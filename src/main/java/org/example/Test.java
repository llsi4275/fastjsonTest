package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

/**
 * @author liliang
 * @since 2020/6/28 V2020C01
 */
public class Test {
    static {
        ParserConfig pc = ParserConfig.getGlobalInstance();
        StringCodecEx sc = new StringCodecEx();
        pc.putDeserializer(String.class, sc);
        pc.putDeserializer(StringBuilder.class, sc);
        pc.putDeserializer(StringBuffer.class, sc);
    }
    
    public static void main(String[] args) {
        UserOperateParam param = JSON.parseObject(
                "{\n" + "\"name\":\"张三   \",\n" + "\"phone\":\"李四   \",\n" + "\"skill\":\"java   \",\n"
                        + "\"recruitment\":4,\n" + "\"region\":\"Chengdu   \",\n" + "\"workingYears\":\"3.5    \"\n" + "}",
                UserOperateParam.class);
        
        System.out.println(param);
    }
}
