package bnd.b$e;
import rod.b;
import bnd.b;
import java.lang.Object;
import ood.d;
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
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontDelayChangeActionV3;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import nsd.u;
import xvc.b;

public final class b$e implements b	// class@000290
{
    public final b a;

    public void b$e(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       Object obj = p1;
       p1 = b$e.class;
       if (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, this, p1, "1")) {
          a.p(obj, "item");
          int i = this.a.a0().o0().o();
          f uof = this.a.a0();
          DraftTextStyleInfo uDraftTextSt = this.a.a0().o0().D();
          int i1 = 0;
          String str = (uDraftTextSt != null)? uDraftTextSt.f(): i1;
          uDraftTextSt = this.a.a0().o0().D();
          Integer integer = (uDraftTextSt != null)? Integer.valueOf(uDraftTextSt.c()): i1;
          TextDesignFontDelayChangeActionV3 textDesignFo = new TextDesignFontDelayChangeActionV3(i, true, obj, str, integer, 0, this.a.a0().o0().w(), 32, 0);
          uof.t0(p1);
       }
       return;
    }
}
