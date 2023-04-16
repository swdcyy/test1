package com.kuaishou.live.common.core.component.comments.parser.a;
import ok.h;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker$LiveRichTextOldSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$PlainSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;

public final class a implements h	// class@0010cc
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       if (p0 == null) {
          p0 = null;
       }else {
          LiveStreamRichTextFeed$PlainSegment plainSegment = new LiveStreamRichTextFeed$PlainSegment();
          plainSegment.text = p0.mText;
          plainSegment.color = p0.mColor;
          p0 = new LiveStreamRichTextFeed$RichTextSegment();
          p0.setPlain(plainSegment);
       }
       return p0;
    }
}
