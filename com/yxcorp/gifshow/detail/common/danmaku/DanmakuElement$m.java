package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$m;
import erd.a;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class DanmakuElement$m implements a	// class@0013e5
{
    public final DanmakuElement b;
    public final boolean c;

    public void DanmakuElement$m(DanmakuElement p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, DanmakuElement$m.class, "1")) {
          return;
       }
       this.b.y0(this.c);
       return;
    }
}
