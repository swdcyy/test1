package kj9.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hlb.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import kj9.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kwai.component.feedstaggercard.model.CardStyle;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import kj9.f$a;
import android.view.ViewOutlineProvider;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;

public class f extends PresenterV2	// class@002caa
{
    public KwaiImageView p;
    public int q;
    public a r;
    public CardStyle s;

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.p.L(this.r.mImageUrl);
       this.p.setOnClickListener(new e(this));
       int i = 0;
       int i1 = (this.s.isCornerCard != null)? a1.e(4.00f): 0;
       if (CardStyle.isV6Bottom(this.s.mBottomType)) {
          i = a1.e(8.00f);
       }
       ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
       layoutParams.leftMargin = i1;
       layoutParams.rightMargin = i1;
       this.p.setLayoutParams(layoutParams);
       this.p.setClipToOutline(true);
       this.p.setOutlineProvider(new f$a(this, i));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a134d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.r8("ADAPTER_POSITION").intValue();
       this.r = this.q8(a.class);
       this.s = this.r8("HOT_CHANNEL_CARD_STYLE");
       return;
    }
}
