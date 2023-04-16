package cu1.c$a;
import androidx.lifecycle.Observer;
import cu1.c;
import java.lang.Object;
import hu1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import zs1.b;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.Iterator;
import hu1.a;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import java.util.Map;
import android.view.View;
import java.lang.StringBuilder;
import cu1.b;
import java.lang.Enum;
import ou1.u;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import hu1.c;
import du1.d;
import ht1.a;
import ou1.o;
import nu1.c;
import eu1.d;
import java.lang.Float;
import pu1.m;
import lu1.c;
import st1.a;
import mu1.i;
import lu1.q;
import ku1.b;
import ut1.j;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import msd.p;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import va1.l0;
import java.lang.IllegalStateException;
import java.util.Set;
import java.util.Map$Entry;
import com.kuaishou.live.viewcontroller.ViewController;

public final class c$a implements Observer	// class@001e4f
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       c value;
       View view;
       PatchProxyResult patchProxyRe;
       String str1;
       Iterator iterator2;
       b uob;
       c uoc3;
       Iterator obj = this;
       PatchProxyResult obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c$a.class, "1")) {
       }else {
          c$a b = obj.b;
          String str = "it";
          a.o(obj1, str);
          Objects.requireNonNull(b);
          c uoc = c.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, uoc, "2")) {
             b.c0(LiveCommonLogTag.MULTI_PK, "begin renderLayout", "logParam", b.f.p());
             b.c.removeAllViews();
             ArrayList uArrayList = new ArrayList();
             uArrayList.addAll(obj1.c);
             uArrayList.addAll(obj1.a());
             uArrayList.addAll(obj1.a);
             obj1 = PatchProxyResult.class;
             HashMap hashMap = PatchProxy.applyOneRefs(uArrayList, b, uoc, "3");
             if (hashMap != obj1) {
             }else {
                hashMap = new HashMap();
                Iterator iterator1 = uArrayList.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      a uoa = iterator1.next();
                      LiveMultiPkLayoutViewType liveMultiPkL = uoa.c();
                      HashMap hashMap1 = PatchProxy.applyTwoRefs(liveMultiPkL, hashMap, b, uoc, "5");
                      if (hashMap1 != obj1) {
                      }else {
                         hashMap1 = hashMap.get(liveMultiPkL);
                         if (hashMap1 == null) {
                            hashMap1 = new HashMap();
                            hashMap.put(liveMultiPkL, hashMap1);
                         }
                      }
                      HashMap hashMap2 = b.a.get(liveMultiPkL);
                      if (hashMap2 != null) {
                         LiveMultiPkRenderChildViewController liveMultiPkR = hashMap2.get(uoa.b());
                         if (liveMultiPkR != null) {
                            a.o(liveMultiPkR, str);
                            hashMap1.put(uoa.b(), liveMultiPkR);
                            HashMap hashMap3 = b.a.get(liveMultiPkL);
                            if (hashMap3 != null) {
                               LiveMultiPkRenderChildViewController liveMultiPkR1 = hashMap3.remove(uoa.b());
                            }
                            view = liveMultiPkR.X2();
                            patchProxyRe = obj1;
                            str1 = str;
                            iterator2 = iterator1;
                         label_01fd :
                            if (view != null) {
                               d uod = uoa.a();
                               if (!PatchProxy.applyVoidTwoRefs(view, uod, b, uoc, "4")) {
                                  ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                                  if (layoutParams != null) {
                                     layoutParams.width = uod.width;
                                     layoutParams.height = uod.height;
                                     if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                                        layoutParams.leftMargin = uod.leftMargin;
                                        layoutParams.topMargin = uod.topMargin;
                                     }
                                  }else {
                                     view.setLayoutParams(uod);
                                  }
                               }
                               if (view.getParent() == null) {
                                  b.c.addView(view);
                               }else if(!l0.g()){
                                  int i = a.g(view.getParent(), b.c) ^ 0x01;
                                  if (i) {
                                     throw new IllegalStateException("child vc add to wrong container!");
                                  }
                               }
                            }
                         label_0255 :
                            obj1 = patchProxyRe;
                            str = str1;
                            iterator1 = iterator2;
                         }
                      }
                      c uoc1 = PatchProxy.applyOneRefs(uoa, b, uoc, "7");
                      if (uoc1 != obj1) {
                         patchProxyRe = obj1;
                         str1 = str;
                         iterator2 = iterator1;
                      }else {
                         LiveMultiPkLayoutViewType liveMultiPkL1 = uoa.c();
                         String str2 = uoa.b();
                         b.Z(LiveCommonLogTag.MULTI_PK, "createViewControllerByType "+liveMultiPkL1);
                         switch (b.a[liveMultiPkL1.ordinal()]){
                             case 1:
                               patchProxyRe = obj1;
                               str1 = str;
                               iterator2 = iterator1;
                               uob = new b(b.d);
                               break;
                             case 2:
                             case 4:
                             case 5:
                             case 3:
                               if (m.m(b.f)) {
                                  patchProxyRe = obj1;
                                  str1 = str;
                                  iterator2 = iterator1;
                                  c uoc2 = new c(liveMultiPkL1, b.a(liveMultiPkL1), b.e, b.d, b.h, b.i, b.f.g);
                               }else {
                                  patchProxyRe = obj1;
                                  str1 = str;
                                  iterator2 = iterator1;
                                  q oq = new q(liveMultiPkL1, b.a(liveMultiPkL1), b.e, b.d, b.h);
                               }
                               break;
                             case 6:
                               uoc3 = new c(uoa.a().a);
                            label_0145 :
                               patchProxyRe = obj1;
                               str1 = str;
                               iterator2 = iterator1;
                            label_01a6 :
                               uob = uoc3;
                               break;
                             case 7:
                             case 8:
                               uoc3 = new o(b.a(liveMultiPkL1), b.e, b.d, b.i);
                               goto label_0145 ;
                               break;
                             case 9:
                             case 10:
                               uoc3 = new u(b.a(liveMultiPkL1), b.e, b.d, b.i);
                               goto label_0145 ;
                               break;
                             default:
                               patchProxyRe = obj1;
                               str1 = str;
                               iterator2 = iterator1;
                               uoc3 = null;
                               goto label_01a6 ;
                         }
                         c f = b.f;
                         value = b.c;
                         Objects.requireNonNull(uob);
                         if (!PatchProxy.applyVoidThreeRefs(str2, f, value, uob, LiveMultiPkRenderChildViewController.class, "10")) {
                            a.p(str2, "viewKey");
                            a.p(f, "pkCoreModel");
                            a.p(value, "renderContainer");
                            uob.n = str2;
                            uob.j = f;
                            uob.l = f.w();
                            uob.k = f.l();
                            uob.m = f.o();
                            uob.o = value;
                         }
                         uoc1 = uob;
                      }
                      hashMap1.put(uoa.b(), uoc1);
                      Objects.requireNonNull(uoc1, "null cannot be cast to non-null type com.kuaishou.live.viewcontroller.ViewController");
                      b.g.invoke(Boolean.TRUE, uoc1);
                      view = uoc1.X2();
                      goto label_01fd ;
                   }
                }
             }
             if (!PatchProxy.applyVoid(null, b, uoc, "6")) {
                obj = b.a.entrySet().iterator();
                while (obj.hasNext()) {
                   Iterator iterator = obj.next().getValue().entrySet().iterator();
                   while (iterator.hasNext()) {
                      value = iterator.next().getValue();
                      Objects.requireNonNull(value, "null cannot be cast to non-null type com.kuaishou.live.viewcontroller.ViewController");
                      b.g.invoke(Boolean.FALSE, value);
                   }
                }
                b.a.clear();
             }
             b.a.putAll(hashMap);
             b.c0(LiveCommonLogTag.MULTI_PK, "end renderLayout", "logParam", b.f.p());
          }
       }
       return;
    }
}
