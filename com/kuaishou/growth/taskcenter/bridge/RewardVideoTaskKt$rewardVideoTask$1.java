package com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import f55.g;
import com.kuaishou.growth.taskcenter.model.RewardVideoTaskParams;
import android.app.Activity;
import p55.a;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.api.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import am9.a;
import com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1$a;
import android.content.Context;
import ql9.q;
import android.os.Bundle;

public final class RewardVideoTaskKt$rewardVideoTask$1 extends Lambda implements l	// class@000732
{
    public final Activity $activity;
    public final a $bridgeContext;
    public final g $callback;
    public final RewardVideoTaskParams $taskParams;

    public void RewardVideoTaskKt$rewardVideoTask$1(g p0,RewardVideoTaskParams p1,Activity p2,a p3){
       this.$callback = p0;
       this.$taskParams = p1;
       this.$activity = p2;
       this.$bridgeContext = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardVideoTaskKt$rewardVideoTask$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.$callback.onSuccess(new JsSuccessResult());
          a uoa = new a();
          uoa.b = this.$taskParams.getMAdIncentiveVideoToastImageUrl();
          uoa.a = this.$taskParams.getMAdIncentiveVideoToastDesc();
          p0.i(uoa);
          p0.j(this.$activity, new RewardVideoTaskKt$rewardVideoTask$1$a(this, p0));
       }else {
          this.$callback.a(0x1e84a, "plugin install fails", null);
       }
       return;
    }
}
