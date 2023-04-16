package cx0.b$c;
import ub.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import cx0.b$b;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;
import com.facebook.drawee.view.DraweeView;

public final class b$c extends a	// class@001e8e
{
    public final KwaiImageView b;
    public final b$b c;

    public void b$c(KwaiImageView p0,b$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$c.class, "2")) {
          return;
       }
       this.c.b();
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$c.class, "1")) {
       }else if(p1 != null && (p1.getHeight() && p1.getWidth())){
          this.b.setAspectRatio((((float)p1.getWidth() * 0x3f800000) / (float)p1.getHeight()));
          this.c.a();
       }else {
          this.c.b();
       }
       return;
    }
}
