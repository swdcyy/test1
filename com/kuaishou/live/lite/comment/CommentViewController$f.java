package com.kuaishou.live.lite.comment.CommentViewController$f;
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView$a;
import com.kuaishou.live.lite.comment.CommentViewController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Runnable;
import e93.f;
import java.util.Objects;
import w93.a;

public final class CommentViewController$f implements LiveLiteCommentRecyclerView$a	// class@0007dd
{
    public final CommentViewController a;

    public void CommentViewController$f(CommentViewController p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       CommentViewController$f uof = CommentViewController$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (p0) {
          f.f(this.a.C);
       }else {
          CommentViewController q = this.a.q;
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoid(null, q, a.class, "11")) {
             q.m = q.c;
             q.b();
          }
       }
       return;
    }
}
