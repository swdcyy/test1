package com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.gifshow.platform.network.keyconfig.GlobalPopupConfig$ExtParams;
import java.lang.Number;
import java.lang.Long;
import ok.k;

public class GlobalPopupConfig implements Serializable	// class@00086a
{
    public long mAutoDismissMs;
    public long mDelayTimeMs;
    public long mDispersedTime;
    public long mEndTimeMs;
    public GlobalPopupConfig$ExtParams mLiveParams;
    public GlobalPopupConfig$ExtParams mPhotoParams;
    public String mPopupId;
    public long mStartTimeMs;
    public static final long serialVersionUID = 0xe9f92a2b585f1ffa;

    public void GlobalPopupConfig(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GlobalPopupConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!TextUtils.n(this.mPopupId, p0.mPopupId) || (this.mStartTimeMs - p0.mStartTimeMs || this.mEndTimeMs - p0.mEndTimeMs)) {
          b = false;
       }
       return b;
    }
    public String getAuthorId(){
       GlobalPopupConfig obj = PatchProxy.apply(null, this, GlobalPopupConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLiveParams;
       if (obj == null) {
          return "";
       }
       return TextUtils.k(obj.mAuthorId);
    }
    public String getPhotoId(){
       GlobalPopupConfig obj = PatchProxy.apply(null, this, GlobalPopupConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPhotoParams;
       if (obj == null) {
          return "";
       }
       return TextUtils.k(obj.mPhotoId);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, GlobalPopupConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mPopupId,Long.valueOf(this.mStartTimeMs),Long.valueOf(this.mEndTimeMs)};
       return k.b(obj);
    }
    public boolean isLive(){
       boolean b = (this.mLiveParams != null)? true: false;
       return b;
    }
    public boolean isPhoto(){
       boolean b = (this.mPhotoParams != null)? true: false;
       return b;
    }
}
