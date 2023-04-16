package end.b$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import end.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hnd.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import mod.a;
import kod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleStartAction;
import xvc.b;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.util.List;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.text_v2.action.DeleteTextActionV3;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectAction;
import android.view.MotionEvent;
import vmd.c;
import java.util.Objects;
import k2b.e0;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUnSelectAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveStartAction;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleEndAction;
import wnd.b;

public final class b$a extends DecorationContainerView$e	// class@000d9c
{
    public final b a;
    public final Fragment b;

    public void b$a(b p0,Fragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void A(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "13")) {
          return;
       }
       b$a ta = this.a;
       ta.m0(p0, ta.s0().o0().C());
       this.a.s0().t0(new DecorationScaleStartAction());
       return;
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "10")) {
       }else {
          super.b(p0);
          this.z(p0);
          this.a.L();
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "9")) {
       }else {
          super.c(p0);
          this.A(p0);
          this.a.I();
       }
       return;
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "7")) {
       }else {
          super.d(p0, p1);
          if (p0 != null) {
             p1 = this.a.s0().o0().i();
             int i = -1;
             int i1 = 1;
             if (p1.size() > i1) {
                int i2 = p1.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < i2) {
                   if (p1.get(i4).l0() == p0.getLayerIndex()) {
                      i = i4 + 1;
                      i = (i == p1.size())? p1.get(i3).l0(): p1.get(i).l0();
                   }
                label_0060 :
                   i4 = i4 + 1;
                }
             }
             this.a.s0().t0(new DeleteTextActionV3(p0.getLayerIndex(), i, (i1 ^ this.a.s0().o0().E())));
          }
       }
       return;
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.h(p0);
          if (p0 instanceof NewEditTextElement) {
             p0.getTextDrawerLayout().setAcceptEvent(true);
          }
          this.a.s0().t0(new DecorationSelectAction(p0.getLayerIndex()));
          this.a.I();
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "11")) {
       }else {
          super.i(p0);
          this.A(p0);
          this.a.I();
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$a.class, "4")) {
       }else {
          super.k(p0, p1);
          if (this.a.s0().o0().C().f()) {
             this.a.M();
             c a = c.a;
             b$a tb = this.b;
             Objects.requireNonNull(tb, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(tb, a, c.class, "7")) {
                a.p(tb, "iLogPage");
                a.b(tb, "CLOSE_INPUT_TEXT");
             }
          }else if(!this.a.h0() && (p0 != null && p0.isSubtitle() == true)){
             this.a.S().R();
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
       }else {
          super.l(p0);
          if (p0 != null) {
             if (p0 instanceof NewEditTextElement) {
                p0.getTextDrawerLayout().setAcceptEvent(false);
             }
             this.a.s0().t0(new DecorationUnSelectAction(this.a.s0().o0().E()));
          }
          this.a.L();
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "5")) {
       }else {
          super.p(p0);
          b$a ta = this.a;
          ta.m0(p0, ta.s0().o0().C());
          this.a.s0().t0(new DecorationMoveStartAction());
          this.a.q0(false);
          this.a.e0();
          TextView textView = this.a.W();
          if (textView != null && !textView.getVisibility()) {
             this.a.W().setVisibility(8);
          }
          this.a.I();
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof NewEditTextElement && p0.isSubtitle())? true: false;
       return b;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          this.a.r0();
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "12")) {
       }else {
          super.x(p0);
          this.z(p0);
          this.a.L();
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "6")) {
       }else {
          super.y(p0);
          b$a ta = this.a;
          ta.l0(p0, ta.s0().o0().C());
          if (p0 != null) {
             DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(p0.getLayerIndex(), true, false, p0.getMoveX(), p0.getMoveY(), (this.a.s0().o0().E() ^ 0x01));
             this.a.s0().t0(v8);
             this.a.q0(true);
          }
          this.a.L();
       }
       return;
    }
    public final void z(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "14")) {
          return;
       }
       b$a ta = this.a;
       ta.l0(p0, ta.s0().o0().C());
       if (p0 != null) {
          DecorationScaleEndAction uDecorationS = new DecorationScaleEndAction(p0.getLayerIndex(), true, p0.getScale(), p0.getAdditionalScale(), (this.a.s0().o0().E() ^ 0x01));
          this.a.s0().t0(v8);
       }
       b.d(this.a.S(), this.a.s0(), true, this.a.s0().o0().w());
       return;
    }
}
