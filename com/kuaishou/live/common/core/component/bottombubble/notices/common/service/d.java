package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.d;
import pp.c;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class d implements c	// class@000f9c
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return "CommentNotice";
    }
}
