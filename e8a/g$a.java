package e8a.g$a;
import android.view.View$OnLayoutChangeListener;
import e8a.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import jta.e;
import kotlin.jvm.internal.a;

public final class g$a implements View$OnLayoutChangeListener	// class@0020a6
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(g$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, g$a.class, "1")) {
             return;
          }
       }
       if (p1 == p5 && (p2 == p6 && (p3 != p7 || p4 != p8))) {
          Iterator iterator = this.b.P8().iterator();
          while (iterator.hasNext()) {
             a.o(p0, "v");
             iterator.next().b(p0.getWidth(), p0.getHeight());
          }
       }
       return;
    }
}
