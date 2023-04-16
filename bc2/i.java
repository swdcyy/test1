package bc2.i;
import z1.a;
import bc2.k;
import java.lang.Object;
import androidx.fragment.app.c;
import yb2.i;
import com.kuaishou.live.core.show.luckystar.openresult.LiveLuckyStarOpenResultFragment;
import bc2.g;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarBaseDialogFragment;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;

public final class i implements a	// class@0003d4
{
    public final k a;

    public void i(k p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       i ta = this.a;
       LiveLuckyStarOpenResultFragment liveLuckySta = LiveLuckyStarOpenResultFragment.vh(ta.a, 2);
       ta.f = liveLuckySta;
       liveLuckySta.k0(new g(ta));
       ta.f.Cb(p0, "LuckyStarResultLuckyUserDialogFragment");
    }
}
