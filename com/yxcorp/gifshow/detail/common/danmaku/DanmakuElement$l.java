package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$l;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.y;

public final class DanmakuElement$l implements g	// class@0013e4
{
    public final DanmakuElement b;

    public void DanmakuElement$l(DanmakuElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DanmakuElement$l.class, "1")) {
       }else {
          p0 = this.b.L;
          if (p0 != null) {
             p0.onNext(Boolean.FALSE);
          }
          PatchProxy.onMethodExit(DanmakuElement$l.class, "1");
       }
       return;
    }
}
