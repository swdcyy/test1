package az3.l$a;
import ub.a;
import az3.l;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.content.res.Resources;
import cw9.c;

public class l$a extends a	// class@0002e3
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l$a.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l$a.class, "2")) {
       }else if(p1 != null && (!p1.getWidth() || !p1.getHeight())){
          this.b.P8();
       }else {
          p1 = this.b.t.getLayoutParams();
          int i = (int)(((float)p1.getWidth() / (float)p1.getHeight()) * (float)c.a(this.b.t.getResources(), 0x7f070295));
          if (p1.width != i) {
             p1.width = i;
             this.b.t.setLayoutParams(p1);
          }
       }
       return;
    }
}
