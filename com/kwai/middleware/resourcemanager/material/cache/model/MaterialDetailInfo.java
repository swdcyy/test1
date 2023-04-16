package com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import pb7.a;
import com.kwai.middleware.resourcemanager.cache.adt.DetailInfo;
import java.io.Serializable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.lang.StringBuilder;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import java.util.Objects;
import qrd.p;
import com.google.gson.Gson;

public final class MaterialDetailInfo implements a, DetailInfo, Serializable	// class@000f50
{
    public String checksum;
    public Class extClass;
    public Object extObj;
    public String extParams;
    public String groupId;
    public List iconUrls;
    public String materialId;
    public String materialName;
    public String md5;
    public List resourceUrls;
    public int version;
    public static final MaterialDetailInfo$a Companion;
    public static final long serialVersionUID;

    static {
       MaterialDetailInfo.Companion = new MaterialDetailInfo$a(null);
    }
    public void MaterialDetailInfo(){
       super(null, null, null, 0, null, null, null, null, 255, null);
    }
    public void MaterialDetailInfo(String p0,String p1,String p2,int p3,String p4,List p5,List p6,String p7){
       super();
       this.materialId = p0;
       this.checksum = p1;
       this.materialName = p2;
       this.version = p3;
       this.md5 = p4;
       this.iconUrls = p5;
       this.resourceUrls = p6;
       this.extParams = p7;
       this.groupId = "default";
    }
    public void MaterialDetailInfo(String p0,String p1,String p2,int p3,String p4,List p5,List p6,String p7,int p8,u p9){
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
    public static MaterialDetailInfo copy$default(MaterialDetailInfo p0,String p1,String p2,String p3,int p4,String p5,List p6,List p7,String p8,int p9,Object p10){
       MaterialDetailInfo materialDeta = p0;
       int i = p9;
       MaterialDetailInfo materialId = (i & 0x01)? materialDeta.materialId: p1;
       MaterialDetailInfo checksum = (i & 0x02)? materialDeta.checksum: p2;
       MaterialDetailInfo materialName = (i & 0x04)? materialDeta.materialName: p3;
       MaterialDetailInfo version = (i & 0x08)? materialDeta.version: p4;
       String md5 = (i & 0x10)? p0.getMd5(): p5;
       MaterialDetailInfo iconUrls = (i & 0x20)? materialDeta.iconUrls: p6;
       List resourceUrls = (i & 0x40)? p0.getResourceUrls(): p7;
       MaterialDetailInfo extParams = (i & 0x0080)? materialDeta.extParams: p8;
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
       return this.getMd5();
    }
    public final List component6(){
       return this.iconUrls;
    }
    public final List component7(){
       return this.getResourceUrls();
    }
    public final String component8(){
       return this.extParams;
    }
    public final MaterialDetailInfo copy(String p0,String p1,String p2,int p3,String p4,List p5,List p6,String p7){
       MaterialDetailInfo materialDeta = new MaterialDetailInfo(p0, p1, p2, p3, p4, p5, p6, p7);
       return v9;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof MaterialDetailInfo && (a.g(this.materialId, p0.materialId) && (a.g(this.checksum, p0.checksum) && (a.g(this.materialName, p0.materialName) && (this.version == p0.version && (a.g(this.getMd5(), p0.getMd5()) && (a.g(this.iconUrls, p0.iconUrls) && (a.g(this.getResourceUrls(), p0.getResourceUrls()) && a.g(this.extParams, p0.extParams)))))))))) {
          return true;
       }
       return false;
    }
    public final String getChecksum(){
       return this.checksum;
    }
    public final Object getExtObject(){
       MaterialDetailInfo textParams = this.extParams;
       MaterialDetailInfo materialDeta = null;
       if (textParams != null && this.extClass != null) {
          if (this.extObj == null) {
             a.m(textParams);
             MaterialDetailInfo textClass = this.extClass;
             a.m(textClass);
             this.parseExtObj(textParams, textClass);
          }
          textParams = this.extObj;
          if (textParams instanceof Object) {
             materialDeta = textParams;
          }
       }
    label_0021 :
       return materialDeta;
    }
    public final String getExtParams(){
       return this.extParams;
    }
    public String getGroupId(){
       return this.groupId;
    }
    public String getGroupName(){
       return null;
    }
    public final List getIconUrls(){
       return this.iconUrls;
    }
    public String getId(){
       MaterialDetailInfo tmaterialId = this.materialId;
       if (tmaterialId != null) {
       }else {
          tmaterialId = "";
       }
       return tmaterialId;
    }
    public final String getMaterialId(){
       return this.materialId;
    }
    public final String getMaterialName(){
       return this.materialName;
    }
    public String getMd5(){
       return this.md5;
    }
    public List getResourceUrls(){
       return this.resourceUrls;
    }
    public String getUniqueIdentifier(){
       return this.materialId+'+'+this.checksum;
    }
    public final int getVersion(){
       return this.version;
    }
    public int hashCode(){
       MaterialDetailInfo tmaterialId = this.materialId;
       int i = 0;
       int i1 = (tmaterialId != null)? tmaterialId.hashCode(): 0;
       i1 = i1 * 31;
       MaterialDetailInfo tchecksum = this.checksum;
       int i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchecksum = this.materialName;
       i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.version) * 31;
       String md5 = this.getMd5();
       i2 = (md5 != null)? md5.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchecksum = this.iconUrls;
       i2 = (tchecksum != null)? tchecksum.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       List resourceUrls = this.getResourceUrls();
       i2 = (resourceUrls != null)? resourceUrls.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tchecksum = this.extParams;
       if (tchecksum != null) {
          i = tchecksum.hashCode();
       }
       return (i1 + i);
    }
    public final void parseExtObj(String p0,Class p1){
       Objects.requireNonNull(ResourceSdk.f);
       this.extObj = ResourceSdk.e.getValue().h(p0, p1);
    }
    public final void setChecksum(String p0){
       this.checksum = p0;
    }
    public final void setExtClass(Class p0){
       a.p(p0, "extClass");
       this.extClass = p0;
       MaterialDetailInfo textParams = this.extParams;
       if (textParams != null) {
          this.parseExtObj(textParams, p0);
       }
       return;
    }
    public final void setExtParams(String p0){
       this.extParams = p0;
    }
    public void setGroupId(String p0){
       this.groupId = p0;
    }
    public void setGroupName(String p0){
    }
    public final void setIconUrls(List p0){
       this.iconUrls = p0;
    }
    public void setId(String p0){
       a.p(p0, "value");
       this.materialId = p0;
    }
    public final void setMaterialId(String p0){
       this.materialId = p0;
    }
    public final void setMaterialName(String p0){
       this.materialName = p0;
    }
    public void setMd5(String p0){
       this.md5 = p0;
    }
    public void setResourceUrls(List p0){
       this.resourceUrls = p0;
    }
    public final void setVersion(int p0){
       this.version = p0;
    }
    public String toString(){
       return "MaterialDetailInfo{mMaterialId=\'"+this.materialId+"\', mMaterialName=\'"+this.materialName+"\', mVersion="+this.version+", mIconUrls="+this.iconUrls+", mResourceUrls="+this.getResourceUrls()+", mChecksum=\'"+this.checksum+"\', mGroupId=\'"+this.getGroupId()+"\'}";
    }
}
