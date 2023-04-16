package e31.e;
import java.lang.Runnable;
import e31.h;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveAudienceTaskConfig;
import f31.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import d61.c0;

public final class e implements Runnable	// class@002095
{
    public final h b;

    public void e(h p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "5")) {
       }else if(!tb.h.b(tb.g.mBizId)){
          b.Z(LiveLogTag.LIVE_TASK_CENTER, "tryStartTaskNormalGuide fail, frequency invalid");
       }else {
          tb.d(c0.a.b("/udata/pkg/kwai-client-image/live_task_center/live_task_center_normal.json"), 2, 0);
       }
       return;
    }
}
