package f11.w$a;
import lq5.a;
import f11.w;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import lp3.c;
import lp3.b;

public class w$a implements a	// class@002286
{
    public final w b;

    public void w$a(w p0){
       this.b = p0;
       super();
    }
    public void A(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$a.class, "1")) {
          return;
       }
       this.b.P8(p0, true);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
