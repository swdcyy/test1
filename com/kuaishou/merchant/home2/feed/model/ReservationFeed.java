package com.kuaishou.merchant.home2.feed.model.ReservationFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import ekd.x0;
import vw3.d;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class ReservationFeed extends BaseFeed	// class@0017ba
{
    public String mAnchorId;
    public List mAvatarUrls;
    public CommodityFeed mCommodity;
    public boolean mEnableScaleAnimation;
    public int mHeight;
    public String mId;
    public String mJumpUrl;
    public String mPhotoUrl;
    public CDNUrl[] mPhotoUrls;
    public QPhoto mQPhoto;
    public ReservationInfo mReservationInfo;
    public int mWidth;
    public static final long serialVersionUID = 0xd883959257ad69e2;

    public void ReservationFeed(){
       super();
    }
    public String getBiz(){
       return "ReservationCardLogger";
    }
    public String getId(){
       return this.mId;
    }
    public String getPhotoId(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Uri obj = PatchProxy.apply(objArray, this, ReservationFeed.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = x0.f(this.mJumpUrl);
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, d.class, "3");
       String str = (obj1 != patchProxyRe)? obj1: obj.getLastPathSegment();
    }
    public boolean isValidWorkKwaiLink(){
       String host;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       Uri obj = PatchProxy.apply(objArray, this, ReservationFeed.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = x0.f(this.mJumpUrl);
       Object[] objArray1 = PatchProxy.applyOneRefs(obj, objArray, d.class, str);
       if (objArray1 != patchProxyRe) {
       }else {
          Object obj1 = PatchProxy.applyTwoRefs(obj, objArray, objArray, d.class, "2");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             try{
                host = obj.getHost();
                if (!TextUtils.x(host)) {
                   objArray = host;
                }
             }catch(java.lang.Exception e0){
                a.l(MerchantHomeLogBiz.Common, "SafetyUriUtil", "parse host error", e0);
             }
          }
       }
       return TextUtils.n(objArray1, "work");
    }
}
