package bnd.a$c;
import ynd.c;
import bnd.a;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import hnd.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextStyleChangeAction;
import xvc.b;

public final class a$c implements c	// class@000289
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       a$c uoc = a$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1")) {
          this.a.g0().t0(new TextStyleChangeAction(this.a.g0().o0().o(), 1, p1, (this.a.g0().o0().E() ^ 1)));
       }
       return;
    }
}
