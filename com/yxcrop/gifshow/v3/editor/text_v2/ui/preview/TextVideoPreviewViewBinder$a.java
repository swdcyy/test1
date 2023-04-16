package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import mod.a;
import xld.c;
import kod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleStartAction;
import xvc.b;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import kotlin.jvm.internal.a;
import tnd.c;
import java.util.Objects;
import k2b.e0;
import com.yxcrop.gifshow.v3.editor.text_v2.action.DeleteTextActionV3;
import wnd.j;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationSelectAction;
import android.view.MotionEvent;
import xld.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationUnSelectAction;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveStartAction;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationScaleEndAction;
import wnd.b;

public final class TextVideoPreviewViewBinder$a extends DecorationContainerView$e	// class@000b28
{
    public final TextVideoPreviewViewBinder a;
    public final Fragment b;

    public void TextVideoPreviewViewBinder$a(TextVideoPreviewViewBinder p0,Fragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void A(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "14")) {
          return;
       }
       TextVideoPreviewViewBinder$a ta = this.a;
       ta.m0(p0, ta.s0().o0().y());
       this.a.s0().t0(new DecorationScaleStartAction());
       return;
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "11")) {
       }else {
          super.b(p0);
          this.z(p0);
          this.a.L();
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "10")) {
       }else {
          super.c(p0);
          this.A(p0);
          this.a.I();
       }
       return;
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextVideoPreviewViewBinder$a.class, "8")) {
       }else {
          super.d(p0, p1);
          if (a.g(p1, "auto_delete") ^ 0x01) {
             TextVideoPreviewViewBinder$a tb = this.b;
             Objects.requireNonNull(tb, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             c.a.c(tb);
          }
          if (p0 != null) {
             this.a.s0().t0(new DeleteTextActionV3(p0.getLayerIndex(), -1, this.a.s0().o0().w()));
             j.a.e(this.b, this.a.S());
          }
       }
       return;
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "2")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.h(p0);
          if (p0 instanceof NewEditTextElement) {
             p0.getTextDrawerLayout().setAcceptEvent(true);
          }
          this.a.s0().t0(new DecorationSelectAction(p0.getLayerIndex()));
          TextVideoPreviewViewBinder$a tb = this.b;
          Objects.requireNonNull(tb, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          c.a.g(tb);
          this.a.I();
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "12")) {
       }else {
          super.i(p0);
          this.A(p0);
          this.a.I();
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextVideoPreviewViewBinder$a.class, "5")) {
       }else {
          super.k(p0, p1);
          if (this.a.s0().o0().y().f()) {
             this.a.M();
             TextVideoPreviewViewBinder$a tb = this.b;
             Objects.requireNonNull(tb, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
             c.a.f(tb);
          }else if(!this.a.s0().o0().E().d() && (p0 != null && !p0.isSubtitle())){
             this.a.S().R();
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "4")) {
       }else {
          super.l(p0);
          if (p0 != null) {
             if (p0 instanceof NewEditTextElement) {
                p0.getTextDrawerLayout().setAcceptEvent(false);
             }
             this.a.s0().t0(new DecorationUnSelectAction(false, 1, null));
          }
          this.a.L();
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "6")) {
       }else {
          super.p(p0);
          TextVideoPreviewViewBinder$a ta = this.a;
          ta.m0(p0, ta.s0().o0().y());
          this.a.s0().t0(new DecorationMoveStartAction());
          this.a.q0(false);
          this.a.e0();
          TextView textView = this.a.Y();
          if (textView != null && !textView.getVisibility()) {
             this.a.Y().setVisibility(8);
          }
          this.a.I();
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof NewEditTextElement && !p0.isSubtitle())? true: false;
       return b;
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextVideoPreviewViewBinder$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.t(p0, p1);
          if (!p0.isInitFromDraft()) {
             this.a.G();
             p1 = this.a;
             p1.H = new a(this, p0);
             p1.S().post(this.a.H);
          }
       }
       return;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "3")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          if (!this.a.s0().o0().E().d()) {
             this.a.r0();
          }
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "13")) {
       }else {
          super.x(p0);
          this.z(p0);
          this.a.L();
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "7")) {
       }else {
          super.y(p0);
          TextVideoPreviewViewBinder$a ta = this.a;
          ta.l0(p0, ta.s0().o0().y());
          if (p0 != null) {
             DecorationMoveEndAction uDecorationM = new DecorationMoveEndAction(p0.getLayerIndex(), false, false, p0.getMoveX(), p0.getMoveY(), this.a.s0().o0().w());
             this.a.s0().t0(v8);
             this.a.q0(true);
          }
          this.a.L();
       }
       return;
    }
    public final void z(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$a.class, "15")) {
          return;
       }
       TextVideoPreviewViewBinder$a ta = this.a;
       ta.l0(p0, ta.s0().o0().y());
       if (p0 != null) {
          DecorationScaleEndAction uDecorationS = new DecorationScaleEndAction(p0.getLayerIndex(), false, p0.getScale(), p0.getAdditionalScale(), this.a.s0().o0().w());
          this.a.s0().t0(v7);
       }
       b.d(this.a.S(), this.a.s0(), false, this.a.s0().o0().w());
       return;
    }
}
