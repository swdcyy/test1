package ls1.g$b;
import ub.a;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class g$b extends a	// class@003015
{
    public final KwaiCDNImageView b;
    public final int c;

    public void g$b(KwaiCDNImageView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g$b.class, "1")) {
       }else if(p1 != null && (p1.getWidth() > 0 && p1.getHeight() > 0)){
          p0.width = (int)((float)this.c * (float)p1.getWidth()) / p1.getHeight();
          p0.height = this.c;
          this.b.requestLayout();
       }
       return;
    }
}
