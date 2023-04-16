package dlc.h1$a;
import df5.b;
import dlc.h1;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import android.view.View;

public class h1$a implements b	// class@00224d
{
    public final h1 a;

    public void h1$a(h1 p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1$a.class, "1")) {
          return;
       }
       if (p0 != null && p0.isLiveStream()) {
          this.a.q.setVisibility(8);
          this.a.r.setVisibility(8);
       }else {
          this.a.q.setVisibility(0);
          this.a.r.setVisibility(0);
       }
       return;
    }
    public void c(QPhoto p0){
       a.c(this, p0);
    }
}
