package c6a.b$a;
import android.view.View$OnClickListener;
import c6a.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$a implements View$OnClickListener	// class@00055c
{
    public final int b;
    public final b c;
    public final View d;

    public void b$a(int p0,b p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       b$a tb = this.b;
       tc.S8(tb, tc.P8(tb));
       PatchProxy.onMethodExit(b$a.class, "1");
       return;
    }
}
