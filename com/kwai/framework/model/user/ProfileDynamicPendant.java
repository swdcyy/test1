package com.kwai.framework.model.user.ProfileDynamicPendant;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ProfileDynamicPendant implements Serializable	// class@001711
{
    public float heightRadio;
    public String lottieUrl;
    public float widthRadio;

    public void ProfileDynamicPendant(){
       super(null, 0, 0, 7, null);
    }
    public void ProfileDynamicPendant(String p0,float p1,float p2){
       super();
       this.lottieUrl = p0;
       this.widthRadio = p1;
       this.heightRadio = p2;
    }
    public void ProfileDynamicPendant(String p0,float p1,float p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = null;
       }
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static ProfileDynamicPendant copy$default(ProfileDynamicPendant p0,String p1,float p2,float p3,int p4,Object p5){
       ProfileDynamicPendant lottieUrl;
       ProfileDynamicPendant widthRadio;
       ProfileDynamicPendant heightRadio;
       if (p4 & 0x01) {
          lottieUrl = p0.lottieUrl;
       }
       if (p4 & 0x02) {
          widthRadio = p0.widthRadio;
       }
       if (p4 & 0x04) {
          heightRadio = p0.heightRadio;
       }
       return p0.copy(lottieUrl, widthRadio, heightRadio);
    }
    public final String component1(){
       return this.lottieUrl;
    }
    public final float component2(){
       return this.widthRadio;
    }
    public final float component3(){
       return this.heightRadio;
    }
    public final ProfileDynamicPendant copy(String p0,float p1,float p2){
       if (PatchProxy.isSupport(ProfileDynamicPendant.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, ProfileDynamicPendant.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ProfileDynamicPendant(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileDynamicPendant.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ProfileDynamicPendant && (a.g(this.lottieUrl, p0.lottieUrl) && (!Float.compare(this.widthRadio, p0.widthRadio) && !Float.compare(this.heightRadio, p0.heightRadio))))) {
          return true;
       }
       return false;
    }
    public final float getHeightRadio(){
       return this.heightRadio;
    }
    public final String getLottieUrl(){
       return this.lottieUrl;
    }
    public final float getWidthRadio(){
       return this.widthRadio;
    }
    public int hashCode(){
       ProfileDynamicPendant obj = PatchProxy.apply(null, this, ProfileDynamicPendant.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lottieUrl;
       int i = (obj != null)? obj.hashCode(): 0;
       return ((((i * 31) + Float.floatToIntBits(this.widthRadio)) * 31) + Float.floatToIntBits(this.heightRadio));
    }
    public final void setHeightRadio(float p0){
       this.heightRadio = p0;
    }
    public final void setLottieUrl(String p0){
       this.lottieUrl = p0;
    }
    public final void setWidthRadio(float p0){
       this.widthRadio = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ProfileDynamicPendant.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ProfileDynamicPendant\(lottieUrl="+this.lottieUrl+", widthRadio="+this.widthRadio+", heightRadio="+this.heightRadio+"\)";
    }
}
