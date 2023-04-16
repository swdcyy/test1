package com.meizu.cloud.pushsdk.b.b.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.meizu.cloud.pushsdk.b.b.b;
import com.meizu.cloud.pushsdk.b.b.c;

public class a	// class@00149e
{
    public Class b;
    public String c;
    public Object d;
    public static final HashMap a;

    static {
       a.a = new HashMap();
    }
    public void a(Object p0){
       this.d = p0;
    }
    public void a(String p0){
       this.c = p0;
    }
    public static a a(Object p0){
       return new a(p0);
    }
    public static a a(String p0){
       return new a(p0);
    }
    public b a(Class[] p0){
       return new b(this, p0);
    }
    public c a(String p0,Class[] p1){
       return new c(this, p0, p1);
    }
    public Class a(){
       a tb = this.b;
       if (tb != null) {
       }else {
          tb = this.d;
          if (tb != null) {
             tb = tb.getClass();
          }else {
             HashMap a = a.a;
             Class uClass = a.get(this.c);
             if (uClass == null) {
                uClass = Class.forName(this.c);
                a.put(this.c, uClass);
             }
             tb = uClass;
          }
       }
       return tb;
    }
}
