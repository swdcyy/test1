package dh9.a$e;
import android.view.View$OnLayoutChangeListener;
import dh9.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;

public final class a$e implements View$OnLayoutChangeListener	// class@001f38
{
    public final a b;
    public final View c;

    public void a$e(a p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(a$e.class)) {
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
          if (PatchProxy.applyVoid(objArray, this, a$e.class, "1")) {
             return;
          }
       }
       this.c.removeOnLayoutChangeListener(this);
       int i = g.f(this.b.e);
       a$e tb = this.b;
       if (tb.u != i) {
          tb.i2();
       }
       tb.u = i;
       return;
    }
}
