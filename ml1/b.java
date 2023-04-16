package ml1.b;
import ub.a;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftItemLeftTagView;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rm1.e;
import lnc.a1;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class b extends a	// class@0031bb
{
    public final KwaiImageView b;
    public final LiveGiftItemLeftTagView c;

    public void b(LiveGiftItemLeftTagView p0,KwaiImageView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       int e;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
       }else {
          e.a(this.b);
          e = LiveGiftItemLeftTagView.e;
          if (p1 != null) {
             e = a1.e((float)(int)(((double)p1.getWidth() * 14.00f) / (double)p1.getHeight()));
          }
          p1 = this.b;
          b uob = b.class;
          if (PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(e), p1, this, uob, "2") && e != p1.getLayoutParams().width)) {
             uob.width = e;
             p1.requestLayout();
          }
       }
       return;
    }
}
