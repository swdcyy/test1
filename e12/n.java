package e12.n;
import e12.l;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import e12.n$a;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import qvb.f;
import java.util.List;
import qvb.a;
import z12.x;
import wvb.e;
import qvb.q;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.basic.liveslide.datasource.b;
import qvb.n0;
import java.lang.IllegalArgumentException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.t;
import com.kuaishou.live.basic.liveslide.datasource.LiveSlideResponse;
import la6.b;

public class n extends l	// class@002604
{
    public final f l;
    public b m;
    public e n;
    public final q o;

    public void n(LiveBizParam p0){
       List list;
       boolean b;
       super();
       n$a uoa = new n$a(this);
       this.o = uoa;
       b uob = b.e(p0.mSlidePlayId);
       if (uob.M7() instanceof f) {
          f uof = uob.M7();
          this.l = uof;
          list = x.J(uof.getItems());
       }else if(uob.M7() instanceof e){
          e uoe = uob.M7();
          this.n = uoe;
          this.l = uoe.m();
          list = x.J(this.n.getItems());
       }else {
          throw new IllegalArgumentException("找不到对应的fetcher");
       }
       this.l.h(uoa);
       if (!q.f(list)) {
          this.b(list);
       }
       b = (this.l.hasMore() && p0.mDisableLoadMore == null)? true: false;
       this.d = b;
       return;
    }
    public static boolean B(n p0){
       return super.a();
    }
    public static boolean C(n p0){
       return super.n();
    }
    public boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, on, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.m == null) {
          Object obj1 = PatchProxy.apply(objArray, this, on, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(this.l.isLoading() && this.l.g()){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             this.l.a();
             return true;
          }
       }
       return super.a();
    }
    public t c(boolean p0){
       LiveSlideResponse obj;
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, on, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.m != null) {
          obj = new LiveSlideResponse();
          obj.mFeedItems = x.J(this.m.getItems());
          return t.just(obj);
       }else {
          return null;
       }
    }
    public String f(){
       return "LiveSlidePageListAdapterPageModel";
    }
    public boolean h(Object p0){
       return this.y(p0);
    }
    public List m(boolean p0,Object p1){
       return this.z(p0, p1);
    }
    public boolean n(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n on = n.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, on, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.m == null) {
          Object obj1 = PatchProxy.apply(objArray, this, on, "3");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(this.l.hasMore() || (!this.l.g() || this.l.isLoading())){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             this.l.load();
             return true;
          }
       }
       return super.n();
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, n.class, "8")) {
          return;
       }
       n tl = this.l;
       if (tl != null) {
          tl.f(this.o);
       }
       return;
    }
    public boolean y(LiveSlideResponse p0){
       p0 = PatchProxy.applyOneRefs(p0, this, n.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = (this.m.hasMore() || this.l.hasMore())? true: false;
       this.d = b;
       return b;
    }
    public List z(boolean p0,LiveSlideResponse p1){
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, on, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.m = null;
       return super.z(p0, p1);
    }
}
