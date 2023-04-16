package a3a.f;
import sf6.b;
import jb5.e;
import a3a.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.action.RealActionBizType;
import java.lang.Object;
import qvb.a;
import qvb.n0;
import sf6.a;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a3a.e;
import erd.g;
import a3a.d;
import la6.b;
import java.util.List;
import com.yxcorp.gifshow.network.feed.RecommendFeedResponse;
import qvb.f;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import wkd.b;
import zy5.k;
import zy5.e;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import zy5.i;
import java.util.Objects;
import zy5.d;
import java.util.Iterator;
import java.util.Collection;
import ekd.q;
import k50.a;
import com.yxcorp.gifshow.model.response.feed.EdgeRealTimeConfig;
import e50.g;
import com.yxcorp.gifshow.action.i;
import yv8.c;
import yv8.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Enum;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import sf6.a$a;
import tf6.a$a;
import tf6.a;
import kp.y1;
import qk.g0;
import b06.d;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class f extends c implements b, e	// class@000027
{
    public final a s;
    public a$a t;
    public List u;
    public final c v;

    public void f(QPhoto p0){
       super(p0);
       this.v = RealActionBizType.DOMINO;
       this.add(p0);
       this.R1(true);
       this.s = new a("NASA_SLIDE_DETAIL");
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.I1().doOnNext(new e(this)).doOnError(new d(this));
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "2");
       if (list != PatchProxyResult.class) {
       }else {
          list = super.W1(p0, p1);
          if (HomePageExperimentManager.b()) {
             k ok = b.a(-275376108);
             List list1 = i.a(e.Y, false);
             Objects.requireNonNull(ok);
             if (PatchProxy.applyVoidTwoRefs(list, list1, ok, d.class, "11") || (list != null && !list.isEmpty())) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   if (ok.a(iterator.next(), list1)) {
                      iterator.remove();
                   }
                }
             }
          }
          if (!q.f(list)) {
             this.q.u2(new a(p0.mEdgeRealTimeConfig, p0.mLlsid, p0.mPageRealSize), p1, list, this.K());
          }
       }
       return list;
    }
    public String h2(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-129117978).g(this.v, null, false);
    }
    public boolean i(){
       return false;
    }
    public String i2(){
       return "3";
    }
    public String j2(){
       int i;
       c obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (k.B(this.p) != null) {
          i = k.B(this.p).mAdGroup.ordinal();
       }
       i3 oi3 = i3.f();
       oi3.c("adType", Integer.valueOf(i));
       return oi3.e();
    }
    public void k(List p0){
       this.u = p0;
    }
    public String k2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.s;
       Objects.requireNonNull(obj);
       a$a uoa = PatchProxy.apply(objArray, obj, a.class, "3");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a$a(obj.b.c(obj.a));
       }
       this.t = uoa;
       return uoa.b;
    }
    public int l2(){
       return 7;
    }
    public void n2(RecommendFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "5")) {
          return;
       }
       if (this.K()) {
          f tu = this.u;
          if (tu != null && tu.size()) {
             p1.addAll(0, this.u);
             this.u.clear();
          }else {
             p1.add(0, this.p);
          }
       }
       y1.c(p0.getItems(), p0.mLlsid);
       this.o2(p0.getItems(), this.p.getSource());
       d.f(p1);
       d.g(p1);
       d.c(p1);
       y1.e(0, p1);
       y1.f(p1, r1.D1(this.p.mEntity));
       return;
    }
    public a q(){
       return this.s;
    }
}
