package com.yxcorp.gifshow.magic.data.repo.response.MagicExtraDependentData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MagicExtraDependentData implements Serializable	// class@001b92
{
    public final String key;
    public final Object payLoad;
    public final List preloadResourceURLs;

    public void MagicExtraDependentData(String p0,Object p1,List p2){
       super();
       this.key = p0;
       this.payLoad = p1;
       this.preloadResourceURLs = p2;
    }
    public static MagicExtraDependentData copy$default(MagicExtraDependentData p0,String p1,Object p2,List p3,int p4,Object p5){
       MagicExtraDependentData key;
       MagicExtraDependentData preloadResou;
       if (p4 & 0x01) {
          key = p0.key;
       }
       if (p4 & 0x02) {
          p2 = p0.payLoad;
       }
       if (p4 & 0x04) {
          preloadResou = p0.preloadResourceURLs;
       }
       return p0.copy(key, p2, preloadResou);
    }
    public final String component1(){
       return this.key;
    }
    public final Object component2(){
       return this.payLoad;
    }
    public final List component3(){
       return this.preloadResourceURLs;
    }
    public final MagicExtraDependentData copy(String p0,Object p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicExtraDependentData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MagicExtraDependentData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicExtraDependentData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicExtraDependentData && (a.g(this.key, p0.key) && (a.g(this.payLoad, p0.payLoad) && a.g(this.preloadResourceURLs, p0.preloadResourceURLs))))) {
          return true;
       }
       return false;
    }
    public final String getKey(){
       return this.key;
    }
    public final Object getPayLoad(){
       return this.payLoad;
    }
    public final List getPreloadResourceURLs(){
       return this.preloadResourceURLs;
    }
    public int hashCode(){
       MagicExtraDependentData obj = PatchProxy.apply(null, this, MagicExtraDependentData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.key;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MagicExtraDependentData tpayLoad = this.payLoad;
       int i2 = (tpayLoad != null)? tpayLoad.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpayLoad = this.preloadResourceURLs;
       if (tpayLoad != null) {
          i = tpayLoad.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicExtraDependentData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicExtraDependentData\(key="+this.key+", payLoad="+this.payLoad+", preloadResourceURLs="+this.preloadResourceURLs+"\)";
    }
}
