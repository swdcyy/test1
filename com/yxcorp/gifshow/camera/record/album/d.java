package com.yxcorp.gifshow.camera.record.album.d;
import erd.g;
import com.yxcorp.gifshow.camera.record.album.o;
import com.yxcorp.gifshow.camera.bubble.b;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ym6.b;
import ym6.c;
import lnc.a1;
import sb9.w;
import com.yxcorp.gifshow.camera.bubble.b$d;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public final class d implements g	// class@001cb3
{
    public final o b;
    public final b c;
    public final boolean d;

    public void d(o p0,b p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (p0.second == null) {
       }else {
          tc.s(d.a(-589470275).Tw());
          int i = (tb.m2())? - a1.d(0x7f070329): 0;
          tc.t(i);
          tc.w(new w(p0));
          tb.D = tc;
          tb.w.n(tc);
          o.u2(td);
       }
       return;
    }
}
