package ir1.a;
import androidx.lifecycle.Observer;
import ir1.b;
import android.view.ViewGroup;
import msd.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.ViewController;
import hr1.a;

public final class a implements Observer	// class@002983
{
    public final b b;
    public final ViewGroup c;
    public final a d;

    public void a(b p0,ViewGroup p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "hasRender");
          if (p0.booleanValue()) {
             this.b.a.E2(this.c, this.d.invoke());
          }
       }
       return;
    }
}
