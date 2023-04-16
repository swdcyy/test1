package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m;
import com.yxcorp.download.k;
import msd.a;
import java.io.File;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import faa.a;
import w46.b;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$m$b;

public final class VideoCoverProportionViewBinder$m extends k	// class@000eaf
{
    public final a c;
    public final File d;

    public void VideoCoverProportionViewBinder$m(a p0,File p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverProportionViewBinder$m.class, "1")) {
          return;
       }
       a.p(p0, "task");
       k1.o(new VideoCoverProportionViewBinder$m$a(this));
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoCoverProportionViewBinder$m.class, "2")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "e");
       a.D().e("VideoCoverProportionViewBinder", "prefetchHelperDialogPicIfNeeded: picture download error: ", p1);
       k1.o(new VideoCoverProportionViewBinder$m$b(this));
       return;
    }
}
