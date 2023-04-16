package k59.j1;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.ad.webview.n;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j1 extends m	// class@002aea
{
    public final n c;

    public void j1(n p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j1.class, "1")) {
          return;
       }
       this.c.X8();
       this.c.R8();
       return;
    }
}
