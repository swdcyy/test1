package g82.v$b$a;
import ok.h;
import g82.v$b;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import java.lang.String;
import kg1.f$a;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import brd.t;
import g82.d0;
import g82.c0;
import erd.g;

public class v$b$a implements h	// class@002aba
{
    public final boolean b;
    public final LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig c;
    public final int d;
    public final boolean e;
    public final String f;
    public final f$a g;
    public final long h;
    public final v$b i;

    public void v$b$a(v$b p0,boolean p1,LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig p2,int p3,boolean p4,String p5,f$a p6,long p7){
       this.i = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, v$b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          v$b$a tf = this.f;
          v$b$a tg = this.g;
          v$b$a th = this.h;
          d0 uod0 = new d0(this, this.e, tf, tg, th);
          v$b$a uob$a = tf;
          c0 uoc0 = new c0(this, uob$a, tg, th);
          p0 = this.i.kj(this.b, this.c, this.d).subscribe(v11, uod0);
       }
       return p0;
    }
}
