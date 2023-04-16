package end.e$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import end.e;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hnd.f;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationScaleProcessAction;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import xvc.b;
import mod.a;
import kod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleStartAction;
import java.util.List;
import java.util.Collection;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.text_v2.action.DeleteTextActionV3;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectActionV3;
import android.view.MotionEvent;
import tod.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUnSelectAction;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationMoveProcessAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveStartAction;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationMoveProcessSdkAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationScaleProcessSdkAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleEndAction;
import wnd.b;

public final class e$a extends DecorationContainerView$e	// class@000da7
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public final void A(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "17")) {
          return;
       }
       if (p0 != null) {
          DecorationScaleProcessAction uDecorationS = new DecorationScaleProcessAction(p0.getLayerIndex(), false, p0.getScale(), (this.a.s0().o0().E() ^ 0x01), true);
          this.a.s0().t0(v7);
       }
       return;
    }
    public final void B(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "16")) {
          return;
       }
       e$a ta = this.a;
       ta.m0(p0, ta.s0().o0().C());
       this.a.s0().t0(new DecorationScaleStartAction());
       return;
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "12")) {
       }else {
          super.b(p0);
          this.z(p0);
          this.a.L();
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "10")) {
       }else {
          super.c(p0);
          this.B(p0);
          this.a.I();
       }
       return;
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "8")) {
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
             if (this.a.s0().o0().C().e()) {
                this.a.M();
             }
          }
       }
       return;
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.h(p0);
          this.a.s0().t0(new DecorationSelectActionV3(p0.getLayerIndex()));
          this.a.I();
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "13")) {
       }else {
          super.i(p0);
          this.B(p0);
          this.a.I();
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "4")) {
       }else {
          super.k(p0, p1);
          if (this.a.s0().o0().C().f()) {
             this.a.M();
             a.a.b(true);
          }else if(!this.a.h0() && (p0 != null && p0.isSubtitle() == true)){
             this.a.S().R();
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
       }else {
          super.l(p0);
          if (p0 != null) {
             this.a.s0().t0(new DecorationUnSelectAction(this.a.s0().o0().E()));
          }
          this.a.L();
       }
       return;
    }
    public void n(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "6")) {
       }else {
          super.n(p0);
          if (p0 != null) {
             DecorationMoveProcessAction uDecorationM = new DecorationMoveProcessAction(p0.getLayerIndex(), false, p0.getMoveX(), p0.getMoveY(), this.a.s0().o0().w(), true);
             this.a.s0().t0(v8);
          }
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "5")) {
       }else {
          super.p(p0);
          e$a ta = this.a;
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
       Object obj = PatchProxy.applyOneRefs(p0, this, e$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof NewEditTextV3Element && p0.isSubtitle())? true: false;
       return b;
    }
    public void s(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "14")) {
       }else {
          super.s(p0);
          this.A(p0);
       }
       return;
    }
    public void u(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "11")) {
       }else {
          super.u(p0);
          this.A(p0);
       }
       return;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          this.a.r0();
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "15")) {
       }else {
          super.x(p0);
          this.z(p0);
          this.a.L();
       }
       return;
    }
    public void y(BaseDrawer p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e$a.class, "7")) {
       }else {
          super.y(obj1);
          e$a a = obj.a;
          a.l0(obj1, a.s0().o0().C());
          if (obj1 != null) {
             DecorationMoveProcessSdkAction uDecorationM = new DecorationMoveProcessSdkAction(obj1.getLayerIndex(), true, obj1.getMoveX(), obj1.getMoveY(), obj.a.s0().o0().w());
             obj.a.s0().t0(v9);
             DecorationMoveEndAction uDecorationM1 = new DecorationMoveEndAction(obj1.getLayerIndex(), true, false, obj1.getMoveX(), obj1.getMoveY(), (obj.a.s0().o0().E() ^ 0x01));
             obj.a.s0().t0(uDecorationM);
             obj.a.q0(true);
          }
          obj.a.L();
       }
       return;
    }
    public final void z(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "18")) {
          return;
       }
       e$a ta = this.a;
       ta.l0(p0, ta.s0().o0().C());
       if (p0 != null) {
          this.a.s0().t0(new DecorationScaleProcessSdkAction(p0.getLayerIndex(), 1, p0.getScale(), (this.a.s0().o0().E() ^ 1)));
          DecorationScaleEndAction uDecorationS = new DecorationScaleEndAction(p0.getLayerIndex(), true, p0.getScale(), p0.getAdditionalScale(), (this.a.s0().o0().E() ^ 0x01));
          this.a.s0().t0(v8);
       }
       b.d(this.a.S(), this.a.s0(), 1, this.a.s0().o0().w());
       return;
    }
}
