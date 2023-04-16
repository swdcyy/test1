package bnd.b$d;
import rod.b;
import bnd.b;
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
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextFontChangeActionV3;
import nsd.u;
import xvc.b;

public final class b$d implements b	// class@00028f
{
    public final b a;

    public void b$d(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       Object obj = p1;
       p1 = b$d.class;
       if (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, this, p1, "1")) {
          a.p(obj, "item");
          TextFontChangeActionV3 textFontChan = new TextFontChangeActionV3(this.a.a0().o0().o(), true, 0, obj, this.a.a0().o0().w(), 4, null);
          this.a.a0().t0(p1);
       }
       return;
    }
}
