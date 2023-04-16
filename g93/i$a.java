package g93.i$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Object;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardItemTag;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.drawable.Drawable;
import d61.h;
import java.lang.CharSequence;

public final class i$a implements Observer	// class@002adf
{
    public final KwaiImageView b;
    public final TextView c;

    public void i$a(KwaiImageView p0,TextView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       i$a tc;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          p0 = p0.mTag;
          if (p0 != null) {
             LiveBenefitCardItemTag mTagType = p0.mTagType;
             String str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
             if (mTagType == 1) {
                this.b.setVisibility(8);
                tc = this.c;
                ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
                Objects.requireNonNull(layoutParams, str);
                layoutParams.leftMargin = a1.e(4.00f);
                tc.setLayoutParams(layoutParams);
             }else if(mTagType == 2){
                this.b.setVisibility(0);
                this.b.U(p0.mIconPath);
             }else if(mTagType == 3){
                this.b.setPadding(a1.e(2.50f), a1.e(2.50f), a1.e(2.50f), a1.e(2.50f));
                tc = this.b;
                ViewGroup$LayoutParams layoutParams1 = tc.getLayoutParams();
                Objects.requireNonNull(layoutParams1, str);
                int i = a1.e(10.00f);
                layoutParams1.width = i;
                layoutParams1.height = i;
                tc.setLayoutParams(layoutParams1);
                this.b.setForegroundDrawable(h.a(a1.e(2.50f), a1.a(R.color.arg_RES_7f0620c7)));
                this.b.setVisibility(0);
             }
             this.c.setText(p0.mTagText);
          }
       }
       return;
    }
}
