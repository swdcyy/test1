package abc.p;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.intimate.dialog.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class p extends m	// class@0000db
{
    public final i c;

    public void p(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       this.c.A();
       return;
    }
}
