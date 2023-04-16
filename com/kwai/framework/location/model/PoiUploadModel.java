package com.kwai.framework.location.model.PoiUploadModel;
import com.kwai.framework.location.model.KsRegeocode;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PoiUploadModel	// class@001655
{
    public KsRegeocode regeocode;

    public void PoiUploadModel(){
       super(null, 1, null);
    }
    public void PoiUploadModel(KsRegeocode p0){
       super();
       this.regeocode = p0;
    }
    public void PoiUploadModel(KsRegeocode p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public static PoiUploadModel copy$default(PoiUploadModel p0,KsRegeocode p1,int p2,Object p3){
       PoiUploadModel regeocode;
       if (p2 & 0x01) {
          regeocode = p0.regeocode;
       }
       return p0.copy(regeocode);
    }
    public final KsRegeocode component1(){
       return this.regeocode;
    }
    public final PoiUploadModel copy(KsRegeocode p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoiUploadModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PoiUploadModel(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoiUploadModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PoiUploadModel && a.g(this.regeocode, p0.regeocode))) {
          return true;
       }
       return false;
    }
    public final KsRegeocode getRegeocode(){
       return this.regeocode;
    }
    public int hashCode(){
       PoiUploadModel obj = PatchProxy.apply(null, this, PoiUploadModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.regeocode;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final void setRegeocode(KsRegeocode p0){
       this.regeocode = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PoiUploadModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PoiUploadModel\(regeocode="+this.regeocode+"\)";
    }
}
