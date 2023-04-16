package com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefInfoItem;
import java.io.Serializable;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialBriefInfoItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MaterialBriefInfoItem implements Serializable	// class@00105d
{
    public String checksum;
    public String materialId;
    public static final MaterialBriefInfoItem$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialBriefInfoItem.Companion = new MaterialBriefInfoItem$a(null);
    }
    public void MaterialBriefInfoItem(){
       super(null, null, 3, null);
    }
    public void MaterialBriefInfoItem(String p0,String p1){
       super();
       this.materialId = p0;
       this.checksum = p1;
    }
    public void MaterialBriefInfoItem(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static MaterialBriefInfoItem copy$default(MaterialBriefInfoItem p0,String p1,String p2,int p3,Object p4){
       MaterialBriefInfoItem materialId;
       MaterialBriefInfoItem checksum;
       if (p3 & 0x01) {
          materialId = p0.materialId;
       }
       if (p3 & 0x02) {
          checksum = p0.checksum;
       }
       return p0.copy(materialId, checksum);
    }
    public final String component1(){
       return this.materialId;
    }
    public final String component2(){
       return this.checksum;
    }
    public final MaterialBriefInfoItem copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MaterialBriefInfoItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MaterialBriefInfoItem(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MaterialBriefInfoItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MaterialBriefInfoItem && (a.g(this.materialId, p0.materialId) && a.g(this.checksum, p0.checksum)))) {
          return true;
       }
       return false;
    }
    public final String getChecksum(){
       return this.checksum;
    }
    public final String getId(){
       MaterialBriefInfoItem tmaterialId = this.materialId;
       if (tmaterialId != null) {
       }else {
          tmaterialId = "";
       }
       return tmaterialId;
    }
    public final String getMaterialId(){
       return this.materialId;
    }
    public int hashCode(){
       MaterialBriefInfoItem obj = PatchProxy.apply(null, this, MaterialBriefInfoItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.materialId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MaterialBriefInfoItem tchecksum = this.checksum;
       if (tchecksum != null) {
          i = tchecksum.hashCode();
       }
       return (i1 + i);
    }
    public final void setChecksum(String p0){
       this.checksum = p0;
    }
    public final void setId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MaterialBriefInfoItem.class, "1")) {
          return;
       }
       a.p(p0, "id");
       this.materialId = p0;
       return;
    }
    public final void setMaterialId(String p0){
       this.materialId = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MaterialBriefInfoItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialBriefInfoItem\(materialId="+this.materialId+", checksum="+this.checksum+"\)";
    }
}
