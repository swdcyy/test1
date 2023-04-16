package by6.f$a;
import by6.a$a;
import by6.f;
import by6.f$c;
import dy6.b;
import java.lang.Object;
import dy6.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import by6.b;
import java.util.Map;
import java.lang.Integer;
import by6.f$b;
import dy6.c;
import java.util.List;

public class f$a implements a$a	// class@0004b5
{
    public final f$c a;
    public final b b;
    public final f c;

    public void f$a(f p0,f$c p1,b p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       b.a("NetworkTaskGroupDetector onCompleted canceled:"+this.c.f);
       f$a tc = this.c;
       if (tc.f != null) {
          return;
       }
       tc.d.put(this.b, p0);
       this.c.c(this.a);
       return;
    }
    public void onProgress(int p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       int i = (int)(((float)((this.c.b.a() * 100) + p0) / ((float)this.c.a.mNetworkDetectTasks.size() * 100.00f)) * 100.00f);
       this.a.onProgress(i);
       b.a("NetworkTaskGroupDetector onProgress percentage:"+p0+" callBackPercentage:"+i);
       return;
    }
}
