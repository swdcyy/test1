package al3.d;
import im8.g;
import dk3.b;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import al3.a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import al3.g;
import java.util.Map;
import java.util.HashMap;
import lp3.i;

public class d extends b implements g	// class@0000f5
{
    public LiveMiniWidgetKdsView A;
    public ViewGroup B;
    public LivePreviewPendantModel C;
    public final PublishSubject D;
    public final LiveTkItemManager y;
    public i z;

    public void d(){
       super();
       this.y = new LiveTkItemManager();
       this.D = PublishSubject.g();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       super.E8();
       b.Z(LivePreviewLogTag.LIVE_PREVIEW_PENDANT, "onBind");
       this.X7(this.D.subscribe(new a(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       super.J8();
       b.Z(LivePreviewLogTag.LIVE_PREVIEW_PENDANT, "onUnbind");
       this.W8();
       this.C = null;
       this.y.a();
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       b.Z(LivePreviewLogTag.LIVE_PREVIEW_PENDANT, "releaseKdsView");
       d tA = this.A;
       if (tA != null) {
          if (tA.getParent() != null) {
             this.A.getParent().removeView(this.A);
          }
          this.A.b();
          this.A = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a234b);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new g());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.j8();
       this.z = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
