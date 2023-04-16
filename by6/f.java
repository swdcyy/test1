package by6.f;
import dy6.c;
import java.lang.Object;
import dy6.b;
import by6.f$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import by6.a;
import com.kuaishou.aegon.netcheck.NetcheckTaskController$TaskType;
import cy6.d;
import cy6.b;
import cy6.a;
import java.lang.StringBuilder;
import by6.b;
import by6.f$a;
import by6.a$a;
import by6.f$b;
import java.util.Map;

public class f	// class@0004b8
{
    public final c a;
    public f$b b;
    public a c;
    public Map d;
    public boolean e;
    public boolean f;
    public boolean g;

    public void f(c p0){
       super();
       this.a = p0;
    }
    public final void a(b p0,f$c p1){
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uof, "2")) {
          return;
       }
       d uod = PatchProxy.applyOneRefs(p0, this, uof, "4");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = null;
          if ((NetcheckTaskController$TaskType.SERVER_CHECK.getType()).equals(p0.mType)) {
             uod = new d(p0);
          }else if((NetcheckTaskController$TaskType.LOCAL_NETWORK_CHECK.getType()).equals(p0.mType)){
             uod = new b(p0);
          }else if((NetcheckTaskController$TaskType.DNS_CHECK.getType()).equals(p0.mType)){
             uod = new a(p0);
          }
       }
       this.c = uod;
       b.a("NetworkTaskGroupDetector detect task id:"+p0.mId+" type:"+p0.mType+" config:"+p0.mConfig+" target:"+p0.mTarget);
       if (this.c != null) {
          b.a("NetworkTaskGroupDetector has detector");
          if (!this.c.b(new f$a(this, p1, p0))) {
             b.a("NetworkTaskGroupDetector create fail");
             this.c(p1);
          }
       }else {
          b.a("NetworkTaskGroupDetector detector null");
          this.c(p1);
       }
       return;
    }
    public c b(){
       return this.a;
    }
    public void c(f$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       if (this.b.b()) {
          b.a("NetworkTaskGroupDetector retry hasNextDetectTask");
          this.a(this.b.c(), p0);
       }else {
          b.a("NetworkTaskGroupDetector retry callbackCompleted");
          this.e = true;
          this.f = false;
          this.g = false;
          p0.a(this.d);
       }
       return;
    }
}
