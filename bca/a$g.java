package bca.a$g;
import erd.a;
import bca.a;
import eca.g;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import h69.b;
import com.yxcorp.gifshow.editor.aicutv2.actions.AICutLastSelectedSubItemIdUpdateAction;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import brd.g;

public final class a$g implements a	// class@000450
{
    public final a b;
    public final g c;
    public final v d;

    public void a$g(a p0,g p1,v p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$g.class, "1")) {
          return;
       }
       a$g tb = this.b;
       tb.i(tb.a.y6(), this.c);
       a d = this.b.d;
       if (d != null) {
          VideoTemplate videoTemplat = this.c.b();
          if (videoTemplat != null) {
             objArray = videoTemplat.getId();
          }
          d.t0(new AICutLastSelectedSubItemIdUpdateAction(objArray));
       }
       this.d.onComplete();
       return;
    }
}
