package a3c.d;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import com.yxcorp.image.callercontext.ImageSource;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s0d.f;
import java.util.Collection;
import s0d.e;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class d	// class@000065
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final void a(KwaiImageView p0,List p1,ImageSource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "2")) {
          return;
       }
       a.p(p0, "imageView");
       a.p(p1, "cdnUrls");
       a.p(p2, "imageSrc");
       e[] uoeArray = f.x().q(p1).w();
       a.o(uoeArray, "KwaiImageRequestGroupBui¡­s\)\n      .buildRequests\(\)");
       d uod = Fresco.newDraweeControllerBuilder();
       uod.q(true);
       a$a uoa = a.d();
       uoa.b(":ks-components:profile-access");
       uoa.d(p2);
       d uod1 = uod.r(uoa.a());
       uod1.u(uoeArray);
       AbstractDraweeController uAbstractDra = uod1.e();
       a.o(uAbstractDra, "Fresco.newDraweeControll¡­equests\(requests\).build\(\)");
       p0.setController(uAbstractDra);
       return;
    }
    public static final void b(KwaiImageView p0,String p1,ImageSource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, d.class, "1")) {
          return;
       }
       a.p(p0, "imageView");
       a.p(p1, "url");
       a.p(p2, "imageSrc");
       e[] uoeArray = f.x().t(p1).w();
       a.o(uoeArray, "KwaiImageRequestGroupBui¡­l\)\n      .buildRequests\(\)");
       d uod = Fresco.newDraweeControllerBuilder();
       uod.q(true);
       a$a uoa = a.d();
       uoa.b(":ks-components:profile-access");
       uoa.d(p2);
       d uod1 = uod.r(uoa.a());
       uod1.u(uoeArray);
       AbstractDraweeController uAbstractDra = uod1.e();
       a.o(uAbstractDra, "Fresco.newDraweeControll¡­\(requests\)\n      .build\(\)");
       p0.setController(uAbstractDra);
       return;
    }
}
