package ab0.v;
import com.yxcorp.gifshow.widget.m;
import ab0.t;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class v extends m	// class@000057
{
    public final t c;

    public void v(t p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.c.R8();
       return;
    }
}
