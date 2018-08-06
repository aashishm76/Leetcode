// LeetCode 771: Jewels and Stones

public class Solution
{
  public int numJewelsInStones(String J, String S)
  {
    // Counter variable
    int count = 0;
    int i, j = 0;

    for(i = 0; i < S.length(); i++)
    {
      for(j = 0; j < J.length(); j++)
      {
        if(J.charAt(j) == S.charAt(i))
        {
          count++;
        }
      }
    }

    return count;
  }
}
