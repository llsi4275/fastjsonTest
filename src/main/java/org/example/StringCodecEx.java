package org.example;

import java.lang.reflect.Type;
import java.text.Normalizer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.serializer.StringCodec;

/**
 * 使用fastjson作为json转换框架的转换器。
 *
 * @author liliang
 * @since 2020-06-17 V2018C01
 */
public class StringCodecEx extends StringCodec {
    /**
     * 对字符串作统一的归一化操作和trim操作。
     *
     * @author liliang
     * @since 2020-06-18 V2018C01
     */
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {
        T t = super.deserialze(parser, clazz, fieldName);
        System.out.println("***** entry stringcodecex: " + fieldName + ":" + t + "----");
        if (t instanceof String) {
            return (T) trimAndNormalize((String) t);
        } else if (t instanceof StringBuilder) {
            return (T) trimAndNormalize((StringBuilder) t);
        } else if (t instanceof StringBuffer) {
            return (T) trimAndNormalize((StringBuffer) t);
        }
        return t;
    }
    
    /**
     * 对字符进行trim操作和归一化操作.
     *
     * @param str 要trim和归一化操作的字符串。
     * @return trim和归一化操作后的字符串。
     */
    public static String trimAndNormalize(String str) {
        if (str == null)
            return str;
        return Normalizer.normalize(str.trim(), Normalizer.Form.NFKC);
    }
    
    /**
     * 对字符进行trim操作和归一化操作.
     *
     * @param str 要trim和归一化操作的字符串。
     * @return trim和归一化操作后的字符串。
     */
    public static StringBuilder trimAndNormalize(StringBuilder str) {
        return new StringBuilder(trimAndNormalize(str.toString()));
    }
    
    /**
     * 对字符进行trim操作和归一化操作.
     *
     * @param str 要trim和归一化操作的字符串。
     * @return trim和归一化操作后的字符串。
     */
    public static StringBuffer trimAndNormalize(StringBuffer str) {
        return new StringBuffer(trimAndNormalize(str.toString()));
    }
}
