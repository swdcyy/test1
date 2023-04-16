package dlc.e0;
import tkc.c;
import dlc.h0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.util.Objects;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p5a.c;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.kwai.framework.player.core.b;
import java.lang.Runnable;

public final class e0 implements c	// class@002241
{
    public final h0 a;

    public void e0(h0 p0){
       this.a = p0;
    }
    public final void a(QPhoto p0,String p1){
       e0 ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 != null) {
          h0 r = ta.r;
          r.mPhoto = p0;
          r.setSlidePlayId(p1);
          if (!PatchProxy.applyVoid(null, ta, h0.class, "10")) {
             c uoc = QPhotoMediaPlayerCacheManager.d(ta.r.mPhoto);
             if (uoc != null) {
                uoc.release();
             }
          }
          ta.s.run();
       }
       return;
    }
}
