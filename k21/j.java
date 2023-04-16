package k21.j;
import gq5.c;
import k21.k;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import t02.a0;
import jv1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public class j implements c	// class@002c6e
{
    public final k a;

    public void j(k p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "1")) {
          return;
       }
       if (this.a.r.x.H2()) {
          k r = this.a.r;
          r.B.onFloatFullScreenButtonShow(false, r.Z2.a());
       }
       return;
    }
}
