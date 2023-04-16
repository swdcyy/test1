package com.yxcorp.gifshow.share.wechat.HaoKanExtInfo;
import com.yxcorp.gifshow.share.wechat.HaoKanSource;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import o56.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HaoKanExtInfo	// class@001c95
{
    public final String appVersion;
    public final HaoKanSource source;
    public final int type;

    public void HaoKanExtInfo(HaoKanSource p0,String p1,int p2){
       a.p(p0, "source");
       a.p(p1, "appVersion");
       super();
       this.source = p0;
       this.appVersion = p1;
       this.type = p2;
    }
    public void HaoKanExtInfo(HaoKanSource p0,String p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = String.valueOf(a.q);
       }
       if (p3 & 0x04) {
          p2 = 1;
       }
       super(p0, p1, p2);
       return;
    }
    public static HaoKanExtInfo copy$default(HaoKanExtInfo p0,HaoKanSource p1,String p2,int p3,int p4,Object p5){
       HaoKanExtInfo source;
       HaoKanExtInfo appVersion;
       HaoKanExtInfo type;
       if (p4 & 0x01) {
          source = p0.source;
       }
       if (p4 & 0x02) {
          appVersion = p0.appVersion;
       }
       if (p4 & 0x04) {
          type = p0.type;
       }
       return p0.copy(source, appVersion, type);
    }
    public final HaoKanSource component1(){
       return this.source;
    }
    public final String component2(){
       return this.appVersion;
    }
    public final int component3(){
       return this.type;
    }
    public final HaoKanExtInfo copy(HaoKanSource p0,String p1,int p2){
       if (PatchProxy.isSupport(HaoKanExtInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, HaoKanExtInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "source");
       a.p(p1, "appVersion");
       return new HaoKanExtInfo(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HaoKanExtInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HaoKanExtInfo && (a.g(this.source, p0.source) && (a.g(this.appVersion, p0.appVersion) && this.type == p0.type)))) {
          return true;
       }
       return false;
    }
    public final String getAppVersion(){
       return this.appVersion;
    }
    public final HaoKanSource getSource(){
       return this.source;
    }
    public final int getType(){
       return this.type;
    }
    public int hashCode(){
       HaoKanExtInfo obj = PatchProxy.apply(null, this, HaoKanExtInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.source;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       HaoKanExtInfo tappVersion = this.appVersion;
       if (tappVersion != null) {
          i = tappVersion.hashCode();
       }
       return (((i1 + i) * 31) + this.type);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HaoKanExtInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HaoKanExtInfo\(source="+this.source+", appVersion="+this.appVersion+", type="+this.type+"\)";
    }
}
