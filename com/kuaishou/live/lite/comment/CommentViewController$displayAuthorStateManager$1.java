package com.kuaishou.live.lite.comment.CommentViewController$displayAuthorStateManager$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.CommentViewController;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.g;

public final class CommentViewController$displayAuthorStateManager$1 extends Lambda implements a	// class@0007da
{
    public final CommentViewController this$0;

    public void CommentViewController$displayAuthorStateManager$1(CommentViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, CommentViewController$displayAuthorStateManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.O.getLiveStreamId();
    }
}
