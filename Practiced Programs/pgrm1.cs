using System;
  
class Test
{
      
    static char convert(string s, int n)
    {
        String str= "";
		String temp = ""; 
        int f = 0; 
		for (int i = 0; i < s.Length ; )
        {
            temp = ""; 
            f = 0; 
            while (i < s.Length && s[i]>='a' && s[i]<='z')
            {
                temp += s[i];
                i++;
            }
			while (i < s.Length && s[i] >= '1' && s[i] <= '9')
            {
                f = f * 10 + s[i] - '0';
                i++;
            }
			for (int j = 1; j <= f; j++)
                str += temp;
		}
		if (f == 0)
            str+= temp;
		return str[n - 1];
    }
      
    public static void Main()
    {
        string s = "a1b1c3";
        int n = 5;
        Console.Write(convert(s, n));
    }
}