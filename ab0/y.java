package ab0.y;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.grid.d;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import android.view.View;
import fb0.l;
import sa0.c;
import com.kuaishou.gifshow.smartalbum.logic.SmartAlbumManager;
import t36.a;

public final class y implements g	// class@00005a
{
    public final d b;

    public void y(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b == null) {
          tb.x.setVisibility(0);
          l.j(0);
       }else {
          l.j(true);
          SmartAlbumManager.w0().d(tb);
          SmartAlbumManager.w0().R();
       }
       return;
    }
}
