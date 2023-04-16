package com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1$a$a;
import erd.g;
import com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1$a;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.bridge.RewardVideoTaskKt$rewardVideoTask$1;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import com.google.gson.Gson;
import com.kuaishou.growth.taskcenter.model.Reward;
import com.google.gson.JsonElement;
import z55.a;
import y55.a;
import p55.a;

public final class RewardVideoTaskKt$rewardVideoTask$1$a$a implements g	// class@000730
{
    public final RewardVideoTaskKt$rewardVideoTask$1$a b;

    public void RewardVideoTaskKt$rewardVideoTask$1$a$a(RewardVideoTaskKt$rewardVideoTask$1$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardVideoTaskKt$rewardVideoTask$1$a$a.class, "1")) {
       }else {
          RewardVideoTaskKt$rewardVideoTask$1 $bridgeConte = this.b.a.$bridgeContext;
          if ($bridgeConte != null) {
             p0 = p0.a();
             JsonObject jsonObject = null;
             if (p0 != null) {
                jsonObject = new JsonObject();
                jsonObject.H("taskCompleted", Boolean.valueOf(p0.getMTaskCompleted()));
                jsonObject.c0("toast", p0.getMToast());
                jsonObject.c0("reward", new Gson().q(p0.getMReward()));
                jsonObject = jsonObject.toString();
             }
             p0 = $bridgeConte.a(a.class);
             if (p0 != null) {
                p0.a("native_refresh_task_data", jsonObject);
             }
          }
       }
       return;
    }
}
