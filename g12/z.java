package g12.z;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g12.z$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import joc.y;
import g12.x;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.lang.StringBuilder;
import java.lang.Boolean;
import g12.y;
import java.lang.Runnable;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import g12.c0;
import java.util.Map;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;

public class z extends PresenterV2 implements g	// class@002a42
{
    public View p;
    public View q;
    public PublishSubject r;
    public final b s;
    public static String sLivePresenterClassName = "LiveSlideSquareSideBarLayoutPresenter";

    public void z(){
       super();
       this.s = new z$a(this);
    }
    public void E8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       LiveLogTag lIVE_SQUARE = LiveLogTag.LIVE_SQUARE;
       StringBuilder str = "LiveSlideSquareSideBarLayoutPresenter";
       lIVE_SQUARE.appendTag(str);
       b.P(lIVE_SQUARE, "onBindStart");
       b = false;
       if (this.q != null) {
          z tp = this.p;
          if (tp != null) {
             y.c(tp);
             this.q.setVisibility(b);
             this.P8(b);
             this.X7(this.r.subscribe(new x(this), Functions.e));
             b.P(lIVE_SQUARE.appendTag(str), "onBindEnd");
             return;
          }
       }
       List list = lIVE_SQUARE.appendTag(str);
       str = "mSquareSideBarLayout == null ?";
       boolean b1 = (this.p == null)? true: false;
       str = str+b1+"; mSquareSideBarContainerLayout == null ?";
       if (this.q == null) {
          b = true;
       }
       b.r(list, str+b);
       return;
    }
    public final void P8(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "4")) {
          return;
       }
       if (p0) {
          this.p.post(new y(this));
       }else {
          float f = (float)n.z(this.getActivity());
          b.P(LiveLogTag.LIVE_SQUARE.appendTag("LiveSlideSquareSideBarLayoutPresenter"), "setTranslationX for PORTRAIT, translation = "+f);
          this.p.setTranslationX(f);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a25ba);
       this.q = m1.f(p0, 0x7f0a25b9);
       b.P(LiveLogTag.LIVE_SQUARE.appendTag("LiveSlideSquareSideBarLayoutPresenter"), "bindView, mSquareSideBarLayout = "+this.p+", mSquareSideBarContainerLayout = "+this.q);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, z.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(z.class, new c0());
       }else {
          obj.put(z.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.r = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       return;
    }
}
