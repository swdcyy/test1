package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$c;
import y8c.r;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment;
import kotlin.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.a;
import crd.b;
import lnc.b9;
import nl8.p;
import mhc.p1;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import ra6.a;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import android.content.res.Resources;
import java.lang.Integer;
import msd.q;
import qrd.l1;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$c$a;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.share.widget.m;
import erd.g;
import brd.t;

public final class ForwardGridSectionRefactorFragment$c extends r	// class@001cd9
{
    public b i;
    public Animator j;
    public AnimatorSet k;
    public final Pair l;
    public final ForwardGridSectionRefactorFragment m;

    public void ForwardGridSectionRefactorFragment$c(ForwardGridSectionRefactorFragment p0,Pair p1){
       this.m = p0;
       super();
       this.l = p1;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionRefactorFragment$c.class, "3")) {
          return;
       }
       ForwardGridSectionRefactorFragment$c tj = this.j;
       if (tj != null) {
          tj.cancel();
       }
       tj = this.k;
       if (tj != null) {
          tj.cancel();
       }
       tj = this.i;
       if (tj == null) {
          a.S("animationDisposable");
       }
       b9.a(tj);
       return;
    }
    public void z(){
       ForwardGridSectionRefactorFragment$c uoc = ForwardGridSectionRefactorFragment$c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "1")) {
          return;
       }
       p1 op1 = this.t();
       if (op1 != null) {
          View view = this.y();
          if (view != null) {
             KwaiImageView kwaiImageVie = view.findViewById(R.id.share_to_button);
             String str = op1.o();
             int i = 0;
             int i1 = 1;
             int i2 = (str == null || !str.length())? 1: 0;
             if (i2) {
                kwaiImageVie.setImageResource(op1.k());
             }else {
                kwaiImageVie.L(op1.o());
             }
             TextView textView = view.findViewById(R.id.share_to_text);
             String str1 = "textView";
             if (!a.e() || KwaiOp.FORWARD_IMFRIEND == op1.M()) {
                a.o(textView, str1);
                textView.setMaxLines(i1);
             }else {
                a.o(textView, str1);
                textView.setMaxLines(2);
             }
             if (this.m.I != null) {
                textView.setTextColor(this.u().getColor(R.color.arg_RES_7f061fa5));
             }
             String text = op1.getText();
             if (text == null || !text.length()) {
                i = 1;
             }
             if (i) {
                textView.setText(op1.e());
             }else {
                textView.setText(op1.getText());
             }
             ForwardGridSectionRefactorFragment e = this.m.E;
             if (e != null) {
                a.o(kwaiImageVie, "imageView");
                l1 ol1 = e.invoke(op1, kwaiImageVie, Integer.valueOf(this.F()));
             }
             view.setOnClickListener(new ForwardGridSectionRefactorFragment$c$a(this, op1));
             a.o(kwaiImageVie, "imageView");
             if (!PatchProxy.applyVoidTwoRefs(view, kwaiImageVie, this, uoc, "4")) {
                b uob = this.m.Kh().subscribe(new m(this, view, kwaiImageVie));
                a.o(uob, "animationSubject.subscri¡­art\(\) }\n        }\n      }");
                this.i = uob;
             }
          }
       }
       return;
    }
}
