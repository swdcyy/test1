package h52.b$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import h52.b;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class b$b extends GestureDetector$SimpleOnGestureListener	// class@002c49
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.P8();
       return true;
    }
}
