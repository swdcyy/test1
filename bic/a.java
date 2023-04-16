package bic.a;
import bic.b;
import bic.a$a;
import nsd.u;
import ohc.k;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.privacy.PrivacyShareDlgCancelException;
import android.app.Activity;
import uo7.k;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import uo7.h0;
import com.yxcorp.gifshow.share.platform.WechatForward;
import mhc.x;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import com.yxcorp.gifshow.share.platform.QQForward;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import pic.h;
import pic.h$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.model.AuthorShareFeedConfig;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import uw9.c;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.detail.model.AuthorShareFeedConfig$FrequencyConfig;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;

public final class a implements b	// class@00047c
{
    public final k a;
    public final PhotoDetailParam b;
    public final ShareInitResponse$SharePanelElement c;
    public final Throwable d;
    public static final a$a e;

    static {
       a.e = new a$a(null);
    }
    public void a(k p0,PhotoDetailParam p1,ShareInitResponse$SharePanelElement p2,Throwable p3){
       a.p(p0, "conf");
       a.p(p1, "mDetailParam");
       a.p(p2, "element");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public boolean N(){
       boolean b1;
       AuthorShareFeedConfig$FrequencyConfig mHidePopupDa;
       AuthorShareFeedConfig$FrequencyConfig mFrequencyDa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = false;
       if (obj != null && obj instanceof PrivacyShareDlgCancelException) {
          return b;
       }
       Activity uActivity = this.a.k();
       Objects.requireNonNull(uActivity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       QPhoto qPhoto = this.a.K();
       ShareInitResponse$SharePanelElement mActionUrl = this.c.mActionUrl;
       a.o(mActionUrl, "element.mActionUrl");
       String str = new h0(mActionUrl).c();
       String str1 = this.a.s();
       if (!uActivity.isDestroyed() && (!uActivity.isFinishing() && qPhoto.isMine())) {
          String obj1 = PatchProxy.applyTwoRefs(str1, str, this, uoa, "2");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!WechatForward.n0.c().K() && (QQForward.m0.c().K() || h.B0.a().K())){
             obj1 = 1;
          }else {
             obj1 = null;
          }
          if (obj1 && (!TextUtils.n(str1, "DOWNLOAD") && (!TextUtils.n(str, "wechat") && (!TextUtils.n(str, "wechatMoments") && (!TextUtils.n(str, "wechatWow") && (!TextUtils.n(str, "qq") && (TextUtils.n(str, "qzone") || TextUtils.n(str, "weibo")))))))) {
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             obj1 = PatchProxy.apply(objArray, this, uoa, "3");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                AuthorShareFeedConfig obj2 = PatchProxy.apply(objArray, this, uoa, "4");
                if (obj2 != patchProxyRe) {
                }else {
                   obj2 = a.t().getValue("authorShareFeedConfig", AuthorShareFeedConfig.class, objArray);
                }
                long l = 0;
                long longx = c.a.getLong("authorGuideDialogForbiddenTime", l);
                if (obj2 != null) {
                   AuthorShareFeedConfig mAlert = obj2.mAlert;
                   if (mAlert != null) {
                      mHidePopupDa = mAlert.mHidePopupDays;
                   label_0111 :
                      if (!longx - l || DateUtils.r(longx, System.currentTimeMillis()) >= mHidePopupDa) {
                         if (DateUtils.H(c.b())) {
                            int i = c.a();
                            if (obj2 != null) {
                               obj2 = obj2.mAlert;
                               if (obj2 != null) {
                                  mFrequencyDa = obj2.mFrequencyDaily;
                               label_0138 :
                                  if (i < mFrequencyDa) {
                                  label_013b :
                                     b = true;
                                  }
                               }
                            }
                            mFrequencyDa = 2;
                            goto label_0138 ;
                         }else {
                            goto label_013b ;
                         }
                      }
                   }
                }
                mHidePopupDa = 3;
                goto label_0111 ;
             }
          }
       }
    label_013c :
       return b;
    }
}
