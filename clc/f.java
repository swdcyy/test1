package clc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import clc.d;
import clc.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.entity.QPhoto;

public class f extends PresenterV2	// class@0005cc
{
    public QPhoto p;
    public a q;
    public PhotoDetailParam r;
    public final b$b s;
    public final IMediaPlayer$OnPreparedListener t;

    public void f(){
       super();
       this.s = new d(this);
       this.t = new e(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       f tq = this.q;
       if (tq != null && tq.getPlayer() != null) {
          this.q.getPlayer().w(this.s);
          tq = this.r;
          if (tq != null) {
             PhotoDetailParam mPhoto = tq.mPhoto;
             if (mPhoto != null && this.p == mPhoto) {
                this.q.getPlayer().addOnPreparedListener(this.t);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tq = this.q;
       if (tq != null && tq.getPlayer() != null) {
          this.q.getPlayer().O(this.s);
          this.q.getPlayer().removeOnPreparedListener(this.t);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       this.r = this.q8(PhotoDetailParam.class);
       return;
    }
}
