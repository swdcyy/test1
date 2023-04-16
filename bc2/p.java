package bc2.p;
import z1.a;
import bc2.t;
import java.lang.Object;
import androidx.fragment.app.c;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultFragmentV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultPanelState;
import bc2.n;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;

public final class p implements a	// class@0003db
{
    public final t a;
    public final boolean b;

    public void p(t p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       LiveLuckyStarOpenResultFragmentV2 liveLuckySta;
       p ta = this.a;
       p tb = this.b;
       t a = ta.a;
       if (PatchProxy.isSupport(LiveLuckyStarOpenResultFragmentV2.class)) {
          liveLuckySta = PatchProxy.applyTwoRefs(a, Boolean.valueOf(tb), null, LiveLuckyStarOpenResultFragmentV2.class, "1");
          if (liveLuckySta != PatchProxyResult.class) {
          label_0036 :
             ta.e = liveLuckySta;
             liveLuckySta.k0(new n(ta));
             ta.e.Cb(p0, "LiveLuckyStarOpenResultFragmentV2");
             return;
          }
       }
       liveLuckySta = new LiveLuckyStarOpenResultFragmentV2();
       liveLuckySta.B = a;
       LiveLuckyStarOpenResultPanelState oPENED = (tb != null)? LiveLuckyStarOpenResultPanelState.OPENED: LiveLuckyStarOpenResultPanelState.ROLLING;
       liveLuckySta.C = oPENED;
       goto label_0036 ;
    }
}
