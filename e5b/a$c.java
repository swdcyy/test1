package e5b.a$c;
import android.view.View$OnLayoutChangeListener;
import e5b.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Runnable;
import android.os.Handler;

public final class a$c implements View$OnLayoutChangeListener	// class@002619
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(a$c.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, a$c.class, "1")) {
             return;
          }
       }
       a$c tb = this.b;
       tb.f.removeCallbacks(tb.g);
       tb = this.b;
       tb.f.postDelayed(tb.g, 20);
       return;
    }
}