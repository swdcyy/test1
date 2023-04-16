package hl2.i;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class i	// class@002dc3
{

    public void i(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       return obj;
    }
}
