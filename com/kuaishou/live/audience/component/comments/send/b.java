package com.kuaishou.live.audience.component.comments.send.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.audience.component.comments.send.e;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b implements g	// class@000ab7
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       b.y(LiveLogTag.MERCHANT.appendTag("LiveAudienceSendCommentsPresenter"), "sendCustomerComment", p0);
    }
}
