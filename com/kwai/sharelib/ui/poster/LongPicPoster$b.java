package com.kwai.sharelib.ui.poster.LongPicPoster$b;
import erd.g;
import com.kwai.sharelib.ui.poster.LongPicPoster;
import com.kwai.sharelib.model.PainterModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import java.util.Objects;
import np7.d;
import np7.d$a;

public final class LongPicPoster$b implements g	// class@00171b
{
    public final LongPicPoster b;
    public final PainterModel c;

    public void LongPicPoster$b(LongPicPoster p0,PainterModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LongPicPoster$b.class, "1")) {
       }else {
          LongPicPoster$b tb = this.b;
          tb.g(LongPicPoster.o(tb));
          tb = this.b;
          LongPicPoster$b tc = this.c;
          a.o(p0, "error");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, LongPicPoster.class, "18")) {
             a.p(tc, "painterModel");
             a.p(p0, "error");
             d$a.k(tb, tc, p0);
          }
       }
       return;
    }
}
