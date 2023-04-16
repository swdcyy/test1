package com.kwai.framework.model.user.DynamicPendant;
import java.io.Serializable;
import java.lang.String;
import java.lang.Float;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DynamicPendant implements Serializable	// class@0016ee
{
    public Float heightRadio;
    public String lottieUrl;
    public Float widthRadio;

    public void DynamicPendant(String p0,Float p1,Float p2){
       super();
       this.lottieUrl = p0;
       this.widthRadio = p1;
       this.heightRadio = p2;
    }
    public static DynamicPendant copy$default(DynamicPendant p0,String p1,Float p2,Float p3,int p4,Object p5){
       DynamicPendant lottieUrl;
       DynamicPendant widthRadio;
       DynamicPendant heightRadio;
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
    public final Float component2(){
       return this.widthRadio;
    }
    public final Float component3(){
       return this.heightRadio;
    }
    public final DynamicPendant copy(String p0,Float p1,Float p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DynamicPendant.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DynamicPendant(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DynamicPendant.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DynamicPendant && (a.g(this.lottieUrl, p0.lottieUrl) && (a.g(this.widthRadio, p0.widthRadio) && a.g(this.heightRadio, p0.heightRadio))))) {
          return true;
       }
       return false;
    }
    public final Float getHeightRadio(){
       return this.heightRadio;
    }
    public final String getLottieUrl(){
       return this.lottieUrl;
    }
    public final Float getWidthRadio(){
       return this.widthRadio;
    }
    public int hashCode(){
       DynamicPendant obj = PatchProxy.apply(null, this, DynamicPendant.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lottieUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DynamicPendant twidthRadio = this.widthRadio;
       int i2 = (twidthRadio != null)? twidthRadio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       twidthRadio = this.heightRadio;
       if (twidthRadio != null) {
          i = twidthRadio.hashCode();
       }
       return (i1 + i);
    }
    public final void setHeightRadio(Float p0){
       this.heightRadio = p0;
    }
    public final void setLottieUrl(String p0){
       this.lottieUrl = p0;
    }
    public final void setWidthRadio(Float p0){
       this.widthRadio = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DynamicPendant.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DynamicPendant\(lottieUrl="+this.lottieUrl+", widthRadio="+this.widthRadio+", heightRadio="+this.heightRadio+"\)";
    }
}
