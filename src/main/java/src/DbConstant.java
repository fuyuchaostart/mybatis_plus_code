package src;

/**
 * @author fyc
 * @description: TODO
 * @date 2019/5/31下午 2:03
 */
public enum DbConstant {
    LOCAL("jdbc:mysql://localhost:3306/poi_test?serverTimezone=UTC&characterEncoding=utf-8", "root", "123456"),

    private DbConstant() {

    }

    DbConstant(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;

    }

    public String url;
    public String name;
    public String password;

}
