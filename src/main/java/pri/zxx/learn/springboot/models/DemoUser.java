package pri.zxx.learn.springboot.models;

/**
 * @author Administrator
 * @desc
 * @createTime 2019-02-20-下午 5:12
 */
public class DemoUser {
    private String userName;
    private String passWord;
    private String desc;

    public DemoUser() {
    }

    public DemoUser(String userName, String passWord, String desc) {
        this.userName = userName;
        this.passWord = passWord;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "DemoUser{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
