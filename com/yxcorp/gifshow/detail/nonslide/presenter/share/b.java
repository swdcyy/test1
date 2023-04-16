package com.yxcorp.gifshow.detail.nonslide.presenter.share.b;
import erd.g;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.c;
import java.lang.Object;
import w16.k;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import q46.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import lnc.p3;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import com.kwai.feature.post.api.startup.ShareGuideBlockConfig;
import java.lang.reflect.Type;
import java.util.Collection;
import ekd.q;
import q46.m;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import q46.n;
import wkd.b;
import m9a.c;
import java.util.concurrent.TimeUnit;
import brd.t;
import z2a.c;
import erd.a;

public final class b implements g	// class@0015dc
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       Object[] objArray1;
       p3 op3;
       b tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (p0.d != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "5")) {
             uoc = tb.w;
             if (uoc != null && !uoc.isDisposed()) {
                tb.w.dispose();
             }
             o a = o.a;
             Objects.requireNonNull(a);
             ShareGuideBlockConfig obj = PatchProxy.applyOneRefs(p0, a, o.class, "1");
             boolean b = true;
             int i = 0;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                a.p(p0, "event");
                String str = "PostPublishedWorkGuideConflictUtils";
                if (TextUtils.x(p0.a()) && p0.c() == null) {
                   objArray = new Object[i];
                   p3.D().w(str, "share float activityId is null or taskType is null", objArray);
                }else {
                   obj = a.t().getValue("shareGuideBlockConfig", ShareGuideBlockConfig.class, new ShareGuideBlockConfig());
                   if (obj != null) {
                      ShareGuideBlockConfig mBlockActivi = obj.mBlockActivityIds;
                      mBlockActivi = (mBlockActivi == null || mBlockActivi.isEmpty())? 1: null;
                      if (mBlockActivi) {
                         mBlockActivi = obj.mBlockTaskTypes;
                         String str1 = (mBlockActivi == null || mBlockActivi.isEmpty())? 1: null;
                         if (!str1) {
                         label_009c :
                            str1 = p0.a();
                            if (!TextUtils.x(str1) && !q.f(obj.mBlockActivityIds)) {
                               Optional optional = y.y(obj.mBlockActivityIds, new m(str1));
                               a.o(optional, "Iterables.tryFind\(blockC¡­ activityId\n      \)\n    }");
                               if (optional.isPresent()) {
                                  str1 = 1;
                               label_00c7 :
                                  if (str1) {
                                     objArray1 = new Object[i];
                                     p3.D().w(str, "share float panel block by post activityId", objArray1);
                                  }else {
                                     Integer integer = p0.c();
                                     ShareGuideBlockConfig shareGuideBl = Integer.MIN_VALUE;
                                     if (integer == null || (integer.intValue() != shareGuideBl && !q.f(obj.mBlockTaskTypes))) {
                                        Optional optional1 = y.y(obj.mBlockTaskTypes, new n(integer));
                                        a.o(optional1, "Iterables.tryFind\(blockC\x20\x02nt? -> item == taskType }\x00");
                                        if (optional1.isPresent()) {
                                           op3 = 1;
                                        label_0105 :
                                           if (op3) {
                                              objArray1 = new Object[i];
                                              p3.D().w(str, "share float panel block by post taskType", objArray1);
                                           }
                                        }
                                     }
                                     op3 = null;
                                     goto label_0105 ;
                                  }
                               }
                            }
                            str1 = null;
                            goto label_00c7 ;
                         }
                      }else {
                         goto label_009c ;
                      }
                   }
                   objArray = new Object[i];
                   p3.D().w(str, "share float panel block config is null", objArray);
                }
                b = false;
             }
             if (!b) {
                tb.W8();
             }else {
                b.a(0x7ea62562).a(p0.b());
             }
             tb.v = p0.b();
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, tb, uoc, "3")){
          p0 = tb.w;
          if (p0 != null && !p0.isDisposed()) {
             tb.w.dispose();
          }
          tb.w = t.timer(2000, TimeUnit.MICROSECONDS).doOnTerminate(new c(tb)).subscribe();
       }
       return;
    }
}
