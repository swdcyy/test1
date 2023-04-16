package com.kuaishou.live.common.core.component.recharge.b;
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

public class b implements b	// class@001748
{
    public final a b;
    public final c c;
    public final d$a d;

    public void b(a p0,c p1,d$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RECHARGE, "new recharge dialog onDismiss, refresh payment");
       d.a(0x630bc993).d1().f();
       b tb = this.b;
       if (tb != null) {
          tb.onDismiss();
       }else {
          this.c.a(this.d);
       }
       return;
    }
    public void onFail(int p0,String p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_RECHARGE, "new recharge dialog  onFail", "code", Integer.valueOf(p0), "msg", p1);
       b tb = this.b;
       if (tb != null) {
          tb.onDismiss();
       }else {
          this.c.a(this.d);
       }
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.onShow();
          b.Z(LiveLogTag.LIVE_RECHARGE, "new recharge dialog onShow");
       }
       return;
    }
}
