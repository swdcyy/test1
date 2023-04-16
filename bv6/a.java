package bv6.a;
import zu6.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class a extends a	// class@0004a3
{
    public boolean a;
    public final String b;
    public final String c;

    public void a(String p0,int p1,String p2,String p3){
       a.p(p0, "bundleId");
       a.p(p2, "versionName");
       a.p(p3, "assetFileName");
       a.p(p0, "bundleId");
       a.p(p2, "versionName");
       a.p(p3, "assetFileName");
       super(p0, p1, p2, -1);
       this.b = p3;
       this.c = null;
    }
    public final String e(){
       return this.b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{bundleId="+this.a()+", versionCode="+this.c()+", versionName="+this.d()+", "+"assertFileName="+this.b+", extraInfo="+this.c+'}';
    }
}
