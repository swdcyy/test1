package com.loc.dy;
import java.lang.Object;
import java.lang.String;
import com.loc.eg;
import java.lang.StringBuilder;

public final class dy	// class@0013f5
{
    public long a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public short g;
    public boolean h;

    public void dy(boolean p0){
       super();
       this.c = -113;
       this.f = 0;
       this.h = p0;
    }
    public static long a(String p0){
       if (p0 == null || !p0.length()) {
          return 0;
       }
       long l = 0;
       int i = p0.length() - 1;
       long l1 = 0;
       while (true) {
          if (i >= 0) {
             long l2 = (long)p0.charAt(i);
             long l3 = 48;
             if (l2 - l3 >= 0 && l2 - 57 <= 0) {
                l2 = l2 - l3;
             }else {
                l3 = 10;
                long l4 = 97;
                if (l2 - l4 < 0 || l2 - 102 > 0) {
                   l4 = 65;
                   if (l2 - l4 < 0 || l2 - 70 > 0) {
                      if (l2 - 58 && l2 - 124) {
                         break ;
                      }else {
                      label_0057 :
                         i = i - 1;
                      }
                   }
                }
                l2 = l2 - l4;
                l2 = l2 + l3;
             }
             l2 = l2 << l;
             l1 = l1 + l2;
             l = l + 4;
             goto label_0057 ;
          }else if(l != 48){
             return 0;
          }else {
             return l1;
          }
       }
       return 0;
    }
    public static String a(long p0){
       if (p0 < 0 || p0 - 0xffffffffffff > 0) {
          return null;
       }
       return eg.a(eg.a(p0), ":");
    }
    public final String a(){
       return this.h+"#"+this.a;
    }
    public final dy b(){
       dy uody = new dy(this.h);
       uody.a = this.a;
       uody.b = this.b;
       uody.c = this.c;
       uody.d = this.d;
       uody.e = this.e;
       uody.f = this.f;
       uody.g = this.g;
       uody.h = this.h;
       return uody;
    }
    public final Object clone(){
       return this.b();
    }
    public final String toString(){
       return "AmapWifi{mac="+this.a+", ssid=\'"+this.b+'''+", rssi="+this.c+", frequency="+this.d+", timestamp="+this.e+", lastUpdateUtcMills="+this.f+", freshness="+this.g+", connected="+this.h+'}';
    }
}
