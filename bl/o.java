package bl.o;
import java.lang.String;
import java.lang.System;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Character;

public final class o	// class@0002fd
{
    public static final int a;

    static {
       int i1;
       int i2;
       String property = System.getProperty("java.version");
       int i = 0;
       try{
          i1 = -1;
          String[] stringArray = property.split("[._]");
          i2 = Integer.parseInt(stringArray[i]);
          int i3 = 1;
          if (i2 == i3 && stringArray.length > i3) {
             i2 = Integer.parseInt(stringArray[i3]);
          }
       }catch(java.lang.NumberFormatException e0){
          i2 = -1;
       }
       if (i2 == i1) {
          try{
             StringBuilder str = "";
             for (; i < e0.length(); i = i + 1) {
                char c = e0.charAt(i);
                if (Character.isDigit(c)) {
                   str = str+c;
                }else {
                   break ;
                }
             }
             i2 = Integer.parseInt(str);
          }catch(java.lang.NumberFormatException e0){
             i2 = -1;
          }
       }
    }
    public static boolean a(){
       boolean b = (o.a >= 9)? true: false;
       return b;
    }
}
