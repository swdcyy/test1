package com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$onReceiveCommentNotice$tkBridge$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bq5.f;

public final class LiveTkNoticeHandler$onReceiveCommentNotice$tkBridge$1 extends Lambda implements a	// class@001017
{
    public final LiveTkNoticeHandler this$0;

    public void LiveTkNoticeHandler$onReceiveCommentNotice$tkBridge$1(LiveTkNoticeHandler p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       LiveTkNoticeHandler obj = PatchProxy.apply(null, this, LiveTkNoticeHandler$onReceiveCommentNotice$tkBridge$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.b;
       if (obj != null) {
          obj.d();
       }
       this.this$0.b = null;
       return true;
    }
}
