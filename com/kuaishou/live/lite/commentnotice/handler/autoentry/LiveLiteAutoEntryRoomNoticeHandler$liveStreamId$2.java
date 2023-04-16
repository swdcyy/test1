package com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$liveStreamId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.g;

public final class LiveLiteAutoEntryRoomNoticeHandler$liveStreamId$2 extends Lambda implements a	// class@000857
{
    public final LiveLiteAutoEntryRoomNoticeHandler this$0;

    public void LiveLiteAutoEntryRoomNoticeHandler$liveStreamId$2(LiveLiteAutoEntryRoomNoticeHandler p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, LiveLiteAutoEntryRoomNoticeHandler$liveStreamId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.m.getLiveStreamId();
       if (obj == null) {
          obj = "empty";
       }
       return obj;
    }
}
