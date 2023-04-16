package aw1.b;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class b	// class@0002bf
{

    public void b(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       if (p0 != null) {
          obj.liveStreamPackage = p0;
       }
       return obj;
    }
    public static ClientContent$MoreInfoPackageV2 b(String p0,String p1,boolean p2){
       ClientContent$MoreInfoPackageV2 obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (TextUtils.x(p0)) {
          return null;
       }else {
          obj = new ClientContent$MoreInfoPackageV2();
          obj.id = p0;
          if (!TextUtils.x(p1)) {
             obj.params = p1;
          }
          p0 = (p2)? "LARGE_STYLE": "NORMAL";
          obj.type = p0;
          return obj;
       }
    }
}
