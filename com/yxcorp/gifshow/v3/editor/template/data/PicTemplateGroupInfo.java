package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import java.io.Serializable;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo$b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;

public final class PicTemplateGroupInfo implements Serializable, Parcelable	// class@001338
{
    public final String id;
    public final String name;
    public final List picTemplateInfos;
    public static final Parcelable$Creator CREATOR;
    public static final PicTemplateGroupInfo$a Companion;
    public static final PicTemplateGroupInfo importGroupInfo;

    static {
       PicTemplateGroupInfo.Companion = new PicTemplateGroupInfo$a(null);
       PicTemplateGroupInfo picTemplateG = new PicTemplateGroupInfo("", "-1", null, 4, null);
       PicTemplateGroupInfo.importGroupInfo = v0;
       PicTemplateGroupInfo.CREATOR = new PicTemplateGroupInfo$b();
    }
    public void PicTemplateGroupInfo(){
       super("", "", null, 4, null);
    }
    public void PicTemplateGroupInfo(String p0,String p1,List p2){
       a.p(p0, "name");
       a.p(p1, "id");
       super();
       this.name = p0;
       this.id = p1;
       this.picTemplateInfos = p2;
    }
    public void PicTemplateGroupInfo(String p0,String p1,List p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = CollectionsKt__CollectionsKt.E();
       }
       super(p0, p1, p2);
       return;
    }
    public static PicTemplateGroupInfo copy$default(PicTemplateGroupInfo p0,String p1,String p2,List p3,int p4,Object p5){
       PicTemplateGroupInfo name;
       PicTemplateGroupInfo id;
       PicTemplateGroupInfo picTemplateI;
       if (p4 & 0x01) {
          name = p0.name;
       }
       if (p4 & 0x02) {
          id = p0.id;
       }
       if (p4 & 0x04) {
          picTemplateI = p0.picTemplateInfos;
       }
       return p0.copy(name, id, picTemplateI);
    }
    public final String component1(){
       return this.name;
    }
    public final String component2(){
       return this.id;
    }
    public final List component3(){
       return this.picTemplateInfos;
    }
    public final PicTemplateGroupInfo copy(String p0,String p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PicTemplateGroupInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       a.p(p1, "id");
       return new PicTemplateGroupInfo(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateGroupInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PicTemplateGroupInfo && (a.g(this.name, p0.name) && (a.g(this.id, p0.id) && a.g(this.picTemplateInfos, p0.picTemplateInfos))))) {
          return true;
       }
       return false;
    }
    public final String getId(){
       return this.id;
    }
    public final String getName(){
       return this.name;
    }
    public final List getPicTemplateInfos(){
       return this.picTemplateInfos;
    }
    public int hashCode(){
       PicTemplateGroupInfo obj = PatchProxy.apply(null, this, PicTemplateGroupInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PicTemplateGroupInfo tid = this.id;
       int i2 = (tid != null)? tid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tid = this.picTemplateInfos;
       if (tid != null) {
          i = tid.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PicTemplateGroupInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PicTemplateGroupInfo\(name="+this.name+", id="+this.id+", picTemplateInfos="+this.picTemplateInfos+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PicTemplateGroupInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PicTemplateGroupInfo.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.name);
       p0.writeString(this.id);
       PicTemplateGroupInfo tpicTemplate = this.picTemplateInfos;
       if (tpicTemplate != null) {
          p0.writeInt(1);
          p0.writeInt(tpicTemplate.size());
          Iterator iterator = tpicTemplate.iterator();
          while (iterator.hasNext()) {
             iterator.next().writeToParcel(p0, 0);
          }
       }else {
          p0.writeInt(0);
       }
       return;
    }
}
