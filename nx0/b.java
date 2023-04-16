package nx0.b;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View$a;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import nx0.e;
import nx0.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nx0.x$c$c;
import nx0.x$c;
import nx0.x;
import nx0.a;
import android.view.View;
import android.view.ViewGroup;

public final class b implements LiveAudienceOverRoomV2View$a	// class@0033e7
{
    public final LiveAudienceOverRoomV2View a;
    public final e b;
    public final y c;

    public void b(LiveAudienceOverRoomV2View p0,e p1,y p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onDismiss(){
       if (PatchProxy.applyVoidWithListener(null, this, b.class, "1")) {
          return;
       }
       this.b.c.w0(x$c$c.a);
       this.b.b.c.removeView(this.a);
       this.b.b.a = null;
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
