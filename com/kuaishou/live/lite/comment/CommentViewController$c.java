package com.kuaishou.live.lite.comment.CommentViewController$c;
import com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager$a;
import com.kuaishou.live.lite.comment.CommentViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.lite.comment.view.CommentMessageListAdapter;
import java.util.List;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import kotlin.collections.CollectionsKt__CollectionsKt;
import w93.a;
import java.util.Objects;
import java.lang.Runnable;
import e93.f;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView;

public final class CommentViewController$c implements CommentLinearLayoutManager$a	// class@0007d8
{
    public final CommentViewController a;

    public void CommentViewController$c(CommentViewController p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommentViewController$c.class, "1")) {
          return;
       }
       if (CommentViewController.W2(this.a).E() == CollectionsKt__CollectionsKt.G(CommentViewController.V2(this.a).L0())) {
          this.a.q.b();
       }else {
          CommentViewController$c ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, CommentViewController.class, "8")) {
             f.f(ta.C);
             CommentViewController w = ta.w;
             if (w == null) {
                a.S("recyclerView");
             }
             if (!w.x()) {
                f.i("Comment.scrollToBottom", ta.C, ta);
             }
          }
       }
       return;
    }
}
