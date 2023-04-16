package com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement$j;
import jta.e;
import com.yxcorp.gifshow.ad.detail.vm.danmaku.AdDanmakuElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import im5.d;
import qm5.o;

public final class AdDanmakuElement$j implements e	// class@001700
{
    public final AdDanmakuElement a;

    public void AdDanmakuElement$j(AdDanmakuElement p0){
       this.a = p0;
       super();
    }
    public final void b(int p0,int p1){
       AdDanmakuElement$j oj = AdDanmakuElement$j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oj, "1")) {
          return;
       }
       AdDanmakuElement s = this.a.S;
       if (s != null && s.isRunning() == true) {
          oj = this.a;
          if (oj.K == null) {
             s = oj.S;
             if (s != null) {
                o oo = s.F();
                if (oo != null) {
                   oo.m0(p0, p1);
                }
             }
          }
       }
       return;
    }
}
