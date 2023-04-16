package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1$a$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1$a$a;
import w4.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1$a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.airbnb.lottie.LottieAnimationView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import g7a.t;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import bz6.c;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;

public final class NasaCommentExternalEditorPresenter$addComment$params$1$a$a$a implements Runnable	// class@00184a
{
    public final NasaCommentExternalEditorPresenter$addComment$params$1$a$a b;
    public final e c;

    public void NasaCommentExternalEditorPresenter$addComment$params$1$a$a$a(NasaCommentExternalEditorPresenter$addComment$params$1$a$a p0,e p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       ViewGroup$MarginLayoutParams marginLayout;
       if (PatchProxy.applyVoid(null, this, NasaCommentExternalEditorPresenter$addComment$params$1$a$a$a.class, "1")) {
          return;
       }
       this.b.a.a.this$0.R8();
       NasaCommentExternalEditorPresenter$addComment$params$1 this$0 = this.b.a.a.this$0;
       NasaCommentExternalEditorPresenter$addComment$params$1$a$a$a tc = this.c;
       Objects.requireNonNull(this$0);
       NasaCommentExternalEditorPresenter nasaCommentE = NasaCommentExternalEditorPresenter.class;
       if (!PatchProxy.applyVoidOneRefs(tc, this$0, nasaCommentE, "24")) {
          LottieAnimationView lottieAnimat = PatchProxy.applyOneRefs(tc, this$0, nasaCommentE, "25");
          if (lottieAnimat != PatchProxyResult.class) {
          }else {
             lottieAnimat = new LottieAnimationView(this$0.getContext());
             lottieAnimat.setComposition(tc);
          }
          if (!PatchProxy.applyVoidOneRefs(lottieAnimat, this$0, nasaCommentE, "26")) {
             NasaCommentExternalEditorPresenter b = this$0.B;
             if (b != null) {
                this$0.S8(b);
             }
             this$0.B = lottieAnimat;
             if (lottieAnimat != null) {
                lottieAnimat.a(new t(this$0));
             }
             View view = this$0.m8();
             Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
             if (!view.getWidth()) {
                marginLayout = c.a.c(view, -1, -2);
             }else {
                int width = view.getWidth();
                marginLayout = c.a.c(view, width, (int)((float)width * 0x3f1bd37a));
             }
             marginLayout.bottomMargin = a1.d(0x7f07030d);
             view.addView(this$0.B, marginLayout);
             NasaCommentExternalEditorPresenter b1 = this$0.B;
             if (b1 != null) {
                b1.s();
             }
          }
       }
    label_00a5 :
       return;
    }
}
