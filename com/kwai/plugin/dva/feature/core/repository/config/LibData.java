package com.kwai.plugin.dva.feature.core.repository.config.LibData;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LibData	// class@00132a
{
    public final String abi;
    public final List jniLibs;

    public void LibData(String p0,List p1){
       a.p(p0, "abi");
       super();
       this.abi = p0;
       this.jniLibs = p1;
    }
    public static LibData copy$default(LibData p0,String p1,List p2,int p3,Object p4){
       LibData abi;
       LibData jniLibs;
       if (p3 & 0x01) {
          abi = p0.abi;
       }
       if (p3 & 0x02) {
          jniLibs = p0.jniLibs;
       }
       return p0.copy(abi, jniLibs);
    }
    public final String component1(){
       return this.abi;
    }
    public final List component2(){
       return this.jniLibs;
    }
    public final LibData copy(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LibData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "abi");
       return new LibData(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LibData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LibData) {
          return false;
       }
       if (!a.g(this.abi, p0.abi)) {
          return false;
       }
       if (!a.g(this.jniLibs, p0.jniLibs)) {
          return false;
       }
       return true;
    }
    public final String getAbi(){
       return this.abi;
    }
    public final List getJniLibs(){
       return this.jniLibs;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LibData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.abi).hashCode() * 31;
       LibData tjniLibs = this.jniLibs;
       int i1 = (tjniLibs == null)? 0: tjniLibs.hashCode();
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LibData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LibData\(abi="+this.abi+", jniLibs="+this.jniLibs+')';
    }
}
