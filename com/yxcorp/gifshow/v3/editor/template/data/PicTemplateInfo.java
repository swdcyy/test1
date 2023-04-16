package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import java.io.Serializable;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo$a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;

public final class PicTemplateInfo implements Serializable, Parcelable	// class@00133a
{
    public final List icon;
    public final String id;
    public final String md5;
    public final String name;
    public final List resource;
    public int resourceType;
    public static final Parcelable$Creator CREATOR;

    static {
       PicTemplateInfo.CREATOR = new PicTemplateInfo$a();
    }
    public void PicTemplateInfo(){
       super("", "", CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), null, 0, 48, null);
    }
    public void PicTemplateInfo(String p0,String p1,List p2,List p3,String p4,int p5){
       a.p(p0, "name");
       a.p(p1, "id");
       a.p(p3, "resource");
       super();
       this.name = p0;
       this.id = p1;
       this.icon = p2;
       this.resource = p3;
       this.md5 = p4;
       this.resourceType = p5;
    }
    public void PicTemplateInfo(String p0,String p1,List p2,List p3,String p4,int p5,int p6,u p7){
       if (p6 & 0x10) {
          p4 = null;
       }
       String str = p4;
       int i = (p6 & 0x20)? -1: p5;
       super(p0, p1, p2, p3, str, i);
       return;
    }
    public static PicTemplateInfo copy$default(PicTemplateInfo p0,String p1,String p2,List p3,List p4,String p5,int p6,int p7,Object p8){
       PicTemplateInfo name;
       PicTemplateInfo id;
       PicTemplateInfo icon;
       PicTemplateInfo resource;
       PicTemplateInfo md5;
       PicTemplateInfo resourceType;
       if (p7 & 0x01) {
          name = p0.name;
       }
       if (p7 & 0x02) {
          id = p0.id;
       }
       p8 = id;
       if (p7 & 0x04) {
          icon = p0.icon;
       }
       PicTemplateInfo picTemplateI = icon;
       if (p7 & 0x08) {
          resource = p0.resource;
       }
       PicTemplateInfo picTemplateI1 = resource;
       if (p7 & 0x10) {
          md5 = p0.md5;
       }
       PicTemplateInfo picTemplateI2 = md5;
       if (p7 & 0x20) {
          resourceType = p0.resourceType;
       }
       return p0.copy(name, p8, picTemplateI, picTemplateI1, picTemplateI2, resourceType);
    }
    public final String component1(){
       return this.name;
    }
    public final String component2(){
       return this.id;
    }
    public final List component3(){
       return this.icon;
    }
    public final List component4(){
       return this.resource;
    }
    public final String component5(){
       return this.md5;
    }
    public final int component6(){
       return this.resourceType;
    }
    public final PicTemplateInfo copy(String p0,String p1,List p2,List p3,String p4,int p5){
       Object obj;
       if (PatchProxy.isSupport(PicTemplateInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, PicTemplateInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "name");
       a.p(p1, "id");
       a.p(p3, "resource");
       PicTemplateInfo picTemplateI = new PicTemplateInfo(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PicTemplateInfo && (a.g(this.name, p0.name) && (a.g(this.id, p0.id) && (a.g(this.icon, p0.icon) && (a.g(this.resource, p0.resource) && (a.g(this.md5, p0.md5) && this.resourceType == p0.resourceType))))))) {
          return true;
       }
       return false;
    }
    public final List getIcon(){
       return this.icon;
    }
    public final String getId(){
       return this.id;
    }
    public final String getMd5(){
       return this.md5;
    }
    public final String getName(){
       return this.name;
    }
    public final List getResource(){
       return this.resource;
    }
    public final int getResourceType(){
       return this.resourceType;
    }
    public int hashCode(){
       PicTemplateInfo obj = PatchProxy.apply(null, this, PicTemplateInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PicTemplateInfo tid = this.id;
       int i2 = (tid != null)? tid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tid = this.icon;
       i2 = (tid != null)? tid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tid = this.resource;
       i2 = (tid != null)? tid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tid = this.md5;
       if (tid != null) {
          i = tid.hashCode();
       }
       return (((i1 + i) * 31) + this.resourceType);
    }
    public final void setResourceType(int p0){
       this.resourceType = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PicTemplateInfo\(name="+this.name+", id="+this.id+", icon="+this.icon+", resource="+this.resource+", md5="+this.md5+", resourceType="+this.resourceType+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       Iterator iterator;
       if (PatchProxy.isSupport(PicTemplateInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PicTemplateInfo.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.name);
       p0.writeString(this.id);
       PicTemplateInfo ticon = this.icon;
       if (ticon != null) {
          p0.writeInt(1);
          p0.writeInt(ticon.size());
          iterator = ticon.iterator();
          while (iterator.hasNext()) {
             p0.writeSerializable(iterator.next());
          }
       }else {
          p0.writeInt(0);
       }
       ticon = this.resource;
       p0.writeInt(ticon.size());
       iterator = ticon.iterator();
       while (iterator.hasNext()) {
          p0.writeSerializable(iterator.next());
       }
       p0.writeString(this.md5);
       p0.writeInt(this.resourceType);
       return;
    }
}
