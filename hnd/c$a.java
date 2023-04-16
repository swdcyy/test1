package hnd.c$a;
import java.lang.Runnable;
import hnd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TemplateLoadedAction;
import tvc.a;

public final class c$a implements Runnable	// class@000f91
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       tb.h = true;
       KSStore kSStore = tb.a();
       if (kSStore != null) {
          kSStore.a(new TemplateLoadedAction());
       }
       return;
    }
}
