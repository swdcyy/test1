package com.kuaishou.logic.fetchframe.b;
import io.reactivex.g;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import java.lang.Object;
import brd.v;
import qr3.a;
import gq.a;
import java.lang.String;
import q87.c;
import com.kwai.video.editorsdk2.ThumbnailGenerator$RequestFinishListener;

public final class b implements g	// class@0014c1
{
    public final long b;
    public final long c;
    public final ThumbnailGenerator d;
    public final ThumbnailGeneratorRequest e;

    public void b(long p0,long p1,ThumbnailGenerator p2,ThumbnailGeneratorRequest p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       a uoa = new a(p0, this.b, this.c);
       Object[] objArray = new Object[0];
       a.D().w("FetchFrameManager", "rxSdkGetThumbnail: start get thumbnail", objArray);
       this.d.getThumbnailAsync(this.e, v8);
    }
}
