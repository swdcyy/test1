package nx1.o;
import erd.g;
import nx1.q;
import nx1.j;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;

public final class o implements g	// class@003418
{
    public final q b;
    public final j c;
    public final LiveInteractiveWidgetProto$LiveInteractiveWidget d;

    public void o(q p0,j p1,LiveInteractiveWidgetProto$LiveInteractiveWidget p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       o tb = this.b;
       o tc = this.c;
       o td = this.d;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(tc, td, tb, q.class, "6")) {
       }else {
          b.d0(LiveLogTag.LIVE_SCENE_ACTIVITY_WIDGET, "onKDSLoadFail", "taskKey", tc.a(), "widgetId", td.widgetId);
          tc.c();
          tb.b.remove(tc);
       }
       return;
    }
}
