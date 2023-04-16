package com.yxcorp.gifshow.album.widget.preview.b;
import erd.o;
import com.yxcorp.gifshow.album.widget.preview.c;
import java.io.File;
import java.lang.Object;
import ekd.b0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.System;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import android.widget.ImageView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import android.view.View;
import u79.e;
import io.reactivex.g;
import brd.t;
import g79.a;
import w69.p0;
import brd.z;
import u79.j;
import brd.y;

public final class b implements o	// class@001b2b
{
    public final c b;
    public final File c;

    public void b(c p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       a c;
       b tb = this.b;
       b tc = this.c;
       Object obj = p0;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidTwoRefs(tc, obj, tb, c.class, "12")) {
       }else {
          Log.g("ImagePreviewItem", "previewWithSubSamplingView, index = "+tb.b);
          long l = System.currentTimeMillis();
          tb.f.w().setVisibility(8);
          if (tb.f.u() != null) {
             tb.f.u().setVisibility(0);
             c = a.c;
             j oj = new j(tb, l, tc, obj);
             t.create(new e(tb)).subscribeOn(c.i().d()).observeOn(c.i().b()).subscribe(v6);
          }
       }
       return null;
    }
}
