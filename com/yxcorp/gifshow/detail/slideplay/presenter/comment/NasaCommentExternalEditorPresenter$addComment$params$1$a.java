package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1$a;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import com.yxcorp.gifshow.comment.e$g;
import m9a.t$c;
import bk5.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1$a$a;
import android.content.Context;
import com.yxcorp.gifshow.detail.util.e$b;
import crd.b;
import com.yxcorp.gifshow.detail.util.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ek9.d1;

public final class NasaCommentExternalEditorPresenter$addComment$params$1$a implements e$c	// class@00184c
{
    public final NasaCommentExternalEditorPresenter$addComment$params$1 a;

    public void NasaCommentExternalEditorPresenter$addComment$params$1$a(NasaCommentExternalEditorPresenter$addComment$params$1 p0){
       this.a = p0;
       super();
    }
    public void a(QComment p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NasaCommentExternalEditorPresenter$addComment$params$1$a.class, "2")) {
          return;
       }
       a.p(p0, "comment");
       a.p(p1, "error");
       p0.A = false;
       return;
    }
    public void b(QComment p0,e$g p1){
       t$c a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NasaCommentExternalEditorPresenter$addComment$params$1$a.class, "1")) {
          return;
       }
       a.p(p0, "comment");
       a.p(p1, "intercept");
       NasaCommentExternalEditorPresenter$addComment$params$1$a ta = this.a;
       p1.A = false;
       a = ta.$emojiEmotion.a;
       if (a != null && !TextUtils.isEmpty(a.b)) {
          this.a.this$0.X7(e.a(a.b(), this.a.$emojiEmotion.a.b, new NasaCommentExternalEditorPresenter$addComment$params$1$a$a(this)));
       }
       return;
    }
    public void c(){
       d1.b(this);
    }
    public void d(QComment p0,Throwable p1){
       d1.d(this, p0, p1);
    }
}
