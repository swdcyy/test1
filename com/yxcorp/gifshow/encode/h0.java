package com.yxcorp.gifshow.encode.h0;
import erd.o;
import java.lang.Object;
import android.util.Pair;
import java.lang.String;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import brd.t;
import com.yxcorp.gifshow.encode.s0;
import pca.a1;

public final class h0 implements o	// class@000d20
{
    public static final h0 b;

    static {
       h0.b = new h0();
    }
    public void h0(){
       super();
    }
    public final Object apply(Object p0){
       if (p0.first != null) {
          File uFile = b.X(PostUtils.g("[>|62|>]"), ".mp4");
          p0 = s0.h(p0.first.getAbsolutePath(), uFile.getAbsolutePath()).map(new a1(uFile));
       }else {
          p0 = t.just(p0);
       }
       return p0;
    }
}
