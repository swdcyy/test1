package ee0.c;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.growth.pendant.core.manager.f;
import java.util.Map;
import ce0.b;
import q87.c;
import ie0.b;
import java.lang.System;
import ie0.a;

public final class c implements g	// class@0020f2
{
    public final String b;
    public final String c;
    public final long d;

    public void c(String p0,String p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       f.a.remove(tb);
       Object[] objArray = new Object[0];
       b.C().u("AnimationResourceManager", p0, objArray);
       if (b.b(0)) {
          a.a(tb, "error", tc, (System.currentTimeMillis() - td));
       }
       return;
    }
}
