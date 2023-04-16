package a32.n;
import im8.g;
import k51.c;
import lnc.a1;
import java.util.concurrent.CopyOnWriteArraySet;
import a32.n$a;
import a32.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import oq5.c;
import jv1.b;
import a32.n$b;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import java.util.Set;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Iterator;
import a32.k;
import java.lang.Integer;
import a32.m;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.utils.e;
import a32.q;
import java.util.Map;
import java.util.HashMap;

public class n extends c implements g	// class@00002e
{
    public Set p;
    public a0 q;
    public LiveBizParam r;
    public c s;
    public r t;
    public final c u;
    public static String sLivePresenterClassName = "LiveTopMarginAdapterPresenter";
    public static final int v;

    static {
       n.v = a1.e(5.00f);
    }
    public void n(){
       super();
       this.p = new CopyOnWriteArraySet();
       this.t = new n$a(this);
       this.u = new l(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       n tq = this.q;
       if (tq != null) {
          tq.x.H6(this.u);
          if (this.q.h != null) {
             n$b uob = new n$b(this);
             this.s = uob;
             this.q.y2.P4(uob);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       n tq = this.q;
       if (tq != null) {
          tq.x.Q0(this.u);
          tq = this.s;
          if (tq != null) {
             this.q.y2.d5(tq);
          }
       }
       this.p.clear();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, n.class, "4")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       int i = this.S8();
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          this.R8(iterator.next(), i);
       }
       return;
    }
    public void R8(k p0,int p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, on, "5")) {
          return;
       }
       k1.o(new m(p0, p1));
       return;
    }
    public int S8(){
       Object obj = PatchProxy.apply(null, this, n.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getActivity() == null) {
          return 0;
       }
       return e.k(this.getActivity(), this.r.mIsStatusBarSolid);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new q());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.q = this.s8(a0.class);
       this.r = this.q8(LiveBizParam.class);
       return;
    }
}
