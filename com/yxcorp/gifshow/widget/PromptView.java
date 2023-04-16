package com.yxcorp.gifshow.widget.PromptView;
import tyc.b2;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import com.kwai.library.widget.specific.misc.KwaiLoadingCircle;
import a2.m0;
import a2.i0;
import com.yxcorp.gifshow.widget.PromptView$a;
import java.lang.Runnable;
import tyc.n3;
import android.widget.TextView;
import java.lang.CharSequence;
import lnc.a1;
import com.yxcorp.utility.n;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;

public final class PromptView extends FrameLayout implements b2	// class@0018a4
{
    public HashMap b;

    public void PromptView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public void PromptView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
    }
    public void PromptView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1, p2);
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(PromptView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PromptView.class, "2")) {
          return;
       }
       KwaiLoadingCircle kwaiLoadingC = this.c(R.id.edit_loading_view);
       if (kwaiLoadingC != null) {
          kwaiLoadingC.g();
       }
       m0 om0 = i0.c(this);
       om0.k((- (float)(this.getTop() + this.getMeasuredHeight())));
       om0.d(150);
       om0.l(new PromptView$a(this));
       om0.j();
       return;
    }
    public void b(n3 p0,boolean p1){
       if (PatchProxy.isSupport(PromptView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PromptView.class, "1")) {
          return;
       }
       a.p(p0, "options");
       if (this.getContext() == null) {
          return;
       }
       TextView textView = this.c(R.id.edit_prompt_txt);
       a.o(textView, "edit_prompt_txt");
       textView.setText(p0.c);
       int i = -1;
       this.c(R.id.edit_prompt_txt).setTextColor(i);
       int i1 = 0x7f0a0c82;
       KwaiLoadingCircle kwaiLoadingC = this.c(i1);
       if (kwaiLoadingC != null) {
          kwaiLoadingC.e();
       }
       kwaiLoadingC = this.c(i1);
       if (kwaiLoadingC != null) {
          kwaiLoadingC.setProgressColor(i);
       }
       this.c(i1).setProgressWidth(a1.e(0x3fa3d70a));
       this.setVisibility(0);
       this.setTranslationY((- (float)(this.getTop() + this.getMeasuredHeight())));
       m0 om0 = i0.c(this);
       om0.k(((float)n.A(this.getContext()) + 0));
       om0.d(150);
       om0.j();
       return;
    }
    public View c(int p0){
       View obj;
       if (PatchProxy.isSupport(PromptView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PromptView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.b == null) {
          this.b = new HashMap();
       }
       obj = this.b.get(Integer.valueOf(p0));
       if (obj == null) {
          obj = this.findViewById(p0);
          this.b.put(Integer.valueOf(p0), obj);
       }
       return obj;
    }
}
