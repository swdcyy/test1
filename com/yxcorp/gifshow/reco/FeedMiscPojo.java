package com.yxcorp.gifshow.reco.FeedMiscPojo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import y95.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.TextUtils;
import java.lang.Long;

public class FeedMiscPojo implements Serializable	// class@001302
{
    public String mDeviceBit;
    public long mUserRecoBit;
    public static boolean b;

    public void FeedMiscPojo(){
       super();
    }
    public static boolean a(long p0){
       long l = 1;
       if (!((p0 >> l) % 2)) {
       }else {
          l = false;
       }
       return l;
    }
    public static boolean b(long p0){
       boolean b = (!(p0 % 2))? true: false;
       return b;
    }
    public static boolean hasFeedMiscPojoInit(){
       return FeedMiscPojo.b;
    }
    public static boolean isCommercialRecommendEnabled(){
       Object obj = PatchProxy.apply(null, null, FeedMiscPojo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!QCurrentUser.ME.isLogined()) {
          return FeedMiscPojo.isDeviceCommercialRecommendEnabled();
       }
       boolean b = (FeedMiscPojo.isUserCommercialRecommendEnabled() && FeedMiscPojo.isDeviceCommercialRecommendEnabled())? true: false;
       return b;
    }
    public static boolean isDeviceCommercialRecommendEnabled(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, FeedMiscPojo.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a.a();
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, FeedMiscPojo.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(TextUtils.x(obj)){
          b = true;
       }else if(!TextUtils.isDigitsOnly(obj)){
          b = false;
       }else {
          b = FeedMiscPojo.a(Long.parseLong(obj));
       }
       return b;
    }
    public static boolean isDeviceFeedRecommendEnabled(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, FeedMiscPojo.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a.a();
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, FeedMiscPojo.class, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(TextUtils.x(obj)){
          b = true;
       }else if(!TextUtils.isDigitsOnly(obj)){
          b = false;
       }else {
          b = FeedMiscPojo.b(Long.parseLong(obj));
       }
       return b;
    }
    public static boolean isFeedRecommendEnabled(){
       Object obj = PatchProxy.apply(null, null, FeedMiscPojo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!QCurrentUser.ME.isLogined()) {
          return FeedMiscPojo.isDeviceFeedRecommendEnabled();
       }
       boolean b = (FeedMiscPojo.isUserFeedRecommendEnabled() && FeedMiscPojo.isDeviceFeedRecommendEnabled())? true: false;
       return b;
    }
    public static boolean isUserCommercialRecommendEnabled(){
       Object obj = PatchProxy.apply(null, null, FeedMiscPojo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return FeedMiscPojo.a(a.b());
    }
    public static boolean isUserFeedRecommendEnabled(){
       Object obj = PatchProxy.apply(null, null, FeedMiscPojo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return FeedMiscPojo.b(a.b());
    }
    public static void setFeedMiscPojoInit(){
       FeedMiscPojo.b = true;
    }
}
