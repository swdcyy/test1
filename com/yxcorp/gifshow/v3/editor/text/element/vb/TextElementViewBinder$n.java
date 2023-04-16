package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$n;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$n$a;
import t36.f$a;
import t36.f;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import tkd.b;
import tkd.d;
import wpc.b0;
import android.view.MotionEvent;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import crd.a;
import brd.a0;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import wuc.g;
import crd.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import wuc.j;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;

public final class TextElementViewBinder$n extends DecorationContainerView$e	// class@00140e
{
    public final TextElementViewBinder a;

    public void TextElementViewBinder$n(TextElementViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TextElementViewBinder$n.class, "1")) {
          return;
       }
       super.a();
       TextElementViewBinder d = this.a.D;
       if (d != null) {
          d.s0(TextElementViewBinder$n$a.a);
       }
       return;
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "14")) {
       }else {
          super.b(p0);
          if (p0 != null) {
             TextDrawerLayout textDrawerLa = p0.getTextDrawerLayout();
             if (textDrawerLa != null) {
                textDrawerLa.setAcceptEvent(true);
             }
          }
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "12")) {
       }else {
          super.c(p0);
          this.a.Q(p0);
          Object[] objArray = new Object[0];
          a.D().w("TextElementViewBinder", "onSingleFingerScaleAndRotateStart decorationDrawer:"+p0, objArray);
       }
       return;
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextElementViewBinder$n.class, "4")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.d(p0, p1);
          int i = 0;
          if (a.g(p1, Integer.valueOf(19))) {
             this.a.A.d1(p0);
          }else {
             int i1 = 1;
             if (a.g(p1, Integer.valueOf(10)) ^ i1) {
                Object obj = null;
                if (this.a.A.u0(p0.getLayerIndex())) {
                   TextElementViewModel.w0(this.a.A, p0, i, 2, obj);
                }
                TextElementViewBinder.F(this.a, i, i1, obj);
             }
          }
          d.a(0x14ddc3fe).lm(p0);
          p1 = new Object[i];
          a.D().w("TextElementViewBinder", "onDelete decorationDrawer:"+p0+", payload:"+p1, p1);
       }
       return;
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "7")) {
       }else {
          super.h(p0);
          if (p0 != null) {
             TextDrawerLayout textDrawerLa = p0.getTextDrawerLayout();
             if (textDrawerLa != null) {
                textDrawerLa.setAcceptEvent(true);
             }
          }
          d.a(0x14ddc3fe).ex(p0);
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "13")) {
       }else {
          super.i(p0);
          this.a.Q(p0);
          Object[] objArray = new Object[0];
          a.D().w("TextElementViewBinder", "onDoubleFingerScaleAndRotateStart decorationDrawer:"+p0, objArray);
       }
       return;
    }
    public void k(BaseDrawer p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextElementViewBinder$n.class, "6")) {
       }else {
          super.k(p0, p1);
          TextElementViewBinder$n ta = this.a;
          if (ta.H == null) {
             int i = 0;
             if (!ta.P() && this.a.J().getSelectDrawer() != null) {
                this.a.J().R();
             }else if(p0 != null){
                p0.getTextDrawerLayout().setAcceptEvent(i);
                StringBuilder str = 1;
                ta = (!(p0.getText()).length())? 1: null;
                if (ta) {
                   this.a.J().R();
                }else {
                   TextElementViewBinder.F(this.a, i, str, null);
                }
             }
             Object[] objArray = new Object[i];
             a.D().w("TextElementViewBinder", "onSingleTapBlankScreen decorationDrawer:"+p0, objArray);
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "9")) {
       }else {
          super.l(p0);
          Object obj = null;
          boolean b = false;
          int i = 1;
          if (p0 != null) {
             p0.getTextDrawerLayout().setAcceptEvent(b);
             this.a.A.m1(p0);
             TextElementViewBinder$n on = (!(p0.getText()).length())? 1: null;
             if (on) {
                this.a.G(p0);
                if (PostExperimentUtils.t1() && (!PostExperimentUtils.u1() || this.a.G == null)) {
                   on = this.a;
                   if (on.H == null) {
                      on.J().j0(p0.getLayerIndex(), obj);
                   }
                }
             }
             on = this.a;
             if (on.F != null) {
                on.K().c(this.a.A.D1().G(d.a).R(Functions.d(), g.b));
             }
          }
          TextElementViewBinder.F(this.a, b, i, obj);
          d.a(0x14ddc3fe).lm(p0);
          Object[] objArray = new Object[b];
          a.D().w("TextElementViewBinder", "onUnSelect decorationDrawer:"+p0, objArray);
       }
       return;
    }
    public void m(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextElementViewBinder$n.class, "5")) {
          return;
       }
       super.m(p0, p1);
       if (p1 != null) {
          p0 = p1.iterator();
          while (p0.hasNext()) {
             this.a.A.d1(p0.next());
          }
       }
       return;
    }
    public void o(List p0,Object p1,int p2){
       if (PatchProxy.isSupport(TextElementViewBinder$n.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TextElementViewBinder$n.class, "3")) {
          return;
       }
       super.o(p0, p1, p2);
       if (p2 == -1) {
          return;
       }
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().getLayerIndex() == p2) {
                if (this.a.e.a()) {
                   p1 = this.a.d;
                   if (p1 != null && !p1.Ch()) {
                      p1 = 1;
                   label_0052 :
                      if (!p1) {
                         this.a.V();
                      }
                   }
                }
                p1 = null;
                goto label_0052 ;
             }
          }
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "10")) {
       }else {
          super.p(p0);
          this.a.Q(p0);
          Object[] objArray = new Object[0];
          a.D().w("TextElementViewBinder", "onSingleFingerMoveStart decorationDrawer:"+p0, objArray);
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       return p0 instanceof EditTextBaseElement;
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextElementViewBinder$n.class, "2")) {
       }else {
          super.t(p0, p1);
          int i = 0;
          if (a.g(p1, Integer.valueOf(3)) || (a.g(p1, Integer.valueOf(20)) && p0 != null)) {
             if (this.a.e.a()) {
                p1 = this.a.d;
                if (p1 != null && !p1.Ch()) {
                   p1 = 1;
                label_0043 :
                   if (!p1) {
                      this.a.V();
                   }
                }
             }
             p1 = null;
             goto label_0043 ;
          }
       label_004a :
          Object[] objArray = new Object[i];
          a.D().w("TextElementViewBinder", "onAdd decorationDrawer:"+p0, objArray);
       }
       return;
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "8")) {
       }else {
          super.v(p0);
          Object[] objArray = new Object[0];
          a.D().w("TextElementViewBinder", "onSelectedTap decorationDrawer:"+p0, objArray);
          TextElementViewBinder d = this.a.d;
          if (d != null && !d.Ch()) {
             d = this.a.d;
             if (d != null) {
                d.Dh();
             }
          }
          this.a.V();
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$n.class, "11")) {
       }else {
          super.y(p0);
          if (p0 != null) {
             TextDrawerLayout textDrawerLa = p0.getTextDrawerLayout();
             if (textDrawerLa != null) {
                textDrawerLa.setAcceptEvent(true);
             }
          }
       }
       return;
    }
}
