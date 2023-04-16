package com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$b;
import java.lang.Object;
import nsd.u;
import pp.c;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wa1.c;
import kotlin.jvm.internal.a;

public final class LiveLiteAutoEntryRoomNoticeHandler$b	// class@000855
{

    public void LiveLiteAutoEntryRoomNoticeHandler$b(){
       super();
    }
    public void LiveLiteAutoEntryRoomNoticeHandler$b(u p0){
       super();
    }
    public final c a(){
       return LiveLiteAutoEntryRoomNoticeHandler.p;
    }
    public final boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteAutoEntryRoomNoticeHandler$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0 = LiveLiteAutoEntryRoomNoticeHandler.q.a(p0, Boolean.FALSE);
       a.o(p0, "hasEnterDetailRoomPrefer¡­.get\(liveStreamId, false\)");
       return p0.booleanValue();
    }
}
