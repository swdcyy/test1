package com.yxcorp.plugin.search.utils.q;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import nfd.k1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import brd.t;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.imagepipeline.request.ImageRequest;
import io.reactivex.subjects.PublishSubject;
import nfd.e1;
import erd.g;
import java.lang.Iterable;
import nfd.i1;
import brd.m;
import java.util.concurrent.TimeUnit;
import com.yxcorp.plugin.search.utils.r;
import nfd.h1;

public final class q implements o	// class@0007b0
{
    public final long b;

    public void q(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       q tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k1 ok1 = k1.class;
       if (PatchProxy.isSupport(ok1)) {
          ot = PatchProxy.applyTwoRefs(p0, Long.valueOf(tb), null, ok1, "2");
          if (ot != patchProxyRe) {
          label_009a :
             return ot.onErrorReturn(new r(p0)).map(new h1(p0));
          }
       }
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, null, ok1, "1");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          if (p0 != null) {
             Iterator iterator1 = p0.iterator();
             while (iterator1.hasNext()) {
                uArrayList.add(iterator1.next().getUrl());
             }
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ImageRequest imageRequest = ImageRequest.c(str);
          t ot1 = PatchProxy.applyTwoRefs(str, imageRequest, null, ok1, "4");
          if (ot1 != patchProxyRe) {
          }else {
             PublishSubject publishSubje = PublishSubject.g();
             ot1 = publishSubje.doOnSubscribe(new e1(imageRequest, str, publishSubje));
          }
          uArrayList1.add(ot1);
       }
       ot = t.concat(uArrayList1).flatMap(new i1(p0)).firstElement().C().timeout(tb, TimeUnit.MILLISECONDS);
       goto label_009a ;
    }
}
