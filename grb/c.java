package grb.c;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002bd8
{
    public HashMap mCityNameMapping;
    public String mVersion;

    public void c(){
       HashMap hashMap = new HashMap();
       a.p("", "mVersion");
       a.p(hashMap, "mCityNameMapping");
       super();
       this.mVersion = "";
       this.mCityNameMapping = hashMap;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.mVersion, p0.mVersion) && a.g(this.mCityNameMapping, p0.mCityNameMapping)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mVersion;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c tmCityNameMa = this.mCityNameMapping;
       if (tmCityNameMa != null) {
          i = tmCityNameMa.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CityMappingResponse\(mVersion="+this.mVersion+", mCityNameMapping="+this.mCityNameMapping+"\)";
    }
}
