package d31.b;
import lf3.g;
import d31.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import e31.h;
import com.kuaishou.live.core.basic.model.LiveAudienceTaskConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import x32.a;
import d61.c0;
import lf3.f;

public final class b implements g	// class@001efd
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       LiveLogTag lIVE_TASK_CE = LiveLogTag.LIVE_TASK_CENTER;
       b.c0(lIVE_TASK_CE, "onReceiveUserTaskStatusChange", "msg", p0);
       if (p0.taskStatus == 1 && tb.M != null) {
          b.Z(lIVE_TASK_CE, "startTaskFinishGuide");
          e m = tb.M;
          m.g.mTaskFinishUrl = p0.jumpUrl;
          if (!PatchProxy.applyVoid(null, m, h.class, "6") && m.e.Ck()) {
             m.d(c0.a.b("/udata/pkg/kwai-client-image/live_task_center/live_task_center_finish.json"), 3, 1);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
