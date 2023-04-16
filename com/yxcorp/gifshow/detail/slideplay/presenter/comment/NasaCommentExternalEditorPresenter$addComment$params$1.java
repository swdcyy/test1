package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kuaishou.android.model.mix.QComment;
import m9a.t$c;
import java.lang.Object;
import ek9.a$a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1$a;
import com.yxcorp.gifshow.comment.e$c;

public final class NasaCommentExternalEditorPresenter$addComment$params$1 extends Lambda implements l	// class@00184d
{
    public final QComment $comment;
    public final t$c $emojiEmotion;
    public final BaseEditorFragment$g $event;
    public final NasaCommentExternalEditorPresenter this$0;

    public void NasaCommentExternalEditorPresenter$addComment$params$1(NasaCommentExternalEditorPresenter p0,BaseEditorFragment$g p1,QComment p2,t$c p3){
       this.this$0 = p0;
       this.$event = p1;
       this.$comment = p2;
       this.$emojiEmotion = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaCommentExternalEditorPresenter$addComment$params$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       NasaCommentExternalEditorPresenter$addComment$params$1 t$event = this.$event;
       boolean b = false;
       BaseEditorFragment$g b1 = (t$event != null)? t$event.b: false;
       NasaCommentExternalEditorPresenter q = this.this$0.q;
       if (q == null) {
          a.S("mPhoto");
       }
       p0 = p0.o(q, b);
       p0.e(true);
       p0.p(true);
       p0 = p0.k(this.$comment);
       p0.d(b1);
       t$event = this.$event;
       if (t$event != null && t$event.s != null) {
          b = true;
       }
       p0.m(b);
       p0.n(new NasaCommentExternalEditorPresenter$addComment$params$1$a(this));
       return;
    }
}
