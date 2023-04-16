package d19.c;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.c;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import p5a.c;
import com.kwai.framework.player.core.b;
import android.graphics.Bitmap;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import rd5.i;
import io.reactivex.subjects.PublishSubject;

public final class c implements g	// class@002028
{
    public final c b;

    public void c(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != ActivityEvent.PAUSE || (!PatchProxy.applyVoid(null, tb, c.class, "6") && (tb.t != null && (tb.q.getPlayer().F() && (tb.q.getPlayer().isPlaying() || tb.q.getPlayer().isPaused()))))) {
          tb.r.onNext(i.b(tb.p.C(), 0));
       }
    label_004f :
       return;
    }
}
