package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e$a;
import t2c.b;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import w2c.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import x3c.b;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;
import x3c.c;
import java.util.Objects;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;
import c5c.k;
import f3c.j;
import com.facebook.imagepipeline.request.ImageRequest;
import s0d.f;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo$BgImageInfo;
import s0d.a;
import s0d.e;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import dd.d;
import kb.c;

public class e$a implements b	// class@00157b
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public boolean a(UserProfileResponse p0,a p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       e$a obj = PatchProxy.applyTwoRefs(p0, p1, this, e$a.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       obj.t = p0;
       String str1 = "3";
       UserProfileResponseMeta userProfileR = PatchProxy.applyOneRefs(p0, null, b.class, str1);
       if (userProfileR != patchProxyRe) {
       }else {
          a.p(p0, "response");
          UserProfileResponseMeta userProfileR1 = c.d(p0);
          userProfileR = (userProfileR1 != null)? userProfileR1.mDialogInfo: null;
       }
       Objects.requireNonNull(obj);
       p0 = PatchProxy.applyTwoRefs(userProfileR, p1, obj, e.class, str1);
       b = true;
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else if(!obj.P8()){
          boolean b1 = (userProfileR != null && (userProfileR.mButtonInfo == null && (userProfileR.mSwitchInfo != null || userProfileR.mDialogStyle == 6)))? true: false;
          g.f(KsLogProfileTag.COMMON_DIALOG.appendTag("ProfileDialogPresenter"), "showDialog", "isValidDialogData", String.valueOf(b1));
          if (b1) {
             ProfileDialogInfo mBgImageInfo = userProfileR.mBgImageInfo;
             k ok = new k(obj, userProfileR, p1);
             if (!PatchProxy.applyVoidTwoRefs(mBgImageInfo, ok, null, j.class, str)) {
                if (mBgImageInfo == null) {
                   ok.onRequestSuccess(null, null, b);
                }else {
                   e uoe = f.x().o(mBgImageInfo.mImageWidth, mBgImageInfo.mImageHeight).t(mBgImageInfo.mBgImg).v();
                   if (uoe == null) {
                      ok.onRequestSuccess(null, null, b);
                   }else {
                      a$a uoa = a.d();
                      uoa.b(":ks-features:ft-social:profile");
                      Fresco.getImagePipeline().prefetchToBitmapCache(uoe, uoa.a(), ok);
                   }
                }
             }
          }
       }
       b = false;
       return b;
    }
    public int getPriority(){
       return 3;
    }
}
