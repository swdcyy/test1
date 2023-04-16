package buc.e;
import tvc.c;
import androidx.lifecycle.ViewModelProvider;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import tvc.a;
import tvc.e;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateReleaseAction;
import cuc.a;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateAction;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateDraftAction;
import com.yxcorp.gifshow.v3.framework.KSStore;
import crd.b;

public final class e extends c	// class@000491
{
    public a b;
    public final ViewModelProvider c;

    public void e(ViewModelProvider p0){
       a.p(p0, "vmp");
       super();
       this.c = p0;
       this.b = new a();
    }
    public e b(a p0,e p1){
       e uoe = e.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uoe, "1");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
          if (p0 instanceof PicTemplateReleaseAction) {
             if (!PatchProxy.applyVoidTwoRefs(p1, p0, this, uoe, "2")) {
                this.c(p1, p0);
                this.b.dispose();
             }
          }else if(p0 instanceof PicTemplateAction){
             this.c(p1, p0);
          }else if(p0 instanceof PicTemplateDraftAction){
             this.c(p1, p0);
          }
       }
       return p1;
    }
    public final void c(PicTemplateState p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "3")) {
          return;
       }
       e tc = this.c;
       KSStore kSStore = this.a();
       if (kSStore != null) {
          b uob = p1.handle(tc, kSStore, p0);
          if (uob != null && !uob.isDisposed()) {
             this.b.c(uob);
          }
       }
       return;
    }
}
