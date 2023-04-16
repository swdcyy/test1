package com.yxcorp.gifshow.v3.editor.cover.d2;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter;
import lnc.d1$a;
import android.graphics.Bitmap;
import java.lang.Object;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import lnc.p6;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import qaa.a;
import android.graphics.RectF;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.d1;
import ppc.f2;
import lnc.d1$b;
import ppc.d2;
import erd.g;
import lnc.d1$c;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class d2 implements Runnable	// class@000e59
{
    public final VideoCoverGeneratePresenter b;
    public final d1$a c;
    public final Bitmap d;

    public void d2(VideoCoverGeneratePresenter p0,d1$a p1,Bitmap p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       d2 tb = this.b;
       d2 tc = this.c;
       d2 td = this.d;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "generateCover run on ui", objArray);
       VideoCoverGeneratePresenter t = tb.t;
       if (t.v() == null) {
       }else {
          boolean coverManualS = t.v().getVideoCoverParam().getCoverManualSelected();
          if (p6.f(t) && !coverManualS) {
             t = 1;
          label_003b :
             if (t) {
                p6.i(tb.s, tc.c(), tc.b());
             }
             tb.r.b();
             tb.r.g(new f2(tb));
             tb.r.f(new d2(tb, td));
             if (!tb.r.a(tc)) {
                objArray = new Object[0];
                a.D().w("VideoCoverGeneratePresenter", "generateCover: no need crop cover", objArray);
                d1$c uoc = tb.r.d(tc);
                if (uoc != null) {
                   tb.P8(BitmapUtil.s(uoc.b()), 0);
                }else {
                   tb.P8(td, 0);
                }
             }
             return;
          }
       }
       t = null;
       goto label_003b ;
    }
}
