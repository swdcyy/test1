package com.yxcorp.gifshow.detail.school.SchoolSquareResponse$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SchoolSquareResponse$b	// class@001704
{
    public final String desc;
    public final boolean enable;
    public final int value;

    public void SchoolSquareResponse$b(){
       super("", 0, 0);
    }
    public void SchoolSquareResponse$b(String p0,int p1,boolean p2){
       a.p(p0, "desc");
       super();
       this.desc = p0;
       this.value = p1;
       this.enable = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SchoolSquareResponse$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SchoolSquareResponse$b && (a.g(this.desc, p0.desc) && (this.value == p0.value && this.enable == p0.enable)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SchoolSquareResponse$b obj = PatchProxy.apply(null, this, SchoolSquareResponse$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.desc;
       int i = (obj != null)? obj.hashCode(): 0;
       i = ((i * 31) + this.value) * 31;
       SchoolSquareResponse$b tenable = this.enable;
       if (tenable != null) {
          tenable = 1;
       }
       return (i + tenable);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SchoolSquareResponse$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FilterItem\(desc="+this.desc+", value="+this.value+", enable="+this.enable+"\)";
    }
}
