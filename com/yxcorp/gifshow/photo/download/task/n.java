package com.yxcorp.gifshow.photo.download.task.n;
import erd.g;
import exb.b;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Objects;
import ixb.k0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.System;

public final class n implements g	// class@000f0e
{
    public final b b;
    public final StatModel c;
    public final boolean d;

    public void n(b p0,StatModel p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       k1.o(new k0(tb));
       tc.mStartTime = System.currentTimeMillis();
       int i = (this.d != null)? 1: 3;
       tc.mWaterMarkType = i;
       return;
    }
}
