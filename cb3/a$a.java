package cb3.a$a;
import android.view.View$OnTouchListener;
import cb3.a;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;

public final class a$a implements View$OnTouchListener	// class@0004da
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       p1.setLocation(p1.getRawX(), p1.getRawY());
       this.b.B2().dispatchTouchEvent(p1);
       return true;
    }
}
