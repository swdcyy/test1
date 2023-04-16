package jod.a;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@001720
{
    public final List a;

    public void a(){
       super(null, 1, null);
    }
    public void a(List p0){
       a.p(p0, "rangeList");
       super();
       this.a = p0;
    }
    public void a(List p0,int p1,u p2){
       ArrayList uArrayList = (p1 & 0x01)? new ArrayList(): null;
       super(uArrayList);
       return;
    }
    public static a a(a p0,List p1,int p2,Object p3){
       a a = (p2 & 0x01)? p0.a: null;
       Objects.requireNonNull(p0);
       p0 = PatchProxy.applyOneRefs(a, p0, a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(a, "rangeList");
          p0 = new a(a);
       }
       return p0;
    }
    public final List b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DecorationTimelineData\(rangeList="+this.a+"\)";
    }
}
