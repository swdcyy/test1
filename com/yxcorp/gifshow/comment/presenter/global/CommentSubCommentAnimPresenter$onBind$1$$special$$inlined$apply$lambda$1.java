package com.yxcorp.gifshow.comment.presenter.global.CommentSubCommentAnimPresenter$onBind$1$$special$$inlined$apply$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import el9.l0$c;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import el9.l0;
import ek9.m1;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class CommentSubCommentAnimPresenter$onBind$1$$special$$inlined$apply$lambda$1 extends Lambda implements a	// class@0010e9
{
    public final l0$c this$0;

    public void CommentSubCommentAnimPresenter$onBind$1$$special$$inlined$apply$lambda$1(l0$c p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, CommentSubCommentAnimPresenter$onBind$1$$special$$inlined$apply$lambda$1.class, "1")) {
          return;
       }
       if (this.this$0.b.r != null) {
          Object[] objArray = new Object[0];
          m1.C().w("CommentSubCommentAnimPresenter", "post clear itemAnimator", objArray);
          l0.P8(this.this$0.b).h0().removeCallbacks(this.this$0.b.s);
          l0.P8(this.this$0.b).h0().post(this.this$0.b.s);
       }
       PatchProxy.onMethodExit(CommentSubCommentAnimPresenter$onBind$1$$special$$inlined$apply$lambda$1.class, "1");
       return;
    }
}
