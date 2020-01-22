package kr.or.connect.diexam01;

public class UserBean {
    /*
    * 기본 생성자를 가지고 있다
    * 필드는
    *
    *
    * */

    private String name;
    private int age;
    private boolean male;

    public UserBean(){}
    public UserBean(String name, int age, boolean male) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
