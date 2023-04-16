package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.CommentTKActionBarPresenter$mActionBarCloseCallback$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.CommentTKActionBarPresenter;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class CommentTKActionBarPresenter$mActionBarCloseCallback$1 extends Lambda implements l	// class@00155b
{
    public final CommentTKActionBarPresenter this$0;

    public void CommentTKActionBarPresenter$mActionBarCloseCallback$1(CommentTKActionBarPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       if (PatchProxy.isSupport(CommentTKActionBarPresenter$mActionBarCloseCallback$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommentTKActionBarPresenter$mActionBarCloseCallback$1.class, "1")) {
          return;
       }
       CommentTKActionBarPresenter$mActionBarCloseCallback$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       CommentTKActionBarPresenter uCommentTKAc = PatchProxy.apply(null, tthis$0, CommentTKActionBarPresenter.class, "7");
       if (uCommentTKAc != PatchProxyResult.class) {
       }else {
          uCommentTKAc = tthis$0.t;
          if (uCommentTKAc == null) {
             a.S("mCommentActionbarClosePublisher");
          }
       }
       uCommentTKAc.onNext(Boolean.TRUE);
       return;
    }
}
