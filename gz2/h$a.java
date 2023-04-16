package gz2.h$a;
import android.view.View$OnTouchListener;
import gz2.h;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gz2.g;
import java.lang.Runnable;

public class h$a implements View$OnTouchListener	// class@002bdb
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       h$a obj = PatchProxy.applyTwoRefs(p0, p1, this, h$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj.c == null || obj.i == null) {
          return false;
       }
       obj.l(new g(this, p0, p1));
       return true;
    }
}
