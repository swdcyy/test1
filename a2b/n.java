package a2b.n;
import ub.a;
import a2b.m;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public final class n extends a	// class@000030
{
    public final m b;

    public void n(m p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, n.class, "1")) {
       }else {
          ViewGroup$LayoutParams layoutParams = m.P8(this.b).getLayoutParams();
          int i = 0;
          int width = (p1 != null)? p1.getWidth(): 0;
          layoutParams.width = width;
          if (p1 != null) {
             i = p1.getHeight();
          }
          layoutParams.height = i;
          m.P8(this.b).setLayoutParams(layoutParams);
       }
       return;
    }
}
