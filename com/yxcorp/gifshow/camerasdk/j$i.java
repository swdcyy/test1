package com.yxcorp.gifshow.camerasdk.j$i;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBeautifyStatusChangedListener;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import si9.c;
import si9.f;
import java.lang.StringBuilder;
import java.lang.System;
import qi9.x0;
import java.lang.Runnable;
import ekd.k1;

public class j$i implements FaceMagicController$FaceMagicBeautifyStatusChangedListener	// class@001022
{
    public final j a;

    public void j$i(j p0){
       this.a = p0;
       super();
    }
    public void beautifyStatusChanged(int p0,int p1){
       j$i oi = j$i.class;
       String str = "1";
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, str)) {
          return;
       }
       j h0 = this.a.H0;
       Objects.requireNonNull(h0);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), h0, uoc, str) && (h0.e != null && (!p0 && p1 == 1)))) {
          h0.e = f.c.a("stage_beauty_ready"+h0.d, System.currentTimeMillis());
          h0.d = h0.d + 1;
       }
    label_0066 :
       k1.o(new x0(this, p0, p1));
       return;
    }
}
