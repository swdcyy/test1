package com.ta.utdid2.a.a.g;
import java.lang.String;
import java.util.regex.Pattern;

public class g	// class@000cc6
{
    public static final Pattern a;

    static {
       g.a = Pattern.compile("\([\t\r\n]\)+");
    }
    public static int a(String p0){
       int i = 0;
       if (p0.length() > 0) {
          char[] uocharArray = p0.toCharArray();
          int i1 = 0;
          for (; i < uocharArray.length; i = i + 1) {
             i1 = i1 * 31;
             i1 = i1 + uocharArray[i];
          }
          i = i1;
       }
       return i;
    }
    public static boolean a(String p0){
       if (p0 != null && p0.length() > 0) {
          return false;
       }
       return true;
    }
}
