package com.kwai.wake.pojo.ControlData;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class ControlData	// class@001119
{
    public String pkg;
    public long requestIntervalInMs;
    public List toCollectPkgList;

    public void ControlData(){
       super();
       this.requestIntervalInMs = 0;
       this.toCollectPkgList = CollectionsKt__CollectionsKt.E();
       this.pkg = "";
    }
    public final String a(){
       return this.pkg;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof ControlData && (!this.requestIntervalInMs - p0.requestIntervalInMs && (a.g(this.toCollectPkgList, p0.toCollectPkgList) && a.g(this.pkg, p0.pkg))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       ControlData trequestInte = this.requestIntervalInMs;
       int i = (int)(trequestInte ^ (trequestInte >> 32)) * 31;
       trequestInte = this.toCollectPkgList;
       int i1 = 0;
       int i2 = (trequestInte != null)? trequestInte.hashCode(): 0;
       i = (i + i2) * 31;
       trequestInte = this.pkg;
       if (trequestInte != null) {
          i1 = trequestInte.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       return "ControlData\(requestIntervalInMs="+this.requestIntervalInMs+", toCollectPkgList="+this.toCollectPkgList+", pkg="+this.pkg+"\)";
    }
}
