package com.kwai.plugin.dva.feature.core.repository.config.JniLib;
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

public final class JniLib	// class@001329
{
    public final String md5;
    public final String name;
    public final int size;

    public void JniLib(String p0,String p1,int p2){
       a.p(p1, "name");
       super();
       this.md5 = p0;
       this.name = p1;
       this.size = p2;
    }
    public static JniLib copy$default(JniLib p0,String p1,String p2,int p3,int p4,Object p5){
       JniLib md5;
       JniLib name;
       JniLib size;
       if (p4 & 0x01) {
          md5 = p0.md5;
       }
       if (p4 & 0x02) {
          name = p0.name;
       }
       if (p4 & 0x04) {
          size = p0.size;
       }
       return p0.copy(md5, name, size);
    }
    public final String component1(){
       return this.md5;
    }
    public final String component2(){
       return this.name;
    }
    public final int component3(){
       return this.size;
    }
    public final JniLib copy(String p0,String p1,int p2){
       if (PatchProxy.isSupport(JniLib.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, JniLib.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "name");
       return new JniLib(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JniLib.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof JniLib) {
          return false;
       }
       if (!a.g(this.md5, p0.md5)) {
          return false;
       }
       if (!a.g(this.name, p0.name)) {
          return false;
       }
       if (this.size != p0.size) {
          return false;
       }
       return true;
    }
    public final String getMd5(){
       return this.md5;
    }
    public final String getName(){
       return this.name;
    }
    public final int getSize(){
       return this.size;
    }
    public int hashCode(){
       JniLib obj = PatchProxy.apply(null, this, JniLib.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.md5;
       int i = (obj == null)? 0: obj.hashCode();
       return ((((i * 31) + (this.name).hashCode()) * 31) + this.size);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JniLib.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JniLib\(md5="+this.md5+", name="+this.name+", size="+this.size+')';
    }
}
