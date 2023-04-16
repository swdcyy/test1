package d6a.w;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import d6a.w$a;
import android.view.GestureDetector;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class w	// class@001eb2
{
    public boolean a;
    public final w$a b;
    public final GestureDetector c;
    public final View d;

    public void w(Context p0,View p1){
       a.p(p0, "context");
       a.p(p1, "delegate");
       super();
       this.d = p1;
       w$a uoa = new w$a(this);
       this.b = uoa;
       this.c = new GestureDetector(p0, uoa);
    }
    public final boolean a(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.c.onTouchEvent(p0)) {
          return b;
       }
       boolean b1 = this.c(this.d, p0);
       boolean b2 = (this.a == null)? this.b(p0): false;
       if (!b1 && !b2) {
          b = false;
       }
       return b;
    }
    public abstract boolean b(MotionEvent p0);
    public abstract boolean c(View p0,MotionEvent p1);
}
