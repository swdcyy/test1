package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$b;
import erd.a;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DanmakuElement$b implements a	// class@0013d6
{
    public final DanmakuElement b;
    public final boolean c;
    public final a d;

    public void DanmakuElement$b(DanmakuElement p0,boolean p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$b.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.X = this.d;
       }else {
          DanmakuElement$b td = this.d;
          if (td != null) {
             this.b.X = td;
          }
       }
       DanmakuElement.J0(this.b, true, null, 2, null);
       return;
    }
}
