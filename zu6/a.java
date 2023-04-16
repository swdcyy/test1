package zu6.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@003f7f
{
    public final String bundleId;
    public final long taskId;
    public final int versionCode;
    public final String versionName;

    public void a(String p0,int p1,String p2,long p3){
       a.p(p0, "bundleId");
       a.p(p2, "versionName");
       super();
       this.bundleId = p0;
       this.versionCode = p1;
       this.versionName = p2;
       this.taskId = p3;
    }
    public final String a(){
       return this.bundleId;
    }
    public final long b(){
       return this.taskId;
    }
    public final int c(){
       return this.versionCode;
    }
    public final String d(){
       return this.versionName;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BundleConfig\(bundleId="+this.bundleId+", versionCode="+this.versionCode+", "+"versionName="+this.versionName+')';
    }
}
