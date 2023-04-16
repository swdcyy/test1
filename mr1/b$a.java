package mr1.b$a;
import android.view.View$OnTouchListener;
import mr1.b;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.GestureDetector;

public final class b$a implements View$OnTouchListener	// class@0031ee
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return this.b.c.onTouchEvent(p1);
    }
}
