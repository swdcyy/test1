package aq7.e$a;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class e$a implements View$OnTouchListener	// class@000341
{
    public static final e$a b;

    static {
       e$a.b = new e$a();
    }
    public void e$a(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.o(p1, "event");
       int action = p1.getAction();
       if (action && action != 2) {
          a.o(p0, "v");
          p0.setAlpha(0x3f800000);
       }else {
          a.o(p0, "v");
          p0.setAlpha(0x3f000000);
       }
       return false;
    }
}
