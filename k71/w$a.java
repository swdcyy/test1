package k71.w$a;
import com.kuaishou.live.core.show.webview.jsparams.LiveJsShowGuestGiftPanelParams$Params;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class w$a	// class@002ccc
{
    public final LiveJsShowGuestGiftPanelParams$Params param;

    public void w$a(){
       super(null);
    }
    public void w$a(LiveJsShowGuestGiftPanelParams$Params p0){
       super();
       this.param = p0;
    }
    public final LiveJsShowGuestGiftPanelParams$Params a(){
       return this.param;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, w$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof w$a && a.g(this.param, p0.param))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       w$a obj = PatchProxy.apply(null, this, w$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.param;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, w$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(param="+this.param+"\)";
    }
}
