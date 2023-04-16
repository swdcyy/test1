package g7a.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class d implements Runnable	// class@0023d3
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void run(){
       a a;
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, a.class, "6")) {
       }else {
          a = tb.A;
          if (a != null && a.getPlayer() != null) {
             if (!tb.A.getPlayer().isPlaying() && (!tb.t.isSinglePhoto() && (tb.t.isAtlasPhotos() || tb.t.isLongPhotos()))) {
                tb.q = tb.q + tb.R8();
             }
             if (tb.B == null && tb.q - 3000 > 0) {
                tb.B = true;
                tb.r.v.onNext(Boolean.TRUE);
             }
          }
       }
       return;
    }
}
