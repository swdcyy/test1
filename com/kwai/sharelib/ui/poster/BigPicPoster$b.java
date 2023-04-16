package com.kwai.sharelib.ui.poster.BigPicPoster$b;
import erd.g;
import com.kwai.sharelib.ui.poster.BigPicPoster;
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

public final class BigPicPoster$b implements g	// class@00170f
{
    public final BigPicPoster b;
    public final PainterModel c;

    public void BigPicPoster$b(BigPicPoster p0,PainterModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigPicPoster$b.class, "1")) {
       }else {
          BigPicPoster$b tb = this.b;
          tb.g(BigPicPoster.o(tb));
          tb = this.b;
          BigPicPoster$b tc = this.c;
          a.o(p0, "error");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidTwoRefs(tc, p0, tb, BigPicPoster.class, "18")) {
             a.p(tc, "painterModel");
             a.p(p0, "error");
             d$a.k(tb, tc, p0);
          }
       }
       return;
    }
}
