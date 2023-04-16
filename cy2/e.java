package cy2.e;
import cy2.f;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cy2.e$a;
import ok.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cy2.c;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import d22.k;
import cy2.g;
import nsd.u;

public final class e implements f	// class@002400
{
    public c a;
    public final x b;

    public void e(LivePlayGLSurfaceView p0){
       a.p(p0, "surface");
       super(new e$a(p0));
    }
    public void e(x p0){
       a.p(p0, "supplier");
       super();
       this.b = p0;
    }
    public boolean I(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean a(LivePlayGLSurfaceView p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "surface");
       e ta = this.a;
       boolean b = true;
       if (ta != null && ta.b == b) {
          ta = this.a;
          if (ta != null) {
             Point point = ta.a();
             if (point != null && point.equals(p1, p2) == b) {
             label_0045 :
                return b;
             }
          }
       }
       b = false;
       goto label_0045 ;
    }
    public void b(LivePlayGLSurfaceView p0,Point p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       a.p(p0, "surface");
       a.p(p1, "videoSize");
       e ta = this.a;
       if (ta != null) {
          ta.d(true);
       }
       ta = this.a;
       if (ta != null) {
          ta.c(p1);
       }
       return;
    }
    public Point c(LivePlayGLSurfaceView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "surface");
       e ta = this.a;
       Point point = (ta != null)? ta.a(): null;
       return point;
    }
    public LivePlayGLSurfaceView get(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       e ta = this.a;
       LivePlayGLSurfaceView livePlayGLSu = (ta != null)? ta.b(): null;
       return livePlayGLSu;
    }
    public void hide(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          ta.b().setVisibility(8);
          ta.b().getRenderer().g(0);
          ta.d(false);
          ta.c(g.a);
       }
       return;
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       if (this.a == null) {
          c obj = this.b.get();
          a.o(obj, "supplier.get\(\)");
          Object obj1 = obj;
          obj = new c(obj1, false, null, 6, null);
          this.a = v0;
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e ta = this.a;
       if (ta != null) {
          LivePlayGLSurfaceView livePlayGLSu = ta.b();
          if (livePlayGLSu != null) {
             k renderer = livePlayGLSu.getRenderer();
             if (renderer != null) {
                renderer.d();
             }
          }
       }
       this.a = null;
       return;
    }
}
