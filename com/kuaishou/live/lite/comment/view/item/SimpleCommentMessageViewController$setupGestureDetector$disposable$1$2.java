package com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$setupGestureDetector$disposable$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController$setupGestureDetector$disposable$1;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ba3.i;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import ba3.i$b$b;
import ba3.i$b;

public final class SimpleCommentMessageViewController$setupGestureDetector$disposable$1$2 extends Lambda implements l	// class@000823
{
    public final SimpleCommentMessageViewController$setupGestureDetector$disposable$1 this$0;

    public void SimpleCommentMessageViewController$setupGestureDetector$disposable$1$2(SimpleCommentMessageViewController$setupGestureDetector$disposable$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SimpleCommentMessageViewController$setupGestureDetector$disposable$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       this.this$0.this$0.Z2().v0(i$b$b.a);
       return true;
    }
}
