package ab0.o;
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
import sa0.c;
import com.kuaishou.gifshow.smartalbum.logic.SmartAlbumManager;
import xa0.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import fb0.l;

public final class o implements u	// class@000045
{
    public final b b;

    public void o(b p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "8")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().w("SmartAlbumGridListPresenter", "deleteAlbum: ", objArray);
          b uob = SmartAlbumManager.w0().n0(tb.p);
          if (uob != null) {
             l.g("CLICK_CONFIRM_DELETE", l.b(uob));
          }
          SmartAlbumManager.w0().J(tb.p);
          tb.R8();
       }
       return;
    }
}
