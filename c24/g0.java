package c24.g0;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import java.util.Map;
import ot3.h0;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import android.app.Activity;
import brd.t;
import c24.g0$a;
import c24.g0$b;
import erd.g;
import crd.b;

public final class g0 implements e	// class@00047a
{

    public void g0(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = h0.a(p0.d());
          String str = obj.get("liveStreamId");
          String str1 = "";
          if (str == null) {
             str = str1;
          }
          String str2 = obj.get("id");
          if (str2 != null) {
             str1 = str2;
          }
          o.H().y(p0.a(), str, str1).subscribe(new g0$a(p0, this), new g0$b(p0, this));
       }
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
