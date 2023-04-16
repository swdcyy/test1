package com.feature.post.bridge.util.h;
import erd.o;
import s3b.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.feature.post.bridge.util.PostVideoHelper$c;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import ixc.c;
import brd.t;
import og.f0;
import io.reactivex.g;
import java.lang.Exception;

public final class h implements o	// class@0014d2
{
    public final a b;
    public final MagicEmoji$MagicFace c;
    public final PostVideoHelper$c d;

    public void h(a p0,MagicEmoji$MagicFace p1,PostVideoHelper$c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       h tc = this.c;
       h td = this.d;
       if (!p0.booleanValue()) {
          throw tb.b(tc);
       }
       p0 = (!td.d.Mk(tc))? t.just(tc): t.create(new f0(tb, tc));
       return p0;
    }
}
