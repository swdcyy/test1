package bc2.j;
import z1.a;
import bc2.k;
import java.lang.String;
import java.lang.Object;
import androidx.fragment.app.c;
import com.kuaishou.live.core.show.luckystar.currentinfo.LiveLuckyStarCurrentInfoFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import bc2.e;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;

public final class j implements a	// class@0003d5
{
    public final k a;
    public final String b;

    public void j(k p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       j ta = this.a;
       j tb = this.b;
       k a = ta.a;
       LiveLuckyStarCurrentInfoFragment liveLuckySta = PatchProxy.applyTwoRefs(a, tb, null, LiveLuckyStarCurrentInfoFragment.class, "1");
       if (liveLuckySta != PatchProxyResult.class) {
       }else {
          liveLuckySta = new LiveLuckyStarCurrentInfoFragment();
          liveLuckySta.t = a;
          liveLuckySta.u = Optional.fromNullable(tb);
       }
       ta.d = liveLuckySta;
       liveLuckySta.k0(new e(ta));
       ta.d.Cb(p0, "LiveLuckyStarCurrentInfoFragment");
       return;
    }
}
