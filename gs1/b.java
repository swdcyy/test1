package gs1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b implements View$OnClickListener	// class@002570
{
    public final LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding b;
    public final LivePuzzleUserInfo c;

    public void b(LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding p0,LivePuzzleUserInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.b.b(this.c);
       return;
    }
}
