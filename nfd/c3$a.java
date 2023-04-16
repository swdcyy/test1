package nfd.c3$a;
import com.yxcorp.gifshow.widget.m;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.utils.k;

public class c3$a extends m	// class@001d97
{
    public final Runnable c;
    public final Activity d;
    public final String e;

    public void c3$a(Runnable p0,Activity p1,String p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c3$a.class, "1")) {
          return;
       }
       c3$a tc = this.c;
       if (tc != null) {
          tc.run();
       }
       k.c(this.d, this.e);
       return;
    }
}
