package dca.c;
import java.lang.Runnable;
import cca.a;
import dca.d;
import cca.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import dca.a;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import h69.b;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.editor.aicutv2.actions.UpdateLyricAction;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadingCompleteAction;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateLoadListAction;

public final class c implements Runnable	// class@001eef
{
    public final a b;
    public final d c;
    public final b d;

    public void c(a p0,d p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       d c;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       d b = tc.b;
       a g = this.b.g;
       c = tc.c;
       Objects.requireNonNull(b);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(g), Boolean.valueOf(c), b, uoa, "9")) {
          VideoTemplate videoTemplat = d.a(-873393519).LM();
          if (g != null) {
             a k = b.k;
             if (videoTemplat != null) {
                objArray = videoTemplat.getAiCutStyle();
             }
             k.t0(new UpdateLyricAction(objArray));
          }
          b.k.t0(new VideoTemplateLoadingCompleteAction(videoTemplat, g, c, c));
          if (c != null) {
             b.n = false;
          }else {
             b.k.t0(new VideoTemplateLoadListAction());
          }
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
