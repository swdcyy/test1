package com.yxcorp.gifshow.model.VideoQualityObserveHandler$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.model.VideoQualityObserveHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.reedit.DraftPublishedBackUpUtils;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lnc.s6;
import haa.f;
import q87.c;
import java.io.File;
import qkd.b;
import l46.a;
import com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator;
import java.lang.StringBuilder;
import j80.f;
import com.yxcorp.gifshow.util.PostUtils;

public final class VideoQualityObserveHandler$b implements Runnable	// class@001e9d
{
    public final VideoQualityObserveHandler b;

    public void VideoQualityObserveHandler$b(VideoQualityObserveHandler p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoQualityObserveHandler$b.class, "1")) {
          return;
       }
       VideoQualityObserveHandler$b tb = this.b;
       if (tb.g == null && !TextUtils.isEmpty(tb.f())) {
          DraftPublishedBackUpUtils b = DraftPublishedBackUpUtils.b;
          String str = this.b.f();
          a.m(str);
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(str, b, DraftPublishedBackUpUtils.class, "5")) {
             a.p(str, "photoId");
             int i = 0;
             if (s6.j()) {
                Object[] objArray = new Object[i];
                f.D().w("DraftPublishedBackUpUtils", "deleteDraftFileSafely, don\'t need to delete.", objArray);
             }else {
                File uFile = b.a(str);
                if (uFile == null || !b.S(uFile)) {
                   Object[] objArray1 = new Object[i];
                   f.D().w("DraftPublishedBackUpUtils", "deleteDraftFileSafely  draftDir not exist : photoId "+str, objArray1);
                }else {
                   str = b.b().i(str);
                   if (str != null && !ReEditAfterDeleteOperator.m(str)) {
                      b.q(uFile);
                   }
                   b.b().d(uFile.getName());
                }
             }
          }
       }
       if (!TextUtils.isEmpty(this.b.d()) && f.e(this.b.d())) {
          PostUtils.B(new File(this.b.d()));
       }
       return;
    }
}
