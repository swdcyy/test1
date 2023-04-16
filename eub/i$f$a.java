package eub.i$f$a;
import com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$b;
import eub.i$f;
import r1c.h;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mq.d;
import faa.a;
import q87.c;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import brd.g;
import eub.i;
import r1c.q$b;
import y26.b$a;
import r1c.b0$b;

public final class i$f$a implements GraphTaskExecuteManager$b	// class@002827
{
    public final i$f a;
    public final h b;
    public final v c;

    public void i$f$a(i$f p0,h p1,v p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$f$a.class, "1")) {
          return;
       }
       d.c(this);
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "upload onRunStart", objArray);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$f$a.class, "3")) {
          return;
       }
       d.d(this);
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "upload onRunStop", objArray);
       return;
    }
    public void c(GraphTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$f$a.class, "4")) {
          return;
       }
       d.a(this, p0);
       this.c.onError(new RuntimeException("EditPageNoUiPublishStageImpl upload onRunError errorTask:"+p0));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i$f$a.class, "2")) {
          return;
       }
       d.e(this);
       if (this.a.b.f != null) {
          q$b uob = this.b.b("PhotosShareParamRequestBuildMTNSTask");
          if (uob == null) {
             this.c.onError(new RuntimeException("EditPageNoUiPublishStageImpl upload onRunSuccess but no result picture"));
             return;
          }else {
             this.c.onNext(uob.a());
          }
       }else {
          b0$b uob1 = this.b.b("VideoShareParamBuildMTNSTask");
          if (uob1 == null) {
             this.c.onError(new RuntimeException("EditPageNoUiPublishStageImpl upload onRunSuccess but no result video"));
             return;
          }else {
             this.c.onNext(uob1.a());
          }
       }
       this.c.onComplete();
       return;
    }
    public void e(String p0){
       d.b(this, p0);
    }
}
