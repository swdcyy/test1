package com.kuaishou.live.common.core.component.recharge.c;
import bd5.b;
import rw1.a;
import gy2.c;
import com.kuaishou.live.common.core.component.recharge.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import gy2.a;
import java.lang.Integer;

public class c implements b	// class@001749
{
    public final a b;
    public final c c;
    public final d$a d;

    public void c(a p0,c p1,d$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RECHARGE, "new recharge dialog onDismiss, refresh payment");
       d.a(0x630bc993).d1().f();
       c tb = this.b;
       if (tb == null) {
          this.c.a(this.d);
       }else {
          tb.onDismiss();
       }
       return;
    }
    public void onFail(int p0,String p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_RECHARGE, "new recharge dialog  onFail", "code", Integer.valueOf(p0), "msg", p1);
       c tb = this.b;
       if (tb == null) {
          this.c.a(this.d);
       }else {
          tb.onDismiss();
       }
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RECHARGE, "new recharge dialog onShow");
       c tb = this.b;
       if (tb != null) {
          tb.onShow();
       }
       return;
    }
}
