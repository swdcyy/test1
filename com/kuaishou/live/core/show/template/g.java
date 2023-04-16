package com.kuaishou.live.core.show.template.g;
import android.content.DialogInterface$OnDismissListener;
import java.lang.Object;
import android.content.DialogInterface;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class g implements DialogInterface$OnDismissListener	// class@001185
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final void onDismiss(DialogInterface p0){
       b.Z(LiveLogTag.LIVE_GUEST_ACTIVITY, "dismiss guest activity dialog");
    }
}
