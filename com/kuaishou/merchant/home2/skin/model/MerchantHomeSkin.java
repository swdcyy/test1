package com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$a;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$TabActivityStyle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$SuperSaleBannerStyle;

public class MerchantHomeSkin implements Serializable	// class@00183c
{
    public MerchantHomeSkin$BaseConfig mBaseConfig;
    public MerchantHomeSkin$ShowConfig mShowConfig;
    public String mSkinRootDirPath;
    public static final long serialVersionUID = 0xaebc130b781aec27;

    public void MerchantHomeSkin(){
       super();
    }
    public static boolean isSameTabActivity(MerchantHomeSkin$a p0,MerchantHomeSkin$TabActivityStyle p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MerchantHomeSkin.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       p0 = p0.a;
       if (p0 == p1) {
          return true;
       }
       if (p0 == null || (p1 != null && (TextUtils.n(p0.mName, p1.mName) && (TextUtils.n(p0.mTabId, p1.mTabId) && (TextUtils.n(p0.mImageUrl, p1.mImageUrl) && TextUtils.n(p0.mJumpUrl, p1.mJumpUrl)))))) {
          b = true;
       }
    label_004c :
       return b;
    }
    public static boolean isSuperSaleBannerValidate(MerchantHomeSkin$ShowConfig p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantHomeSkin.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0 = p0.mSuperSaleBannerStyle;
          if (p0 != null && !TextUtils.x(p0.mBackgroundImgUrl)) {
             b = true;
          label_0025 :
             return b;
          }
       }
       b = false;
       goto label_0025 ;
    }
}
