package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment;
import e17.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@000f16
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void accept(Object p0){
       i.a(R.style.arg_RES_7f11066a, 0x7f102669);
       b.I(LiveLogTag.LIVE_RED_PACK_RAIN, "red pack rain notify reserve failure", p0);
    }
}
