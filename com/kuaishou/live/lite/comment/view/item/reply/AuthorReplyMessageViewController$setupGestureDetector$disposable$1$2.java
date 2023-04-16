package com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$setupGestureDetector$disposable$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController$setupGestureDetector$disposable$1;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import da3.h;
import com.kuaishou.live.lite.comment.view.item.reply.AuthorReplyMessageViewController;
import da3.h$b$b;
import da3.h$b;

public final class AuthorReplyMessageViewController$setupGestureDetector$disposable$1$2 extends Lambda implements l	// class@00083c
{
    public final AuthorReplyMessageViewController$setupGestureDetector$disposable$1 this$0;

    public void AuthorReplyMessageViewController$setupGestureDetector$disposable$1$2(AuthorReplyMessageViewController$setupGestureDetector$disposable$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AuthorReplyMessageViewController$setupGestureDetector$disposable$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       this.this$0.this$0.Z2().v0(h$b$b.a);
       return true;
    }
}
