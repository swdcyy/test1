package com.feature.post.bridge.util.e;
import erd.o;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import pm6.m;
import com.yxcorp.gifshow.music.utils.o;
import java.io.File;
import qkd.b;
import og.l;
import java.lang.Boolean;
import java.lang.String;
import q87.c;
import android.util.Pair;
import com.feature.post.bridge.util.PostVideoHelper;
import brd.t;
import og.d0;
import io.reactivex.g;

public final class e implements o	// class@0014cf
{
    public final int b;

    public void e(int p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       int i = 0;
       boolean b = o.l(p0, m.b(this.b), i);
       File uFile = (b)? o.i(p0): o.f(p0);
       if (b.S(uFile)) {
          Object[] objArray = new Object[]{Boolean.valueOf(b),uFile.getAbsolutePath()};
          Object[] objArray1 = new Object[i];
          l.D().w("PostVideoHelper", String.format("use cached file snip=%b, file=%s", objArray), objArray1);
          p0 = t.just(PostVideoHelper.c(uFile, p0, b));
       }else {
          p0 = t.create(new d0(p0, b, uFile));
       }
       return p0;
    }
}
