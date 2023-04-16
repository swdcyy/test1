package com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor$h;
import erd.o;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.CommonOperateBubbleProcessor;
import java.lang.Object;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import a0c.g;
import q87.c;
import rzb.k;
import java.util.Objects;
import rzb.q;
import pzb.a;
import brd.t;
import java.util.List;
import hzb.a;
import qrd.l1;
import com.yxcorp.gifshow.postentrance.bubblev2.exception.BubbleThrowable;
import java.lang.Throwable;
import nsd.u;
import java.util.ArrayList;
import rzb.l;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import rzb.m;
import io.reactivex.g;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import java.util.concurrent.TimeUnit;
import rzb.j;
import rzb.n;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postentrance.bubblev2.processor.a;
import erd.g;

public final class CommonOperateBubbleProcessor$h implements o	// class@001039
{
    public final CommonOperateBubbleProcessor b;

    public void CommonOperateBubbleProcessor$h(CommonOperateBubbleProcessor p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       k a;
       Object[] objArray1;
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, CommonOperateBubbleProcessor$h.class, "1");
       if (ot != patchProxyRe) {
       }else {
          String str = "bubbleInfo";
          a.p(p0, str);
          int i = 0;
          Object[] objArray = new Object[i];
          g.C().w("home_entrance_bubble", "CommonOperateBubbleProcessor start download res", objArray);
          a = k.a;
          CommonOperateBubbleProcessor$h tb = this.b;
          Objects.requireNonNull(tb);
          a uoa = PatchProxy.applyOneRefs(p0, tb, CommonOperateBubbleProcessor.class, "5");
          if (uoa != patchProxyRe) {
          }else {
             a.p(p0, str);
             uoa = new a(p0);
          }
          Objects.requireNonNull(a);
          ot = PatchProxy.applyOneRefs(uoa, a, k.class, "2");
          if (ot != patchProxyRe) {
          }else {
             a.p(uoa, "bubbleResProvider");
             List list = uoa.c();
             if (list == null) {
                objArray1 = new Object[i];
                g.C().w("home_entrance_bubble", "BubbleResDownloadUtil failed_show_bubble: fetch download res invalid", objArray1);
                a uoa1 = new a();
                uoa1.f(7);
                uoa1.g("download, fetch download res invalid");
                BubbleThrowable uBubbleThrow = new BubbleThrowable(uoa1, null, false, 6, null);
                ot1 = t.error(list);
                a.o(ot1, "Observable.error\(\n      ¡­lid\"\n          }\)\n      \)");
             }else {
                q.c(list, new l(uoa, new ArrayList()));
                if (list.isEmpty()) {
                   objArray1 = new Object[i];
                   g.C().w("home_entrance_bubble", "BubbleResDownloadUtil download res already downloaded", objArray1);
                   ot1 = t.just(uoa.b());
                }else {
                   ot1 = t.create(new m(uoa, list));
                   if (HomePostEntranceExpUtil.b()) {
                      ot1 = ot1.timeout(6000, TimeUnit.MILLISECONDS);
                   }
                   ot1 = ot1.map(new j(uoa)).onErrorResumeNext(n.b).subscribeOn(d.b);
                }
                a.o(ot1, "if \(downloadDataList.isE¡­KING\)\n          }\n      }");
             }
             ot = ot1;
          }
          ot = ot.doOnError(new a(p0));
       }
       return ot;
    }
}
