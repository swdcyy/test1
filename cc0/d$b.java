package cc0.d$b;
import java.lang.Runnable;
import com.kwai.feature.api.pendant.activity.model.ActivityPendantModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.pendant.activity.model.ActivityPendantBubble;
import com.kuaishou.growth.pendant.activity.vm.ActivityPendantCommonVM;
import com.kuaishou.growth.pendant.activity.vm.ActivityPendantCommonVM$Companion;
import com.kuaishou.growth.pendant.activity.vm.ActivityCommonPendantEvent$ShowBubble;
import com.kuaishou.growth.pendant.activity.vm.ActivityCommonPendantEvent;

public final class d$b implements Runnable	// class@000308
{
    public final ActivityPendantModel b;

    public void d$b(ActivityPendantModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       ActivityPendantBubble bubble = this.b.getBubble();
       if (bubble != null) {
          ActivityPendantCommonVM.Companion.getActPendantCommonVM(this.b.getActivityId()).process(new ActivityCommonPendantEvent$ShowBubble(bubble));
       }
       return;
    }
}
