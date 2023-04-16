package b79.b;
import p79.f;
import b79.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import java.lang.CharSequence;
import android.widget.TextView;

public final class b implements f	// class@00037d
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       SizeAdjustableTextView sizeAdjustab = this.a.e().n();
       if (sizeAdjustab != null) {
          sizeAdjustab.setText("");
       }
       return;
    }
}
