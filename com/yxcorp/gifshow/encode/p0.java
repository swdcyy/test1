package com.yxcorp.gifshow.encode.p0;
import io.reactivex.g;
import java.util.List;
import java.io.File;
import java.lang.Object;
import brd.v;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import com.yxcorp.gifshow.encode.s0;
import com.kwai.video.videoprocessor.JpegBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.encode.r0;
import com.kwai.video.videoprocessor.JpegBuilderEventListener;
import pca.n1;
import erd.f;

public final class p0 implements g	// class@000d36
{
    public final boolean b;
    public final List c;
    public final File d;

    public void p0(boolean p0,List p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       p0 tc = this.c;
       p0 td = this.d;
       String str = ".jpg";
       if (this.b != null && tc.size() > 0) {
          File uFile = b.X(PostUtils.f(), str);
          File uFile1 = new File(tc.get((tc.size() - 1)));
          if (b.S(uFile1)) {
             s0.c(uFile1, uFile);
             tc.remove((tc.size() - 1));
             tc.add(uFile.getAbsolutePath());
          }
       }
       JpegBuilder jpegBuilder = new JpegBuilder(a.a().a());
       File uFile2 = b.X(PostUtils.g("[>|63|>]"), str);
       String[] stringArray = new String[tc.size()];
       jpegBuilder.startBuild(tc.toArray(stringArray), uFile2.getAbsolutePath(), n.y(a.a().a()), new r0(p0, uFile2, td));
       p0.setCancellable(new n1(jpegBuilder));
       return;
    }
}
