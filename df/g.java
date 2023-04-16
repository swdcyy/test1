package df.g;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.h0;
import ze.i0;

public class g	// class@001e53
{

    public void g(){
       super();
    }
    public static void a(View p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "1")) {
          return;
       }
       i0.a(p0).f(p1);
       return;
    }
}
