package h52.b$c;
import androidx.recyclerview.widget.RecyclerView$q;
import h52.b;
import a2.f;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class b$c implements RecyclerView$q	// class@002c4a
{
    public final f b;
    public final b c;

    public void b$c(b p0,f p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       this.b.a(p1);
       return false;
    }
    public void onRequestDisallowInterceptTouchEvent(boolean p0){
    }
    public void onTouchEvent(RecyclerView p0,MotionEvent p1){
    }
}
