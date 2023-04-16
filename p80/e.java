package p80.e;
import java.lang.Object;
import p80.e$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q80.b;
import r80.g;
import r80.g$a;
import tkd.b;
import tkd.d;
import p80.m;
import q80.c;

public class e	// class@0028cd
{
    public static e$a a;

    public void e(){
       super();
    }
    public static e$a a(){
       e uoe = e.class;
       Object[] objArray = null;
       String str = "1";
       Object obj = PatchProxy.apply(objArray, objArray, uoe, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.a == null && (!PatchProxy.applyVoid(objArray, objArray, uoe, "2") && !PatchProxy.applyVoid(objArray, objArray, b.class, str))) {
          g.a.c("KsWebView", "createExtensionProvider for KsWebViewExtension");
          d.a(-1717725018).L4(new c());
       }
    label_0040 :
       return e.a;
    }
}
