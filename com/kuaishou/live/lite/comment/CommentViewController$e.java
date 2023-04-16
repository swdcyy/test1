package com.kuaishou.live.lite.comment.CommentViewController$e;
import erd.o;
import java.lang.Object;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.base.Optional;
import kotlin.jvm.internal.a;

public final class CommentViewController$e implements o	// class@0007dc
{
    public static final CommentViewController$e b;

    static {
       CommentViewController$e.b = new CommentViewController$e();
    }
    public void CommentViewController$e(){
       super();
    }
    public Object apply(Object p0){
       Optional optional = PatchProxy.applyOneRefs(p0, this, CommentViewController$e.class, "1");
       if (optional != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          optional = Optional.fromNullable(p0.mLiteAuthorReplyAfterSendGiftConfig);
       }
       return optional;
    }
}
