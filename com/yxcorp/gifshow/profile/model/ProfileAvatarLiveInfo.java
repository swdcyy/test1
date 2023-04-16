package com.yxcorp.gifshow.profile.model.ProfileAvatarLiveInfo;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileAvatarLiveInfo implements Serializable	// class@001392
{
    public int duration;
    public String linkScheme;

    public void ProfileAvatarLiveInfo(){
       super(0, null, 3, null);
    }
    public void ProfileAvatarLiveInfo(int p0,String p1){
       super();
       this.duration = p0;
       this.linkScheme = p1;
    }
    public void ProfileAvatarLiveInfo(int p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static ProfileAvatarLiveInfo copy$default(ProfileAvatarLiveInfo p0,int p1,String p2,int p3,Object p4){
       ProfileAvatarLiveInfo duration;
       ProfileAvatarLiveInfo linkScheme;
       if (p3 & 0x01) {
          duration = p0.duration;
       }
       if (p3 & 0x02) {
          linkScheme = p0.linkScheme;
       }
       return p0.copy(duration, linkScheme);
    }
    public final int component1(){
       return this.duration;
    }
    public final String component2(){
       return this.linkScheme;
    }
    public final ProfileAvatarLiveInfo copy(int p0,String p1){
       if (PatchProxy.isSupport(ProfileAvatarLiveInfo.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, ProfileAvatarLiveInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ProfileAvatarLiveInfo(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileAvatarLiveInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfileAvatarLiveInfo && (this.duration == p0.duration && a.g(this.linkScheme, p0.linkScheme)))) {
          return true;
       }
       return false;
    }
    public final int getDuration(){
       return this.duration;
    }
    public final String getLinkScheme(){
       return this.linkScheme;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ProfileAvatarLiveInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.duration * 31;
       ProfileAvatarLiveInfo tlinkScheme = this.linkScheme;
       int i1 = (tlinkScheme != null)? tlinkScheme.hashCode(): 0;
       return (i + i1);
    }
    public final void setDuration(int p0){
       this.duration = p0;
    }
    public final void setLinkScheme(String p0){
       this.linkScheme = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileAvatarLiveInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfileAvatarLiveInfo\(duration="+this.duration+", linkScheme="+this.linkScheme+"\)";
    }
}
