package nfd.g3$a;
import ub.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;

public class g3$a extends a	// class@001dae
{
    public final KwaiImageView b;

    public void g3$a(KwaiImageView p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g3$a.class, "1")) {
       }else if(p1 != null && (p1.getWidth() > 0 && p1.getHeight() > 0)){
          this.b.setAspectRatio(((float)p1.getWidth() / (float)p1.getHeight()));
       }
       return;
    }
}
