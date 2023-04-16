package com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$mNoMoreView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$mNoMoreTextView$2;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$mEmptyView$2;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.gifshow.designercreation.feed.helper.DesignerTemplateTipsHelper$a;
import android.view.View$OnClickListener;
import g9c.d;
import java.lang.Throwable;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.f;
import e17.i;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import xa5.a;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.util.Objects;

public final class DesignerTemplateTipsHelper extends e	// class@0012e0
{
    public final p i;
    public final p j;
    public final p k;

    public void DesignerTemplateTipsHelper(ProfileCreationTemplateFragment p0){
       a.p(p0, "fragment");
       super(p0);
       this.i = s.c(new DesignerTemplateTipsHelper$mNoMoreView$2(this));
       this.j = s.c(new DesignerTemplateTipsHelper$mNoMoreTextView$2(this));
       this.k = s.c(new DesignerTemplateTipsHelper$mEmptyView$2(this));
    }
    public final View A(){
       Object obj = PatchProxy.apply(null, this, DesignerTemplateTipsHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, DesignerTemplateTipsHelper.class, "4")) {
          return;
       }
       this.x();
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.p(new DesignerTemplateTipsHelper$a(this));
       uoa.j(2);
       uoa.h(R.string.arg_RES_7f1038e4);
       uoa.a(this.y());
       if (!this.c.U0(this.y())) {
          this.w(this.y());
          this.c.P0(this.y());
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       DesignerTemplateTipsHelper uDesignerTem = DesignerTemplateTipsHelper.class;
       if (PatchProxy.isSupport(uDesignerTem) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uDesignerTem, "5")) {
          return;
       }
       a.p(p1, "error");
       if (p0) {
          this.i();
       }else {
          a.o(i.g(R.style.arg_RES_7f110668, f.o(R.string.arg_RES_7f1038e5), true, true), "KSToast.applyStyle\(\n    ¡­rue,\n        true\n      \)");
       }
       return;
    }
    public void p(){
       int i1;
       DesignerTemplateTipsHelper uDesignerTem = DesignerTemplateTipsHelper.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDesignerTem, "6")) {
          return;
       }
       this.z().setMovementMethod(LinkMovementMethod.getInstance());
       this.z().setText(R.string.arg_RES_7f101bc7);
       ViewGroup$LayoutParams layoutParams = this.z().getLayoutParams();
       a.o(layoutParams, "mNoMoreTextView.layoutParams");
       int i = 0;
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.setMargins(i, i, i, i);
       }
       this.z().setLayoutParams(layoutParams);
       this.z().setPadding(a1.e(3.00f), a1.e(16.00f), a1.e(3.00f), a1.e(16.00f));
       Object obj = PatchProxy.apply(objArray, this, uDesignerTem, "8");
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else if(a.g(this.d)){
          i = a1.d(R.dimen.arg_RES_7f070bf1);
       }
       i1 = i;
       if (this.A().getPaddingBottom() != i1) {
          this.A().setPadding(this.A().getPaddingLeft(), this.A().getPaddingTop(), this.A().getPaddingRight(), i1);
       }
       if (!this.c.T0(this.A())) {
          this.w(this.A());
          this.c.L0(this.A());
       }
       return;
    }
    public final void w(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DesignerTemplateTipsHelper.class, "7")) {
          return;
       }
       if (p0 != null && p0.getParent() instanceof ViewGroup) {
          ViewParent parent = p0.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.removeView(p0);
       }
       return;
    }
    public final View y(){
       Object obj = PatchProxy.apply(null, this, DesignerTemplateTipsHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final TextView z(){
       Object obj = PatchProxy.apply(null, this, DesignerTemplateTipsHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
