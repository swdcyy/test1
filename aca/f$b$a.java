package aca.f$b$a;
import java.lang.Runnable;
import aca.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingShowEditAction;
import tvc.a;

public final class f$b$a implements Runnable	// class@000090
{
    public final f$b b;

    public void f$b$a(f$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f$b$a.class, "1")) {
          return;
       }
       KSStore kSStore = this.b.b.a();
       if (kSStore != null) {
          kSStore.a(new VideoTemplateLoadingShowEditAction());
       }
       return;
    }
}
