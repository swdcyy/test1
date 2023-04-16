package com.kuaishou.live.lite.comment.CommentViewController$b;
import s93.d;
import java.lang.Object;
import wa1.i;
import s93.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CommentViewController$b implements d	// class@0007d7
{
    public final i a;

    public void CommentViewController$b(){
       super();
       this.a = new i();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentViewController$b.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.a.remove(p0);
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentViewController$b.class, "1")) {
          return;
       }
       a.p(p0, "listener");
       this.a.add(p0);
       return;
    }
}
