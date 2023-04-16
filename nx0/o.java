package nx0.o;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.audience.component.broadcastbanner.overroomv2.LiveAudienceOverRoomV2View;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnClickListener;

public final class o extends m	// class@0033f6
{
    public final LiveAudienceOverRoomV2View c;

    public void o(LiveAudienceOverRoomV2View p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       View$OnClickListener closeClickLi = this.c.getCloseClickListener();
       if (closeClickLi != null) {
          closeClickLi.onClick(p0);
       }
       return;
    }
}
