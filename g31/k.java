package g31.k;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.audience.component.topbar.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.os.Build$VERSION;
import g31.k$a;
import android.view.ViewOutlineProvider;

public class k implements View$OnLayoutChangeListener	// class@002413
{
    public final View b;
    public final d c;

    public void k(d p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(k.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, k.class, "1")) {
             return;
          }
       }
       int height = this.b.getHeight();
       if (height > 0) {
          if (Build$VERSION.SDK_INT > 21) {
             this.b.setClipToOutline(1);
             this.b.setOutlineProvider(new k$a(this, height));
          }
          this.b.removeOnLayoutChangeListener(this);
       }
       return;
    }
}
