package com.kuaishou.live.audience.component.blessingbag.b;
import u07.u;
import com.kuaishou.live.audience.component.blessingbag.e;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.live.core.show.blessingbag.c;
import com.kuaishou.live.core.show.blessingbag.a;
import java.lang.String;
import p91.m;
import gx0.e;
import com.kuaishou.live.core.show.blessingbag.c$a;

public final class b implements u	// class@000a45
{
    public final e b;
    public final LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice c;

    public void b(e p0,LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       new c("KWAI_LUCKY_BAG_RECEIVE_POPUP", tb.q).a(new e(this.c)).b();
       tb.Z8();
    }
}
