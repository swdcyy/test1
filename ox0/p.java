package ox0.p;
import ox0.o$a;
import ox0.o;
import android.app.Activity;
import p51.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import rkd.b;
import com.yxcorp.utility.n;
import ga1.b;
import android.view.View;
import com.kuaishou.live.common.core.basic.player.AdaptPlayViewReason;
import ga1.a;

public final class p implements o$a	// class@0035cb
{
    public final o a;
    public final Activity b;
    public final c c;

    public void p(o p0,Activity p1,c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(float p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, op, "1")) {
          return;
       }
       boolean b = (b.g())? b.e(): n.I(this.b);
       b uob = new b(b, p0, this.a.d.getBottom(), this.a.d().getWidth(), this.a.d().getHeight(), AdaptPlayViewReason.DEFAULT, null);
       this.c.a(v9);
       return;
    }
}
