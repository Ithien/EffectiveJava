package com.jdelgadom.effectivejava.builder;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PersonBuilderExample {
  private int id;
  private String nickname;
  private String name;
  private String lastname;
  private LocalDateTime birthday;
  private String state;

  public static class Builder {

    //Required parameters
    private int id;
    private String nickname;

    //Optional parameters
    private String name;
    private String lastname;
    private LocalDateTime birthday;
    private String state;

    public Builder(int id, String nickname) {
      this.id = id;
      this.nickname = nickname;
    }

    public Builder name(String val) {
      name = val;
      return this;
    }

    public Builder lastname(String val) {
      lastname = val;
      return this;
    }

    public Builder birthday(LocalDateTime val) {
      birthday = val;
      return this;
    }

    public Builder state(String val) {
      state = val;
      return this;
    }

    public PersonBuilderExample build() {
      return new PersonBuilderExample(this);
    }

  }

  private PersonBuilderExample(Builder builder) {
    id = builder.id;
    nickname = builder.nickname;
    name = builder.name;
    lastname = builder.lastname;
    birthday = builder.birthday;
    state = builder.state;
  }


}
