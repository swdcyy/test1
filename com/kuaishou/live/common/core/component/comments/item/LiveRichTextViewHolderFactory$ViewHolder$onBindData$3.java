package com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$ViewHolder$onBindData$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$a;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessage;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import com.kuaishou.live.comments.richtext.LiveRichTextParser;

public final class LiveRichTextViewHolderFactory$ViewHolder$onBindData$3 extends Lambda implements a	// class@001094
{
    public final RichTextMessage $message;
    public final LiveRichTextViewHolderFactory$a this$0;

    public void LiveRichTextViewHolderFactory$ViewHolder$onBindData$3(LiveRichTextViewHolderFactory$a p0,RichTextMessage p1){
       this.this$0 = p0;
       this.$message = p1;
       super(0);
    }
    public final CharSequence invoke(){
       Object obj = PatchProxy.apply(null, this, LiveRichTextViewHolderFactory$ViewHolder$onBindData$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.h.a.b(this.$message.getSegments());
    }
    public Object invoke(){
       return this.invoke();
    }
}
