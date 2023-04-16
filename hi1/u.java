package hi1.u;
import hi1.i;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import hi1.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Collection;
import hi1.q;
import io.reactivex.g;
import brd.t;
import hi1.k;
import erd.o;
import t45.d;
import brd.z;
import hi1.r;
import hi1.s;
import erd.g;
import crd.b;
import lnc.b9;

public class u implements i	// class@0026e8
{
    public b a;
    public static final List b;

    static {
       u.b = LiveLogTag.LIVE_EFFECT.appendTag("LiveMagicFaceReportServiceImpl");
    }
    public void u(){
       super();
    }
    public void a(String p0,List p1,boolean p2,g p3){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, u.class, "1")) {
          return;
       }
       this.a = t.create(new q(new ArrayList(p1))).flatMap(new k(this, p0, p2)).subscribeOn(d.c).observeOn(d.a).subscribe(new r(p3), new s(p3));
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       b9.a(this.a);
       return;
    }
}
