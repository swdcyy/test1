package fs1.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import e17.i;
import sq1.a;
import java.lang.Integer;
import msd.l;

public final class c implements View$OnClickListener	// class@002392
{
    public final LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding b;
    public final boolean c;
    public final LivePuzzleUserInfo d;

    public void c(LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding p0,boolean p1,LivePuzzleUserInfo p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       Objects.requireNonNull(tb);
       LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding liveAudience = LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding.class;
       if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(tc), td, tb, liveAudience, "5")) {
          if (tc != null) {
             i.a(R.style.arg_RES_7f11066a, 0x7f102ae5);
          }else if(td != null){
             LivePuzzleUserInfo quickComment = td.quickCommentRouter;
             if (quickComment != null) {
                tb.k.k(quickComment);
             }
          }
          LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding n = tb.n;
          Integer integer = (td != null)? Integer.valueOf(td.countRecord): null;
          n.invoke(String.valueOf(integer));
       }
       return;
    }
}
