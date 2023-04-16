package com.vivo.push.e.a;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import com.vivo.push.e.a$a;
import java.util.Collection;

public final class a	// class@00107e
{
    public ArrayList b;
    public static String[] a;

    static {
       String[] stringArray = new String[]{"com.vivo.pushservice","com.vivo.pushdemo.test","com.vivo.sdk.test","com.vivo.hybrid"};
       a.a = stringArray;
    }
    public void a(){
       super();
       this.b = null;
       this.b = new ArrayList();
    }
    public void a(byte p0){
       super();
    }
    public static a a(){
       return a$a.a();
    }
    public final ArrayList b(){
       return new ArrayList(this.b);
    }
    public final boolean c(){
       a tb = this.b;
       if (tb != null && tb.size()) {
          return true;
       }
       return false;
    }
}
