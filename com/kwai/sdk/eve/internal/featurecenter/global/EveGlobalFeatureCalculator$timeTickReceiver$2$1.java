package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2$1;
import android.content.BroadcastReceiver;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2$1$onReceive$1;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;

public final class EveGlobalFeatureCalculator$timeTickReceiver$2$1 extends BroadcastReceiver	// class@001505
{
    public final EveGlobalFeatureCalculator$timeTickReceiver$2 this$0;

    public void EveGlobalFeatureCalculator$timeTickReceiver$2$1(EveGlobalFeatureCalculator$timeTickReceiver$2 p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveGlobalFeatureCalculator$timeTickReceiver$2$1.class, "1")) {
          return;
       }
       this.this$0.this$0.scatter(new EveGlobalFeatureCalculator$timeTickReceiver$2$1$onReceive$1(this));
       return;
    }
}
