package com.yxcorp.gifshow.profile.model.ProfileAnnualAlbumTipInterval;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileAnnualAlbumTipInterval implements Serializable	// class@001390
{
    public float cancelInterval;
    public float goAlbumInterval;

    public void ProfileAnnualAlbumTipInterval(){
       super(0, 0, 3, null);
    }
    public void ProfileAnnualAlbumTipInterval(float p0,float p1){
       super();
       this.goAlbumInterval = p0;
       this.cancelInterval = p1;
    }
    public void ProfileAnnualAlbumTipInterval(float p0,float p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0xbf800000;
       }
       if (p2 & 0x02) {
          p1 = 0xbf800000;
       }
       super(p0, p1);
       return;
    }
    public static ProfileAnnualAlbumTipInterval copy$default(ProfileAnnualAlbumTipInterval p0,float p1,float p2,int p3,Object p4){
       ProfileAnnualAlbumTipInterval goAlbumInter;
       ProfileAnnualAlbumTipInterval cancelInterv;
       if (p3 & 0x01) {
          goAlbumInter = p0.goAlbumInterval;
       }
       if (p3 & 0x02) {
          cancelInterv = p0.cancelInterval;
       }
       return p0.copy(goAlbumInter, cancelInterv);
    }
    public final float component1(){
       return this.goAlbumInterval;
    }
    public final float component2(){
       return this.cancelInterval;
    }
    public final ProfileAnnualAlbumTipInterval copy(float p0,float p1){
       if (PatchProxy.isSupport(ProfileAnnualAlbumTipInterval.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ProfileAnnualAlbumTipInterval.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ProfileAnnualAlbumTipInterval(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileAnnualAlbumTipInterval.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfileAnnualAlbumTipInterval && (!Float.compare(this.goAlbumInterval, p0.goAlbumInterval) && !Float.compare(this.cancelInterval, p0.cancelInterval)))) {
          return true;
       }
       return false;
    }
    public final float getCancelInterval(){
       return this.cancelInterval;
    }
    public final float getGoAlbumInterval(){
       return this.goAlbumInterval;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ProfileAnnualAlbumTipInterval.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.goAlbumInterval) * 31) + Float.floatToIntBits(this.cancelInterval));
    }
    public final void setCancelInterval(float p0){
       this.cancelInterval = p0;
    }
    public final void setGoAlbumInterval(float p0){
       this.goAlbumInterval = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileAnnualAlbumTipInterval.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfileAnnualAlbumTipInterval\(goAlbumInterval="+this.goAlbumInterval+", cancelInterval="+this.cancelInterval+"\)";
    }
}
