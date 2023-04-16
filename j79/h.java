package j79.h;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$b;
import com.yxcorp.gifshow.album.preview.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import u79.o;
import u79.a;

public final class h implements MediaPreviewGenerateCoverManager$b	// class@002779
{
    public final d a;

    public void h(d p0){
       this.a = p0;
    }
    public final void a(int p0){
       h ta = this.a;
       Objects.requireNonNull(ta);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, uod, "10")) {
          o oo = ta.D(p0);
          if (oo != null) {
             oo.m();
          }
       }
       return;
    }
}
