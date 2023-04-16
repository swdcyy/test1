package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.j;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import java.lang.Object;
import android.content.DialogInterface;
import crd.a;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import brd.t;
import gz0.q;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class j implements DialogInterface$OnDismissListener	// class@000b0d
{
    public final LiveAudienceBottomBarGiftAnimationManger b;

    public void j(LiveAudienceBottomBarGiftAnimationManger p0){
       this.b = p0;
    }
    public final void onDismiss(DialogInterface p0){
       j tb = this.b;
       if (tb.q != null) {
          if (!tb.c()) {
          label_0040 :
             return;
          }else if(tb.k == null){
             tb.k = new a();
          }
          tb.k.c(d.a(0x630bc993).d1().a().subscribe(new q(tb), Functions.d()));
       }
       tb.p = false;
       tb.q = false;
       goto label_0040 ;
    }
}
