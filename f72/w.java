package f72.w;
import ub.a;
import f72.x;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;

public class w extends a	// class@0028df
{
    public final x b;

    public void w(x p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, w.class, "1")) {
       }else if(p1 != null && (p1.getWidth() > 0 && p1.getHeight() > 0)){
          this.b.r.setAspectRatio(((float)p1.getWidth() / (float)p1.getHeight()));
       }
       return;
    }
}
