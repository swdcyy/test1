package az3.p;
import com.yxcorp.gifshow.widget.m;
import az3.m;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class p extends m	// class@0002e9
{
    public final m c;

    public void p(m p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       this.c.P8(p0, 3);
       return;
    }
}
