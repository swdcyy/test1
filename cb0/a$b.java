package cb0.a$b;
import android.view.View$OnClickListener;
import cb0.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import java.util.Objects;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingViewModel;
import ra0.b;
import q87.c;

public final class a$b implements View$OnClickListener	// class@0002f9
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.b.h.setVisibility(8);
       this.b.E(0);
       a i = this.b.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoid(null, i, SmartAlbumLoadingViewModel.class, "7")) {
          Object[] objArray = new Object[0];
          b.D().w("SmartAlbumLoadingVM", "retry", objArray);
          i.h = false;
          i.u0();
          i.x0();
       }
       return;
    }
}
