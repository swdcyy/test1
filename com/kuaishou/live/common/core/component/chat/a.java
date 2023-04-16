package com.kuaishou.live.common.core.component.chat.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@00102a
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.B(LiveLogTag.CHAT, p0.getMessage());
    }
}
