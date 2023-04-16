package a7a.l$c;
import android.view.View$OnLayoutChangeListener;
import a7a.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import rf5.u;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import android.graphics.Rect;

public final class l$c implements View$OnLayoutChangeListener	// class@00005f
{
    public final l b;

    public void l$c(l p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport2(l$c.class, "1")) {
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
          if (PatchProxy.applyVoid(objArray, this, l$c.class, "1")) {
             return;
          }
       }
       if (p1 == p5 && (p2 == p6 && (p3 != p7 || (p4 != p8 && this.b.b9().v())))) {
          this.b.b9().C(new Rect(this.b.n9(), p2, p3, p4));
       }
       PatchProxy.onMethodExit(l$c.class, "1");
       return;
    }
}
