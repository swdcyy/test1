package com.kuaishou.live.lite.like.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class a implements g	// class@0009eb
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       b.I(LiveLiteLogTag.LITE_LIKE, "LiteLikeDoubleTapController.fetchLikeResource failed", p0);
    }
}
