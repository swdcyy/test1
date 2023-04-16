package com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import iw9.a;
import bw6.a;
import android.os.Parcelable;
import java.lang.Cloneable;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate$a;
import java.lang.String;
import java.lang.Integer;
import java.util.List;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.lang.Number;
import android.os.Parcel;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.Serializable;

public final class KwaiTemplate implements a, a, Parcelable, Cloneable	// class@001301
{
    public final List coverUrls;
    public final String description;
    public final Long duration;
    public final Integer groupCount;
    public final Integer height;
    public final String id;
    public final Integer materialCount;
    public final String name;
    public final Long useCount;
    public final List videoUrls;
    public final Integer width;
    public static final Parcelable$Creator CREATOR;

    static {
       KwaiTemplate.CREATOR = new KwaiTemplate$a();
    }
    public void KwaiTemplate(String p0,String p1,Integer p2,String p3,List p4,List p5,Long p6,Long p7,Integer p8,Integer p9,Integer p10){
       super();
       this.id = p0;
       this.name = p1;
       this.materialCount = p2;
       this.description = p3;
       this.coverUrls = p4;
       this.videoUrls = p5;
       this.useCount = p6;
       this.duration = p7;
       this.width = p8;
       this.height = p9;
       this.groupCount = p10;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, KwaiTemplate.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public List coverUrls(){
       KwaiTemplate obj = PatchProxy.apply(null, this, KwaiTemplate.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.coverUrls;
       if (obj == null) {
          List list = CollectionsKt__CollectionsKt.E();
       }
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public final List getCoverUrls(){
       return this.coverUrls;
    }
    public final String getDescription(){
       return this.description;
    }
    public final Long getDuration(){
       return this.duration;
    }
    public String getGrootId(){
       String obj = PatchProxy.apply(null, this, KwaiTemplate.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiTemplate.class.getName();
       a.o(obj, "this.javaClass.name");
       return obj;
    }
    public final Integer getGroupCount(){
       return this.groupCount;
    }
    public final Integer getHeight(){
       return this.height;
    }
    public final String getId(){
       return this.id;
    }
    public final Integer getMaterialCount(){
       return this.materialCount;
    }
    public final String getName(){
       return this.name;
    }
    public final Long getUseCount(){
       return this.useCount;
    }
    public final List getVideoUrls(){
       return this.videoUrls;
    }
    public final Integer getWidth(){
       return this.width;
    }
    public boolean isSame(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiTemplate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "model");
       boolean b = (p0 instanceof KwaiTemplate && a.g(p0.id, this.id))? true: false;
       return b;
    }
    public int videoHeight(){
       KwaiTemplate obj = PatchProxy.apply(null, this, KwaiTemplate.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.height;
       int i = (obj != null)? obj.intValue(): 0;
       return i;
    }
    public String videoId(){
       KwaiTemplate tid = this.id;
       if (tid != null) {
       }else {
          tid = "";
       }
       return tid;
    }
    public List videoUrls(){
       KwaiTemplate obj = PatchProxy.apply(null, this, KwaiTemplate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.videoUrls;
       if (obj == null) {
          List list = CollectionsKt__CollectionsKt.E();
       }
       return obj;
    }
    public int videoWidth(){
       KwaiTemplate obj = PatchProxy.apply(null, this, KwaiTemplate.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.width;
       int i = (obj != null)? obj.intValue(): 0;
       return i;
    }
    public void writeToParcel(Parcel p0,int p1){
       Iterator iterator;
       if (PatchProxy.isSupport(KwaiTemplate.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KwaiTemplate.class, "8")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.id);
       p0.writeString(this.name);
       KwaiTemplate tmaterialCou = this.materialCount;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeInt(tmaterialCou.intValue());
       }else {
          p0.writeInt(0);
       }
       p0.writeString(this.description);
       tmaterialCou = this.coverUrls;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeInt(tmaterialCou.size());
          iterator = tmaterialCou.iterator();
          while (iterator.hasNext()) {
             p0.writeSerializable(iterator.next());
          }
       }else {
          p0.writeInt(0);
       }
       tmaterialCou = this.videoUrls;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeInt(tmaterialCou.size());
          iterator = tmaterialCou.iterator();
          while (iterator.hasNext()) {
             p0.writeSerializable(iterator.next());
          }
       }else {
          p0.writeInt(0);
       }
       tmaterialCou = this.useCount;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeLong(tmaterialCou.longValue());
       }else {
          p0.writeInt(0);
       }
       tmaterialCou = this.duration;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeLong(tmaterialCou.longValue());
       }else {
          p0.writeInt(0);
       }
       tmaterialCou = this.width;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeInt(tmaterialCou.intValue());
       }else {
          p0.writeInt(0);
       }
       tmaterialCou = this.height;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeInt(tmaterialCou.intValue());
       }else {
          p0.writeInt(0);
       }
       tmaterialCou = this.groupCount;
       if (tmaterialCou != null) {
          p0.writeInt(1);
          p0.writeInt(tmaterialCou.intValue());
       }else {
          p0.writeInt(0);
       }
       return;
    }
}
