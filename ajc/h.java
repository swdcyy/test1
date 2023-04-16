package ajc.h;
import com.yxcorp.gifshow.share.platform.WechatForward;
import mhc.v;
import mhc.x;
import nsd.u;
import com.yxcorp.gifshow.share.platform.WechatForward$Companion;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.share.OperationModel;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.yxcorp.gifshow.share.platform.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import com.kuaishou.android.model.feed.VideoFeed;
import com.yxcorp.gifshow.model.SharePlatformData;
import com.yxcorp.gifshow.share.wechat.HaoKanSource;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.model.mix.VideoMeta;
import java.lang.Math;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import com.kuaishou.android.model.mix.CoverMeta;
import com.yxcorp.gifshow.share.wechat.HaoKanExtInfo;
import com.google.gson.Gson;
import brd.x;
import mhc.u1;
import java.lang.Boolean;
import ihd.a;
import n80.a;
import android.content.SharedPreferences;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;

public final class h extends v implements WechatForward	// class@00013a
{
    public final boolean h;
    public final x i;
    public final int j;

    public void h(){
       super(false, null, 0, 7, null);
    }
    public void h(boolean p0){
       super(p0, null, 0, 6, null);
    }
    public void h(boolean p0,x p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = true;
       }
       p1 = (p3 & 0x02)? WechatForward.n0.d(): null;
       if (p3 & 0x04) {
          p2 = p1.k();
       }
       a.p(p1, "forward");
       super(p1, 0, 0, null, null, false, 62, null);
       this.h = p0;
       this.i = p1;
       this.j = p2;
       return;
    }
    public WXMediaMessage G(OperationModel p0){
       return b.a(this, p0);
    }
    public WXMediaMessage I(OperationModel p0){
       return b.c(this, p0);
    }
    public WXMediaMessage K0(OperationModel p0){
       return b.e(this, p0);
    }
    public WXMediaMessage N(OperationModel p0){
       return b.d(this, p0);
    }
    public t O(String p0,String p1,KwaiOperator p2,String p3){
       return b.i(this, p0, p1, p2, p3);
    }
    public t P0(KwaiOperator p0){
       String str;
       SharePlatformData$ShareConfig mResourceUrl;
       CDNUrl uCDNUrl;
       SharePlatformData$ShareConfig mSubTitle;
       String str4;
       Object obj = this;
       t obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       OperationModel obj2 = PatchProxy.applyOneRefs(obj1, obj, oh, "1");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       a.p(obj1, "operator");
       obj2 = p0.i();
       BaseFeed obj3 = PatchProxy.applyOneRefs(obj2, obj, oh, "3");
       Object[] objArray = null;
       if (obj3 != patchProxyRe) {
          str = obj3;
       }else {
          obj3 = obj2.i();
          Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.kuaishou.android.model.feed.VideoFeed");
          SharePlatformData mShareConfig = obj2.j(this.getForward()).mShareConfig;
          String id = obj3.getId();
          a.o(id, "video.id");
          CommonMeta mCaption = obj3.mCommonMeta.mCaption;
          String str1 = "";
          if (mShareConfig != null) {
             SharePlatformData$ShareConfig mTitle = mShareConfig.mTitle;
             if (mTitle != null) {
             label_0058 :
                CommonMeta uCommonMeta = PatchProxy.applyTwoRefs(mCaption, mTitle, obj, oh, "5");
                if (uCommonMeta != patchProxyRe) {
                }else if(TextUtils.isEmpty(mCaption) || ("...").equals(mCaption)){
                   mResourceUrl = mTitle;
                }else {
                   a.m(mCaption);
                }
                uCommonMeta = mResourceUrl;
                if (mShareConfig != null) {
                   mResourceUrl = mShareConfig.mResourceUrl;
                   if (mResourceUrl != null) {
                      mTitle = mResourceUrl;
                   label_0081 :
                      if (mShareConfig != null) {
                         mResourceUrl = mShareConfig.mCoverUrls;
                         if (mResourceUrl != null) {
                            object oobject = mResourceUrl[0];
                            if (oobject != null) {
                               CDNUrl mUrl = oobject.mUrl;
                               if (mUrl != null) {
                                  uCDNUrl = mUrl;
                               label_0093 :
                                  if (mShareConfig != null) {
                                     mSubTitle = mShareConfig.mSubTitle;
                                     if (mSubTitle != null) {
                                     label_009b :
                                        long l = (long)Math.ceil(((double)obj3.mVideoModel.mDuration / 0x408f400000000000));
                                        String str2 = PatchProxy.apply(objArray, obj, oh, "4");
                                        if (str2 != patchProxyRe) {
                                        }else {
                                           c uoc = a.a();
                                           a.o(uoc, "AppEnv.get\(\)");
                                           Application uApplication = uoc.a();
                                           a.o(uApplication, "app");
                                           CharSequence applicationL = uApplication.getPackageManager().getApplicationLabel(uApplication.getApplicationInfo());
                                           if (applicationL != null) {
                                              str2 = applicationL.toString();
                                              if (str2 == null) {
                                              }
                                           }else {
                                           }
                                        }
                                        String str3 = str2;
                                     label_00eb :
                                        VideoFeed mCoverMeta = obj3.mCoverMeta;
                                        HaoKanSource haoKanSource = new HaoKanSource(id, uCommonMeta, mTitle, uCDNUrl, mSubTitle, l, str3, "https://static.yximgs.com/bs2/fes/app_kwai_logo.png", ((double)mCoverMeta.mWidth / (double)mCoverMeta.mHeight));
                                        HaoKanExtInfo haoKanExtInf = new HaoKanExtInfo(v19, null, 0, 6, null);
                                        str = new Gson().q(mCoverMeta);
                                        a.o(str, "Gson\(\).toJson\(data\)");
                                     }
                                  }
                                  mSubTitle = str1;
                                  goto label_009b ;
                               }
                            }
                         }
                      }
                      uCDNUrl = str1;
                      goto label_0093 ;
                   }
                }
                str4 = str1;
                goto label_0081 ;
             }
          }
          str4 = str1;
          goto label_0058 ;
       }
       obj1 = obj.O("nativeShareToHaokan", str, obj1, null).compose(u1.b(obj1, obj));
       a.o(obj1, "sendHaoKanMessage\(getBus¡­nsformer\(operator, this\)\)");
       return obj1;
    }
    public boolean Q0(OperationModel p0){
       VideoFeed mPhotoMeta;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "model");
       boolean b = true;
       if (super.Q0(p0)) {
          Object[] objArray = null;
          obj = PatchProxy.apply(objArray, objArray, a.class, "3");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.a.getBoolean("enableWechatWow", false);
          if (b1) {
             BaseFeed uBaseFeed = p0.i();
             if (uBaseFeed instanceof VideoFeed) {
                objArray = uBaseFeed;
             }
             if (objArray != null) {
                mPhotoMeta = objArray.mPhotoMeta;
                if (mPhotoMeta != null && (mPhotoMeta.mPhotoStatus == null && (!objArray.isPayCourse() && objArray.mVideoModel.mDuration > 0))) {
                   mPhotoMeta = 1;
                label_0065 :
                   if (mPhotoMeta) {
                   label_0069 :
                      return b;
                   }
                }
             }
             mPhotoMeta = 0;
             goto label_0065 ;
          }
       }
    label_0068 :
       b = false;
       goto label_0069 ;
    }
    public int S0(){
       return 2;
    }
    public WXMediaMessage X(OperationModel p0){
       return b.b(this, p0);
    }
    public WXMediaMessage a0(OperationModel p0){
       return b.g(this, p0);
    }
    public t c0(WXMediaMessage p0,KwaiOperator p1,String p2){
       return b.j(this, p0, p1, p2);
    }
    public WXMediaMessage d0(OperationModel p0,ShareToken p1){
       return b.f(this, p0, p1);
    }
    public SharePlatformData$ShareConfig e0(OperationModel p0){
       return b.h(this, p0);
    }
    public x getForward(){
       return this.i;
    }
    public int k(){
       return this.j;
    }
    public boolean m(){
       return this.h;
    }
}
