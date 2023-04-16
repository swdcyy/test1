package gs1.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.selfanchor.LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import msd.l;

public final class d implements View$OnClickListener	// class@002572
{
    public final LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding b;
    public final LivePuzzleUserInfo c;

    public void d(LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding p0,LivePuzzleUserInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       LiveAudienceMultiLinePuzzleSelfAnchorWidgetDataBinding l = this.b.l;
       d tc = this.c;
       Integer integer = (tc != null)? Integer.valueOf(tc.countRecord): null;
       l.invoke(String.valueOf(integer));
       this.b.b(this.c);
       return;
    }
}
