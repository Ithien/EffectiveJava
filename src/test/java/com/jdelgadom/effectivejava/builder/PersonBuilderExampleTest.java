package com.jdelgadom.effectivejava.builder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;

@RunWith(MockitoJUnitRunner.class)
public class PersonBuilderExampleTest {
  @Test
  public void testPersonBuilderRequired() {
    PersonBuilderExample person = new PersonBuilderExample.Builder(1, "nickname").build();
    Assert.assertEquals("The result will be 1", 1, person.getId());
    Assert.assertEquals("The result will be nickname", "nickname", person.getNickname());
  }

  @Test
  public void testPersonBuilderName() {
    PersonBuilderExample person = new PersonBuilderExample.Builder(1, "nickname").name("Jose").build();
    Assert.assertEquals("The result will be Jose", "Jose", person.getName());
  }

  @Test
  public void testPersonBuilderLastName() {
    PersonBuilderExample person = new PersonBuilderExample.Builder(1, "nickname").lastname("Delgado").build();
    Assert.assertEquals("The result will be Delgado", "Delgado", person.getLastname());
  }

  @Test
  public void testPersonBuilderState() {
    PersonBuilderExample person = new PersonBuilderExample.Builder(1, "nickname").state("Married").build();
    Assert.assertEquals("The result will be Married", "Married", person.getState());
  }

  @Test
  public void testPersonBuilderBirthday() {
    PersonBuilderExample person = new PersonBuilderExample.Builder(1, "nickname").birthday(LocalDateTime.now()).build();
    Assert.assertEquals("The result will be DayOfYear", LocalDateTime.now().getDayOfYear(), person.getBirthday().getDayOfYear());
  }
}