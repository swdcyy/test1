package com.kuaishou.edit.a;
import com.kwai.video.editorsdk2.ThumbnailGenerator$RequestFinishListener;
import com.kuaishou.edit.TimeLineGenerator;
import java.lang.Object;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import com.kwai.video.editorsdk2.ThumbnailGeneratorResult;
import java.util.Objects;
import y30.b;
import java.lang.Runnable;
import ekd.k1;

public final class a implements ThumbnailGenerator$RequestFinishListener	// class@0016f0
{
    public final TimeLineGenerator a;
    public final long b;

    public void a(TimeLineGenerator p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onFinish(ThumbnailGenerator p0,ThumbnailGeneratorResult p1){
       a ta = this.a;
       Objects.requireNonNull(ta);
       k1.o(new b(ta, p1, this.b));
    }
}
