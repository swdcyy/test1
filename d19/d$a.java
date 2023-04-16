package d19.d$a;
import androidx.recyclerview.widget.RecyclerView$r;
import d19.d;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import im8.f;
import java.lang.Boolean;
import android.view.View;
import java.lang.Math;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public class d$a extends RecyclerView$r	// class@002029
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$a.class, "1")) {
          return;
       }
       int i = (this.a.q.get().booleanValue())? this.a.s.getHeight() - this.a.w: this.a.s.getHeight();
       if (Math.abs(this.a.u.get().intValue()) < i) {
          this.a.r.exitPlayerOutOfSightByScroll();
          this.a.P8(false);
       }else {
          this.a.r.enterPlayerOutOfSightByScroll();
          this.a.P8(true);
       }
       return;
    }
}
