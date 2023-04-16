package ab0.n;
import u07.u;
import com.kuaishou.gifshow.smartalbum.ui.grid.b;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ra0.b;
import q87.c;
import fb0.l;

public final class n implements u	// class@000044
{
    public final b b;

    public void n(b p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "7")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().w("SmartAlbumGridListPresenter", "cancelDelete: ", objArray);
          l.f("CLICK_CONFIRM_CANCEL");
       }
       return;
    }
}
