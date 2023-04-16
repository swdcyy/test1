package l7a.a$c;
import android.view.View$OnLayoutChangeListener;
import l7a.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper;

public class a$c implements View$OnLayoutChangeListener	// class@002d5d
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
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
       if (p1 == p5 && (p3 == p7 && (p2 == p6 && p4 == p8))) {
          return;
       }else {
          a s = this.b.s;
          if (s != null && s.e() != null) {
             this.b.s.e().invalidate();
          }
          return;
       }
    }
}
