package com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveTopAreaMountDelegate$a;
import z1.a;
import com.kuaishou.merchant.dynamicpendant.mount.live.delegate.LiveTopAreaMountDelegate;
import ks5.j;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks5.i;
import lp3.c;
import lp3.i;
import ks5.m;

public final class LiveTopAreaMountDelegate$a implements a	// class@0016a4
{
    public final LiveTopAreaMountDelegate a;
    public final j b;

    public void LiveTopAreaMountDelegate$a(LiveTopAreaMountDelegate p0,j p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTopAreaMountDelegate$a.class, "1")) {
       }else {
          LiveTopAreaMountDelegate c = this.a.c;
          if (c != null) {
             i oi = c.a(i.class);
             if (oi != null) {
                oi.rb(this.b, p0);
             }
          }
       }
       return;
    }
}
