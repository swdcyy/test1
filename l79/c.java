package l79.c;
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

public final class c implements View$OnClickListener	// class@002cb8
{
    public final AlbumSelectedContainer b;

    public void c(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       AlbumSelectedContainer m = this.b.M;
       if (m == null) {
          a.L();
       }
       m.h0().o();
       return;
    }
}
