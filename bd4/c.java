package bd4.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import ub.a;
import android.view.View;
import ekd.m1;

public final class c extends PresenterV2	// class@000388
{
    public a p;
    public KwaiCDNImageView q;

    public void c(){
       super();
    }
    public void E8(){
       a c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "3")) {
          return;
       }
       c tp = this.p;
       if (tp != null) {
          c = tp.c;
          if (c instanceof String) {
             Objects.requireNonNull(c, "null cannot be cast to non-null type kotlin.String");
             objArray = c;
          }
          if (!TextUtils.x(objArray)) {
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-merchant:merchant-transaction:base");
             uoa.d(ImageSource.ICON);
             c = uoa.a();
             c tq = this.q;
             if (tq == null) {
                a.S("mImageView");
             }
             tq.M(objArray, c);
          }else {
             this.P8();
          }
       }else {
          this.P8();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tq = this.q;
       if (tq == null) {
          a.S("mImageView");
       }
       KwaiCDNImageView.q0(tq, R.string.arg_RES_7f10346b, 0, null, 4, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a152f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.p = this.s8(a.class);
       return;
    }
}
