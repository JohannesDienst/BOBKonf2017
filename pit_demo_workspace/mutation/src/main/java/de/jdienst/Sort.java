package de.jdienst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort
{

  public List<Integer> sort(List<Integer> coll)
  {
    List<Integer> list = new ArrayList<>();
    list.addAll(coll);

    Collections.sort(list);
    log(list);

    return Collections.unmodifiableList(list);
  }

  private void log(List<Integer> list)
  {
    System.out.println(
      list.stream().map(Object::toString)
      .collect(Collectors.joining(", ")));
  }

}
