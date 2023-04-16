package com.yxcorp.gifshow.photoad.PhotoAdClientLogReport$a;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PhotoAdClientLogReport$a	// class@000f64
{
    public final List clickTypes;
    public final List showTypes;

    public void PhotoAdClientLogReport$a(){
       super(null, null, 3, null);
    }
    public void PhotoAdClientLogReport$a(List p0,List p1,int p2,u p3){
       super();
       this.showTypes = null;
       this.clickTypes = null;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoAdClientLogReport$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PhotoAdClientLogReport$a && (a.g(this.showTypes, p0.showTypes) && a.g(this.clickTypes, p0.clickTypes)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PhotoAdClientLogReport$a obj = PatchProxy.apply(null, this, PhotoAdClientLogReport$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.showTypes;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PhotoAdClientLogReport$a tclickTypes = this.clickTypes;
       if (tclickTypes != null) {
          i = tclickTypes.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoAdClientLogReport$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdActionTypeWhiteList\(showTypes="+this.showTypes+", clickTypes="+this.clickTypes+"\)";
    }
}
