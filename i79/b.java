package i79.b;
import aya.a;
import java.util.List;
import com.yxcorp.gifshow.album.model.KSMemoryClipType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b implements a	// class@002645
{
    public List a;
    public List b;
    public KSMemoryClipType c;
    public double d;

    public void b(List p0,List p1,KSMemoryClipType p2,double p3){
       a.p(p0, "mMedias");
       a.p(p2, "mClipType");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void b(List p0,List p1,KSMemoryClipType p2,double p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = 0;
       }
       super(p0, null, p2, p3);
       return;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getAssetTag();
    }
    public List b(){
       return this.a;
    }
    public final List c(){
       return this.b;
    }
    public final KSMemoryClipType d(){
       return this.c;
    }
    public final List e(){
       return this.a;
    }
    public final void f(List p0){
       this.b = p0;
    }
    public double getClipDuration(){
       return this.d;
    }
}
