package com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer$delegate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBaseCommentNoticeMessageConsumer$delegate$2 extends Lambda implements a	// class@00085d
{
    public final LiveLiteBaseCommentNoticeMessageConsumer this$0;

    public void LiveLiteBaseCommentNoticeMessageConsumer$delegate$2(LiveLiteBaseCommentNoticeMessageConsumer p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBaseCommentNoticeMessageConsumer$delegate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteBaseCommentNoticeMessageConsumer$delegate$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
