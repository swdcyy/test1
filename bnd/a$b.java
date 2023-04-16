package bnd.a$b;
import ynd.c;
import bnd.a;
import java.lang.Object;
import bod.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import hnd.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextFontChangeAction;
import xvc.b;

public final class a$b implements c	// class@000288
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       a$b uob = a$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          a.p(p1, "item");
          this.a.g0().t0(new TextFontChangeAction(this.a.g0().o0().o(), 1, p1, (this.a.g0().o0().E() ^ 1)));
       }
       return;
    }
}
