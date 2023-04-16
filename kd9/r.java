package kd9.r;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.frame.c;
import fd9.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

public class r implements ViewTreeObserver$OnGlobalLayoutListener	// class@002c68
{
    public final a b;
    public final View c;
    public final c d;

    public void r(c p0,a p1,View p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       if (this.d.A2(this.b.a)) {
          this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.d.D2();
       }
       return;
    }
}
