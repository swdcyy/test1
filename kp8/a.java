package kp8.a;
import sp8.b$a;
import com.tachikoma.core.component.view.TKView;
import android.view.MotionEvent;
import java.lang.Object;
import tp8.b;
import java.util.Objects;
import up8.a;
import java.lang.String;
import com.tachikoma.core.event.base.TKBaseEvent;
import com.tachikoma.core.component.view.TKView$1;
import tp8.a;

public final class a implements b$a	// class@002c08
{
    public final TKView a;
    public final MotionEvent b;

    public void a(TKView p0,MotionEvent p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(b p0){
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       if (p0 instanceof a) {
          p0.setType("dispatch");
          p0.a = new TKView$1(ta, tb);
          p0.setState(a.a(tb));
       }
       return;
    }
}
