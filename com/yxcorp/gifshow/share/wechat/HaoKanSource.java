package com.yxcorp.gifshow.share.wechat.HaoKanSource;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HaoKanSource	// class@001c96
{
    public final double aspectRatio;
    public final String description;
    public final String id;
    public final String mediaHeadUrl;
    public final String mediaName;
    public final String thumbUrl;
    public final String title;
    public final String url;
    public final long videoLength;

    public void HaoKanSource(String p0,String p1,String p2,String p3,String p4,long p5,String p6,String p7,double p8){
       a.p(p0, "id");
       a.p(p1, "title");
       a.p(p2, "url");
       a.p(p3, "thumbUrl");
       a.p(p4, "description");
       a.p(p6, "mediaName");
       a.p(p7, "mediaHeadUrl");
       super();
       this.id = p0;
       this.title = p1;
       this.url = p2;
       this.thumbUrl = p3;
       this.description = p4;
       this.videoLength = p5;
       this.mediaName = p6;
       this.mediaHeadUrl = p7;
       this.aspectRatio = p8;
    }
    public static HaoKanSource copy$default(HaoKanSource p0,String p1,String p2,String p3,String p4,String p5,long p6,String p7,String p8,double p9,int p10,Object p11){
       HaoKanSource haoKanSource = p0;
       int i = p10;
       HaoKanSource id = (i & 0x01)? haoKanSource.id: p1;
       HaoKanSource title = (i & 0x02)? haoKanSource.title: p2;
       HaoKanSource url = (i & 0x04)? haoKanSource.url: p3;
       HaoKanSource thumbUrl = (i & 0x08)? haoKanSource.thumbUrl: p4;
       HaoKanSource description = (i & 0x10)? haoKanSource.description: p5;
       HaoKanSource videoLength = (i & 0x20)? haoKanSource.videoLength: p6;
       HaoKanSource mediaName = (i & 0x40)? haoKanSource.mediaName: p7;
       HaoKanSource mediaHeadUrl = (i & 0x0080)? haoKanSource.mediaHeadUrl: p8;
       HaoKanSource aspectRatio = (i & 0x0100)? haoKanSource.aspectRatio: p9;
       return p0.copy(id, title, url, thumbUrl, description, videoLength, mediaName, mediaHeadUrl, aspectRatio);
    }
    public final String component1(){
       return this.id;
    }
    public final String component2(){
       return this.title;
    }
    public final String component3(){
       return this.url;
    }
    public final String component4(){
       return this.thumbUrl;
    }
    public final String component5(){
       return this.description;
    }
    public final long component6(){
       return this.videoLength;
    }
    public final String component7(){
       return this.mediaName;
    }
    public final String component8(){
       return this.mediaHeadUrl;
    }
    public final double component9(){
       return this.aspectRatio;
    }
    public final HaoKanSource copy(String p0,String p1,String p2,String p3,String p4,long p5,String p6,String p7,double p8){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p6;
       object oobject6 = p7;
       HaoKanSource haoKanSource = HaoKanSource.class;
       if (PatchProxy.isSupport(haoKanSource)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = Long.valueOf(p5);
          objArray[6] = oobject5;
          objArray[7] = oobject6;
          objArray[8] = Double.valueOf(p8);
          Object obj = PatchProxy.apply(objArray, this, haoKanSource, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "id");
       a.p(oobject1, "title");
       a.p(oobject2, "url");
       a.p(oobject3, "thumbUrl");
       a.p(oobject4, "description");
       a.p(oobject5, "mediaName");
       a.p(oobject6, "mediaHeadUrl");
       haoKanSource = new HaoKanSource(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v13;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HaoKanSource.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HaoKanSource && (a.g(this.id, p0.id) && (a.g(this.title, p0.title) && (a.g(this.url, p0.url) && (a.g(this.thumbUrl, p0.thumbUrl) && (a.g(this.description, p0.description) && (!this.videoLength - p0.videoLength && (a.g(this.mediaName, p0.mediaName) && (a.g(this.mediaHeadUrl, p0.mediaHeadUrl) && !Double.compare(this.aspectRatio, p0.aspectRatio))))))))))) {
          return true;
       }
       return false;
    }
    public final double getAspectRatio(){
       return this.aspectRatio;
    }
    public final String getDescription(){
       return this.description;
    }
    public final String getId(){
       return this.id;
    }
    public final String getMediaHeadUrl(){
       return this.mediaHeadUrl;
    }
    public final String getMediaName(){
       return this.mediaName;
    }
    public final String getThumbUrl(){
       return this.thumbUrl;
    }
    public final String getTitle(){
       return this.title;
    }
    public final String getUrl(){
       return this.url;
    }
    public final long getVideoLength(){
       return this.videoLength;
    }
    public int hashCode(){
       HaoKanSource obj = PatchProxy.apply(null, this, HaoKanSource.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       HaoKanSource ttitle = this.title;
       int i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.url;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.thumbUrl;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.description;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       ttitle = this.videoLength;
       i1 = (((i1 + i2) * 31) + (int)(ttitle ^ (ttitle >> 32))) * 31;
       ttitle = this.mediaName;
       i2 = (ttitle != null)? ttitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttitle = this.mediaHeadUrl;
       if (ttitle != null) {
          i = ttitle.hashCode();
       }
       long l = Double.doubleToLongBits(this.aspectRatio);
       return (((i1 + i) * 31) + (int)(l ^ (l >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HaoKanSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HaoKanSource\(id="+this.id+", title="+this.title+", url="+this.url+", thumbUrl="+this.thumbUrl+", description="+this.description+", videoLength="+this.videoLength+", mediaName="+this.mediaName+", mediaHeadUrl="+this.mediaHeadUrl+", aspectRatio="+this.aspectRatio+"\)";
    }
}
