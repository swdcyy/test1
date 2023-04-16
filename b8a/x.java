package b8a.x;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.h;
import java.lang.Object;
import android.view.View;
import p5a.e;
import de5.a;
import m9a.y;
import java.lang.Float;
import java.util.List;
import sz9.w;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import sz9.w$b;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import java.lang.StringBuilder;
import java.lang.String;

public final class x implements View$OnClickListener	// class@000418
{
    public final h b;

    public void x(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       x tb = this.b;
       int i = tb.H.indexOf(Float.valueOf(y.d(tb.C.getPlayer())));
       float f = (i == (tb.H.size() - 1))? tb.H.get(0).floatValue(): tb.H.get((i + 1)).floatValue();
       w.i.a(tb.getActivity()).updateSpeed(f);
       if (tb.C.getPlayer() != null && (tb.C.getPlayer().getIKwaiMediaPlayer() != null && tb.C.getPlayer().getIKwaiMediaPlayer().getSpeed(0x3f800000) - f)) {
          tb.C.getPlayer().setSpeed(f);
       }
    label_007c :
       tb.S8("play_"+tb.R8(f));
       return;
    }
}
