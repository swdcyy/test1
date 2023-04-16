package com.feature.post.bridge.util.f;
import erd.o;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.feature.post.bridge.util.PostVideoHelper$c;
import android.os.Bundle;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.feature.post.bridge.util.PostVideoHelper;
import lnc.s6;
import brd.t;
import og.e0;
import com.feature.post.bridge.util.PostVideoHelper$PairNotSupportException;
import og.m0;

public final class f implements o	// class@0014d0
{
    public final JsCameraCallbackParams$Param b;
    public final GifshowActivity c;
    public final PostVideoHelper$c d;
    public final Bundle e;

    public void f(JsCameraCallbackParams$Param p0,GifshowActivity p1,PostVideoHelper$c p2,Bundle p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       if (PostVideoHelper.k(tb, p0)) {
          return PostVideoHelper.n(PostVideoHelper.j(tc), tb, (s6.H() ^ 0x01), td).map(new e0(p0, te));
       }
       throw new PostVideoHelper$PairNotSupportException(false, null);
    }
}
