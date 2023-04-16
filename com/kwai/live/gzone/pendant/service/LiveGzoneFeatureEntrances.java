package com.kwai.live.gzone.pendant.service.LiveGzoneFeatureEntrances;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Color;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import com.kuaishou.webkit.URLUtil;

public class LiveGzoneFeatureEntrances implements Serializable, a	// class@000d96
{
    public boolean isShowed;
    public LiveGzoneFeatureEntrances$a mBottomInfo;
    public LiveGzoneFeatureEntranceBubble mBubbleInfo;
    public long mDismissTimestamp;
    public boolean mForcePortrait;
    public CDNUrl[] mIconUrls;
    public String mId;
    public String mName;
    public int mPriority;
    public long mRedDotId;
    public CDNUrl[] mRedDotImg;
    public int mShowCount;
    public long mShowDelayMs;
    public boolean mShowH5Pendant;
    public boolean mShowInTab;
    public int mTabBarColor;
    public String mTabBarServerColorString;
    public CDNUrl[] mTabIcons;
    public int mType;
    public String mUrl;
    public static final long serialVersionUID = 0x73d38a298e9b8e13;

    public void LiveGzoneFeatureEntrances(){
       super();
       this.mTabBarColor = -1;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneFeatureEntrances.class, "3")) {
          return;
       }
       try{
          this.mTabBarColor = Color.parseColor(this.mTabBarServerColorString);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneFeatureEntrances.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       LiveGzoneFeatureEntrances tmId = this.mId;
       p0 = p0.mId;
       if (tmId != null) {
          if (!tmId.equals(p0)) {
          label_0036 :
             return false;
          }
       }else if(p0 != null){
          goto label_0036 ;
       }
       return true;
    }
    public int hashCode(){
       LiveGzoneFeatureEntrances obj = PatchProxy.apply(null, this, LiveGzoneFeatureEntrances.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public boolean isKrnUrl(){
       LiveGzoneFeatureEntrances obj = PatchProxy.apply(null, this, LiveGzoneFeatureEntrances.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mUrl;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (obj.startsWith("kwai://krn") || (this.mUrl).startsWith("kwailive://krndialog")) {
          b = true;
       }
       return b;
    }
    public boolean isNormalH5(){
       LiveGzoneFeatureEntrances tmType = this.mType;
       boolean b = (tmType == 2 || tmType == 3)? true: false;
       return b;
    }
    public boolean isSupport(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneFeatureEntrances.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mShowInTab != null) {
          if (this.mUrl == null) {
             return false;
          }else if(this.isKrnUrl() || URLUtil.isNetworkUrl(this.mUrl)){
             return false;
          }
       }
       return true;
    }
}
