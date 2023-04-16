package com.yxcorp.gifshow.v3.editor.cover.b2;
import erd.g;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverGeneratePresenter;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import ppc.e2;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.feature.post.api.core.model.EditCoverConfiguration;

public final class b2 implements g	// class@000e40
{
    public final VideoCoverGeneratePresenter b;
    public final double c;

    public void b2(VideoCoverGeneratePresenter p0,double p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       VideoCoverGeneratePresenter z;
       b2 tb = this.b;
       b2 tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverGeneratePresenter", "dumpOriginalFrame success", objArray);
       boolean b = tb.t.D();
       if (!b) {
          tb.t.c0();
       }
       Cover$b uob = tb.t.l(new e2(tc));
       uob.d(tb.t.M(p0));
       if (PostExperimentUtils.m()) {
          z = tb.z;
          if (z == null || z.isSaveToFinalCover()) {
             uob.e(tb.t.M(p0));
          }
       }else {
          z = tb.z;
          if (z != null && z.isSaveToFinalCover()) {
             uob.e(tb.t.M(p0));
          }
       }
       if (!b) {
          tb.t.g(0);
       }
       return;
    }
}
