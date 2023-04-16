package com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$onReceiveCommentNotice$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z51.c;
import pp.c;
import z51.c$b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;

public final class LiveTkNoticeHandler$onReceiveCommentNotice$2 extends Lambda implements l	// class@001016
{
    public static final LiveTkNoticeHandler$onReceiveCommentNotice$2 INSTANCE;

    static {
       LiveTkNoticeHandler$onReceiveCommentNotice$2.INSTANCE = new LiveTkNoticeHandler$onReceiveCommentNotice$2();
    }
    public void LiveTkNoticeHandler$onReceiveCommentNotice$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkNoticeHandler$onReceiveCommentNotice$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       b.B(c.i.a(), "loadTkBundle failed: "+p0.getLocalizedMessage());
       return;
    }
}
