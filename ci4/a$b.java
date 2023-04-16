package ci4.a$b;
import ub.a;
import ci4.a;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public final class a$b extends a	// class@000472
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$b.class, "1")) {
       }else if(p1 == null){
          ViewGroup$LayoutParams layoutParams = a.h(this.b).getLayoutParams();
          if (layoutParams != null) {
             int i = 32;
             if (p1.getWidth() > i && p1.getHeight() > i) {
                i1 = 32;
             label_0055 :
                i = i1;
                i1 = 32;
             }else if(p1.getWidth() <= i && p1.getHeight() <= i){
                i = p1.getHeight();
                i1 = p1.getWidth();
             }else if(p1.getWidth() > i){
                i1 = p1.getHeight() * 1;
                goto label_0055 ;
             }else {
                i1 = p1.getWidth() * 1;
             }
             if (layoutParams.height != i || layoutParams.width != i1) {
                layoutParams.width = i1;
                layoutParams.height = i;
                a.h(this.b).setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
