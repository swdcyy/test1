package com.kuaishou.growth.pendant.model.PendantExpandButtonConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantExpandButtonConfig$a;
import nsd.u;
import java.lang.String;
import java.util.Map;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PendantExpandButtonConfig implements Serializable	// class@000676
{
    public final String bgUrl;
    public final List positionArray;
    public Map textConfigMap;
    public static final PendantExpandButtonConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PendantExpandButtonConfig.Companion = new PendantExpandButtonConfig$a(null);
    }
    public void PendantExpandButtonConfig(String p0,Map p1,List p2){
       super();
       this.bgUrl = p0;
       this.textConfigMap = p1;
       this.positionArray = p2;
    }
    public void PendantExpandButtonConfig(String p0,Map p1,List p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static PendantExpandButtonConfig copy$default(PendantExpandButtonConfig p0,String p1,Map p2,List p3,int p4,Object p5){
       PendantExpandButtonConfig bgUrl;
       PendantExpandButtonConfig textConfigMa;
       PendantExpandButtonConfig positionArra;
       if (p4 & 0x01) {
          bgUrl = p0.bgUrl;
       }
       if (p4 & 0x02) {
          textConfigMa = p0.textConfigMap;
       }
       if (p4 & 0x04) {
          positionArra = p0.positionArray;
       }
       return p0.copy(bgUrl, textConfigMa, positionArra);
    }
    public final String component1(){
       return this.bgUrl;
    }
    public final Map component2(){
       return this.textConfigMap;
    }
    public final List component3(){
       return this.positionArray;
    }
    public final PendantExpandButtonConfig copy(String p0,Map p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PendantExpandButtonConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PendantExpandButtonConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantExpandButtonConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantExpandButtonConfig && (a.g(this.bgUrl, p0.bgUrl) && (a.g(this.textConfigMap, p0.textConfigMap) && a.g(this.positionArray, p0.positionArray))))) {
          return true;
       }
       return false;
    }
    public final String getBgUrl(){
       return this.bgUrl;
    }
    public final List getPositionArray(){
       return this.positionArray;
    }
    public final Map getTextConfigMap(){
       return this.textConfigMap;
    }
    public int hashCode(){
       PendantExpandButtonConfig obj = PatchProxy.apply(null, this, PendantExpandButtonConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bgUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PendantExpandButtonConfig ttextConfigM = this.textConfigMap;
       int i2 = (ttextConfigM != null)? ttextConfigM.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttextConfigM = this.positionArray;
       if (ttextConfigM != null) {
          i = ttextConfigM.hashCode();
       }
       return (i1 + i);
    }
    public final void setTextConfigMap(Map p0){
       this.textConfigMap = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantExpandButtonConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantExpandButtonConfig\(bgUrl="+this.bgUrl+", textConfigMap="+this.textConfigMap+", positionArray="+this.positionArray+"\)";
    }
}
