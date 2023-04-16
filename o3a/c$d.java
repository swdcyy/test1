package o3a.c$d;
import erd.g;
import o3a.c;
import java.lang.Object;
import rd5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import m3a.t;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import m3a.r;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import e1a.p;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.yxcorp.gifshow.detail.helper.d;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import android.graphics.Bitmap;
import kotlin.jvm.internal.a;
import m3a.o;

public final class c$d implements g	// class@00327b
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Bitmap uBitmap;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          o.C().w("SmallWindowPlayPresenter", "mPipModeObservable: "+p0.b(), objArray);
          if (!p0.b()) {
             QPhoto qPhoto = c.P8(this.b).a();
             if (qPhoto != null) {
                p0 = this.b;
                Objects.requireNonNull(p0);
                StringBuilder str = null;
                if (!PatchProxy.applyVoidOneRefs(qPhoto, p0, c.class, "7")) {
                   Object[] objArray2 = new Object[i];
                   o.C().w("SmallWindowPlayPresenter", "savePlayPosition: "+r.a(qPhoto), objArray2);
                   p0 = p0.S8();
                   if (p0 != null && !PatchProxy.applyVoidTwoRefs(p0, qPhoto, str, p.class, "2")) {
                      long currentPosit = p0.getCurrentPosition();
                      if (currentPosit - false > 0) {
                         p.d().f(qPhoto, currentPosit);
                      }else if(p0.isVideoRenderingStart() || p0.isAudioRenderingStart()){
                         p.d().h(qPhoto);
                      }
                   }
                }
                p0 = this.b.S8();
                if (p0 != null) {
                   if (!p0.isPlaying()) {
                      PlayerKitContentFrame playerKitCon = this.b.R8();
                      if (playerKitCon != null) {
                         uBitmap = playerKitCon.C();
                      label_00c5 :
                         o oo = o.C();
                         str = "play: "+p0.isPlaying()+", has bitmap ";
                         boolean b = (uBitmap != null)? true: false;
                         Object[] objArray1 = new Object[i];
                         oo.w("SmallWindowPlayPresenter", str+b, objArray1);
                         c t = this.b.t;
                         if (t == null) {
                            a.S("mDismissListener");
                         }
                         t.a(qPhoto, p.b(qPhoto), p0.isPlaying(), uBitmap);
                      }
                   }
                   uBitmap = str;
                   goto label_00c5 ;
                }
             }
          }
       }
       return;
    }
}
