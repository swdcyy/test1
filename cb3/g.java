package cb3.g;
import vb3.m;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import wa1.i;
import com.kuaishou.live.lite.layoutmanager.StageType;
import cb3.g$a;
import vb3.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import vb3.c;
import db3.g;
import java.util.Iterator;
import java.lang.Iterable;

public final class g implements m	// class@0004e6
{
    public final Handler a;
    public final i b;
    public StageType c;
    public g d;
    public final Runnable e;
    public final p f;

    public void g(p p0){
       a.p(p0, "layoutLogicCreator");
       super();
       this.f = p0;
       this.a = new Handler(Looper.getMainLooper());
       this.b = new i();
       this.c = StageType.None;
       this.e = new g$a(this);
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       this.b.add(p0);
       return;
    }
    public void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       g tc = this.c;
       if (tc != StageType.None) {
          p0.a(tc);
       }
       this.b.add(p0);
       return;
    }
    public void c(StageType p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "2")) {
          return;
       }
       a.p(p0, "stageType");
       b.d0(LiveLiteLogTag.LAYOUT_MANAGER, "exitStage", "type", p0, "current type", this.c);
       if (this.c == p0) {
          this.c = StageType.None;
          if (!PatchProxy.applyVoid(null, this, og, "6")) {
             this.a.postDelayed(this.e, 100);
          }
       }
       return;
    }
    public void d(StageType p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       a.p(p0, "stageType");
       b.e0(LiveLiteLogTag.LAYOUT_MANAGER, "enterStage", "type", p0, "current type", this.c, "strategy", p1);
       if (this.c == p0) {
          return;
       }
       this.c = p0;
       this.a.removeCallbacks(this.e);
       g td = this.d;
       if (td != null) {
          td.a();
       }
       this.d = this.f.invoke(p0, p1);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
