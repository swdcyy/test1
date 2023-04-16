package com.kuaishou.android.post.topic.model.TopicItem;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.model.topic.TopicItemType;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.topic.TopicIcon;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TopicItem implements Serializable	// class@000ec9
{
    public final int id;
    public final String keyWorld;
    public TopicIcon leftIcon;
    public int mClassId;
    public final String mKsOrderId;
    public final String specialId;
    public TopicIcon topicIcon;
    public final int topicType;
    public final TopicItemType type;
    public long viewCount;

    public void TopicItem(String p0,int p1,TopicItemType p2,String p3,String p4,int p5){
       a.p(p0, "keyWorld");
       a.p(p2, "type");
       super();
       this.keyWorld = p0;
       this.id = p1;
       this.type = p2;
       this.mKsOrderId = p3;
       this.specialId = p4;
       this.topicType = p5;
    }
    public static TopicItem copy$default(TopicItem p0,String p1,int p2,TopicItemType p3,String p4,String p5,int p6,int p7,Object p8){
       TopicItem keyWorld;
       TopicItem id;
       TopicItem type;
       TopicItem mKsOrderId;
       TopicItem specialId;
       TopicItem topicType;
       if (p7 & 0x01) {
          keyWorld = p0.keyWorld;
       }
       if (p7 & 0x02) {
          id = p0.id;
       }
       p8 = id;
       if (p7 & 0x04) {
          type = p0.type;
       }
       TopicItem topicItem = type;
       if (p7 & 0x08) {
          mKsOrderId = p0.mKsOrderId;
       }
       TopicItem topicItem1 = mKsOrderId;
       if (p7 & 0x10) {
          specialId = p0.specialId;
       }
       TopicItem topicItem2 = specialId;
       if (p7 & 0x20) {
          topicType = p0.topicType;
       }
       return p0.copy(keyWorld, p8, topicItem, topicItem1, topicItem2, topicType);
    }
    public final String component1(){
       return this.keyWorld;
    }
    public final int component2(){
       return this.id;
    }
    public final TopicItemType component3(){
       return this.type;
    }
    public final String component4(){
       return this.mKsOrderId;
    }
    public final String component5(){
       return this.specialId;
    }
    public final int component6(){
       return this.topicType;
    }
    public final TopicItem copy(String p0,int p1,TopicItemType p2,String p3,String p4,int p5){
       Object obj;
       if (PatchProxy.isSupport(TopicItem.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, TopicItem.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "keyWorld");
       a.p(p2, "type");
       TopicItem topicItem = new TopicItem(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TopicItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TopicItem && (a.g(this.keyWorld, p0.keyWorld) && (this.id == p0.id && (a.g(this.type, p0.type) && (a.g(this.mKsOrderId, p0.mKsOrderId) && (a.g(this.specialId, p0.specialId) && this.topicType == p0.topicType))))))) {
          return true;
       }
       return false;
    }
    public final int getId(){
       return this.id;
    }
    public final String getKeyWorld(){
       return this.keyWorld;
    }
    public final TopicIcon getLeftIcon(){
       return this.leftIcon;
    }
    public final int getMClassId(){
       return this.mClassId;
    }
    public final String getMKsOrderId(){
       return this.mKsOrderId;
    }
    public final String getSpecialId(){
       return this.specialId;
    }
    public final TopicIcon getTopicIcon(){
       return this.topicIcon;
    }
    public final int getTopicType(){
       return this.topicType;
    }
    public final TopicItemType getType(){
       return this.type;
    }
    public final long getViewCount(){
       return this.viewCount;
    }
    public int hashCode(){
       TopicItem obj = PatchProxy.apply(null, this, TopicItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.keyWorld;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.id) * 31;
       TopicItem ttype = this.type;
       int i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.mKsOrderId;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.specialId;
       if (ttype != null) {
          i = ttype.hashCode();
       }
       return (((i1 + i) * 31) + this.topicType);
    }
    public final void setLeftIcon(TopicIcon p0){
       this.leftIcon = p0;
    }
    public final void setMClassId(int p0){
       this.mClassId = p0;
    }
    public final void setTopicIcon(TopicIcon p0){
       this.topicIcon = p0;
    }
    public final void setViewCount(long p0){
       this.viewCount = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TopicItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TopicItem\(keyWorld="+this.keyWorld+", id="+this.id+", type="+this.type+", mKsOrderId="+this.mKsOrderId+", specialId="+this.specialId+", topicType="+this.topicType+"\)";
    }
}
