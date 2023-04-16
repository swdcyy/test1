package p80.j;
import com.kuaishou.gifshow.kswebview.KsWebViewInstallException;
import java.util.Set;
import nsd.u;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class j	// class@0028d2
{
    public int a;
    public int b;
    public boolean c;
    public KsWebViewInstallException d;
    public Set e;

    public void j(){
       super(0, 0, false, null, null, 31, null);
    }
    public void j(int p0,int p1,boolean p2,KsWebViewInstallException p3,Set p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = 0;
       }
       if (p5 & 0x02) {
          p1 = 0;
       }
       if (p5 & 0x04) {
          p2 = true;
       }
       LinkedHashSet linkedHashSe = (p5 & 0x10)? new LinkedHashSet(): null;
       a.p(linkedHashSe, "installCallbacks");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = null;
       this.e = linkedHashSe;
       return;
    }
    public final Set a(){
       return this.e;
    }
    public final int b(){
       return this.b;
    }
    public final int c(){
       return this.a;
    }
    public final boolean d(){
       return this.c;
    }
    public final void e(KsWebViewInstallException p0){
       this.d = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof j && (this.a == p0.a && (this.b == p0.b && (this.c == p0.c && (a.g(this.d, p0.d) && a.g(this.e, p0.e))))))) {
          return true;
       }
       return false;
    }
    public final void f(int p0){
       this.a = p0;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.a * 31) + this.b) * 31;
       j tc = this.c;
       if (tc != null) {
          tc = 1;
       }
       i = (i + tc) * 31;
       tc = this.d;
       int i1 = 0;
       int i2 = (tc != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       tc = this.e;
       if (tc != null) {
          i1 = tc.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsWebViewInstallRecorder\(installStatus="+this.a+", installRetryTimes="+this.b+", isPredownload="+this.c+", installException="+this.d+", installCallbacks="+this.e+"\)";
    }
}
