package com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.EffectInfo$a;
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

public final class EffectInfo implements Serializable	// class@000f81
{
    public final String bundleId;
    public final String format;
    public final String krnUrl;
    public final String mp4Url;
    public static final EffectInfo$a Companion;
    public static final long serialVersionUID;

    static {
       EffectInfo.Companion = new EffectInfo$a(null);
    }
    public void EffectInfo(String p0,String p1,String p2,String p3){
       super();
       this.krnUrl = p0;
       this.format = p1;
       this.bundleId = p2;
       this.mp4Url = p3;
    }
    public static EffectInfo copy$default(EffectInfo p0,String p1,String p2,String p3,String p4,int p5,Object p6){
       EffectInfo krnUrl;
       EffectInfo format;
       EffectInfo bundleId;
       EffectInfo mp4Url;
       if (p5 & 0x01) {
          krnUrl = p0.krnUrl;
       }
       if (p5 & 0x02) {
          format = p0.format;
       }
       if (p5 & 0x04) {
          bundleId = p0.bundleId;
       }
       if (p5 & 0x08) {
          mp4Url = p0.mp4Url;
       }
       return p0.copy(krnUrl, format, bundleId, mp4Url);
    }
    public final String component1(){
       return this.krnUrl;
    }
    public final String component2(){
       return this.format;
    }
    public final String component3(){
       return this.bundleId;
    }
    public final String component4(){
       return this.mp4Url;
    }
    public final EffectInfo copy(String p0,String p1,String p2,String p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, EffectInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new EffectInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof EffectInfo && (a.g(this.krnUrl, p0.krnUrl) && (a.g(this.format, p0.format) && (a.g(this.bundleId, p0.bundleId) && a.g(this.mp4Url, p0.mp4Url)))))) {
          return true;
       }
       return false;
    }
    public final String getBundleId(){
       return this.bundleId;
    }
    public final String getFormat(){
       return this.format;
    }
    public final String getKrnUrl(){
       return this.krnUrl;
    }
    public final String getMp4Url(){
       return this.mp4Url;
    }
    public int hashCode(){
       EffectInfo obj = PatchProxy.apply(null, this, EffectInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.krnUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       EffectInfo tformat = this.format;
       int i2 = (tformat != null)? tformat.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tformat = this.bundleId;
       i2 = (tformat != null)? tformat.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tformat = this.mp4Url;
       if (tformat != null) {
          i = tformat.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EffectInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EffectInfo\(krnUrl="+this.krnUrl+", format="+this.format+", bundleId="+this.bundleId+", mp4Url="+this.mp4Url+"\)";
    }
}
