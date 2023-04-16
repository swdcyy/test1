package com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicResourceRequestData;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MagicResourceRequestData implements Serializable	// class@000e2f
{
    public final boolean readLocalResource;
    public final List resourceDependencies;

    public void MagicResourceRequestData(List p0,boolean p1){
       super();
       this.resourceDependencies = p0;
       this.readLocalResource = p1;
    }
    public void MagicResourceRequestData(List p0,boolean p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public static MagicResourceRequestData copy$default(MagicResourceRequestData p0,List p1,boolean p2,int p3,Object p4){
       MagicResourceRequestData resourceDepe;
       MagicResourceRequestData readLocalRes;
       if (p3 & 0x01) {
          resourceDepe = p0.resourceDependencies;
       }
       if (p3 & 0x02) {
          readLocalRes = p0.readLocalResource;
       }
       return p0.copy(resourceDepe, readLocalRes);
    }
    public final List component1(){
       return this.resourceDependencies;
    }
    public final boolean component2(){
       return this.readLocalResource;
    }
    public final MagicResourceRequestData copy(List p0,boolean p1){
       if (PatchProxy.isSupport(MagicResourceRequestData.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, MagicResourceRequestData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new MagicResourceRequestData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicResourceRequestData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MagicResourceRequestData && (a.g(this.resourceDependencies, p0.resourceDependencies) && this.readLocalResource == p0.readLocalResource))) {
          return true;
       }
       return false;
    }
    public final boolean getReadLocalResource(){
       return this.readLocalResource;
    }
    public final List getResourceDependencies(){
       return this.resourceDependencies;
    }
    public int hashCode(){
       MagicResourceRequestData obj = PatchProxy.apply(null, this, MagicResourceRequestData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.resourceDependencies;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       MagicResourceRequestData treadLocalRe = this.readLocalResource;
       if (treadLocalRe != null) {
          treadLocalRe = 1;
       }
       return (i + treadLocalRe);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicResourceRequestData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MagicResourceRequestData\(resourceDependencies="+this.resourceDependencies+", readLocalResource="+this.readLocalResource+"\)";
    }
}
