package com.kwai.framework.location.model.KsBusinessArea;
import java.lang.String;
import com.kwai.framework.location.model.KsLocation;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KsBusinessArea	// class@00164d
{
    public KsLocation location;
    public String name;

    public void KsBusinessArea(){
       super(null, null, 3, null);
    }
    public void KsBusinessArea(String p0,KsLocation p1){
       super();
       this.name = p0;
       this.location = p1;
    }
    public void KsBusinessArea(String p0,KsLocation p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
    public static KsBusinessArea copy$default(KsBusinessArea p0,String p1,KsLocation p2,int p3,Object p4){
       KsBusinessArea name;
       KsBusinessArea location;
       if (p3 & 0x01) {
          name = p0.name;
       }
       if (p3 & 0x02) {
          location = p0.location;
       }
       return p0.copy(name, location);
    }
    public final String component1(){
       return this.name;
    }
    public final KsLocation component2(){
       return this.location;
    }
    public final KsBusinessArea copy(String p0,KsLocation p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KsBusinessArea.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KsBusinessArea(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsBusinessArea.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KsBusinessArea && (a.g(this.name, p0.name) && a.g(this.location, p0.location)))) {
          return true;
       }
       return false;
    }
    public final KsLocation getLocation(){
       return this.location;
    }
    public final String getName(){
       return this.name;
    }
    public int hashCode(){
       KsBusinessArea obj = PatchProxy.apply(null, this, KsBusinessArea.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.name;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       KsBusinessArea tlocation = this.location;
       if (tlocation != null) {
          i = tlocation.hashCode();
       }
       return (i1 + i);
    }
    public final void setLocation(KsLocation p0){
       this.location = p0;
    }
    public final void setName(String p0){
       this.name = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsBusinessArea.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsBusinessArea\(name="+this.name+", location="+this.location+"\)";
    }
}
