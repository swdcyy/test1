package elb.d0$a;
import e17.i$e;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import android.view.View;
import e17.i$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.net.Uri;
import com.yxcorp.image.request.a;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class d0$a implements i$e	// class@002741
{
    public final boolean a;
    public final UploadInfo b;

    public void d0$a(boolean p0,UploadInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(View p0,i$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d0$a.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       a.p(p1, "<anonymous parameter 1>");
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.toast_icon);
       int i = 0;
       kwaiImageVie.setVisibility(i);
       if (this.a != null) {
          kwaiImageVie.setBackground(a1.f(R.drawable.arg_RES_7f080812));
       }else {
          a uoa = a.t(Uri.parse(this.b.mPublishToastIconUrl));
          uoa.x(i);
          e uoe = uoa.q();
          a.o(uoe, "KwaiImageRequestBuilder.¡­          .buildRequest\(\)");
          d uod = Fresco.newDraweeControllerBuilder();
          uod.w(uoe);
          AbstractDraweeController uAbstractDra = uod.e();
          a.o(uAbstractDra, "Fresco.newDraweeControll¡­est\)\n            .build\(\)");
          kwaiImageVie.setController(uAbstractDra);
       }
       return;
    }
}
