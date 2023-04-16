package com.yxcorp.gifshow.growth.kpop.ext.model.TkConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kpop.ext.model.TkConfig$a;
import nsd.u;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TkConfig implements Serializable	// class@00140f
{
    public final String tkBundleId;
    public final JsonObject tkParams;
    public final String tkViewKey;
    public static final TkConfig$a Companion;
    public static final long serialVersionUID;

    static {
       TkConfig.Companion = new TkConfig$a(null);
    }
    public void TkConfig(){
       super(null, null, null, 7, null);
    }
    public void TkConfig(String p0){
       super(p0, null, null, 6, null);
    }
    public void TkConfig(String p0,String p1){
       super(p0, p1, null, 4, null);
    }
    public void TkConfig(String p0,String p1,JsonObject p2){
       a.p(p0, "tkBundleId");
       a.p(p1, "tkViewKey");
       a.p(p2, "tkParams");
       super();
       this.tkBundleId = p0;
       this.tkViewKey = p1;
       this.tkParams = p2;
    }
    public void TkConfig(String p0,String p1,JsonObject p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "";
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       if (p3 & 0x04) {
          p2 = new JsonObject();
       }
       super(p0, p1, p2);
       return;
    }
    public static TkConfig copy$default(TkConfig p0,String p1,String p2,JsonObject p3,int p4,Object p5){
       TkConfig tkBundleId;
       TkConfig tkViewKey;
       TkConfig tkParams;
       if (p4 & 0x01) {
          tkBundleId = p0.tkBundleId;
       }
       if (p4 & 0x02) {
          tkViewKey = p0.tkViewKey;
       }
       if (p4 & 0x04) {
          tkParams = p0.tkParams;
       }
       return p0.copy(tkBundleId, tkViewKey, tkParams);
    }
    public final String component1(){
       return this.tkBundleId;
    }
    public final String component2(){
       return this.tkViewKey;
    }
    public final JsonObject component3(){
       return this.tkParams;
    }
    public final TkConfig copy(String p0,String p1,JsonObject p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TkConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tkBundleId");
       a.p(p1, "tkViewKey");
       a.p(p2, "tkParams");
       return new TkConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TkConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TkConfig && (a.g(this.tkBundleId, p0.tkBundleId) && (a.g(this.tkViewKey, p0.tkViewKey) && a.g(this.tkParams, p0.tkParams))))) {
          return true;
       }
       return false;
    }
    public final String getTkBundleId(){
       return this.tkBundleId;
    }
    public final JsonObject getTkParams(){
       return this.tkParams;
    }
    public final String getTkViewKey(){
       return this.tkViewKey;
    }
    public int hashCode(){
       TkConfig obj = PatchProxy.apply(null, this, TkConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.tkBundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       TkConfig ttkViewKey = this.tkViewKey;
       int i2 = (ttkViewKey != null)? ttkViewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttkViewKey = this.tkParams;
       if (ttkViewKey != null) {
          i = ttkViewKey.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TkConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TkConfig\(tkBundleId="+this.tkBundleId+", tkViewKey="+this.tkViewKey+", tkParams="+this.tkParams+"\)";
    }
}
