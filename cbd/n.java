package cbd.n;
import ub.a;
import cbd.o;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nfd.t0;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class n extends a	// class@000523
{
    public final o b;

    public void n(o p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "1")) {
       }else if(p1.getWidth() > 0 && p1.getHeight() > 0){
          int u = t0.u;
          ViewGroup$LayoutParams layoutParams = this.b.v.getLayoutParams();
          layoutParams.height = u;
          layoutParams.width = (int)((((double)u * 0x3ff0000000000000) / (double)p1.getHeight()) * (double)p1.getWidth());
          this.b.v.setLayoutParams(layoutParams);
       }
       return;
    }
}
