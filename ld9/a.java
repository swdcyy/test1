package ld9.a;
import java.lang.String;

public final class a	// class@002db5
{

    public static String a(int p0,boolean p1){
       String str = "9:16";
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 == 5) {
                      str = "full_v2";
                   }
                }else {
                   str = "full";
                }
             }else {
                str = "1:1";
             }
          }else {
             str = "4:3";
          }
       }else if(p1){
          str = "9:16_v2";
       }
       return str;
    }
}
