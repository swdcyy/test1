package com.kuaishou.live.core.show.wishlight.download.base.d;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlight.download.base.e;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.v;
import j80.f;
import java.io.File;
import java.lang.System;
import java.util.concurrent.atomic.AtomicReference;
import brd.t;
import com.kuaishou.live.core.show.wishlight.download.base.c;
import io.reactivex.g;
import en2.f;
import erd.a;
import java.util.concurrent.TimeUnit;
import brd.z;
import en2.g;
import en2.h;
import en2.e;
import erd.g;
import crd.b;
import java.util.List;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;

public final class d implements Runnable	// class@0012a6
{
    public final e b;
    public final CDNUrl[] c;
    public final a$a d;

    public void d(e p0,CDNUrl[] p1,a$a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       String str;
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       Objects.requireNonNull(tb);
       if (tc != null && tc.length) {
          int i = 0;
          if (tc[i] == null || TextUtils.isEmpty(tc[i].mUrl)) {
          label_00fe :
             if (td != null) {
                td.a(LiveAvatarFailType.INVALID_PARAM, "inValid cdnUrls", new IllegalArgumentException("inValid cdnUrls"));
             }
          }else {
             CDNUrl mUrl = tc[i].mUrl;
             e e = tb.e;
             e f = tb.f;
             if (PatchProxy.isSupport(e.class)) {
                str = PatchProxy.applyThreeRefs(mUrl, Integer.valueOf(e), Integer.valueOf(f), tb, e.class, "5");
                if (str != PatchProxyResult.class) {
                label_0075 :
                   if (f.e(str)) {
                      if (!PatchProxy.applyVoidOneRefs(str, null, f.class, "4")) {
                         File uFile = new File(str);
                         if (uFile.exists() && !uFile.isDirectory()) {
                            uFile.setLastModified(System.currentTimeMillis());
                         }
                      }
                      if (td != null) {
                         td.onSuccess(str);
                      }
                   }else {
                      AtomicReference uAtomicRefer = new AtomicReference();
                      t ot = PatchProxy.applyTwoRefs(tc, str, tb, e.class, "2");
                      if (ot != PatchProxyResult.class) {
                      }else {
                         AtomicReference uAtomicRefer1 = new AtomicReference();
                         ot = t.create(new c(tb, tc, str, uAtomicRefer1)).doOnDispose(new f(uAtomicRefer1)).timeout(tb.b, TimeUnit.MILLISECONDS);
                      }
                      uAtomicRefer.set(ot.subscribeOn(tb.h).observeOn(tb.h).subscribe(new g(td, str), new h(tb, uAtomicRefer, td), new e(tb, uAtomicRefer)));
                      tb.g.add(uAtomicRefer);
                   }
                }
             }
             str = tb.a+"/"+v.h(mUrl)+"_"+e+"_"+f+".png";
             goto label_0075 ;
          }
       }else {
          goto label_00fe ;
       }
       return;
    }
}
