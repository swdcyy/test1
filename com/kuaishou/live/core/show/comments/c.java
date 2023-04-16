package com.kuaishou.live.core.show.comments.c;
import ok.h;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextMessage;
import com.kuaishou.live.core.show.comments.f;
import da1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import h81.b;
import h81.a;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import com.kuaishou.live.basic.model.QLiveMessage;

public final class c implements h	// class@000a58
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = null;
       if (p0 != null) {
          obj = PatchProxy.applyOneRefs(p0, obj, c.class, "29");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = new RichTextMessage();
             obj.setBizType(p0.bizType);
             obj.setBackground(p0.feedBackground);
             obj.setTapAction(a.a(p0.tapAction));
             obj.setLongPressAction(a.a(p0.longPressAction));
             obj.setSegments(p0.segment);
             obj.setSortRank(p0.sortRank);
             obj.setTime(p0.serverTimestamp);
             obj.setId(p0.id);
             obj.setDeviceHash(p0.deviceHash);
          }
       }
       return obj;
    }
}
