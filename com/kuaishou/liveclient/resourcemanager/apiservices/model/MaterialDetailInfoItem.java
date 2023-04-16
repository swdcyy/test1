package com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailExtraInfo;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MaterialDetailInfoItem implements Serializable	// class@00105f
{
    public String checksum;
    public MaterialDetailExtraInfo extParams;
    public String groupName;
    public List iconUrls;
    public String materialId;
    public String materialName;
    public String md5;
    public List resourceUrls;
    public int version;

    public void MaterialDetailInfoItem(){
       super(null, null, null, 0, null, null, null, null, 255, null);
    }
    public void MaterialDetailInfoItem(String p0,String p1,String p2,int p3,String p4,List p5,List p6,MaterialDetailExtraInfo p7){
       super();
       this.materialId = p0;
       this.checksum = p1;
       this.materialName = p2;
       this.version = p3;
       this.md5 = p4;
       this.iconUrls = p5;
       this.resourceUrls = p6;
       this.extParams = p7;
    }
    public void MaterialDetailInfoItem(String p0,String p1,String p2,int p3,String p4,List p5,List p6,MaterialDetailExtraInfo p7,int p8,u p9){
       int i = p8;
       int i1 = 0;
       int i2 = (i & 0x01)? i1: p0;
       int i3 = (i & 0x02)? i1: p1;
       int i4 = (i & 0x04)? i1: p2;
       int i5 = (i & 0x08)? 0: p3;
       int i6 = (i & 0x10)? i1: p4;
       int i7 = (i & 0x20)? i1: p5;
       int i8 = (i & 0x40)? i1: p6;
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       super(i2, i3, i4, i5, i6, i7, i8, i1);
       return;
    }
    public static MaterialDetailInfoItem copy$default(MaterialDetailInfoItem p0,String p1,String p2,String p3,int p4,String p5,List p6,List p7,MaterialDetailExtraInfo p8,int p9,Object p10){
       MaterialDetailInfoItem materialDeta = p0;
       int i = p9;
       MaterialDetailInfoItem materialId = (i & 0x01)? materialDeta.materialId: p1;
       MaterialDetailInfoItem checksum = (i & 0x02)? materialDeta.checksum: p2;
       MaterialDetailInfoItem materialName = (i & 0x04)? materialDeta.materialName: p3;
       MaterialDetailInfoItem version = (i & 0x08)? materialDeta.version: p4;
       MaterialDetailInfoItem md5 = (i & 0x10)? materialDeta.md5: p5;
       MaterialDetailInfoItem iconUrls = (i & 0x20)? materialDeta.iconUrls: p6;
       MaterialDetailInfoItem resourceUrls = (i & 0x40)? materialDeta.resourceUrls: p7;
       MaterialDetailInfoItem extParams = (i & 0x0080)? materialDeta.extParams: p8;
       return p0.copy(materialId, checksum, materialName, version, md5, iconUrls, resourceUrls, extParams);
    }
    public final String component1(){
       return this.materialId;
    }
    public final String component2(){
       return this.checksum;
    }
    public final String component3(){
       return this.materialName;
    }
    public final int component4(){
       return this.version;
    }
    public final String component5(){
       return this.md5;
    }
    public final List component6(){
       return this.iconUrls;
    }
    public final List component7(){
       return this.resourceUrls;
    }
    public final MaterialDetailExtraInfo component8(){
       return this.extParams;
    }
    public final MaterialDetailInfoItem copy(String p0,String p1,String p2,int p3,String p4,List p5,List p6,MaterialDetailExtraInfo p7){
       Object obj;
       if (PatchProxy.isSupport(MaterialDetailInfoItem.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, this, MaterialDetailInfoItem.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       MaterialDetailInfoItem materialDeta = new MaterialDetailInfoItem(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MaterialDetailInfoItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MaterialDetailInfoItem && (a.g(this.materialId, p0.materialId) && (a.g(this.checksum, p0.checksum) && (a.g(this.materialName, p0.materialName) && (this.version == p0.version && (a.g(this.md5, p0.md5) && (a.g(this.iconUrls, p0.iconUrls) && (a.g(this.resourceUrls, p0.resourceUrls) && a.g(this.extParams, p0.extParams)))))))))) {
          return true;
       }
       return false;
    }
    public final String getChecksum(){
       return this.checksum;
    }
    public final MaterialDetailExtraInfo getExtParams(){
       return this.extParams;
    }
    public final String getGroupName(){
       return this.groupName;
    }
    public final List getIconUrls(){
       return this.iconUrls;
    }
    public final String getMaterialId(){
       return this.materialId;
    }
    public final String getMaterialName(){
       return this.materialName;
    }
    public final String getMd5(){
       return this.md5;
    }
    public final List getResourceUrls(){
       return this.resourceUrls;
    }
    public final int getVersion(){
       return this.version;
    }
    public int hashCode(){
       MaterialDetailInfoItem obj = PatchProxy.apply(null, this, MaterialDetailInfoItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.materialId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MaterialDetailInfoItem tchecksum = this.checksum;
       int i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchecksum = this.materialName;
       i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.version) * 31;
       tchecksum = this.md5;
       i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchecksum = this.iconUrls;
       i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchecksum = this.resourceUrls;
       i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchecksum = this.extParams;
       if (tchecksum != null) {
          i = tchecksum.hashCode();
       }
       return (i1 + i);
    }
    public final void setChecksum(String p0){
       this.checksum = p0;
    }
    public final void setExtParams(MaterialDetailExtraInfo p0){
       this.extParams = p0;
    }
    public final void setGroupName(String p0){
       this.groupName = p0;
    }
    public final void setIconUrls(List p0){
       this.iconUrls = p0;
    }
    public final void setMaterialId(String p0){
       this.materialId = p0;
    }
    public final void setMaterialName(String p0){
       this.materialName = p0;
    }
    public final void setMd5(String p0){
       this.md5 = p0;
    }
    public final void setResourceUrls(List p0){
       this.resourceUrls = p0;
    }
    public final void setVersion(int p0){
       this.version = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MaterialDetailInfoItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialDetailInfoItem\(materialId="+this.materialId+", checksum="+this.checksum+", materialName="+this.materialName+", version="+this.version+", md5="+this.md5+", iconUrls="+this.iconUrls+", resourceUrls="+this.resourceUrls+", extParams="+this.extParams+"\)";
    }
}
