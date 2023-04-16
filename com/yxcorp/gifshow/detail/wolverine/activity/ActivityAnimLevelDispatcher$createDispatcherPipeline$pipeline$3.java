package com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher;
import java.lang.Object;
import s9a.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import z1.k;
import java.lang.Boolean;
import w27.a;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;
import s9a.d;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityPhoneLevelConfig;
import nsd.u;
import s9a.b;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityPhoneLevelInput;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.yxcorp.utility.AbiUtil;
import com.yxcorp.utility.SystemUtil;
import kotlin.Pair;
import qrd.r0;
import java.util.HashMap;
import trd.t0;

public final class ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$3 extends Lambda implements a	// class@001a8a
{
    public final ActivityAnimLevelDispatcher this$0;

    public void ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$3(ActivityAnimLevelDispatcher p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object[] objArray1;
       a a;
       boolean b;
       ActivityAnimLevelDispatcher uActivityAni = ActivityAnimLevelDispatcher.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$3 obj = PatchProxy.apply(objArray, this, ActivityAnimLevelDispatcher$createDispatcherPipeline$pipeline$3.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       if (obj.c != null) {
          Objects.requireNonNull(obj);
          objArray1 = PatchProxy.apply(objArray, obj, uActivityAni, "4");
          if (objArray1 != patchProxyRe) {
          label_00ee :
             return objArray1;
          }else {
             uActivityAni = obj.c;
             a.m(uActivityAni);
             Boolean uBoolean = uActivityAni.get();
             a = a.a;
             a.o(uBoolean, "isBizLowPhone");
             ActivityAnimLevel dEMOTION = (uBoolean.booleanValue())? ActivityAnimLevel.DEMOTION: ActivityAnimLevel.DEFAULT;
             a.c("wpl_bizLowPhonePerformanceDispatcher", dEMOTION.getKey());
             if (uBoolean.booleanValue()) {
                objArray = new d(ActivityAnimLevel.DEMOTION);
             }
          }
       }else {
          Objects.requireNonNull(obj);
          objArray1 = PatchProxy.apply(objArray, obj, uActivityAni, "5");
          if (objArray1 != patchProxyRe) {
             goto label_00ee ;
          }else {
             ActivityPhoneLevelConfig uActivityPho = new ActivityPhoneLevelConfig(false, false, 0, 0, 15, null);
             ActivityPhoneLevelInput uActivityPho1 = PatchProxy.applyOneRefs(objArray1, objArray, b.class, str);
             int i = 1;
             if (uActivityPho1 != patchProxyRe) {
             }else {
                a.p(objArray1, "config");
                ActivityPhoneLevelInput uActivityPho2 = new ActivityPhoneLevelInput(b.a(-404437045).e(objArray1.getPhoneLevelQuantile()), objArray1.isInLowPhoneList(), objArray1.isArm32LowPhone(), (AbiUtil.b() ^ 0x01), objArray1.getPhoneLevelQuantile(), objArray1.getLowPhoneRamTotalSizeLimit(), SystemUtil.t());
             }
             b = uActivityPho1.activityLowPhoneResult();
             Pair[] pairArray = new Pair[]{r0.a("input", uActivityPho1),r0.a("result", Boolean.valueOf(b))};
             a.a.b("wpl_LowPhonePerformanceDispatcher", t0.M(pairArray));
             if (b) {
                objArray = new d(ActivityAnimLevel.DEMOTION);
             }
          }
       }
       objArray1 = objArray;
       goto label_00ee ;
    }
}
