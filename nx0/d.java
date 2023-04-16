package nx0.d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import nx0.e;
import nx0.y;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nx0.x$c$b;
import nx0.x$c;
import nx0.x;

public final class d extends m	// class@0033e9
{
    public final LiveAudienceOverRoomV2View c;
    public final e d;
    public final y e;

    public void d(LiveAudienceOverRoomV2View p0,e p1,y p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       this.d.c.w0(new x$c$b(this.c.getClickAreaType()));
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
