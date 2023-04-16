package com.yxcorp.gifshow.v3.editor.cover.q0$c;
import voc.y;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import voc.x;
import android.view.ViewGroup;
import ppc.n0;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.cover.q0$g;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$d;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter$Action;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.cover.r0;
import erd.r;
import com.yxcorp.gifshow.v3.editor.cover.q0$a;
import com.yxcorp.gifshow.v3.editor.cover.q0$e;
import android.graphics.Bitmap;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import ppc.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.cover.h;
import ok.h;
import com.google.common.collect.Lists;
import hba.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.cover.q0$c$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class q0$c implements y	// class@000ebd
{
    public final q0 b;

    public void q0$c(q0 p0){
       this.b = p0;
       super();
    }
    public void Md(){
       if (PatchProxy.applyVoid(null, this, q0$c.class, "8")) {
          return;
       }
       q0$c tb = this.b;
       if (tb.Y0 != null) {
          q0 v = tb.v;
          if (v != null) {
             v.setVisibility(0);
          }
       }
       return;
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, q0$c.class, "3")) {
          return;
       }
       this.b.t.setVisibility(8);
       this.b.u.setVisibility(0);
       this.b.u.post(new n0(this));
       return;
    }
    public void c2(){
       if (PatchProxy.applyVoid(null, this, q0$c.class, "1")) {
          return;
       }
       this.b.t.setVisibility(0);
       this.b.u.setVisibility(8);
       return;
    }
    public void o4(){
       if (PatchProxy.applyVoid(null, this, q0$c.class, "7")) {
          return;
       }
       q0 v = this.b.v;
       if (v != null) {
          v.setVisibility(8);
       }
       return;
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q0$c.class, "5")) {
          return;
       }
       this.b.Y.R();
       q0$c tb = this.b;
       q0 b1 = tb.b1;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(b1, tb, q0.class, "19") && b1 != null) {
          tb.R = Integer.valueOf(tb.b1.b);
          tb.X0 = tb.b1.d;
          tb.S = Boolean.valueOf(tb.b1.e);
          tb.Z0 = tb.b1.f;
          tb.a1 = tb.b1.a;
          tb.X8(true, true);
          tb.w.P();
          tb.w.V(tb.R.intValue());
          tb.w.N(tb.i1);
       }
       tb = this.b;
       tb.b1 = objArray;
       tb.d1.j();
       this.b.H.j();
       this.b.N.onNext(ReEditCoverPresenter$Action.DISCARD);
       this.b.Y.f0(r0.b, Integer.valueOf(10));
       return;
    }
    public void x9(){
       q0$c tb;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q0$c.class, "6")) {
          return;
       }
       this.b.b1 = new q0$g(objArray);
       q0$g q0 a1 = this.b.a1;
       if (a1 != null) {
          q0$e a = a1.a;
          if (a != null && !a.isRecycled()) {
             this.b.b1.a = new q0$e(objArray);
             tb = this.b;
             a1 = tb.b1.a;
             a1 = tb.a1;
             a1.b = a1.b;
             a1.a = a1.a;
          }
       }
       tb = this.b;
       tb.b1.d = tb.X0;
       tb = this.b;
       tb.b1.b = tb.R.intValue();
       tb = this.b;
       tb.b1.e = tb.S.booleanValue();
       tb = this.b;
       tb.b1.f = tb.Z0;
       return;
    }
    public void yd(){
       Object[] objArray = null;
       StringBuilder str = "4";
       if (PatchProxy.applyVoid(objArray, this, q0$c.class, str)) {
          return;
       }
       q0$c tb = this.b;
       tb.b1 = objArray;
       VideoContext videoContext = tb.J.d1();
       List list = this.b.y.V9();
       String str1 = PatchProxy.applyOneRefs(list, objArray, k.class, str);
       if (str1 != PatchProxyResult.class) {
       }else if(list == null || !list.size()){
          str1 = "";
       }else {
          int i = list.size();
          str = "";
          int i1 = 0;
          while (i1 < i) {
             str = str+list.get(i1);
             int i2 = i - 1;
             if (i1 != i2) {
                str = str+"_";
             }
             i1 = i1 + 1;
          }
          str1 = str;
       }
       videoContext.C0(str1);
       q0$c tb1 = this.b;
       q0$c tb2 = this.b;
       this.b.J.d1().D0(k.b(tb1.d1, tb1.J.W0(), tb2.O, Lists.h(this.b.y.V9(), h.b), tb2.y.k8()));
       return;
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, q0$c.class, "2")) {
          return;
       }
       this.b.Y.getViewTreeObserver().addOnGlobalLayoutListener(new q0$c$a(this));
       return;
    }
}
