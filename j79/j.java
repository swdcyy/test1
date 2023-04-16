package j79.j;
import erd.g;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import j79.l0;
import android.os.Handler;

public final class j implements g	// class@00277d
{
    public final MediaPreviewFragment b;

    public void j(MediaPreviewFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, MediaPreviewFragment.class, "22")) {
       }else {
          MediaPreviewFragment i = p0.i;
          if (i != null && i.t0().isSelected()) {
             p0.l.sendEmptyMessageDelayed(0, 30);
          }else {
             p0.fh();
          }
       }
       return;
    }
}
