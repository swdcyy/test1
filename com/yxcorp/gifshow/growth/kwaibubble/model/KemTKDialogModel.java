package com.yxcorp.gifshow.growth.kwaibubble.model.KemTKDialogModel;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kwaibubble.model.KemTKDialogModel$a;
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

public final class KemTKDialogModel implements Serializable	// class@001422
{
    public final String bundleId;
    public final JsonObject params;
    public final String viewKey;
    public static final KemTKDialogModel$a Companion;
    public static final long serialVersionUID;

    static {
       KemTKDialogModel.Companion = new KemTKDialogModel$a(null);
    }
    public void KemTKDialogModel(){
       super(null, null, null, 7, null);
    }
    public void KemTKDialogModel(String p0){
       super(p0, null, null, 6, null);
    }
    public void KemTKDialogModel(String p0,String p1){
       super(p0, p1, null, 4, null);
    }
    public void KemTKDialogModel(String p0,String p1,JsonObject p2){
       a.p(p0, "bundleId");
       a.p(p1, "viewKey");
       a.p(p2, "params");
       super();
       this.bundleId = p0;
       this.viewKey = p1;
       this.params = p2;
    }
    public void KemTKDialogModel(String p0,String p1,JsonObject p2,int p3,u p4){
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
    public static KemTKDialogModel copy$default(KemTKDialogModel p0,String p1,String p2,JsonObject p3,int p4,Object p5){
       KemTKDialogModel bundleId;
       KemTKDialogModel viewKey;
       KemTKDialogModel params;
       if (p4 & 0x01) {
          bundleId = p0.bundleId;
       }
       if (p4 & 0x02) {
          viewKey = p0.viewKey;
       }
       if (p4 & 0x04) {
          params = p0.params;
       }
       return p0.copy(bundleId, viewKey, params);
    }
    public final String component1(){
       return this.bundleId;
    }
    public final String component2(){
       return this.viewKey;
    }
    public final JsonObject component3(){
       return this.params;
    }
    public final KemTKDialogModel copy(String p0,String p1,JsonObject p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KemTKDialogModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bundleId");
       a.p(p1, "viewKey");
       a.p(p2, "params");
       return new KemTKDialogModel(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KemTKDialogModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KemTKDialogModel && (a.g(this.bundleId, p0.bundleId) && (a.g(this.viewKey, p0.viewKey) && a.g(this.params, p0.params))))) {
          return true;
       }
       return false;
    }
    public final String getBundleId(){
       return this.bundleId;
    }
    public final JsonObject getParams(){
       return this.params;
    }
    public final String getViewKey(){
       return this.viewKey;
    }
    public int hashCode(){
       KemTKDialogModel obj = PatchProxy.apply(null, this, KemTKDialogModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KemTKDialogModel tviewKey = this.viewKey;
       int i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.params;
       if (tviewKey != null) {
          i = tviewKey.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KemTKDialogModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KemTKDialogModel\(bundleId="+this.bundleId+", viewKey="+this.viewKey+", params="+this.params+"\)";
    }
}
