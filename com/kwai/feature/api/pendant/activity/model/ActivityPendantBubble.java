package com.kwai.feature.api.pendant.activity.model.ActivityPendantBubble;
import java.io.Serializable;
import com.kwai.feature.api.pendant.activity.model.ActivityPendantBubble$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ActivityPendantBubble implements Serializable	// class@001027
{
    public final String bubbleId;
    public final String jumpUrl;
    public final long showTimeSeconds;
    public final String text;
    public static final ActivityPendantBubble$a Companion;
    public static final long serialVersionUID;

    static {
       ActivityPendantBubble.Companion = new ActivityPendantBubble$a(null);
    }
    public void ActivityPendantBubble(){
       super(null, null, null, 0, 15, null);
    }
    public void ActivityPendantBubble(String p0){
       super(p0, null, null, 0, 14, null);
    }
    public void ActivityPendantBubble(String p0,String p1){
       super(p0, p1, null, 0, 12, null);
    }
    public void ActivityPendantBubble(String p0,String p1,String p2){
       super(p0, p1, p2, 0, 8, null);
    }
    public void ActivityPendantBubble(String p0,String p1,String p2,long p3){
       a.p(p0, "bubbleId");
       a.p(p1, "jumpUrl");
       a.p(p2, "text");
       super();
       this.bubbleId = p0;
       this.jumpUrl = p1;
       this.text = p2;
       this.showTimeSeconds = p3;
    }
    public void ActivityPendantBubble(String p0,String p1,String p2,long p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "-1";
       }
       String str = "";
       String str1 = (p4 & 0x02)? str: p1;
       if (!(p4 & 0x04)) {
          str = p2;
       }
       if (p4 & 0x08) {
          p3 = 5;
       }
       super(p0, str1, str, p3);
       return;
    }
    public static ActivityPendantBubble copy$default(ActivityPendantBubble p0,String p1,String p2,String p3,long p4,int p5,Object p6){
       ActivityPendantBubble bubbleId;
       ActivityPendantBubble jumpUrl;
       ActivityPendantBubble text;
       ActivityPendantBubble showTimeSeco;
       if (p5 & 0x01) {
          bubbleId = p0.bubbleId;
       }
       if (p5 & 0x02) {
          jumpUrl = p0.jumpUrl;
       }
       p6 = jumpUrl;
       if (p5 & 0x04) {
          text = p0.text;
       }
       ActivityPendantBubble uActivityPen = text;
       if (p5 & 0x08) {
          showTimeSeco = p0.showTimeSeconds;
       }
       return p0.copy(bubbleId, p6, uActivityPen, showTimeSeco);
    }
    public final String component1(){
       return this.bubbleId;
    }
    public final String component2(){
       return this.jumpUrl;
    }
    public final String component3(){
       return this.text;
    }
    public final long component4(){
       return this.showTimeSeconds;
    }
    public final ActivityPendantBubble copy(String p0,String p1,String p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(ActivityPendantBubble.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Long.valueOf(p3), this, ActivityPendantBubble.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "bubbleId");
       a.p(p1, "jumpUrl");
       a.p(p2, "text");
       ActivityPendantBubble uActivityPen = new ActivityPendantBubble(p0, p1, p2, p3);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ActivityPendantBubble.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ActivityPendantBubble && (a.g(this.bubbleId, p0.bubbleId) && (a.g(this.jumpUrl, p0.jumpUrl) && (a.g(this.text, p0.text) && !this.showTimeSeconds - p0.showTimeSeconds))))) {
          return true;
       }
       return false;
    }
    public final String getBubbleId(){
       return this.bubbleId;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final long getShowTimeSeconds(){
       return this.showTimeSeconds;
    }
    public final String getText(){
       return this.text;
    }
    public int hashCode(){
       ActivityPendantBubble obj = PatchProxy.apply(null, this, ActivityPendantBubble.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bubbleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       ActivityPendantBubble tjumpUrl = this.jumpUrl;
       int i2 = (tjumpUrl != null)? tjumpUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tjumpUrl = this.text;
       if (tjumpUrl != null) {
          i = tjumpUrl.hashCode();
       }
       ActivityPendantBubble tshowTimeSec = this.showTimeSeconds;
       return (((i1 + i) * 31) + (int)(tshowTimeSec ^ (tshowTimeSec >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ActivityPendantBubble.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ActivityPendantBubble\(bubbleId="+this.bubbleId+", jumpUrl="+this.jumpUrl+", text="+this.text+", showTimeSeconds="+this.showTimeSeconds+"\)";
    }
}
