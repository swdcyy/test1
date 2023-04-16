package com.kwai.plugin.dva.feature.core.repository.config.ApkData;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class ApkData	// class@001326
{
    public final String abi;
    public final String md5;
    public final int size;
    public final String url;

    public void ApkData(String p0,String p1,int p2,String p3){
       a.p(p0, "abi");
       a.p(p1, "md5");
       a.p(p3, "url");
       super();
       this.abi = p0;
       this.md5 = p1;
       this.size = p2;
       this.url = p3;
    }
    public static ApkData copy$default(ApkData p0,String p1,String p2,int p3,String p4,int p5,Object p6){
       ApkData abi;
       ApkData md5;
       ApkData size;
       ApkData url;
       if (p5 & 0x01) {
          abi = p0.abi;
       }
       if (p5 & 0x02) {
          md5 = p0.md5;
       }
       if (p5 & 0x04) {
          size = p0.size;
       }
       if (p5 & 0x08) {
          url = p0.url;
       }
       return p0.copy(abi, md5, size, url);
    }
    public final String component1(){
       return this.abi;
    }
    public final String component2(){
       return this.md5;
    }
    public final int component3(){
       return this.size;
    }
    public final String component4(){
       return this.url;
    }
    public final ApkData copy(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(ApkData.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, ApkData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "abi");
       a.p(p1, "md5");
       a.p(p3, "url");
       return new ApkData(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ApkData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ApkData) {
          return false;
       }
       if (!a.g(this.abi, p0.abi)) {
          return false;
       }
       if (!a.g(this.md5, p0.md5)) {
          return false;
       }
       if (this.size != p0.size) {
          return false;
       }
       if (!a.g(this.url, p0.url)) {
          return false;
       }
       return true;
    }
    public final String getAbi(){
       return this.abi;
    }
    public final String getMd5(){
       return this.md5;
    }
    public final int getSize(){
       return this.size;
    }
    public final String getUrl(){
       return this.url;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ApkData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((((((this.abi).hashCode() * 31) + (this.md5).hashCode()) * 31) + this.size) * 31) + (this.url).hashCode());
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ApkData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ApkData\(abi="+this.abi+", md5="+this.md5+", size="+this.size+", url="+this.url+')';
    }
}
