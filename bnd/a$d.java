package bnd.a$d;
import ynd.c;
import bnd.a;
import java.lang.Object;
import bod.d;
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
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextTemplateChangeAction;
import xvc.b;

public final class a$d implements c	// class@00028a
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       a$d uod = a$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "1")) {
          a.p(p1, "item");
          this.a.g0().t0(new TextTemplateChangeAction(this.a.g0().o0().o(), 1, p1, (this.a.g0().o0().E() ^ 1)));
       }
       return;
    }
}
