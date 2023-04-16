package com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1$a;
import ql9.q;
import com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1;
import com.yxcorp.gifshow.commercial.api.b;
import java.lang.Object;
import ql9.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import com.kuaishou.growth.taskcenter.model.RewardVideoTaskParams;
import wkd.b;
import zf0.c;
import java.lang.System;
import brd.t;
import com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1$a$a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import ql9.p;

public final class RewardVideoTaskKt$rewardVideoTask$1$a implements q	// class@000731
{
    public final RewardVideoTaskKt$rewardVideoTask$1 a;
    public final b b;

    public void RewardVideoTaskKt$rewardVideoTask$1$a(RewardVideoTaskKt$rewardVideoTask$1 p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(boolean p0,o p1){
       RewardVideoTaskKt$rewardVideoTask$1$a orewardVideo = RewardVideoTaskKt$rewardVideoTask$1$a.class;
       if (PatchProxy.isSupport(orewardVideo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, orewardVideo, "1")) {
          return;
       }
       a.p(p1, "rewardInfo");
       this.b.d();
       if (!p0) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "RewardVideoTask", "taskReport: bizId = "+this.a.$taskParams.getMBizId()+", taskToken = "+this.a.$taskParams.getMTaskToken()+", eventId = "+this.a.$taskParams.getMEventId()+", reportValue = "+this.a.$taskParams.getMTargetCount(), false, 4, null);
       b.a(-449945749).a(this.a.$taskParams.getMBizId(), this.a.$taskParams.getMTaskToken(), this.a.$taskParams.getMEventId(), (long)this.a.$taskParams.getMTargetCount(), String.valueOf(System.currentTimeMillis())).subscribe(new RewardVideoTaskKt$rewardVideoTask$1$a$a(this), Functions.e);
       return;
    }
    public void onFirstFrame(){
       p.a(this);
    }
    public void r(){
       p.c(this);
    }
}
