package g12.q;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ge5.d;
import g12.q$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.widget.FrameLayout;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import joc.c;
import joc.a0;
import joc.z;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import joc.g;
import joc.m;
import joc.l;
import android.view.View;
import com.yxcorp.gifshow.util.c;
import com.kwai.robust.PatchProxyResult;
import joc.o;
import g12.r;
import java.lang.Number;
import android.content.Context;
import ekd.l1;
import com.yxcorp.utility.n;
import g12.u;
import java.util.Map;
import java.util.HashMap;

public class q extends PresenterV2 implements g	// class@002a38
{
    public final d p;
    public LiveBizParam q;
    public SwipeLayout r;
    public a s;
    public int t;
    public final a u;
    public static String sLivePresenterClassName = "LiveSlideRootViewSwipePresenter";

    public void q(){
       super();
       this.p = new d();
       this.t = -1;
       this.u = new q$a(this);
    }
    public void E8(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       this.s = a.n(activity);
       SwipeLayout swipeLayout = w9.a(this.getActivity());
       this.r = swipeLayout;
       swipeLayout.requestFocusFromTouch();
       this.r.setIgnoreEdge(false);
       if (!PatchProxy.applyVoid(objArray, this, oq, "3")) {
          if (this.q.mIsFromPush != null) {
             this.r.setDirection(SwipeLayout$Direction.BOTH);
          }else {
             this.r.setDirection(SwipeLayout$Direction.LEFT);
          }
       }
       this.p.f(new c());
       this.r.c(this.p.b());
       if (!PatchProxy.applyVoid(objArray, this, oq, "4")) {
          if (this.q.mLiveStyleParams.mIsEnableExitShrink != null) {
             this.p.c = new g(this.getActivity(), 2, this.P8());
             this.p.d = new m(this.getActivity(), 2, this.P8());
          }else {
             l ol = new l(this.r);
             ol.m(new c(this.getActivity()));
             r or = PatchProxy.apply(objArray, this, oq, "5");
             if (or != PatchProxyResult.class) {
             }else {
                or = new r(this, this.getActivity());
             }
             ol.g(or);
             this.p.e = ol;
          }
       }
       this.p.c();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "7")) {
          return;
       }
       q tr = this.r;
       if (tr != null) {
          tr.m(this.p.b());
       }
       return;
    }
    public final int P8(){
       q obj = PatchProxy.apply(null, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.t;
       if (obj != -1) {
          return obj;
       }
       this.t = 0;
       Activity activity = this.getActivity();
       if (l1.a(activity)) {
          this.t = this.t + n.A(activity);
       }
       return this.t;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(q.class, new u());
       }else {
          obj.put(q.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.q = this.q8(LiveBizParam.class);
       return;
    }
}
