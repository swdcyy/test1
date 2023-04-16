package a99.h;
import uw9.y;
import a99.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import l17.b;
import l17.b$a;
import android.view.ViewGroup;

public class h implements y	// class@000065
{
    public final g a;

    public void h(g p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.a.b9();
       return;
    }
    public void e(RecyclerView p0,int p1,int p2){
       g h;
       b e;
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, h.class, "1")) {
          return;
       }
       h = this.a.H;
       h.a = h.a + p2;
       int i = 2;
       if (p2 > 0) {
          if (h.c == i) {
             p2 = h.b + 1;
             h.b = p2;
             if (p2 >= i) {
                e = h.e;
                if (e != null) {
                   e.a();
                   h.b = 0;
                   h.d = true;
                }
             }
          }else {
             h.b = 0;
             h.c = i;
             h.d = false;
          }
       }else if(p2 < 0){
          if (h.c == 1) {
             p2 = h.b + 1;
             h.b = p2;
             if (p2 >= i) {
                e = h.e;
                if (e != null && h.d == null) {
                   e.b();
                   h.d = true;
                   h.b = 0;
                }
             }
          }else {
             h.b = 0;
             h.c = 1;
             h.d = false;
          }
       }
       this.a.Z8();
       if (!p0.canScrollVertically(-1)) {
          this.a.b9();
       }
       return;
    }
}
