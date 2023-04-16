package com.yxcorp.gifshow.profile.model.ProfileTips;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class ProfileTips implements Serializable	// class@0013b2
{
    public boolean mEnablePhotoExpirationTip;

    public void ProfileTips(boolean p0){
       super();
       this.mEnablePhotoExpirationTip = p0;
    }
    public static ProfileTips copy$default(ProfileTips p0,boolean p1,int p2,Object p3){
       ProfileTips mEnablePhoto;
       if (p2 & 0x01) {
          mEnablePhoto = p0.mEnablePhotoExpirationTip;
       }
       return p0.copy(mEnablePhoto);
    }
    public final boolean component1(){
       return this.mEnablePhotoExpirationTip;
    }
    public final ProfileTips copy(boolean p0){
       if (PatchProxy.isSupport(ProfileTips.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ProfileTips.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ProfileTips(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ProfileTips && this.mEnablePhotoExpirationTip == p0.mEnablePhotoExpirationTip)) {
          return true;
       }
       return false;
    }
    public final boolean getMEnablePhotoExpirationTip(){
       return this.mEnablePhotoExpirationTip;
    }
    public int hashCode(){
       ProfileTips tmEnablePhot = this.mEnablePhotoExpirationTip;
       if (tmEnablePhot != null) {
          tmEnablePhot = 1;
       }
       return tmEnablePhot;
    }
    public final void setMEnablePhotoExpirationTip(boolean p0){
       this.mEnablePhotoExpirationTip = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileTips.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfileTips\(mEnablePhotoExpirationTip="+this.mEnablePhotoExpirationTip+"\)";
    }
}
