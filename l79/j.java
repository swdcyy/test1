package l79.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;

public final class j implements Runnable	// class@002cbf
{
    public final AlbumSelectedContainer b;

    public void j(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       View view = this.b.J();
       if (view == null) {
          a.L();
       }
       BubbleInterface$Position tOP = BubbleInterface$Position.TOP;
       int[] ointArray = a$c.f0(view, tOP);
       AlbumSelectedContainer m = this.b.M;
       if (m == null) {
          a.L();
       }
       m.n0(ointArray[0], ointArray[1]);
       AlbumSelectedContainer m1 = this.b.M;
       if (m1 == null) {
          a.L();
       }
       m1.D0(tOP);
       m1 = this.b.M;
       if (m1 == null) {
          a.L();
       }
       p.n(m1);
       return;
    }
}
