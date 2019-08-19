package cn.zx.tkmybatistest.entity;

import javax.persistence.*;

@Table(name = "test.user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String age;

    private String habbit;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return habbit
     */
    public String getHabbit() {
        return habbit;
    }

    /**
     * @param habbit
     */
    public void setHabbit(String habbit) {
        this.habbit = habbit;
    }
}