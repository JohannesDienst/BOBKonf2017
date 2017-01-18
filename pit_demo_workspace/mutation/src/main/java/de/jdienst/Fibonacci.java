package de.jdienst;

public class Fibonacci
{

  public int calc(int i)
  {
    if (i == 0)
    {
      return 0;
    }

    if (i <= 2)
    {
      return 1;
    }

    return calc(i-1) + calc(i-2);
  }

}
