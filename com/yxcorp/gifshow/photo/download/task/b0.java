package com.yxcorp.gifshow.photo.download.task.b0;
import erd.g;
import com.yxcorp.gifshow.photo.download.task.n0;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import java.util.Objects;
import s16.j;
import com.yxcorp.gifshow.photo.download.task.f;
import java.io.File;
import ixb.z1;
import java.lang.Runnable;
import ekd.k1;
import ywb.e;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class b0 implements g	// class@000eee
{
    public final n0 b;

    public void b0(n0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       j.d().h(tb.j, p0.m());
       k1.o(new z1(tb));
       Object[] objArray = new Object[0];
       e.C().w(n0.p, "reExportHighFrameRateVideoFromLocal FrameRatePromote,start download video end outputFile:"+tb.j, objArray);
    }
}
