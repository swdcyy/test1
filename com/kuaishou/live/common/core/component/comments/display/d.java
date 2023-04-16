package com.kuaishou.live.common.core.component.comments.display.d;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.comments.display.LiveCommentsDisplayControllerV2;
import va1.a0;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;

public final class d implements o	// class@001072
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (a0.g(p0) || p0 instanceof SystemNoticeMessage)? true: false;
       return b;
    }
}
