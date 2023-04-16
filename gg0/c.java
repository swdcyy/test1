package gg0.c;
import gg0.l;
import hg0.a;
import gg0.c$a;
import nsd.u;
import java.util.ArrayList;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import ekd.y0;
import hg0.b;
import kp.r1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.ExtMeta;
import gg0.e;
import tl8.d;
import ok.h;
import tl8.e;
import java.util.List;
import gg0.d;
import java.lang.Runnable;
import wkd.b;
import fg0.k;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import crd.b;
import lnc.b9;

public final class c extends a implements l	// class@0024d2
{
    public float j;
    public b k;
    public float l;
    public y0 m;
    public boolean n;
    public String o;
    public static float p;
    public static BaseFeed q;
    public static final List r;
    public static final c$a s;

    static {
       c.s = new c$a(null);
       c.r = new ArrayList();
    }
    public void c(TaskCommonParams p0){
       a.p(p0, "param");
       super(p0);
       this.l = 10.00f;
    }
    public void a(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       BaseFeed q = c.q;
       String str = ",feed=";
       if (q != null && (a.g(q, p0) ^ 0x01)) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseDetailTask", "pauseTimer: return by mCurrentFeed="+this.u(c.q)+str+this.u(p0), false, 4, null);
          return;
       }else if(this.m != null){
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseDetailTask", "pauseTimer: ScheduleHandler stop by mCurrentFeed="+this.u(c.q)+str+this.u(p0), false, 4, null);
          c tm = this.m;
          a.m(tm);
          tm.e();
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseDetailTask", "pauseTimer:"+((float)this.f.getMCurrentProgress() + this.j)+",mCurrentFeed = "+this.u(c.q), false, 4, null);
       return;
    }
    public void b(BaseFeed p0){
       float f;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "3")) {
          return;
       }
       a.p(p0, "feed");
       this.o = p0.getId();
       BaseFeed q = c.q;
       if (q == null || (a.g(q, p0) ^ 0x01)) {
          c.q = p0;
          c.p = 0;
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseDetailTask", "startTimer: resetFeed and mCurrentPhotoPlayTime", false, 4, null);
       }
       if (this.f.isTaskComplete()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseDetailTask", "start timer failed, task is complete", false, 4, null);
          return;
       }else if(r1.D3(p0)){
          Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "4");
          f = (obj != PatchProxyResult.class)? obj.floatValue(): e.h(p0, ExtMeta.class, e.b).floatValue() / 1000.00f;
       }else if(r1.S2(p0)){
          f = 60.00f;
       }else {
          f = 10.00f;
       }
       this.l = f;
       if (c.r.contains(this.o)) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseDetailTask", "startTimer: block by 命中防作弊", false, 4, null);
          return;
       }else if(c.p - this.l >= 0){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseDetailTask", "startTimer: block by 当前作品观看时长超过限定值-"+this.l+" s", false, 4, null);
          return;
       }else if(PatchProxy.applyVoid(null, this, uoc, "6") || this.m != null){
          this.m = new y0((long)100, new d(this));
       }
       c tm = this.m;
       a.m(tm);
       tm.a();
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseDetailTask", "startTimer: mCurrentProgress="+this.f.getMCurrentProgress()+",mStayDuration="+this.j+",mCurrentPhotoPlayTime="+c.p+",mLimitTime="+this.l+",mCurrentFeed = "+this.u(c.q), false, 4, null);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.j = 0;
       this.q(this.h());
       return;
    }
    public float h(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((float)this.f.getMCurrentProgress() + this.j);
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.f.getMCurrentProgress() + this.f.getMCheckValue());
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       this.j = 0;
       this.n = false;
       if ((this.f.getMCurrentProgress() + this.f.getMCheckValue()) < this.f.getMTargetProgress()) {
          b tf = this.f;
          tf.setMCurrentProgress((tf.getMCurrentProgress() + this.f.getMCheckValue()));
          b.a(0x5832311c).d(this.f);
       }
       return;
    }
    public void m(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       a.p(p0, "response");
       this.j = 0;
       this.n = false;
       if (p0.getMTaskCompleted()) {
          this.r(p0);
          BaseFeed q = c.q;
          a.m(q);
          this.a(q);
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       super.o();
       this.a(c.q);
       this.m = null;
       b9.a(this.k);
       return;
    }
    public final String u(BaseFeed p0){
       String id;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          id = p0.getId();
          if (id != null) {
          label_001a :
             return id;
          }
       }
       id = "null";
       goto label_001a ;
    }
}
