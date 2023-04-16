package com.yxcorp.gifshow.v3.editor.cover.y1;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import android.graphics.Bitmap;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import rwc.j;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import qaa.a;
import lnc.d1$a;
import lnc.p6;
import faa.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.util.Pair;
import brd.g;
import ppc.j1;
import lnc.d1$b;
import lnc.d1;
import ppc.o1;
import erd.g;
import lnc.d1$c;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class y1 implements g	// class@000eee
{
    public final VideoCoverEditorPresenter b;
    public final Bitmap c;
    public final Size d;
    public final Bitmap e;

    public void y1(VideoCoverEditorPresenter p0,Bitmap p1,Size p2,Bitmap p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       y1 tb = this.b;
       y1 td = this.d;
       y1 te = this.e;
       Objects.requireNonNull(tb);
       j oj = new j(this.c);
       if (td == null) {
          td = new Size(tb.U.getVideoWidth(), tb.U.getVideoHeight());
       }
       d1$a uoa = p6.c(tb.y, td);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VideoCoverEditorPresenter", "generateCroppedCoverBitmap, cropImageData = "+uoa, objArray);
       if (uoa == null) {
          p0.onNext(new Pair(te, oj));
          p0.onComplete();
       }else {
          uoa.e(oj.getValue());
          tb.Z.g(new j1(oj, p0, te));
          tb.Z.f(new o1(p0, te, oj));
          if (!tb.Z.a(uoa)) {
             Object[] objArray1 = new Object[i];
             a.D().w("VideoCoverEditorPresenter", "generateCroppedCoverBitmap, add task failed", objArray1);
             d1$c uoc = tb.Z.d(uoa);
             if (uoc != null) {
                oj.setValue(BitmapUtil.s(uoc.b()));
             }
             p0.onNext(new Pair(te, oj));
             p0.onComplete();
          }
       }
       return;
    }
}
