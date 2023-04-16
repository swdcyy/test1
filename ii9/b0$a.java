package ii9.b0$a;
import android.view.View$OnLayoutChangeListener;
import ii9.b0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import hi9.d;

public class b0$a implements View$OnLayoutChangeListener	// class@00282f
{
    public final View b;
    public final float c;
    public final b0 d;

    public void b0$a(b0 p0,View p1,float p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(b0$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, b0$a.class, "1")) {
             return;
          }
       }
       this.b.removeOnLayoutChangeListener(this);
       float f = d.e();
       if (this.c - f) {
          this.d.f2(f);
       }
       return;
    }
}
