package b8a.u$a;
import java.lang.Runnable;
import b8a.u;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import uc6.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;

public final class u$a implements Runnable	// class@0003f9
{
    public final u b;
    public final Bitmap c;

    public void u$a(u p0,Bitmap p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       c uoc;
       if (PatchProxy.applyVoid(null, this, u$a.class, "1")) {
          return;
       }
       e player = this.b.X8().getPlayer();
       a.o(player, "mPlayModule.player");
       IKwaiMediaPlayer iKwaiMediaPl = player.getIKwaiMediaPlayer();
       if (iKwaiMediaPl != null) {
          iKwaiMediaPl.setInteractiveMode(0);
       }
       if (this.c != null) {
          uoc = this.b.V8();
          a.m(uoc);
          uoc.h(this.c);
       }
       uoc = this.b.V8();
       a.m(uoc);
       uoc.k(this.b.X8().getPlayer());
       Activity activity = this.b.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.S2(this.b.W8());
       activity.b2(1);
       return;
    }
}
