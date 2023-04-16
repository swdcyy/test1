package d85.e;
import java.lang.Object;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class e	// class@001480
{

    public void e(){
       super();
    }
    public static boolean a(PacketData p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.b() != null && p0.b().length >= 0x4b000)? true: false;
       return b;
    }
}
