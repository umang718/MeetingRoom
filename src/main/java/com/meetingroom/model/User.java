package com.meetingroom.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usertable")
public class User
{
    @Id
    private int id;
    private String Username;
    private String Firstname;
    private String Lastname;
    private int mobile;
    private String Password;

    public User(String username, String firstname, String lastname, int mobile, String password)
    {
        super();
        Username = username;
        Firstname = firstname;
        Lastname = lastname;
        this.mobile = mobile;
        Password = password;
    }



    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return Username;
    }

    public void setUsername(String username)
    {
        Username = username;
    }

    public String getFirstname()
    {
        return Firstname;
    }

    public void setFirstname(String firstname)
    {
        Firstname = firstname;
    }

    public String getLastname()
    {
        return Lastname;
    }

    public void setLastname(String lastname)
    {
        Lastname = lastname;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile)
    {
        this.mobile = mobile;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password)
    {
        Password = password;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", mobile=" + mobile +
                ", Password='" + Password + '\'' +
                '}';
    }
}
