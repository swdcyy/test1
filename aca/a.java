package aca.a;
import erd.a;
import aca.d;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateChangedAction;
import eca.g;
import nsd.u;
import tvc.a;
import com.yxcorp.gifshow.editor.aicutv2.actions.UpdateLyricAction;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.api.AICutStyle;

public final class a implements a	// class@000089
{
    public final d b;
    public final VideoTemplate c;

    public void a(d p0,VideoTemplate p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       KSStore kSStore = this.b.a();
       if (kSStore != null) {
          g og = new g(this.c, 0, null, null, 14, null);
          kSStore.a(new VideoTemplateChangedAction(v9));
       }
       kSStore = this.b.a();
       if (kSStore != null) {
          KwaiAICutStyle aiCutStyle = this.c.getAiCutStyle();
          a.m(aiCutStyle);
          kSStore.a(new UpdateLyricAction(aiCutStyle));
       }
       return;
    }
}
