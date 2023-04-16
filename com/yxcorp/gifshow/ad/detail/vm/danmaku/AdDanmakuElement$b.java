package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$b;
import erd.a;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AdDanmakuElement$b implements a	// class@0016f6
{
    public final AdDanmakuElement b;
    public final boolean c;
    public final a d;

    public void AdDanmakuElement$b(AdDanmakuElement p0,boolean p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdDanmakuElement$b.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.P = this.d;
       }else {
          AdDanmakuElement$b td = this.d;
          if (td != null) {
             this.b.P = td;
          }
       }
       this.b.G0(true);
       return;
    }
}
