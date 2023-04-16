package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$i;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.System;
import wy5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public final class CollectElement$i implements g	// class@00149c
{
    public final CollectElement b;

    public void CollectElement$i(CollectElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectElement$i.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             CollectElement i = p0.I;
             if (i == p0.F) {
                a.l(System.currentTimeMillis());
                a.h((a.a() + 1));
                CollectElement.s0(this.b, 1, 0, 2, null);
             }else if(i == p0.G){
                a.i(1);
                p0 = this.b;
                p0.r0(1, p0.G);
             }else if(i == p0.H){
                p0 = a.a.edit();
                p0.putBoolean(b.d("user")+"isCollectCancelLimitTipShow", 1);
                g.a(p0);
                p0 = this.b;
                p0.r0(1, p0.H);
             }
          }
       }
       return;
    }
}
