package a67.c;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class c	// class@000053
{

    public void c(){
       super();
    }
    public static ClientContent$ScreenPackage a(boolean p0){
       ClientContent$ScreenPackage obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$ScreenPackage();
       int i = (p0)? 2: 1;
       obj.orientation = i;
       return obj;
    }
}
