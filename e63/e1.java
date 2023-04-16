package e63.e1;
import ub.a;
import com.kuaishou.live.gzone.v2.profile.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import lnc.a1;

public class e1 extends a	// class@002649
{
    public final KwaiImageView b;
    public final e c;

    public void e1(e p0,KwaiImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e1.class, "1")) {
       }else if(p1 != null && p1.getHeight()){
          ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
          layoutParams.height = a1.e(14.00f);
          layoutParams.width = (int)((float)(p1.getWidth() * layoutParams.height) / (float)p1.getHeight());
          this.b.setLayoutParams(layoutParams);
       }
       return;
    }
}
