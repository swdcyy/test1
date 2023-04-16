package com.yxcorp.gifshow.featured.feedprefetcher.module.a;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.featured.feedprefetcher.module.PhotoPrefetcherInitModule;
import java.util.List;
import iea.d;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import wkd.b;
import zy5.k;
import zy5.d;
import java.util.ArrayList;
import java.lang.StringBuilder;
import pea.b;
import ekd.k1;
import lnc.i3;
import k2b.u1;

public final class a implements Runnable	// class@000fc5
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       List list = d.a();
       if (!q.f(list)) {
          int i = 0;
          while (i < list.size()) {
             QPhoto qPhoto = list.get(i);
             if (qPhoto != null) {
                boolean b = (d.h(qPhoto) && (d.k(qPhoto.getPhotoId()) && !b.a(-275376108).k(qPhoto.getPhotoId())))? true: false;
                if (!b) {
                   d.m(new ArrayList());
                   b.g("dynamicCache invalid£º"+qPhoto);
                   if (k1.l(0.01f)) {
                      i3 oi3 = i3.f();
                      oi3.d("scene", "removeInvalidDynamicCache");
                      oi3.d("content", qPhoto.toString());
                      u1.R("NASA_PREFETCH_CACHE_RERANK_ORDER", oi3.e(), 14);
                      break ;
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
