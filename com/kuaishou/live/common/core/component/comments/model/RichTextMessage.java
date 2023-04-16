package com.kuaishou.live.common.core.component.comments.model.RichTextMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import java.lang.CharSequence;
import h81.b;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;

public final class RichTextMessage extends QLiveMessage	// class@0010c5
{
    public LiveFeedBackground background;
    public int bizType;
    public CharSequence content;
    public b longPressAction;
    public LiveCommentRichTextMessage$CommentRichTextSegment[] segments;
    public b tapAction;

    public void RichTextMessage(){
       super();
    }
    public final LiveFeedBackground getBackground(){
       return this.background;
    }
    public final int getBizType(){
       return this.bizType;
    }
    public final CharSequence getContent(){
       return this.content;
    }
    public final b getLongPressAction(){
       return this.longPressAction;
    }
    public final LiveCommentRichTextMessage$CommentRichTextSegment[] getSegments(){
       return this.segments;
    }
    public final b getTapAction(){
       return this.tapAction;
    }
    public final void setBackground(LiveFeedBackground p0){
       this.background = p0;
    }
    public final void setBizType(int p0){
       this.bizType = p0;
    }
    public final void setContent(CharSequence p0){
       this.content = p0;
    }
    public final void setLongPressAction(b p0){
       this.longPressAction = p0;
    }
    public final void setSegments(LiveCommentRichTextMessage$CommentRichTextSegment[] p0){
       this.segments = p0;
    }
    public final void setTapAction(b p0){
       this.tapAction = p0;
    }
}
