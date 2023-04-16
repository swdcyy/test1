package nx1.j;
import java.lang.String;
import o63.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import rx4.a;
import crd.b;

public class j	// class@003413
{
    public final String a;
    public final String b;
    public final String c;
    public final a d;
    public a e;
    public b f;
    public b g;
    public long h;

    public void j(String p0,String p1,String p2,a p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a+"_"+this.b;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       if (this.e == null) {
          return;
       }
       b.c0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "releaseKwaiTkContainer", "viewKey", this.a());
       this.e.onDestroy();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       j tf = this.f;
       if (tf != null && !tf.isDisposed()) {
          this.f.dispose();
       }
       tf = this.g;
       if (tf != null && !tf.isDisposed()) {
          this.g.dispose();
       }
       this.b();
       return;
    }
}
