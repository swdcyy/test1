package gf0.a;
import java.lang.Object;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.Integer;
import java.lang.Number;
import java.text.DecimalFormat;
import kf0.s;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import com.kuaishou.growth.pendant.core.demotion.PendantAnimPlan;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public final class a	// class@0024b8
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final i3 a(TaskCommonParams p0,float p1,float p2){
       i3 obj;
       Integer integer1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, a.class, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = i3.f();
       obj.d("activity_id", p0.getMActivityId());
       obj.d("task_token", p0.getMTaskToken());
       obj.d("task_type", p0.getMTaskTypeId());
       obj.c("is_time_done", Integer.valueOf(p0.isTaskComplete()));
       String str = (p1 - (float)0 <= 0)? "LEFT": "RIGHT";
       obj.d("x", str);
       if (PatchProxy.isSupport(a.class)) {
          str = PatchProxy.applyOneRefs(Float.valueOf(p2), this, a.class, "10");
          if (str != patchProxyRe) {
          label_008e :
             obj.d("y", str);
             obj.a("is_tk", Boolean.valueOf(p0.getMIsTK()));
             TaskPendantConfig mPendantConf = p0.getMPendantConfig();
             Integer integer = null;
             str = (mPendantConf != null)? mPendantConf.getMTkBundleId(): integer;
             obj.d("tk_bundle_id", str);
             obj.c("is_demote", Integer.valueOf(PendantAnimPlan.a()));
             obj.c("target_progress", Integer.valueOf(p0.getMTargetProgress()));
             mPendantConf = p0.getMPendantConfig();
             if (mPendantConf != null) {
                TaskUIConfig mUiConfig = mPendantConf.getMUiConfig();
                if (mUiConfig != null) {
                   integer1 = Integer.valueOf(mUiConfig.getMXPolicy());
                label_00e2 :
                   obj.c("x_policy", integer1);
                   TaskPendantConfig mPendantConf1 = p0.getMPendantConfig();
                   if (mPendantConf1 != null) {
                      TaskUIConfig mUiConfig1 = mPendantConf1.getMUiConfig();
                      if (mUiConfig1 != null) {
                         integer = Integer.valueOf(mUiConfig1.getMStyle());
                      }
                   }
                   obj.c("ui_style", integer);
                   a.o(obj, "JsonStringBuilder.newIns\x20\x02onfig?.mUiConfig?.mStyle\)\x00");
                   return obj;
                }
             }
             integer1 = integer;
             goto label_00e2 ;
          }
       }
       str = new DecimalFormat("0.##").format(Float.valueOf((p2 / (float)s.d.c())));
       a.o(str, "DecimalFormat\(\"0.##\"\).fo¡­onUtil.getScreenHeight\(\)\)");
       goto label_008e ;
    }
    public final void b(TaskCommonParams p0,float p1,float p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, a.class, "2")) {
          return;
       }
       a.p(p0, "taskParams");
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setType(1);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OP_ACTIVITY_NEW_TASK_PENDANT";
       i3 oi3 = a.a.a(p0, p1, p2);
       String str = (p3)? "TRUE": "FALSE";
       oi3.d("is_jump", str);
       uElementPack.params = oi3.e();
       uClickMetaDa.setElementPackage(uElementPack);
       u1.B(uClickMetaDa);
       return;
    }
    public final void c(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "7")) {
          return;
       }
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setType(1);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OP_ACTIVITY_NEW_TASK_PENDANT_POPUP";
       i3 oi3 = i3.f();
       oi3.d("activity_id", p0);
       oi3.d("task_token", p1);
       oi3.d("click_title", p2);
       uElementPack.params = oi3.e();
       uClickMetaDa.setElementPackage(uElementPack);
       u1.B(uClickMetaDa);
       return;
    }
    public final void d(TaskCommonParams p0,float p1,float p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, a.class, "1")) {
          return;
       }
       a.p(p0, "taskParams");
       ShowMetaData showMetaData = new ShowMetaData();
       showMetaData.setType(10);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "OP_ACTIVITY_NEW_TASK_PENDANT";
       uElementPack.params = a.a.a(p0, p1, p2).e();
       showMetaData.setElementPackage(uElementPack);
       u1.B0(showMetaData);
       return;
    }
}
