package i19.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.framework.player.core.b;

public final class e extends PresenterV2	// class@002609
{
    public QPhoto p;
    public a q;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       e tq = this.q;
       if (tq == null) {
          a.S("mPlayModule");
       }
       tq = tq.getPlayer();
       if (tq != null) {
          e tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(tp);
          if (photoAdverti != null) {
             PhotoAdvertisement mVideoPlaySt = photoAdverti.mVideoPlayStartTimeMS;
             if (mVideoPlaySt > 0 && mVideoPlaySt - tq.getDuration() < 0) {
                tq = this.q;
                if (tq == null) {
                   a.S("mPlayModule");
                }
                tq = tq.getPlayer();
                if (tq != null) {
                   tq.seekTo(photoAdverti.mVideoPlayStartTimeMS);
                }
             }
          label_004c :
             photoAdverti.mVideoPlayStartTimeMS = 0;
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.q = obj;
       return;
    }
}
