package com.kuaishou.live.audience.component.comments.send.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.audience.component.comments.send.e;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d implements g	// class@000ab9
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveLogTag.COMMENT.appendTag("LiveAudienceSendCommentsPresenter"), "showChatEditorError", p0);
    }
}
