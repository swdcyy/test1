package aca.f$a;
import com.kuaishou.logic.c$a;
import aca.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingProgressAction;
import tvc.a;

public final class f$a implements c$a	// class@00008f
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       f$a uoa = f$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       KSStore kSStore = this.a.a();
       if (kSStore != null) {
          kSStore.a(new VideoTemplateLoadingProgressAction(p0));
       }
       return;
    }
}
