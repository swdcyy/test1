package boc.d0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.String;
import com.facebook.imagepipeline.request.ImageRequest;
import ub.b;
import java.lang.Object;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.DraweeView;
import s0d.f;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import s0d.a;
import java.util.ArrayList;
import com.kuaishou.android.model.response.ConfigResponse;
import com.yxcorp.gifshow.util.resource.n;
import ekd.p0;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import java.util.Collection;
import s0d.e;

public class d0	// class@00043e
{

    public static void a(KwaiBindableImageView p0,String p1,boolean p2){
       b uob = null;
       d uod = p0.g0(uob, uob, d0.f(p1, p2));
       if (uod == null) {
       }else {
          uod.q(true);
          uob = uod.e();
       }
       p0.setController(uob);
       return;
    }
    public static void b(KwaiBindableImageView p0,String p1){
       d0.c(p0, p1, false);
    }
    public static void c(KwaiBindableImageView p0,String p1,boolean p2){
       b uob = null;
       d uod = p0.g0(uob, uob, d0.f(p1, p2));
       if (uod == null) {
       }else {
          uob = uod.e();
       }
       p0.setController(uob);
       return;
    }
    public static void d(SimpleDraweeView p0,String p1){
       d uod;
       ImageRequest[] imageRequest = d0.f(p1, false);
       a uoa = null;
       if (imageRequest.length > 0) {
          uod = Fresco.newDraweeControllerBuilder();
          uod.y(p0.getController());
          uod.v(imageRequest, false);
       }else {
          uod = uoa;
       }
       if (uod != null) {
          uoa = uod.e();
       }
       p0.setController(uoa);
       return;
    }
    public static ImageRequest[] e(String p0){
       return d0.f(p0, true);
    }
    public static ImageRequest[] f(String p0,boolean p1){
       f uof = f.x();
       ImageRequest$CacheChoice sMALL = (p1)? ImageRequest$CacheChoice.SMALL: ImageRequest$CacheChoice.DEFAULT;
       uof.f(sMALL);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p0);
       ConfigResponse uConfigRespo = n.q();
       if (uConfigRespo != null) {
          uConfigRespo = uConfigRespo.mUrlPrefixes;
          if (uConfigRespo != null) {
             String str = p0.n(p0);
             Iterator iterator = uConfigRespo.iterator();
             while (iterator.hasNext()) {
                String str1 = p0.n(iterator.next());
                if (!str1.equals(str)) {
                   uArrayList.add(p0.replace(str, str1));
                }
             }
          }
       }
       uof.u(uArrayList);
       return uof.w();
    }
}
