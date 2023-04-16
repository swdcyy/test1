package com.kuaishou.live.audience.component.blessingbag.c;
import u07.u;
import com.kuaishou.live.audience.component.blessingbag.e;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import o63.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.live.core.show.blessingbag.c;
import com.kuaishou.live.core.show.blessingbag.a;
import java.lang.String;
import p91.m;
import gx0.f;
import com.kuaishou.live.core.show.blessingbag.c$a;
import oa1.a;
import p63.a;
import oa1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import o63.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import js6.a;
import com.kwai.library.widget.popup.common.c;

public final class c implements u	// class@000a46
{
    public final e b;
    public final LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice c;
    public final a d;

    public void c(e p0,LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void a(t p0,View p1){
       c tb = this.b;
       c td = this.d;
       new c("KWAI_LUCKY_BAG_RECEIVE_POPUP", tb.q).a(new f(this.c)).b();
       if (tb.E == null) {
          b.a.b(td, LiveKrnPageKey.LiveAudienceBlessingBagDetailPage, tb.a9(), tb.b9());
       }else if(PatchProxy.applyVoid(null, tb, e.class, "19")){
          a.b.GO("LIVE_BLESSING_BAG_REFRESH", "");
       }
       p0.o();
       tb.Z8();
       return;
    }
}
