package ad0.h$a;
import java.lang.Runnable;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h$a implements Runnable	// class@000065
{
    public final ViewGroup b;
    public final View c;

    public void h$a(ViewGroup p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, h$a.class, "1")) {
          return;
       }
       this.b.removeView(this.c);
       PatchProxy.onMethodExit(h$a.class, "1");
       return;
    }
}
