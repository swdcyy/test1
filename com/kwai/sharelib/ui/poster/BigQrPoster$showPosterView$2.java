package com.kwai.sharelib.ui.poster.BigQrPoster$showPosterView$2;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.sharelib.ui.poster.BigQrPoster;
import android.view.View;
import android.app.Activity;
import com.kwai.sharelib.model.PosterConfig;
import com.kwai.sharelib.model.PainterModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import com.kwai.sharelib.model.PosterConfig$PosterLayout;
import android.content.Context;
import ekd.l1;
import com.kwai.library.widget.popup.common.f;
import com.kwai.sharelib.ui.poster.BigQrPoster$showPosterView$2$onPreDraw$1;
import msd.s;

public final class BigQrPoster$showPosterView$2 implements ViewTreeObserver$OnPreDrawListener	// class@001717
{
    public final BigQrPoster b;
    public final View c;
    public final Activity d;
    public final PosterConfig e;
    public final PainterModel f;

    public void BigQrPoster$showPosterView$2(BigQrPoster p0,View p1,Activity p2,PosterConfig p3,PainterModel p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public boolean onPreDraw(){
       ViewTreeObserver obj = PatchProxy.apply(null, this, BigQrPoster$showPosterView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.getViewTreeObserver();
       a.o(obj, "shareLayout.viewTreeObserver");
       if (obj.isAlive()) {
          this.c.getViewTreeObserver().removeOnPreDrawListener(this);
          int i = n.x(this.d);
          int i1 = n.t(this.d);
          PosterConfig mPosterLayou = this.e.mPosterLayout;
          int i2 = 0;
          int i3 = (mPosterLayou != null)? (int)(mPosterLayou.mWidthPercent * (float)i): 0;
          if (l1.a(this.d) != true) {
             i = f.k(this.d);
             i2 = (i > 0)? i: 96;
          }
       label_0062 :
          this.b.v(i3, ((i1 - this.c.getMeasuredHeight()) - i2), this.d, this.e, this.f, BigQrPoster$showPosterView$2$onPreDraw$1.INSTANCE);
       }
       return true;
    }
}
