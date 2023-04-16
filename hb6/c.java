package hb6.c;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Long;
import ok.k;

public class c	// class@001744
{
    public List mFailoverIpList;
    public String mHost;
    public List mOptimalIpList;
    public long mOptimalIpVersion;

    public List a(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mFailoverIpList == null) {
          this.mFailoverIpList = new ArrayList();
       }
       return this.mFailoverIpList;
    }
    public String b(){
       if (this.mHost == null) {
          this.mHost = "";
       }
       return this.mHost;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mOptimalIpList == null) {
          this.mOptimalIpList = new ArrayList();
       }
       return this.mOptimalIpList;
    }
    public long d(){
       return this.mOptimalIpVersion;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof c) {
          return false;
       }
       if (!(this.b()).equals(p0.b()) || (!this.a().equals(p0.a()) || (!this.c().equals(p0.c()) || this.d() - p0.d()))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mHost,this.mFailoverIpList,this.mOptimalIpList,Long.valueOf(this.mOptimalIpVersion)};
       return k.b(obj);
    }
}
