package ig0.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import wh5.c;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.lang.StringBuilder;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ekd.j;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import com.kuaishou.growth.taskcenter.model.customconfig.TaskCustomConfig;
import com.kuaishou.growth.taskcenter.model.customconfig.WatchLiveTaskCustomConfig;
import java.util.Collection;
import zsd.u;

public final class b	// class@0028c2
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final boolean a(int p0,String p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b = (p0 || (!TextUtils.x(p1) && !a.g("UNKNOWN2", p1)))? true: false;
       return b;
    }
    public static final boolean b(int[] p0,String[] p1,int p2,String p3){
       boolean b;
       List list;
       int i = p1;
       int i1 = p2;
       String str = p3;
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       b = false;
       if (c.b()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterCheckUtil", "checkRestorePages: false, open  child lock", false, 4, null);
          return b;
       }else if(VisitorModeManager.f()){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskCenterCheckUtil", "checkRestorePages: false, open  visitor mode", false, 4, null);
          return b;
       }else {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterCheckUtil", "checkRestorePages , page="+i1+", page2="+str, false, 4, null);
          if (i) {
             int i2 = (!i.length)? 1: 0;
             if (!i2) {
                list = null;
             label_0085 :
                list = (!list)? ArraysKt___ArraysKt.Ey(p1): CollectionsKt__CollectionsKt.E();
                if (CollectionsKt___CollectionsKt.H1(list, str) || j.c(p0, i1)) {
                   b = true;
                }
                return b;
             }
          }
          list = 1;
          goto label_0085 ;
       }
    }
    public final boolean c(TaskCommonParams p0,String p1){
       List mRestrictive;
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "param");
       if (TextUtils.n(p0.getMTaskTypeId(), "watch_live_duration")) {
          TaskCustomConfig mCustomConfi = p0.getMCustomConfig();
          if (mCustomConfi != null) {
             WatchLiveTaskCustomConfig mWatchLiveTa = mCustomConfi.getMWatchLiveTaskCustomConfig();
             if (mWatchLiveTa != null) {
                mRestrictive = mWatchLiveTa.getMRestrictiveUserIds();
             label_0037 :
                b = (mRestrictive == null || mRestrictive.isEmpty())? true: false;
                if (!b) {
                   b = (p1 == null || u.S1(p1))? 1: 0;
                   if (b || !mRestrictive.contains(p1)) {
                      return false;
                   }
                }
             }
          }
          mRestrictive = null;
          goto label_0037 ;
       }
    label_005b :
       return true;
    }
}
