package end.b$h;
import xnd.b;
import end.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import hnd.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.UpdateTextAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;

public final class b$h implements b	// class@000da3
{
    public final b a;

    public void b$h(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2,float p3,float p4,boolean p5,float p6,float p7){
       b$h oh = this;
       object oobject = p1;
       object oobject1 = p2;
       b$h oh1 = b$h.class;
       if (PatchProxy.isSupport(oh1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,Float.valueOf(p3),Float.valueOf(p4),Boolean.valueOf(p5),Float.valueOf(p6),Float.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, oh1, "1")) {
             return;
          }
       }
       a.p(oobject, "newText");
       a.p(oobject1, "oldText");
       UpdateTextAction updateTextAc = new UpdateTextAction(p0, p1, p3, p4, (oh.a.s0().o0().E() ^ 0x01));
       oh.a.s0().t0(v9);
       if (p5) {
          DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(p0, true, false, p6, p7, (oh.a.s0().o0().E() ^ 0x01));
          oh.a.s0().t0(oh1);
       }
       return;
    }
}
