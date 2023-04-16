package ee0.b;
import erd.g;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.growth.pendant.core.manager.f$a;
import com.kuaishou.growth.pendant.core.manager.f;
import java.util.Map;
import ce0.b;
import q87.c;
import ie0.b;
import java.lang.System;
import ie0.a;

public final class b implements g	// class@0020f1
{
    public final String b;
    public final String c;
    public final long d;

    public void b(String p0,String p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       f.a.remove(tb);
       Object[] objArray = new Object[0];
       b.C().t("AnimationResourceManager", "fetchResource done", objArray);
       if ((p0.b).equals("mine") && b.b(true)) {
          a.a(tb, "success", tc, (System.currentTimeMillis() - td));
       }
       return;
    }
}
