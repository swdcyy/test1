package br3.a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@000421
{
    public List materialGroupList;

    public void a(List p0){
       a.p(p0, "materialGroupList");
       super();
       this.materialGroupList = p0;
    }
    public final List a(){
       return this.materialGroupList;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && a.g(this.materialGroupList, p0.materialGroupList))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.materialGroupList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MaterialBriefInfos\(materialGroupList="+this.materialGroupList+"\)";
    }
}
