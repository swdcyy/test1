package dra.f$b;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import dra.f;

public final class f$b implements View$OnTouchListener	// class@00250a
{
    public static final f$b b;

    static {
       f$b.b = new f$b();
    }
    public void f$b(){
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, f$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       f.b.a();
       return false;
    }
}
