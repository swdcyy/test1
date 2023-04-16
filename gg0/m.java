package gg0.m;
import gg0.l;
import hg0.a;
import gg0.m$a;
import nsd.u;
import java.util.ArrayList;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.y0;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import hg0.b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.growth.taskcenter.model.customconfig.TaskCustomConfig;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchPhotoCountTaskCustomConfig;
import ig0.b;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ig0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import ekd.j;
import gg0.n;
import java.lang.Runnable;
import java.lang.Number;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import crd.b;
import lnc.b9;

public final class m extends a implements l	// class@0024e0
{
    public BaseFeed j;
    public int k;
    public boolean l;
    public b m;
    public y0 n;
    public static final List o;
    public static final m$a p;

    static {
       m.p = new m$a(null);
       m.o = new ArrayList();
    }
    public void m(TaskCommonParams p0){
       a.p(p0, "param");
       super(p0);
    }
    public void a(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "5")) {
          return;
       }
       m tj = this.j;
       if (tj != null && (a.g(tj, p0) ^ 0x01)) {
          return;
       }
       m tn = this.n;
       if (tn != null) {
          tn.e();
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "WatchPhotoCountTask", "pauseTimer", false, 4, null);
       return;
    }
    public void b(BaseFeed p0){
       boolean b;
       m tj;
       int[] mEffectPageL;
       List list;
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "3")) {
          return;
       }
       a.p(p0, "feed");
       if (this.f.isTaskComplete()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "WatchPhotoCountTask", "start timer failed, task is complete", false, 4, null);
          return;
       }else {
          String id = p0.getId();
          a.o(id, "feed.id");
          if (m.o.contains(id)) {
             TaskCenterLogUtil.e(TaskCenterLogUtil.b, "WatchPhotoCountTask", "startTimer: block by ÃüÖÐ·À×÷±×", false, 4, null);
             return;
          }else {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object[] objArray = null;
             TaskCustomConfig obj = PatchProxy.apply(objArray, this, om, "4");
             int i = 1;
             int i1 = 0;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = this.g().getMCustomConfig();
                WatchPhotoCountTaskCustomConfig mWatchPhotoC = (obj != null)? obj.getMWatchPhotoCountTaskCustomConfig(): objArray;
                if (mWatchPhotoC != null) {
                   if (mWatchPhotoC.getMEffectPageList() != null) {
                      mEffectPageL = mWatchPhotoC.getMEffectPageList();
                      a.m(mEffectPageL);
                      int i2 = (!mEffectPageL.length)? 1: 0;
                      if (i2 ^ i) {
                      label_0094 :
                         mEffectPageL = mWatchPhotoC.getMEffectPageList();
                         String[] mEffectPage21 = mWatchPhotoC.getMEffectPage2List();
                         ClientEvent$UrlPackage obj1 = PatchProxy.applyTwoRefs(mEffectPageL, mEffectPage21, objArray, b.class, "1");
                         if (obj1 != patchProxyRe) {
                            b = obj1.booleanValue();
                         }else if(mEffectPage21 != null){
                            tj = (!mEffectPage21.length)? 1: 0;
                            if (!tj) {
                               list = null;
                            label_00bc :
                               list = (!list)? ArraysKt___ArraysKt.Ey(mEffectPage21): CollectionsKt__CollectionsKt.E();
                               if (list.contains("ALL")) {
                                  TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterCheckUtil", "checkEffectPages: true, effectPages2 contains ALL", false, 4, null);
                               }else {
                                  ClientEvent$UrlPackage urlPackage = c.a.b();
                                  if (urlPackage == null) {
                                     TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterCheckUtil", "checkEffectPages: false, refer is null", false, 4, null);
                                  }else {
                                     obj1 = urlPackage.page;
                                     urlPackage = urlPackage.page2;
                                     TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterCheckUtil", "checkEffectPages, refPage="+obj1+", refPage2="+urlPackage, false, 4, null);
                                     if (!list.contains(urlPackage) && !j.c(mEffectPageL, obj1)) {
                                     }
                                  }
                               }
                            }
                         }
                         list = 1;
                         goto label_00bc ;
                      }
                   }
                   String[] mEffectPage2 = mWatchPhotoC.getMEffectPage2List();
                   if (mEffectPage2 != null) {
                      mEffectPage2 = (!mEffectPage2.length)? 1: 0;
                      if (!mEffectPage2) {
                         mEffectPageL = null;
                      label_0092 :
                         if (!mEffectPageL) {
                            goto label_0094 ;
                         }
                      }
                   }
                   mEffectPageL = 1;
                   goto label_0092 ;
                }
             label_0127 :
                b = true;
             }
             if (!b) {
                TaskCenterLogUtil.e(TaskCenterLogUtil.b, "WatchPhotoCountTask", "start timer failed, not in EffectPage", false, 4, null);
                return;
             }else {
                tj = this.j;
                if (tj == null || (a.g(tj, p0) ^ i)) {
                   this.k = i1;
                   this.j = p0;
                   this.l = i1;
                }
                if (!PatchProxy.applyVoid(objArray, this, om, "6") && this.n == null) {
                   this.n = new y0((long)1000, new n(this));
                }
                m tn = this.n;
                a.m(tn);
                tn.a();
                TaskCenterLogUtil.d(TaskCenterLogUtil.b, "WatchPhotoCountTask", "startTimer", false, 4, null);
                return;
             }
          }
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.k = 0;
       this.q(this.h());
       return;
    }
    public float h(){
       Object obj = PatchProxy.apply(null, this, m.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.f.getMCurrentProgress();
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, m.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.f.getMCurrentProgress() + 1);
    }
    public void l(){
       this.l = false;
       this.k = 0;
    }
    public void m(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "10")) {
          return;
       }
       a.p(p0, "response");
       this.k = 0;
       m tj = this.j;
       if (tj != null) {
          a.m(tj);
          String id = tj.getId();
          a.o(id, "mCurrentFeed!!.id");
          m.o.add(id);
       }
       this.q((float)this.f.getMCurrentProgress());
       this.a(this.j);
       if (p0.getMTaskCompleted()) {
          this.r(p0);
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, m.class, "7")) {
          return;
       }
       super.o();
       this.a(this.j);
       this.n = null;
       b9.a(this.m);
       return;
    }
}
