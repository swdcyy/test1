package bd4.b;
import bd4.a;
import bd4.b$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import bd4.b$b;
import android.view.View$OnClickListener;

public final class b extends a	// class@000387
{
    public MerchantKwaiImageView w;
    public MerchantKwaiImageView x;
    public static final b$a y;

    static {
       b.y = new b$a(null);
    }
    public void b(Fragment p0){
       super(p0);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.E8();
       a ts = this.s;
       if (ts != null) {
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-merchant:merchant-transaction:base");
          uoa.d(ImageSource.ICON);
          a uoa1 = uoa.a();
          b tw = this.w;
          if (tw == null) {
             a.S("mCommodityImgView");
          }
          tw.S(ts.mPicUrl, uoa1);
          tw = this.x;
          if (tw == null) {
             a.S("mBackgroundImgView");
          }
          tw.M(ts.mCardBgUrl, uoa1);
       }
       return;
    }
    public void doBindView(View p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a178b);
       this.x = m1.f(p0, 0x7f0a178a);
       if (!PatchProxy.applyVoid(null, this, uob, "4")) {
          int i = ((a1.e(316.00f) * n.x(this.P8())) / a1.e(0x43cf0000)) - a1.e(0x3f800000);
          uob = this.x;
          if (uob == null) {
             a.S("mBackgroundImgView");
          }
          ViewGroup$LayoutParams layoutParams = uob.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams.height = i;
          b tx = this.x;
          if (tx == null) {
             a.S("mBackgroundImgView");
          }
          tx.setLayoutParams(layoutParams);
       }
       p0.setOnClickListener(new b$b(this));
       return;
    }
}
