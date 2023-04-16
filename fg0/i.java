package fg0.i;
import yt5.e;
import fg0.i$a;
import nsd.u;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import wkd.b;
import fg0.l;
import hg0.b;
import gg0.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import fg0.h;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Set;
import k2b.k2;
import k2b.u1;
import ig0.b;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import ig0.e;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.framework.model.user.User;
import fg0.i$b;
import kp.r1;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kuaishou.growth.taskcenter.model.customconfig.TaskCustomConfig;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchLiveTaskCustomConfig;
import java.util.List;
import java.util.Collection;
import ekd.q;
import tkd.b;
import tkd.d;
import yt5.j;
import java.lang.Integer;
import java.util.Map;

public final class i implements e	// class@002327
{
    public boolean a;
    public Runnable b;
    public static final i$a c;

    static {
       i.c = new i$a(null);
    }
    public void i(){
       super();
    }
    public void a(Activity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, i.class, "6")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "userId");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveTaskManagerImpl", "onLiveSidebarOpenOrClose, open: "+p2, false, 4, null);
       b uob = b.a(-1524711258).D();
       if (!uob instanceof h) {
          uob = null;
       }
       if (uob != null) {
          if (!p0 instanceof GifshowActivity) {
             return;
          }else if(!p2){
             this.j(uob, p1, null);
          }
       }
       return;
    }
    public void b(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveTaskManagerImpl", "onLiveStreamStop", false, 4, null);
       h.a = false;
       h.c = null;
       this.h();
       this.a = true;
       return;
    }
    public void c(String p0,BaseFeed p1,GifshowActivity p2,Set p3){
       String str;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, i.class, "7")) {
          return;
       }
       a.p(p1, "liveFeed");
       a.p(p2, "gifshowActivity");
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "LiveTaskManagerImpl", "startInitiativeBrowseLiveTask, mLiveStopped: "+this.a, false, 4, null);
       if (this.a != null) {
          return;
       }
       k2 ok2 = u1.j();
       if (ok2 != null) {
          k2 c = ok2.c;
          ok2 = ok2.d;
          if (!b.a(c, ok2)) {
             c = p2.getPage();
             str = p2.o();
          }
          TaskCommonParams taskCommonPa = e.d(p0);
          if (taskCommonPa == null) {
             TaskCenterLogUtil.e(b, "LiveTaskManagerImpl", "startInitiativeBrowseLiveTask failed, taskWidgetParams is null", false, 4, null);
             return;
          }else {
             b.a(-1524711258).i2(taskCommonPa, p2, c, str);
             b uob = b.a(-1524711258).D();
             if (!uob instanceof h) {
                uob = null;
             }
             if (uob != null) {
                uob.b(p1);
             }
          }
       }
       return;
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       a.p(p0, "activity");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveTaskManagerImpl", "onLiveFragmentPause", false, 4, null);
       i tb = this.b;
       if (tb != null) {
          k1.m(tb);
          this.b = null;
       }
       h.b = false;
       this.h();
       return;
    }
    public void e(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       a.p(p0, "user");
       return;
    }
    public void f(Activity p0,BaseFeed p1,Set p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       String str = "liveFeed";
       a.p(p1, str);
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveTaskManagerImpl", "onLiveStreamStart", false, 4, null);
       this.a = false;
       if (!PatchProxy.applyVoidOneRefs(p1, null, h.class, "1")) {
          a.p(p1, str);
          h.a = true;
          h.c = p1;
       }
       this.i(p1, null);
       return;
    }
    public void g(Activity p0,Fragment p1,BaseFeed p2,Set p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, i.class, "3")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "fragment");
       a.p(p2, "liveFeed");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveTaskManagerImpl", "onLiveFragmentResume", false, 4, null);
       i tb = this.b;
       if (tb != null) {
          k1.m(tb);
          this.b = null;
       }
       i$b uob = new i$b(this, p1, p2);
       this.b = uob;
       k1.r(uob, (long)200);
       return;
    }
    public final void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "9")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveTaskManagerImpl", "pauseBrowseLiveTaskIfNeed", false, 4, null);
       b uob = b.a(-1524711258).D();
       if (uob instanceof h) {
          objArray = uob;
       }
       if (objArray != null) {
          objArray.u();
       }
       return;
    }
    public final void i(BaseFeed p0,Fragment p1){
       String str1;
       i oi = i.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oi, "8")) {
          return;
       }
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "LiveTaskManagerImpl", "startBrowseLiveTaskIfNeed, mLiveStopped: "+this.a, false, 4, null);
       if (this.a != null) {
          return;
       }
       String str = r1.U1(p0);
       b uob = b.a(-1524711258).D();
       if (uob == null && !PatchProxy.applyVoidTwoRefs(str, p1, this, oi, "10")) {
          TaskCenterLogUtil.d(b, "LiveTaskManagerImpl", "tryRestoreTask", false, 4, null);
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          if (!uActivity instanceof GifshowActivity) {
             uActivity = null;
          }
          if (uActivity != null) {
             k2 ok2 = u1.j();
             if (ok2 != null) {
                k2 c = ok2.c;
                ok2 = ok2.d;
                if (!b.a(c, ok2) && p1 instanceof BaseFragment) {
                   BaseFragment uBaseFragmen = p1;
                   c = uBaseFragmen.getPage();
                   str1 = uBaseFragmen.o();
                }
                b.a(-1524711258).C(uActivity, c, str1, str);
             }
          }
       }
    label_0093 :
       if (!uob instanceof h) {
          return;
       }else {
          this.j(uob, str, p1);
          uob.b(p0);
          return;
       }
    }
    public final void j(b p0,String p1,Fragment p2){
       String str;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "11")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LiveTaskManagerImpl", "tryShowTask", false, 4, null);
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       List list = null;
       if (!uActivity instanceof GifshowActivity) {
          uActivity = list;
       }
       if (uActivity != null) {
          k2 ok2 = u1.j();
          if (ok2 != null) {
             k2 c = ok2.c;
             ok2 = ok2.d;
             if (!b.a(c, ok2) && p2 instanceof BaseFragment) {
                c = p2.getPage();
                str = p2.o();
             }
             TaskCustomConfig mCustomConfi = p0.g().getMCustomConfig();
             if (mCustomConfi != null) {
                WatchLiveTaskCustomConfig mWatchLiveTa = mCustomConfi.getMWatchLiveTaskCustomConfig();
                if (mWatchLiveTa != null) {
                   list = mWatchLiveTa.getMRestrictiveUserIds();
                }
             }
             if (!q.f(list)) {
                d.a(-1573231572).mg(uActivity, c, str, p1);
                if (!PatchProxy.applyVoidTwoRefs(uActivity, p1, p0, b.class, "5") && p1 != null) {
                   p0.b.put(Integer.valueOf(uActivity.hashCode()), p1);
                }
             }
          }
       }
    label_0091 :
       return;
    }
}
