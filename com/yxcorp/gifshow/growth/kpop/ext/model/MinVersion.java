package com.yxcorp.gifshow.growth.kpop.ext.model.MinVersion;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kpop.ext.model.MinVersion$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MinVersion implements Serializable	// class@00140d
{
    public final String default;
    public final String kwaiAdr;
    public final String nebulaAdr;
    public static final MinVersion$a Companion;
    public static final long serialVersionUID;

    static {
       MinVersion.Companion = new MinVersion$a(null);
    }
    public void MinVersion(){
       super(null, null, null, 7, null);
    }
    public void MinVersion(String p0){
       super(p0, null, null, 6, null);
    }
    public void MinVersion(String p0,String p1){
       super(p0, p1, null, 4, null);
    }
    public void MinVersion(String p0,String p1,String p2){
       a.p(p0, "default");
       a.p(p1, "kwaiAdr");
       a.p(p2, "nebulaAdr");
       super();
       this.default = p0;
       this.kwaiAdr = p1;
       this.nebulaAdr = p2;
    }
    public void MinVersion(String p0,String p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "";
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       if (p3 & 0x04) {
          p2 = "";
       }
       super(p0, p1, p2);
       return;
    }
    public static MinVersion copy$default(MinVersion p0,String p1,String p2,String p3,int p4,Object p5){
       MinVersion default;
       MinVersion kwaiAdr;
       MinVersion nebulaAdr;
       if (p4 & 0x01) {
          default = p0.default;
       }
       if (p4 & 0x02) {
          kwaiAdr = p0.kwaiAdr;
       }
       if (p4 & 0x04) {
          nebulaAdr = p0.nebulaAdr;
       }
       return p0.copy(default, kwaiAdr, nebulaAdr);
    }
    public final String component1(){
       return this.default;
    }
    public final String component2(){
       return this.kwaiAdr;
    }
    public final String component3(){
       return this.nebulaAdr;
    }
    public final MinVersion copy(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MinVersion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "default");
       a.p(p1, "kwaiAdr");
       a.p(p2, "nebulaAdr");
       return new MinVersion(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MinVersion.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MinVersion && (a.g(this.default, p0.default) && (a.g(this.kwaiAdr, p0.kwaiAdr) && a.g(this.nebulaAdr, p0.nebulaAdr))))) {
          return true;
       }
       return false;
    }
    public final String getDefault(){
       return this.default;
    }
    public final String getKwaiAdr(){
       return this.kwaiAdr;
    }
    public final String getNebulaAdr(){
       return this.nebulaAdr;
    }
    public int hashCode(){
       MinVersion obj = PatchProxy.apply(null, this, MinVersion.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.default;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MinVersion tkwaiAdr = this.kwaiAdr;
       int i2 = (tkwaiAdr != null)? tkwaiAdr.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tkwaiAdr = this.nebulaAdr;
       if (tkwaiAdr != null) {
          i = tkwaiAdr.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MinVersion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MinVersion\(default="+this.default+", kwaiAdr="+this.kwaiAdr+", nebulaAdr="+this.nebulaAdr+"\)";
    }
}
