package com.yxcorp.gifshow.upload.e0$c$b;
import erd.g;
import com.yxcorp.gifshow.upload.e0$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.g0;
import java.lang.Runnable;
import android.os.Handler;

public class e0$c$b implements g	// class@001e6e
{
    public final e0$c b;

    public void e0$c$b(e0$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0$c$b.class, "1")) {
       }else {
          e0$c$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, e0$c.class, "3")) {
             if (tb.c != null) {
                tb.b.mThrowable = p0;
                tb.a();
             }else {
                e0$c b = tb.b;
                b.mStatus = IUploadInfo$Status.FAILED;
                b.mThrowable = p0;
                tb.o.c(b);
                tb.o.b.post(new g0(tb));
             }
          }
       }
       return;
    }
}
