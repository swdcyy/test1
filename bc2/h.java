package bc2.h;
import z1.a;
import bc2.k;
import java.lang.Object;
import androidx.fragment.app.c;
import yb2.i;
import com.kuaishou.live.core.show.luckystar.openresult.LiveLuckyStarOpenResultFragment;
import bc2.f;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;

public final class h implements a	// class@0003d3
{
    public final k a;

    public void h(k p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       h ta = this.a;
       LiveLuckyStarOpenResultFragment liveLuckySta = LiveLuckyStarOpenResultFragment.vh(ta.a, 1);
       ta.e = liveLuckySta;
       liveLuckySta.k0(new f(ta));
       ta.e.Cb(p0, "LuckyStarResultRollUserDialogFragment");
    }
}
