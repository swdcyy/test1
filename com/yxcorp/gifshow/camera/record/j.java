package com.yxcorp.gifshow.camera.record.j;
import erd.o;
import s3b.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import t5b.a;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import ixc.c;
import brd.t;
import qb9.h0;
import io.reactivex.g;
import java.lang.Exception;

public final class j implements o	// class@001d52
{
    public final a b;
    public final MagicEmoji$MagicFace c;

    public void j(a p0,MagicEmoji$MagicFace p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       j tc = this.c;
       if (!p0.booleanValue()) {
          throw tb.b(tc);
       }
       p0 = (!d.a(0x3bf0d115).Mk(tc))? t.just(tc): t.create(new h0(tb, tc));
       return p0;
    }
}
