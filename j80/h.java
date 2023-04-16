package j80.h;
import com.kwai.framework.utility.receiver.SDCardStateReceiver$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.utility.receiver.SDCardStateReceiver;
import java.util.List;
import wkd.b;
import j80.c;

public class h implements SDCardStateReceiver$a	// class@002240
{

    public void h(){
       super();
    }
    public static void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, h.class, "1")) {
          return;
       }
       h oh = new h();
       if (!PatchProxy.applyVoidOneRefs(oh, objArray, SDCardStateReceiver.class, "2")) {
          SDCardStateReceiver.a.add(oh);
       }
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       int i = -1504323719;
       try{
          b.a(i).q();
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
