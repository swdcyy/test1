package com.yxcorp.gifshow.model.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.model.a;
import ok.x;
import java.lang.Object;
import ot7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mw4.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.social.startup.relation.model.LoginDialogPojo;
import com.kwai.social.startup.relation.model.LoginDialogPojo$BgPicUrls;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;

public class b extends ConfigAutoParseJsonConsumer	// class@001eaf
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("AccountDestroyUrl", p0.mAccountDestroyUrl);
          uEditor.putString("accountFreezeConfig", b.e(p0.mAccountFreezeConfig));
          uEditor.putString("BiologyAuthenticationUrl", p0.mBiologyAuthenticationUrl);
          uEditor.putBoolean("DisableRegisterBindMobile", p0.mDisableRegisterBindMobile);
          uEditor.putBoolean("DisableRegisterExploreFriend", p0.mDisableRegisterExploreFriend);
          uEditor.putBoolean("DisableRegisterFillUserInfo", p0.mDisableRegisterFillUserInfo);
          uEditor.putBoolean("DisableUseOldToken", p0.mDisableUseOldToken);
          uEditor.putBoolean("EnableH5VerifiedApply", p0.mEnableH5VerifiedApply);
          uEditor.putBoolean("enableLoginedResetPassword", p0.mEnableLoginedResetPassword);
          uEditor.putBoolean("EnableShowIdCardVerify", p0.mEnableShowIdCardVerify);
          uEditor.putString("registerGuide", b.e(p0.mLoginDialogPojo));
          uEditor.putString("loginPageTextConfig", b.e(p0.mLoginPageTextConfig));
          uEditor.putString("RealNameAuthenticationUrl", p0.mRealNameAuthenticationUrl);
          uEditor.putLong("RefreshServiceTokenIntervalMs", p0.mRefreshServiceTokenIntervalMs);
          g.a(uEditor);
          a mLoginDialog = p0.mLoginDialogPojo;
          if (mLoginDialog != null) {
             LoginDialogPojo mBgPicUrls = mLoginDialog.mBgPicUrls;
             if (mBgPicUrls != null && !q.f(mBgPicUrls.mLoginBgUrls)) {
                p0 = p0.mLoginDialogPojo.mBgPicUrls.mLoginBgUrls;
                CDNUrl[] uCDNUrlArray = new CDNUrl[p0.size()];
                Fresco.getImagePipeline().prefetchToBitmapCache(d.b(p0.toArray(uCDNUrlArray))[0], null);
             }
          }
       }
       return;
    }
}
