package com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement$j;
import jta.e;
import com.yxcorp.gifshow.detail.common.danmaku.DanmakuElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import im5.d;
import qm5.o;

public final class DanmakuElement$j implements e	// class@0013e2
{
    public final DanmakuElement a;

    public void DanmakuElement$j(DanmakuElement p0){
       this.a = p0;
       super();
    }
    public final void b(int p0,int p1){
       DanmakuElement$j oj = DanmakuElement$j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oj, "1")) {
          return;
       }
       DanmakuElement u0 = this.a.U0;
       if (u0 != null && u0.isRunning() == true) {
          oj = this.a;
          if (oj.Q == null) {
             u0 = oj.U0;
             if (u0 != null) {
                o oo = u0.F();
                if (oo != null) {
                   oo.m0(p0, p1);
                }
             }
          }
       }
       return;
    }
}
