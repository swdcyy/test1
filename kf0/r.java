package kf0.r;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import wkd.b;
import tjc.c;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import wh5.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import tkd.b;
import tkd.d;
import fp5.a;
import lnc.l1;
import rkd.b;
import ig0.b;
import java.lang.StringBuilder;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import ekd.j;
import java.util.Objects;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.growth.pendant.core.demotion.PendantAnimPlan;
import com.kuaishou.growth.pendant.task.debugtool.TaskPendantDTHelper;
import df0.b;
import mrd.a;

public final class r	// class@002d1d
{
    public static final r a;

    static {
       r.a = new r();
    }
    public void r(){
       super();
    }
    public static final boolean a(Activity p0,TaskCommonParams p1,int p2,String p3,String p4){
       TaskCenterLogUtil b;
       object oobject = p0;
       object oobject1 = p1;
       int i = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       r or = r.class;
       String[] stringArray = null;
       int i1 = 1;
       if (PatchProxy.isSupport(or)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),oobject2,oobject3};
          Object obj = PatchProxy.apply(objArray, stringArray, or, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (b.a(-1608526086).S()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, has splash now", false, 4, null);
          return 0;
       }else if(c.b()){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, open child lock", false, 4, null);
          return 0;
       }else if(VisitorModeManager.f()){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, open visitor mode", false, 4, null);
          return 0;
       }else if(oobject1 == null){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, data is null", false, 4, null);
          return 0;
       }else if(!p1.getMActivityTask()){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, data is not activity task", false, 4, null);
          return 0;
       }else if(d.a(0x31a55ac8).s0(oobject)){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, HomeActivity is in pip mode", false, 4, null);
          return 0;
       }else if(!p1.getMIsMiniGame() && (l1.a() && !b.g())){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, isLandscape", false, 4, null);
          return 0;
       }else if(!b.a.c(oobject1, oobject3)){
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant: false, live task with restrictive user ids, "+"constraint - "+oobject3+" not hit", false, 4, null);
          return 0;
       }else {
          TaskPendantConfig mPendantConf = p1.getMPendantConfig();
          int[] mShowPageLis = (mPendantConf != null)? mPendantConf.getMShowPageList(): stringArray;
          if (j.g(mShowPageLis)) {
             mPendantConf = p1.getMPendantConfig();
             String[] mShowPage2Li = (mPendantConf != null)? mPendantConf.getMShowPage2List(): stringArray;
             if (j.h(mShowPage2Li)) {
                TaskCenterLogUtil.e(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "canShowTaskPendant, showPages is null", false, 4, null);
                return 0;
             }
          }
          r a = r.a;
          mPendantConf = p1.getMPendantConfig();
          mShowPageLis = (mPendantConf != null)? mPendantConf.getMShowPageList(): stringArray;
          TaskPendantConfig mPendantConf1 = p1.getMPendantConfig();
          if (mPendantConf1 != null) {
             stringArray = mPendantConf1.getMShowPage2List();
          }
          List obj1 = stringArray;
          Objects.requireNonNull(a);
          if (PatchProxy.isSupport(or)) {
             String obj2 = PatchProxy.applyFourRefs(mShowPageLis, obj1, Integer.valueOf(p2), p3, a, r.class, "2");
             if (obj2 != PatchProxyResult.class) {
                i1 = obj2.booleanValue();
             }else {
             label_018b :
                b = TaskCenterLogUtil.b;
                TaskCenterLogUtil.d(b, "TaskPendantCheckUtil", "checkShowPages , page="+i+", page2="+oobject2, false, 4, null);
                if (obj1 != null) {
                   obj2 = (!obj1.length)? 1: 0;
                   if (!obj2) {
                      obj2 = null;
                   label_01bd :
                      obj1 = (!obj2)? ArraysKt___ArraysKt.Ey(obj1): CollectionsKt__CollectionsKt.E();
                      if (obj1.contains("ALL")) {
                         TaskCenterLogUtil.d(b, "TaskPendantCheckUtil", "checkShowPages: true, pages2 contains ALL", false, 4, null);
                      }else if(CollectionsKt___CollectionsKt.H1(obj1, oobject2) || j.c(mShowPageLis, i)){
                         i1 = false;
                      }
                   }
                }
                obj2 = 1;
                goto label_01bd ;
             }
          }else {
             goto label_018b ;
          }
          return i1;
       }
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = PendantAnimPlan.a();
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantCheckUtil", "isDemote = "+b, false, 4, null);
       TaskPendantDTHelper c = TaskPendantDTHelper.c;
       Objects.requireNonNull(c);
       TaskPendantDTHelper taskPendantD = TaskPendantDTHelper.class;
       if (!PatchProxy.isSupport(taskPendantD) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), c, taskPendantD, "5") && (!c.c() && c.a().a() != b))) {
          c.a().b = b;
          c.b().onNext(Integer.valueOf(2));
       }
    label_0071 :
       return b;
    }
}
