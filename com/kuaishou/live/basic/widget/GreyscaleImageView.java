package com.kuaishou.live.basic.widget.GreyscaleImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.model.LiveUserInfo;
import com.kuaishou.android.live.contants.LiveAvatarConstants$AvatarSize;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.robust.PatchProxyResult;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.List;
import ekd.q;
import s0d.b;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import s0d.a;
import com.kuaishou.live.basic.widget.GreyscaleImageView$a;
import jd.c;
import s0d.e;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;

public class GreyscaleImageView extends KwaiImageView	// class@000d2d
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
    public void p0(LiveUserInfo p0,LiveAvatarConstants$AvatarSize p1,boolean p2){
       e[] uoeArray;
       if (PatchProxy.isSupport(GreyscaleImageView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, GreyscaleImageView.class, "1")) {
          return;
       }
       this.setPlaceHolderImage(R.drawable.arg_RES_7f0811aa);
       b uob = null;
       if (PatchProxy.isSupport(GreyscaleImageView.class)) {
          uoeArray = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, GreyscaleImageView.class, "2");
          if (uoeArray != PatchProxyResult.class) {
          label_0089 :
             d uod = this.g0(uob, uob, uoeArray);
             if (uod != null) {
                uob = uod.e();
             }
             this.setController(uob);
             return;
          }
       }
       String str = b.g("user_avatar_", q.a(p0.mAvatars), p0.mAvatar, p1.getSize());
       f uof = f.x().r(p0.mAvatars).t(p0.mAvatar);
       uof.g(p1.getSize());
       uof = uof.o(p1.getSize(), p1.getSize());
       GreyscaleImageView$a uoa = (p2)? new GreyscaleImageView$a(str): uob;
       uoeArray = uof.l(uoa).w();
       goto label_0089 ;
    }
}
