package com.kwai.slide.play.detail.model.FeedbackDetailItem;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeedbackDetailItem implements Serializable	// class@00182a
{
    public final String darkIconUrl;
    public final String iconUrl;
    public final String reason;
    public final String text;

    public void FeedbackDetailItem(String p0,String p1,String p2,String p3){
       a.p(p0, "reason");
       a.p(p1, "text");
       a.p(p2, "darkIconUrl");
       a.p(p3, "iconUrl");
       super();
       this.reason = p0;
       this.text = p1;
       this.darkIconUrl = p2;
       this.iconUrl = p3;
    }
    public static FeedbackDetailItem copy$default(FeedbackDetailItem p0,String p1,String p2,String p3,String p4,int p5,Object p6){
       FeedbackDetailItem reason;
       FeedbackDetailItem text;
       FeedbackDetailItem darkIconUrl;
       FeedbackDetailItem iconUrl;
       if (p5 & 0x01) {
          reason = p0.reason;
       }
       if (p5 & 0x02) {
          text = p0.text;
       }
       if (p5 & 0x04) {
          darkIconUrl = p0.darkIconUrl;
       }
       if (p5 & 0x08) {
          iconUrl = p0.iconUrl;
       }
       return p0.copy(reason, text, darkIconUrl, iconUrl);
    }
    public final String component1(){
       return this.reason;
    }
    public final String component2(){
       return this.text;
    }
    public final String component3(){
       return this.darkIconUrl;
    }
    public final String component4(){
       return this.iconUrl;
    }
    public final FeedbackDetailItem copy(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, FeedbackDetailItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "reason");
       a.p(p1, "text");
       a.p(p2, "darkIconUrl");
       a.p(p3, "iconUrl");
       return new FeedbackDetailItem(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeedbackDetailItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FeedbackDetailItem && (a.g(this.reason, p0.reason) && (a.g(this.text, p0.text) && (a.g(this.darkIconUrl, p0.darkIconUrl) && a.g(this.iconUrl, p0.iconUrl)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       FeedbackDetailItem obj = PatchProxy.apply(null, this, FeedbackDetailItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.reason;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       FeedbackDetailItem ttext = this.text;
       int i2 = (ttext != null)? ttext.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttext = this.darkIconUrl;
       i2 = (ttext != null)? ttext.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttext = this.iconUrl;
       if (ttext != null) {
          i = ttext.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeedbackDetailItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeedbackDetailItem\(reason="+this.reason+", text="+this.text+", darkIconUrl="+this.darkIconUrl+", iconUrl="+this.iconUrl+"\)";
    }
}
