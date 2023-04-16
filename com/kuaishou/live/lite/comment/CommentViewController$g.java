package com.kuaishou.live.lite.comment.CommentViewController$g;
import java.lang.Runnable;
import com.kuaishou.live.lite.comment.CommentViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.comment.view.CommentMessageListAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.recyclerview.widget.RecyclerView;

public final class CommentViewController$g implements Runnable	// class@0007de
{
    public final CommentViewController b;

    public void CommentViewController$g(CommentViewController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CommentViewController$g.class, "1")) {
          return;
       }
       if (CommentViewController.V2(this.b).getItemCount() > 0) {
          CommentViewController.X2(this.b).smoothScrollToPosition(CollectionsKt__CollectionsKt.G(CommentViewController.V2(this.b).L0()));
       }
       return;
    }
}
