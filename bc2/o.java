package bc2.o;
import z1.a;
import bc2.t;
import java.lang.String;
import java.lang.Object;
import androidx.fragment.app.c;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.LiveLuckyStarCurrentInfoFragmentV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import bc2.m;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;

public final class o implements a	// class@0003da
{
    public final t a;
    public final String b;

    public void o(t p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       o ta = this.a;
       o tb = this.b;
       t a = ta.a;
       LiveLuckyStarCurrentInfoFragmentV2 liveLuckySta = PatchProxy.applyTwoRefs(a, tb, null, LiveLuckyStarCurrentInfoFragmentV2.class, "1");
       if (liveLuckySta != PatchProxyResult.class) {
       }else {
          liveLuckySta = new LiveLuckyStarCurrentInfoFragmentV2();
          liveLuckySta.C = a;
          liveLuckySta.D = Optional.fromNullable(tb);
       }
       ta.d = liveLuckySta;
       liveLuckySta.k0(new m(ta));
       ta.d.Cb(p0, "LiveLuckyStarCurrentInfoFragmentV2");
       return;
    }
}
