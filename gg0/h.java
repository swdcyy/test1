package gg0.h;
import hg0.a;
import gg0.h$a;
import nsd.u;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kp.r1;
import hg0.b;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.kuaishou.growth.taskcenter.model.customconfig.TaskCustomConfig;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchLiveTaskCustomConfig;
import java.util.List;
import java.util.Collection;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.StringBuilder;
import ekd.y0;
import gg0.i;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import fg0.k;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import fg0.h;
import crd.b;
import lnc.b9;
import java.lang.Float;

public final class h extends a	// class@0024d9
{
    public float j;
    public boolean k;
    public b l;
    public y0 m;
    public BaseFeed n;
    public String o;
    public static final h$a p;

    static {
       h.p = new h$a(null);
    }
    public void h(TaskCommonParams p0){
       a.p(p0, "param");
       super(p0);
    }
    public final void b(BaseFeed p0){
       List mRestrictive;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "1")) {
          return;
       }
       a.p(p0, "liveFeed");
       this.n = p0;
       a.m(p0);
       this.o = r1.U1(p0);
       if (this.f.isTaskComplete()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseLiveTask", "start timer failed, task is complete", false, 4, null);
          return;
       }else {
          TaskCustomConfig mCustomConfi = this.g().getMCustomConfig();
          Object[] objArray = null;
          if (mCustomConfi != null) {
             WatchLiveTaskCustomConfig mWatchLiveTa = mCustomConfi.getMWatchLiveTaskCustomConfig();
             if (mWatchLiveTa != null) {
                mRestrictive = mWatchLiveTa.getMRestrictiveUserIds();
             label_0047 :
                h oh1 = (mRestrictive == null || mRestrictive.isEmpty())? 1: null;
                if (!oh1 && !CollectionsKt___CollectionsKt.H1(mRestrictive, this.o)) {
                   TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseLiveTask", "start timer failed, is not restrictive user id, mCurLiveUserId: "+this.o, false, 4, null);
                   return;
                }else if(PatchProxy.applyVoid(objArray, this, oh, "3") || this.m != null){
                   this.m = new y0((long)100, new i(this));
                }
                h tm = this.m;
                a.m(tm);
                tm.a();
                TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseLiveTask", "startTimer: "+((float)this.f.getMCurrentProgress() + this.j), false, 4, null);
                return;
             }
          }
          mRestrictive = objArray;
          goto label_0047 ;
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       this.j = 0;
       this.q(this.h());
       return;
    }
    public float h(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((float)this.f.getMCurrentProgress() + this.j);
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, h.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.f.getMCurrentProgress() + this.f.getMCheckValue());
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, h.class, "12")) {
          return;
       }
       this.j = 0;
       this.k = false;
       if ((this.f.getMCurrentProgress() + this.f.getMCheckValue()) < this.f.getMTargetProgress()) {
          b tf = this.f;
          tf.setMCurrentProgress((tf.getMCurrentProgress() + this.f.getMCheckValue()));
          b.a(0x5832311c).d(this.f);
       }
       return;
    }
    public void m(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "11")) {
          return;
       }
       a.p(p0, "response");
       this.j = 0;
       this.k = false;
       if (p0.getMTaskCompleted()) {
          this.r(p0);
          this.u();
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseLiveTask", "onStart", false, 4, null);
       if (this.n != null) {
          return;
       }
       BaseFeed uBaseFeed = (h.a && (h.b && h.c != null))? 1: null;
       if (uBaseFeed) {
          uBaseFeed = h.c;
          a.m(uBaseFeed);
          this.b(uBaseFeed);
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       super.o();
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseLiveTask", "onStop", false, 4, null);
       this.u();
       this.m = null;
       b9.a(this.l);
       return;
    }
    public void q(float p0){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, h.class, "9")) {
          return;
       }
       super.q(p0);
       if (this.j - (float)this.f.getMCheckValue() >= 0 && (!PatchProxy.applyVoid(null, this, h.class, "6") && this.k == null)) {
          this.k = true;
          b9.a(this.l);
          this.l = this.e();
       }
    label_0042 :
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       h tm = this.m;
       if (tm != null) {
          a.m(tm);
          tm.e();
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseLiveTask", "pauseTimer: "+((float)this.f.getMCurrentProgress() + this.j), false, 4, null);
       return;
    }
}
