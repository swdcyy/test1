package com.unionpay.utils.j;
import java.lang.String;
import android.util.Log;

public final class j	// class@001012
{
    public static int a = 2147483647;

    public static int a(int p0,String p1,String p2){
       if (p1 != null && p2 != null) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 != 5) {
                      if (p0 != 6) {
                      label_002d :
                         p0 = 0;
                      }else {
                         p0 = Log.e(p1, p2);
                      }
                   }else {
                      p0 = Log.w(p1, p2);
                   }
                }else {
                   p0 = Log.i(p1, p2);
                }
             }else {
                p0 = Log.d(p1, p2);
             }
          }else {
             p0 = Log.v(p1, p2);
          }
       }else {
          goto label_002d ;
       }
       return p0;
    }
    public static int a(String p0,String p1){
       if (j.a <= 3) {
          j.a(3, p0, p1);
       }
       return 0;
    }
    public static int b(String p0,String p1){
       int i = (j.a <= 6)? j.a(6, p0, p1): 0;
       return i;
    }
}
