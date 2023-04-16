package ef2.c;
import com.yxcorp.gifshow.widget.m;
import ef2.d;
import ef2.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c extends m	// class@002719
{
    public final e c;
    public final d d;

    public void c(d p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.d.W8();
       this.c.a();
       return;
    }
}
