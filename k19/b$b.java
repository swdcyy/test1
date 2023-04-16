package k19.b$b;
import android.os.Handler;
import k19.b;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.RecyclerViewPager;

public class b$b extends Handler	// class@002a7a
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       if (p0.what == null) {
          b$b ta = this.a;
          if (ta.c == null) {
             ta.a.z((ta.d + 1), 1);
          }
       }
       return;
    }
}
