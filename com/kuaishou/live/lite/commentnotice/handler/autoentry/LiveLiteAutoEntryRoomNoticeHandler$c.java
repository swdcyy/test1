package com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$c;
import erd.g;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$b;
import wa1.c;

public final class LiveLiteAutoEntryRoomNoticeHandler$c implements g	// class@000856
{
    public final LiveLiteAutoEntryRoomNoticeHandler b;

    public void LiveLiteAutoEntryRoomNoticeHandler$c(LiveLiteAutoEntryRoomNoticeHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteAutoEntryRoomNoticeHandler$c.class, "1")) {
       }else {
          p0 = LiveLiteAutoEntryRoomNoticeHandler.r;
          String str = this.b.f();
          a.o(str, "liveStreamId");
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(str, p0, LiveLiteAutoEntryRoomNoticeHandler$b.class, "2")) {
             LiveLiteAutoEntryRoomNoticeHandler.q.c(str, Boolean.TRUE);
          }
       }
       return;
    }
}
