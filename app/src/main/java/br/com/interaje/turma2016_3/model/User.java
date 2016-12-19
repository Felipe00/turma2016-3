package br.com.interaje.turma2016_3.model;

import com.orm.SugarRecord;

/**
 * Created by felipe on 14/12/16.
 */

public class User extends SugarRecord {
    private String name;
    private String email;
    private String phone;

    public User() {
    }

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
