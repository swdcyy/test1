package h8a.d$a;
import erd.g;
import h8a.d;
import java.lang.Object;
import d0a.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView;
import android.view.View;
import android.widget.TextView;

public final class d$a implements g	// class@0025e2
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          a.p(p0, "event");
          if (p0.a == null) {
             d.Z8(this.b).removeOnScrollListener(this.b.B);
             d.Z8(this.b).setEnabled(false);
             d.Y8(this.b).setSpecialView(null);
          }else {
             d.Y8(this.b).setSpecialView(d.Z8(this.b));
             d.Z8(this.b).setEnabled(true);
             d.Z8(this.b).addOnScrollListener(this.b.B);
          }
          if (p0.a == true) {
             this.b.c9();
             d.X8(this.b).setVisibility(false);
          }else {
             d.X8(this.b).setVisibility(8);
          }
       }
       return;
    }
}
