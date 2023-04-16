package dv1.j$a;
import android.view.View$OnLayoutChangeListener;
import dv1.j;
import java.lang.Object;
import dv1.i;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class j$a implements View$OnLayoutChangeListener	// class@002035
{
    public int b;
    public final j c;

    public void j$a(j p0){
       this.c = p0;
       super();
    }
    public void j$a(j p0,i p1){
       super(p0);
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(j$a.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, j$a.class, "1")) {
             return;
          }
       }
       if (p0.getVisibility()) {
          return;
       }else if(this.b == p0.getWidth()){
          return;
       }else {
          this.b = p0.getWidth();
          this.c.f();
          return;
       }
    }
}
