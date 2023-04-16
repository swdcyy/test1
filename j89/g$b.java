package j89.g$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.w;
import java.lang.StringBuilder;
import android.os.SystemClock;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel;

public final class g$b implements Runnable	// class@0027ad
{
    public final String b;

    public void g$b(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       b.a(-1343064608).U(this.b+"_end", SystemClock.elapsedRealtime());
       if ((this.b).equals("frame_first")) {
          int i = -1436040059;
          Object obj = b.a(i);
          a.o(obj, "Singleton.get\(CNYWebview¡­igentPreinit::class.java\)");
          if (obj.d().mLoadRule == 2) {
             b.a(i).f("first_frame");
          }
       }
       return;
    }
}
