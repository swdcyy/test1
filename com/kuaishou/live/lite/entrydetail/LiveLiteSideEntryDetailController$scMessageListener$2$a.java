package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$scMessageListener$2$a;
import lf3.g;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$scMessageListener$2;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;
import lf3.f;

public final class LiveLiteSideEntryDetailController$scMessageListener$2$a implements g	// class@0008ec
{
    public final LiveLiteSideEntryDetailController$scMessageListener$2 b;

    public void LiveLiteSideEntryDetailController$scMessageListener$2$a(LiveLiteSideEntryDetailController$scMessageListener$2 p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideEntryDetailController$scMessageListener$2$a.class, "1")) {
       }else if(p0 != null){
          LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice subBizType = p0.subBizType;
          a.o(subBizType, "entryRoomGuideNotice.subBizType");
          LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice subBizId = p0.subBizId;
          a.o(subBizId, "entryRoomGuideNotice.subBizId");
          this.b.this$0.V2(subBizType, subBizId, p0.maxShowDurationMs);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
