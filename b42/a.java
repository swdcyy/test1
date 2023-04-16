package b42.a;
import e12.c;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import qvb.n0;
import com.yxcorp.gifshow.model.response.LiveChainPhotoFeedResponse;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.List;
import java.lang.Boolean;
import ub2.j;
import qvb.a;
import la6.b;
import qvb.j;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.framework.model.response.CursorResponse;

public class a extends f implements c	// class@0002f1
{
    public boolean p;
    public boolean q;
    public long r;
    public String s;
    public QPhoto t;
    public j u;

    public void a(){
       super();
       this.p = true;
       this.q = false;
    }
    public t I1(){
       Object[] objArray = null;
       KwaiApiService obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x330163e);
       a ts = this.s;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().mCursor;
       }
       return obj.queryLiveChainSideBar(ts, objArray, 20).map(new e()).subscribeOn(d.b).observeOn(d.a);
    }
    public void L1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       ExceptionHandler.handleCaughtException(p0);
       return;
    }
    public void M1(Object p0,List p1){
       this.i2(p0, p1);
    }
    public boolean Y(List p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj != null) {
          obj.b(p0);
       }
       return this.d(p0);
    }
    public void d2(b p0,List p1){
       this.i2(p0, p1);
    }
    public j g0(){
       return this.c;
    }
    public QPhoto h2(){
       return this.t;
    }
    public boolean i0(QPhoto p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj != null) {
          obj.a(p0);
       }
       return this.remove(p0);
    }
    public void i2(LiveChainPhotoFeedResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       super.d2(p0, p1);
       p0 = p0.mTimeStampMs;
       if (p0) {
          this.r = p0;
       }
       return;
    }
    public void j2(String p0){
    }
    public void k2(LivePassThruParamExtraInfo p0){
    }
    public void l1(j p0){
       this.u = p0;
    }
    public void l2(String p0){
       this.s = p0;
    }
    public void m2(LiveChainPhotoFeedResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.S1(p0);
       return;
    }
    public List n0(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getItems();
    }
    public CursorResponse v0(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L0();
    }
    public void z(Object p0){
       this.m2(p0);
    }
}
