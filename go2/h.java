package go2.h;
import java.lang.Object;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import android.widget.ImageView;
import x66.e;
import android.net.Uri;
import ekd.w0;
import java.util.List;
import java.util.Collections;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.voiceparty.background.b;
import ok.h;
import java.util.ArrayList;
import java.util.Collection;
import com.facebook.imagepipeline.request.ImageRequest;
import ub.b;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;

public final class h	// class@002b5e
{

    public void h(){
       super();
    }
    public static void a(KwaiImageView p0,QMedia p1){
       File uFile;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, h.class, "4")) {
          return;
       }
       if (p1.type == 1) {
          QMedia mThumbnailFi = p1.mThumbnailFile;
          if (mThumbnailFi != null && mThumbnailFi.exists()) {
             p1 = p1.mThumbnailFile;
          }else if(p1.type == null){
             uFile = new File(p1.path);
          }else {
             uFile = new File(p1.path);
             File uFile1 = e.b(uFile, p0.getWidth(), p0.getHeight());
             if (!uFile1.exists()) {
             }
          }
       }else {
          goto label_001e ;
       }
       if (p1 != null) {
          h.b(p0, Collections.singletonList(w0.c(p1)));
       }
       return;
    }
    public static void b(KwaiImageView p0,List p1){
       AbstractDraweeController uAbstractDra = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, uAbstractDra, h.class, "2")) {
          return;
       }
       Object tag = p0.getTag();
       if (tag instanceof List && p1.equals(tag)) {
          return;
       }
       p0.setTag(p1);
       ArrayList uArrayList = new ArrayList(p1.size());
       m.s(p1).F(b.b).n(uArrayList);
       ImageRequest[] imageRequest = new ImageRequest[0];
       d uod = p0.g0(uAbstractDra, uAbstractDra, uArrayList.toArray(imageRequest));
       if (uod != null) {
          uAbstractDra = uod.e();
       }
       p0.setController(uAbstractDra);
       return;
    }
}
