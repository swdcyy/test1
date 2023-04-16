package i02.i;
import rc1.b;
import lp3.a;
import android.content.Context;
import rc1.b$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.LiveIncreaseFansNoticeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import s51.c;
import lp3.c;
import brd.t;
import i02.h;
import bp6.a;
import erd.g;
import crd.b;

public class i extends a implements b	// class@0027f1
{
    public Context d;
    public b$a e;

    public void i(Context p0,b$a p1){
       super();
       this.d = p0;
       this.e = p1;
    }
    public void S4(LiveIncreaseFansNoticeInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       c uoc = this.Po().a(c.class);
       if (this.e.a() != null) {
          this.e.a().subscribe(new h(this, uoc), new a());
       }
       return;
    }
}
