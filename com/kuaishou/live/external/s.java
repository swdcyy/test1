package com.kuaishou.live.external.s;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class s implements g	// class@001bbb
{
    public static final s b;

    static {
       s.b = new s();
    }
    public void s(){
       super();
    }
    public final void accept(Object p0){
       b.B(LiveLogTag.LIVE_PLUGIN, "handleTemplateCard fail, error is"+p0);
    }
}
