package h63.l0;
import android.view.View$OnLayoutChangeListener;
import h63.k0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class l0 implements View$OnLayoutChangeListener	// class@002c8c
{
    public int b;
    public int c;
    public final k0 d;

    public void l0(k0 p0){
       this.d = p0;
       super();
       this.b = -1;
       this.c = -1;
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(l0.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, l0.class, "1")) {
             return;
          }
       }
       if (this.b != p2 || this.c != p4) {
          this.b = p2;
          this.c = p4;
          this.d.P8();
       }
       return;
    }
}
