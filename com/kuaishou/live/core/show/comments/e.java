package com.kuaishou.live.core.show.comments.e;
import ok.o;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.core.show.comments.f;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;

public final class e implements o	// class@000a5e
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean apply(Object p0){
       return p0 instanceof CommentMessage;
    }
}
