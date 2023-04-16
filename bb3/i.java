package bb3.i;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class i implements View$OnLayoutChangeListener	// class@000362
{
    public final LiveLiteLayoutManager b;

    public void i(LiveLiteLayoutManager p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(i.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, i.class, "1")) {
             return;
          }
       }
       a.p(p0, "view");
       p0.removeOnLayoutChangeListener(this);
       this.b.h();
       this.b.c();
       return;
    }
}
