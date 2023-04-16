package dn9.a;
import on5.m$a;
import java.lang.String;
import java.lang.Object;
import zr6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dn9.a$a;
import zr6.g;
import com.kwai.framework.model.channel.HotChannel;
import lnc.g0;
import wn5.b;
import com.kwai.component.kcube.model.model.TabConfig;
import wq6.e;
import android.content.Intent;
import java.lang.Boolean;
import android.net.Uri;
import on5.n;
import on5.o;

public class a extends m$a	// class@001fd0
{

    public void a(){
       super("ato_universalFeedTab");
    }
    public b d(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(p0);
    }
    public void e(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       Object obj = p0.f();
       if (obj instanceof HotChannel) {
          p0.a("KEY_TAB_NAME_DEST", new b(g0.a(obj))).a("KEY_TAB_HOT_CHANNEL", obj);
       }else {
          p0.a("KEY_TAB_NAME_DEST", new b(obj, R.string.arg_RES_7f104441));
          if (obj instanceof TabConfig) {
             p0.a("KEY_UNIVERSAL_TAB_PARAM", obj);
          }
       }
       return;
    }
    public boolean f(e p0,Intent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (super.f(p0, p1)) {
          return true;
       }
       boolean b = n.d(p1.getData(), "kwai", "commontab", "common");
       if (b) {
          o.a("common", false);
       }
       return b;
    }
}
