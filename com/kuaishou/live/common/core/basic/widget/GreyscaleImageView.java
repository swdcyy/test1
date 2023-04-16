package com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import wb5.i;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.List;
import ekd.q;
import s0d.b;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.a;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView$a;
import jd.c;
import s0d.e;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;

public class GreyscaleImageView extends KwaiImageView	// class@000f0a
{

    public void GreyscaleImageView(Context p0){
       super(p0);
    }
    public void GreyscaleImageView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GreyscaleImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void p0(UserInfo p0,HeadImageSize p1,boolean p2){
       SparseArray a;
       e[] uoeArray;
       if (PatchProxy.isSupport(GreyscaleImageView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, GreyscaleImageView.class, "1")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-live:live-libraries:live-widget");
       uoa.d(ImageSource.FEED_AVATAR);
       a uoa1 = uoa.a();
       a = (p1 == HeadImageSize.BIG)? i.a: i.a;
       this.setPlaceHolderImage(R.drawable.detail_avatar_secret);
       b uob = null;
       if (PatchProxy.isSupport(GreyscaleImageView.class)) {
          uoeArray = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, GreyscaleImageView.class, "2");
          if (uoeArray != PatchProxyResult.class) {
          label_00a8 :
             d uod = this.g0(uob, uob, uoeArray);
             if (uod != null) {
                uod.r(uoa1);
             }
             if (uod != null) {
                uob = uod.e();
             }
             this.setController(uob);
             return;
          }
       }
       String str = b.g("user_avatar_", q.a(p0.mHeadUrls), p0.mHeadUrl, p1.getSize());
       f uof = f.x().r(p0.mHeadUrls).t(p0.mHeadUrl);
       uof.g(p1.getSize());
       uof = uof.o(p1.getSize(), p1.getSize());
       GreyscaleImageView$a uoa2 = (p2)? new GreyscaleImageView$a(str): uob;
       uoeArray = uof.l(uoa2).w();
       goto label_00a8 ;
    }
}
