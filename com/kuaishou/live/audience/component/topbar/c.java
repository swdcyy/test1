package com.kuaishou.live.audience.component.topbar.c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.audience.component.topbar.d;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@000be6
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLogTag.FANS_GROUP, "getFansGroupTagInfo fail", p0);
    }
}
