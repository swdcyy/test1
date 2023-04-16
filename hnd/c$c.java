package hnd.c$c;
import erd.g;
import hnd.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TemplateLoadedAction;
import tvc.a;

public final class c$c implements g	// class@000f93
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
       }else {
          p0 = this.b;
          p0.h = true;
          p0 = p0.a();
          if (p0 != null) {
             p0.a(new TemplateLoadedAction());
          }
       }
       return;
    }
}
