package com.meizu.cloud.pushsdk.c.c.c$a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import com.meizu.cloud.pushsdk.c.c.c;
import com.meizu.cloud.pushsdk.c.c.c$1;
import java.lang.IllegalArgumentException;
import java.lang.Integer;

public final class c$a	// class@0014ca
{
    public final List a;

    public void c$a(){
       this.a = new ArrayList(20);
    }
    public static List a(c$a p0){
       return p0.a;
    }
    public c$a a(String p0,String p1){
       this.c(p0, p1);
       return this.b(p0, p1);
    }
    public c a(){
       return new c(this, null);
    }
    public c$a b(String p0,String p1){
       this.a.add(p0);
       this.a.add(p1.trim());
       return this;
    }
    public final void c(String p0,String p1){
       char c;
       if (p0 == null) {
          throw new IllegalArgumentException("name == null");
       }
       if (p0.isEmpty()) {
          throw new IllegalArgumentException("name is empty");
       }
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          Integer integer = 127;
          Integer integer1 = 31;
          if (i2 < i) {
             c = p0.charAt(i2);
             if (c > integer1 && c < integer) {
                i2 = i2 + 1;
             }else {
                break ;
             }
          }else if(p1 != null){
             i = p1.length();
             i2 = 0;
             while (true) {
                if (i2 >= i) {
                   return;
                }
                c = p1.charAt(i2);
                if (c > integer1 && c < integer) {
                   i2 = i2 + 1;
                }else {
                }
             }
             Object[] objArray1 = new Object[]{Integer.valueOf(c),Integer.valueOf(i2),p0,p1};
             throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in %s value: %s", objArray1));
          }else {
             throw new IllegalArgumentException("value == null");
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(c),Integer.valueOf(i2),p0};
       throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", objArray));
    }
}
