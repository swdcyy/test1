package com.kuaishou.merchant.basic.util.a;
import erd.o;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.basic.util.b;
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
import ot3.f;
import erd.g;
import java.lang.Iterable;
import ot3.k;
import java.util.concurrent.TimeUnit;
import ot3.g;
import ot3.i;
import ot3.j;
import java.lang.Exception;
import java.lang.Throwable;

public final class a implements o	// class@0015d2
{
    public final long b;

    public void a(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       a tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          ot = PatchProxy.applyTwoRefs(p0, Long.valueOf(tb), null, uob, "2");
          if (ot != patchProxyRe) {
          label_00a0 :
             return ot.onErrorReturn(new i(p0)).map(new j(p0));
          }
       }
       if (p0 != null) {
          if (tb - null >= 0) {
             ArrayList uArrayList = PatchProxy.applyOneRefs(p0, null, uob, "1");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                Iterator iterator1 = p0.iterator();
                while (iterator1.hasNext()) {
                   uArrayList.add(iterator1.next().getUrl());
                }
             }
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                ImageRequest imageRequest = ImageRequest.c(str);
                t ot1 = PatchProxy.applyTwoRefs(str, imageRequest, null, uob, "4");
                if (ot1 != patchProxyRe) {
                }else {
                   PublishSubject publishSubje = PublishSubject.g();
                   ot1 = publishSubje.doOnSubscribe(new f(str, imageRequest, publishSubje));
                }
                uArrayList1.add(ot1);
             }
             ot = t.concatDelayError(uArrayList1).flatMap(new k(p0)).timeout(tb, TimeUnit.MILLISECONDS).doAfterNext(new g(p0));
             goto label_00a0 ;
          }else {
             throw new Exception("timeout not correct ", new Throwable().fillInStackTrace());
          }
       }else {
          throw new Exception("sourceUrls == null", new Throwable().fillInStackTrace());
       }
    }
}
