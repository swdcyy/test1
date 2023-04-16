package nv1.f;
import android.widget.Scroller;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a;
import android.content.Context;
import android.view.animation.Interpolator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class f extends Scroller	// class@0033dc
{
    public final a a;

    public void f(a p0,Context p1,Interpolator p2){
       this.a = p0;
       super(p1, p2);
    }
    public void startScroll(int p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(f.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
             return;
          }
       }
       super.startScroll(p0, p1, p2, p3, 400);
       return;
    }
}
