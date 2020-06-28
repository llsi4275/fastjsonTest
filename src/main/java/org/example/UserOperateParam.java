package org.example;

/**
 * 添加面试人员的参数.
 * 
 * @author liliang
 * @since 2020/6/21 V2020C01
 */
public class UserOperateParam {
    /**
     * 用户id.
     */
    private String id;
    
    /**
     * 姓名.
     */
    private String name;
    
    /**
     * 电话号码.
     */
    private String phone;
    
    /**
     * 专业技能.
     */
    private String skill;
    
    /**
     * 招聘顾问登录帐号.
     */
    private String recruitment;
    
    /**
     * 地域代码.
     */
    private String region;
    
    /**
     * 工作年限.
     */
    private String workingYears;
    
    /**
     * 面试人员的简历来历.
     */
    private String channel;
    
    /**
     * 学历.
     */
    private String education;
    
    /**
     * 毕业学校.
     */
    private String school;
    
    /**
     * 专业.
     */
    private String major;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getSkill() {
        return skill;
    }
    
    public void setSkill(String skill) {
        this.skill = skill;
    }
    
    public String getRecruitment() {
        return recruitment;
    }
    
    public void setRecruitment(String recruitment) {
        this.recruitment = recruitment;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getWorkingYears() {
        return workingYears;
    }
    
    public void setWorkingYears(String workingYears) {
        this.workingYears = workingYears;
    }
    
    public String getChannel() {
        return channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }
    
    public String getEducation() {
        return education;
    }
    
    public void setEducation(String education) {
        this.education = education;
    }
    
    public String getSchool() {
        return school;
    }
    
    public void setSchool(String school) {
        this.school = school;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserOperateParam{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", skill='").append(skill).append('\'');
        sb.append(", recruitment='").append(recruitment).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append(", workingYears='").append(workingYears).append('\'');
        sb.append(", channel='").append(channel).append('\'');
        sb.append(", education='").append(education).append('\'');
        sb.append(", school='").append(school).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
