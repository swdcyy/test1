package ew1.b;
import im8.g;
import a51.c;
import ew1.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ew1.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import java.util.Objects;
import android.widget.ViewFlipper;
import java.util.List;
import android.view.View;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import ew1.e;
import java.util.Map;
import java.util.HashMap;

public class b extends c implements g	// class@002206
{
    public LiveViewFlipper v;
    public a w;
    public c x;
    public static String sLivePresenterClassName = "LiveTopBarHeadPendantPresenter";

    public void b(){
       super();
       this.x = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       super.E8();
       if (this.v != null) {
          b.Z(LiveLogTag.LIVE_TOP_BAR, "init pendant controller");
          this.w = new a(this.getContext(), this.v);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "4")) {
          return;
       }
       super.J8();
       b tw = this.w;
       if (tw != null) {
          Objects.requireNonNull(tw);
          if (!PatchProxy.applyVoid(objArray, tw, a.class, "7")) {
             tw.b.stopFlipping();
             tw.b.removeAllViews();
             tw.c.clear();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a26a6);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       PatchProxy.applyVoid(null, this, b.class, "1");
    }
}
