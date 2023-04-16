package com.loc.m$1;
import com.loc.ck;
import java.lang.String;
import java.util.concurrent.ConcurrentHashMap;
import com.loc.m;
import java.lang.Object;
import com.loc.m$d;
import android.content.Context;
import com.loc.w;
import com.loc.m$b;
import com.loc.m$a;

public final class m$1 extends ck	// class@00144b
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public void m$1(String p0,String p1,String p2,String p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void a(){
       m$d uod = m.h().get(this.a);
       if (uod == null) {
          return;
       }
       m$d c = uod.c;
       m$b uob = m.a(m.c, uod.a, uod.b, this.b, this.c, this.d);
       if (uob != null && c != null) {
          c.a(uob);
       }
       return;
    }
}
