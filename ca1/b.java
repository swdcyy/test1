package ca1.b;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$AudienceStateSegment;

public class b	// class@00048b
{

    public void b(){
       super();
    }
    public static RichTextMessageOld a(LiveStreamRichTextFeed$RichTextFeed p0){
       RichTextMessageOld obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RichTextMessageOld();
       obj.setId(p0.id);
       obj.setTime(p0.time);
       obj.setSortRank(p0.sortRank);
       obj.type = p0.type;
       LiveStreamRichTextFeed$RichTextFeed segments = p0.segments;
       obj.mSegments = segments;
       int i = 0;
       obj.mLiveAssistantType = i;
       int len = segments.length;
       while (i < len) {
          object oobject = segments[i];
          if (oobject.getContentCase() == 6) {
             obj.mLiveAudienceState = oobject.getState().audienceState;
             break ;
          }else {
             i = i + 1;
          }
       }
       obj.mLogId = p0.id;
       return obj;
    }
}
