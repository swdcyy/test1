package com.alipay.apmobilesecuritysdk.b.a;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import x6.a;

public final class a	// class@000e62
{
    public int a;
    public static a b;

    static {
       a.b = new a();
    }
    public void a(){
       this.a = 0;
    }
    public static a a(){
       return a.b;
    }
    public static String a(String p0,String p1){
       return p0+p1;
    }
    public final void a(int p0){
       this.a = p0;
    }
    public final int b(){
       return this.a;
    }
    public final String c(){
       String str = null;
       if (a.e(str)) {
          return str;
       }
       a ta = this.a;
       if (ta != 1) {
          if (ta != 2) {
             if (ta != 3) {
                if (ta != 4) {
                   return "https://mobilegw.alipay.com/mgw.htm";
                }else {
                   str = "://mobilegw.aaa.alipay.net/mgw.htm";
                }
             }else {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
             }
          }else {
             return "https://mobilegwpre.alipay.com/mgw.htm";
          }
       }else {
          str = "://mobilegw.stable.alipay.net/mgw.htm";
       }
       return a.a("http", str);
    }
}
