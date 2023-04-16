package knd.k;
import knd.j;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import java.util.concurrent.atomic.AtomicBoolean;
import knd.k$c;
import faa.a;
import java.lang.Object;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import zt7.d;
import zt7.d$b;
import knd.k$a;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;

public final class k extends j	// class@0017ee
{
    public PostTaskManager f;
    public k$b g;
    public j$a h;
    public final AtomicBoolean i;
    public d$b j;

    public void k(){
       super();
       this.f = new PostTaskManager();
       boolean b = false;
       this.i = new AtomicBoolean(b);
       this.j = new k$c(this);
       Object[] objArray = new Object[b];
       a.D().w("TTSDownloadManagerV2", "construction method", objArray);
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
       }else {
          Object[] objArray1 = new Object[b];
          a.D().w("TTSDownloadManagerV2", "registerListener: ", objArray1);
          String[] stringArray = new String[]{"Push.MMU.RtTextToSpeechPushKS"};
          f.e().o(this.e(), stringArray);
          this.f().k(this.j, "Global.MMU.RtTextToSpeechPushKS");
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSDownloadManagerV2", "clear", objArray);
       this.f.c();
       return;
    }
    public final k$a n(String p0){
       k$a uoa1;
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "taskId");
       Object[] objArray = new Object[0];
       a.D().w("TTSDownloadManagerV2", "getResultData taskId = "+p0, objArray);
       if (this.f.d(p0) != null) {
          PostTaskManager$a uoa = this.f.d(p0);
          a.m(uoa);
          uoa1 = uoa.b();
       }else {
          uoa1 = null;
       }
       return uoa1;
    }
}
