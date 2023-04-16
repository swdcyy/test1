package com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.BarTitleTextMap$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BarTitleTextMap implements Serializable	// class@000f7f
{
    public final String freeCardCanUseText;
    public final String grabItemUsingCardText;
    public final String grabNoneUsingCardText;
    public static final BarTitleTextMap$a Companion;
    public static final long serialVersionUID;

    static {
       BarTitleTextMap.Companion = new BarTitleTextMap$a(null);
    }
    public void BarTitleTextMap(String p0,String p1,String p2){
       super();
       this.freeCardCanUseText = p0;
       this.grabNoneUsingCardText = p1;
       this.grabItemUsingCardText = p2;
    }
    public static BarTitleTextMap copy$default(BarTitleTextMap p0,String p1,String p2,String p3,int p4,Object p5){
       BarTitleTextMap freeCardCanU;
       BarTitleTextMap grabNoneUsin;
       BarTitleTextMap grabItemUsin;
       if (p4 & 0x01) {
          freeCardCanU = p0.freeCardCanUseText;
       }
       if (p4 & 0x02) {
          grabNoneUsin = p0.grabNoneUsingCardText;
       }
       if (p4 & 0x04) {
          grabItemUsin = p0.grabItemUsingCardText;
       }
       return p0.copy(freeCardCanU, grabNoneUsin, grabItemUsin);
    }
    public final String component1(){
       return this.freeCardCanUseText;
    }
    public final String component2(){
       return this.grabNoneUsingCardText;
    }
    public final String component3(){
       return this.grabItemUsingCardText;
    }
    public final BarTitleTextMap copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BarTitleTextMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BarTitleTextMap(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BarTitleTextMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BarTitleTextMap && (a.g(this.freeCardCanUseText, p0.freeCardCanUseText) && (a.g(this.grabNoneUsingCardText, p0.grabNoneUsingCardText) && a.g(this.grabItemUsingCardText, p0.grabItemUsingCardText))))) {
          return true;
       }
       return false;
    }
    public final String getFreeCardCanUseText(){
       return this.freeCardCanUseText;
    }
    public final String getGrabItemUsingCardText(){
       return this.grabItemUsingCardText;
    }
    public final String getGrabNoneUsingCardText(){
       return this.grabNoneUsingCardText;
    }
    public int hashCode(){
       BarTitleTextMap obj = PatchProxy.apply(null, this, BarTitleTextMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.freeCardCanUseText;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BarTitleTextMap tgrabNoneUsi = this.grabNoneUsingCardText;
       int i2 = (tgrabNoneUsi != null)? tgrabNoneUsi.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tgrabNoneUsi = this.grabItemUsingCardText;
       if (tgrabNoneUsi != null) {
          i = tgrabNoneUsi.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BarTitleTextMap.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BarTitleTextMap\(freeCardCanUseText="+this.freeCardCanUseText+", grabNoneUsingCardText="+this.grabNoneUsingCardText+", grabItemUsingCardText="+this.grabItemUsingCardText+"\)";
    }
}
