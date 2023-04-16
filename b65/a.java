package b65.a;
import java.lang.Object;
import android.content.Context;
import com.kwai.camerasdk.audioCapture.AudioController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.camerasdk.audioCapture.AudioControllerImpl;

public class a	// class@000346
{

    public void a(){
       super();
    }
    public static AudioController a(Context p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new AudioControllerImpl(p0, p1, p2);
    }
}
