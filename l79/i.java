package l79.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import android.widget.TextView;
import android.view.View;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class i implements Runnable	// class@002cbe
{
    public final AlbumSelectedContainer b;

    public void i(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       AlbumSelectedContainer m = this.b.M;
       if (m == null) {
          a.L();
       }
       m.D0(BubbleInterface$Position.BOTTOM);
       m = this.b.M;
       if (m == null) {
          a.L();
       }
       TextView textView = this.b.K();
       if (textView == null) {
          a.L();
       }
       m.o0(textView);
       m = this.b.M;
       if (m == null) {
          a.L();
       }
       p.d(m);
       return;
    }
}
