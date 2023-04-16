package as7.b$a;
import java.lang.Runnable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.timemachine.TMLogManager;
import com.yxcorp.gifshow.log.timemachine.EventTriggerType;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class b$a implements Runnable	// class@000361
{
    public final List b;

    public void b$a(List p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       String str = a.a.q(this.b);
       a.o(str, "Gsons.KWAI_GSON.toJson\(commitList\)");
       TMLogManager.e.d("SlidePlay", EventTriggerType.SlideDispatcher.getMessageType(), str);
       return;
    }
}
