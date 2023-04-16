package ge2.e;
import android.widget.Scroller;
import android.content.Context;
import android.view.animation.Interpolator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class e extends Scroller	// class@002b09
{
    public int a;

    public void e(Context p0,int p1){
       super(p0);
       this.a = 500;
       this.a = p1;
    }
    public void e(Context p0,Interpolator p1,int p2){
       super(p0, p1);
       this.a = 500;
       this.a = p2;
    }
    public void startScroll(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, e.class, "1")) {
          return;
       }
       super.startScroll(p0, p1, p2, p3, this.a);
       return;
    }
    public void startScroll(int p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(e.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, e.class, "2")) {
             return;
          }
       }
       super.startScroll(p0, p1, p2, p3, this.a);
       return;
    }
}
