package test.collection.list;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.Test;

import examples.collection.list.ArrayListCode;

public class ArrayListTest {

  ArrayListCode list = new ArrayListCode();
  
  @Test
  public void testArrayList() {
    list.addMember("Ava");
    assertThat(list.getList(), hasItems("Ava"));
  }
}

