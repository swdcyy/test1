package h63.m0;
import android.view.View$OnLayoutChangeListener;
import h63.k0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class m0 implements View$OnLayoutChangeListener	// class@002c8e
{
    public final View b;
    public final k0 c;

    public void m0(k0 p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(m0.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, m0.class, "1")) {
             return;
          }
       }
       if (!(p4 - p2)) {
          return;
       }else {
          p0.L = null;
          this.b.removeOnLayoutChangeListener(this);
          this.c.P8();
          return;
       }
    }
}
