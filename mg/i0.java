package mg.i0;
import e17.i$e;
import com.kwai.feature.post.api.feature.bridge.JsStatusToastParam;
import java.lang.Object;
import android.view.View;
import e17.i$b;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.net.Uri;
import com.yxcorp.image.request.a;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class i0 implements i$e	// class@00260a
{
    public final JsStatusToastParam a;

    public void i0(JsStatusToastParam p0){
       this.a = p0;
       super();
    }
    public final void a(View p0,i$b p1){
       a.p(p0, "toastView");
       a.p(p1, "<anonymous parameter 1>");
       JsStatusToastParam mToastIcon = this.a.mToastIcon;
       int i = 0;
       mToastIcon = (mToastIcon == null || !mToastIcon.length())? 1: 0;
       if (mToastIcon) {
          return;
       }else {
          KwaiImageView kwaiImageVie = p0.findViewById(R.id.toast_icon);
          kwaiImageVie.setVisibility(i);
          a uoa = a.t(Uri.parse(this.a.mToastIcon));
          uoa.x(i);
          e uoe = uoa.q();
          a.o(uoe, "KwaiImageRequestBuilder.¡­          .buildRequest\(\)");
          d uod = Fresco.newDraweeControllerBuilder();
          uod.w(uoe);
          AbstractDraweeController uAbstractDra = uod.e();
          a.o(uAbstractDra, "Fresco.newDraweeControll¡­quest\)\n          .build\(\)");
          kwaiImageVie.setController(uAbstractDra);
          return;
       }
    }
}
