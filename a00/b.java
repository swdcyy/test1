package a00.b;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class b	// class@000008
{
    public String mBundleId;
    public String mBundleVersion;
    public String mBundleVersionCode;
    public String mBusinessName;
    public long mTaskId;

    public void b(String p0,String p1,String p2,String p3,long p4,int p5,u p6){
       p2 = null;
       p3 = "";
       p1 = (p5 & 0x02)? p3: p2;
       String str = (p5 & 0x04)? p3: p2;
       if (p5 & 0x08) {
          p2 = p3;
       }
       if (p5 & 0x10) {
          p4 = -1;
       }
       a.p(p0, "bundleId");
       a.p(p1, "bundleVersion");
       a.p(str, "bundleVersionCode");
       a.p(p2, "businessName");
       super();
       this.mBusinessName = p2;
       this.mBundleId = p0;
       this.mBundleVersion = p1;
       this.mBundleVersionCode = str;
       this.mTaskId = p4;
       return;
    }
}
