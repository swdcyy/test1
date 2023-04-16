package ond.d$g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import ond.d;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import wpc.k;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Objects;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import mod.a;
import xld.c;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import kotlin.jvm.internal.a;
import a17.b$b;
import a17.b$a;
import java.util.List;
import kotlin.Pair;
import java.lang.Number;

public final class d$g implements EditDecorationContainerView$b	// class@00202c
{
    public final d a;

    public void d$g(d p0){
       this.a = p0;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$g obj = PatchProxy.applyOneRefs(p0, this, d$g.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditTextBaseElement && !p0 instanceof NewEditStickerBaseDrawer) {
          return k.a(this, p0);
       }
       if (this.a.o.H() == null) {
          obj = this.a;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(null, obj, d.class, "21");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c.o0().y().f();
          if (!b || p0.mIsSelected != null) {
             b1 = true;
          label_005a :
             return b1;
          }
       }
       b1 = false;
       goto label_005a ;
    }
    public boolean b(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "drawer");
       boolean b = (p0 instanceof NewEditTextBaseElement || p0 instanceof NewEditStickerBaseDrawer)? true: false;
       return b;
    }
    public void c(b$b p0,b$a p1){
       k.d(this, p0, p1);
    }
    public boolean d(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof NewEditTextBaseElement && !p0 instanceof NewEditStickerBaseDrawer) {
          return b;
       }
       List identifyList = p0.getIdentifyList();
       a.o(identifyList, "drawer.identifyList");
       if (this.a.F(identifyList).getFirst().intValue() != -1) {
          b = true;
       }
       return b;
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       return k.c(this, p0);
    }
}
