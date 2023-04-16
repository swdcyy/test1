package l79.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c;

public final class b implements View$OnClickListener	// class@002cb7
{
    public final AlbumSelectedContainer b;

    public void b(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       AlbumSelectedContainer l = this.b.L;
       if (l == null) {
          a.L();
       }
       l.h0().o();
       return;
    }
}
