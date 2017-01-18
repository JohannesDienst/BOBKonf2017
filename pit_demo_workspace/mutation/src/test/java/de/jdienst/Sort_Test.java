/*
 * Sort.java
 *
 * Id: Sort.java, v  05.01.2017 12:55:16 jdienst
 *
 * Copyright (c) 2017 MULTA MEDIO Informationssysteme AG,
 * Berliner Platz 12, 97080 Wuerzburg, Germany.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * MULTA MEDIO Informationssysteme AG ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with MULTA MEDIO.
 */

package de.jdienst;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class Sort_Test
{
  private Sort sort;

  @Before
  public void setup()
  {
    sort = new Sort();
  }

  @Test public void emptyList() {
    assertEquals(true, sort.sort(Collections.<Integer>emptyList()).isEmpty());
  }

  @Test public void oneList() {
    assertEquals(false,
      sort.sort(Stream.of(42).collect(Collectors.toList())).isEmpty());
  }

  @Test public void twoList() {
    assertEquals(new Integer(1),
      sort.sort(Stream.of(2, 3, 1, 8).collect(Collectors.toList())).get(0));
  }
}