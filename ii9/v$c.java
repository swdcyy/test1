package ii9.v$c;
import com.yxcorp.gifshow.widget.m;
import ii9.v;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public class v$c extends m	// class@00284a
{
    public final v c;

    public void v$c(v p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$c.class, "1")) {
          return;
       }
       this.c.x.performClick();
       return;
    }
}
