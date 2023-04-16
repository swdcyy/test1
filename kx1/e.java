package kx1.e;
import lp3.e;
import pq5.c;
import kx1.b;
import java.lang.Object;
import kx1.e$a;
import mx1.g;
import v51.a;
import java.lang.Class;
import lp3.c;
import hf3.a;
import kx1.d;
import mx1.a;
import nx1.q;
import rp5.a;
import android.app.Activity;
import o63.a;
import kx1.c;
import lx1.c;
import lx1.b;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.b;
import com.kuaishou.live.common.core.component.sceneactivitywidget.container.a;
import rq5.a;
import java.util.List;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;

public class e	// class@002e1c
{
    public final e a;
    public final c b;
    public final b c;
    public final g d;
    public final q e;
    public b f;
    public final a g;

    public void e(e p0,c p1,b p2){
       super();
       this.g = new e$a(this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = new g(p0.a(a.class).u(), new d(this));
       this.e = new q(p0.a(a.class).c(), p0.a(a.class), new c(this));
    }
    public final b a(){
       View obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.Pg();
       if (this.c.b()) {
          return new b(obj, this.a);
       }
       return new a(obj, this.a);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.b.Jg(this.g);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.b.Jg(this.g);
       e tf = this.f;
       if (tf != null) {
          tf.release();
       }
       this.f = this.a();
       this.d();
       return;
    }
    public void d(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          return;
       }
       if (this.f == null) {
          this.f = this.a();
       }
       this.f.b(this.e.b());
       b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "updateWidgetShow", "currentWidgetShowList", this.e.b());
       if (this.c.a() && !q.f(this.e.b())) {
          if (!PatchProxy.applyVoid(objArray, this, uoe, "8")) {
             this.b.gj(this.g);
          }
       }else {
          this.b();
       }
       return;
    }
}
