package cic.i$a;
import com.kwai.video.hodor.ExportMediaCacheTask$ExportMediaCacheTaskCallback;
import cic.i;
import brd.v;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.hodor.ExportMediaCacheTask$TaskInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import cic.h$b;
import java.util.Objects;
import cic.h;
import cic.f;
import java.lang.Runnable;
import t45.c;
import kotlin.jvm.internal.a;
import com.kwai.video.hodor.BaseTaskInfo;
import java.io.File;
import brd.g;

public final class i$a implements ExportMediaCacheTask$ExportMediaCacheTaskCallback	// class@0005af
{
    public final i a;
    public final v b;
    public final String c;

    public void i$a(i p0,v p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCdnReport(ExportMediaCacheTask$TaskInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       h$b b = this.a.b.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, h.class, "3")) {
          c.a(new f(p0));
       }
       return;
    }
    public void onTaskStatusChanged(ExportMediaCacheTask$TaskInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       a.p(p0, "info");
       int taskState = p0.getTaskState();
       if (p0.isComplete() && taskState == 1) {
          this.b.onNext(new File(this.c));
          this.b.onComplete();
       }
       return;
    }
}
