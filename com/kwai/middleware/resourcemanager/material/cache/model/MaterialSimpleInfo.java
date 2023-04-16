package com.kwai.middleware.resourcemanager.material.cache.model.MaterialSimpleInfo;
import java.io.Serializable;
import com.kwai.middleware.resourcemanager.cache.adt.SimpleInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialSimpleInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class MaterialSimpleInfo implements Serializable, SimpleInfo	// class@000f56
{
    public String checksum;
    public String materialId;
    public static final MaterialSimpleInfo$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialSimpleInfo.Companion = new MaterialSimpleInfo$a(null);
    }
    public void MaterialSimpleInfo(){
       super(null, null, 3, null);
    }
    public void MaterialSimpleInfo(String p0,String p1){
       super();
       this.materialId = p0;
       this.checksum = p1;
    }
    public void MaterialSimpleInfo(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static MaterialSimpleInfo copy$default(MaterialSimpleInfo p0,String p1,String p2,int p3,Object p4){
       MaterialSimpleInfo materialId;
       MaterialSimpleInfo checksum;
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
    public final MaterialSimpleInfo copy(String p0,String p1){
       return new MaterialSimpleInfo(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof MaterialSimpleInfo && (a.g(this.materialId, p0.materialId) && a.g(this.checksum, p0.checksum)))) {
          return true;
       }
       return false;
    }
    public final String getChecksum(){
       return this.checksum;
    }
    public String getId(){
       MaterialSimpleInfo tmaterialId = this.materialId;
       a.m(tmaterialId);
       return tmaterialId;
    }
    public final String getMaterialId(){
       return this.materialId;
    }
    public String getUniqueIdentifier(){
       return this.materialId+'+'+this.checksum;
    }
    public int hashCode(){
       MaterialSimpleInfo tmaterialId = this.materialId;
       int i = 0;
       int i1 = (tmaterialId != null)? tmaterialId.hashCode(): 0;
       i1 = i1 * 31;
       MaterialSimpleInfo tchecksum = this.checksum;
       if (tchecksum != null) {
          i = tchecksum.hashCode();
       }
       return (i1 + i);
    }
    public final void setChecksum(String p0){
       this.checksum = p0;
    }
    public void setId(String p0){
       a.p(p0, "id");
       this.materialId = p0;
    }
    public final void setMaterialId(String p0){
       this.materialId = p0;
    }
    public String toString(){
       return "MaterialSimpleInfo\(materialId="+this.materialId+", checksum="+this.checksum+"\)";
    }
}
