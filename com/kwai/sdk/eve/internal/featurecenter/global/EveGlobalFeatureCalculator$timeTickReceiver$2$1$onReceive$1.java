package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2$1$onReceive$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import com.kwai.sdk.eve.InitConfig;
import vm7.a;
import h97.g;
import java.lang.CharSequence;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.lang.StringBuilder;

public final class EveGlobalFeatureCalculator$timeTickReceiver$2$1$onReceive$1 implements Runnable	// class@001504
{
    public final EveGlobalFeatureCalculator$timeTickReceiver$2$1 this$0;

    public void EveGlobalFeatureCalculator$timeTickReceiver$2$1$onReceive$1(EveGlobalFeatureCalculator$timeTickReceiver$2$1 p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveGlobalFeatureCalculator$timeTickReceiver$2$1$onReceive$1.class, "1")) {
          return;
       }
       g og = this.this$0.this$0.this$0.eveContext.b().b();
       String userId = (og != null)? og.getUserId(): objArray;
       StringBuilder str = (userId == null || !userId.length())? 1: null;
       if (str) {
          EveLog.i$default("EveGlobalFeatureCalculator timeTickReceiver uid is empty, do nothing, should not happen", false, 2, objArray);
          return;
       }else {
          EveLog.i$default("EveGlobalFeatureCalculator timeTickReceiver uid:"+userId+", triggerFeatureReportInferIfNeed", false, 2, objArray);
          this.this$0.this$0.this$0.triggerFeatureReportInferIfNeed(userId);
          return;
       }
    }
}
