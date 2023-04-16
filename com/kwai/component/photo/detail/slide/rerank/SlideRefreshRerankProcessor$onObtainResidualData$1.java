package com.kwai.component.photo.detail.slide.rerank.SlideRefreshRerankProcessor$onObtainResidualData$1;
import java.lang.Runnable;
import pf5.o;
import java.util.List;
import kotlin.Pair;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import java.util.LinkedList;
import java.util.Collection;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.NoSuchElementException;
import pf5.m;
import com.kwai.component.photo.detail.slide.rerank.SlideRefreshRerankProcessor$onObtainResidualData$1$2;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class SlideRefreshRerankProcessor$onObtainResidualData$1 implements Runnable	// class@000aa6
{
    public final o b;
    public final List c;
    public final Pair d;

    public void SlideRefreshRerankProcessor$onObtainResidualData$1(o p0,List p1,Pair p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlideRefreshRerankProcessor$onObtainResidualData$1.class, "1")) {
          return;
       }
       if (!this.b.d.r()) {
          SlideRefreshRerankProcessor$onObtainResidualData$1 tb = this.b;
          Objects.requireNonNull(tb);
          SlideRefreshRerankProcessor$onObtainResidualData$1 obj = PatchProxy.apply(objArray, tb, oo, "11");
          boolean b = (obj != patchProxyRe)? obj.booleanValue(): tb.d.o1();
          if (b) {
             tb = this.b;
             obj = this.c;
             Objects.requireNonNull(tb);
             Iterator obj1 = PatchProxy.applyOneRefs(obj, tb, oo, "12");
             int i = 1;
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(obj.isEmpty()){
                b1 = tb.d.a0();
                if (b1 < 0) {
                   b1 = 0;
                }
                List list = tb.d.K0();
                if (!list.isEmpty() && (list.size() - b1) >= obj.size()) {
                   Iterator iterator = obj.iterator();
                   int i1 = 0;
                   while (true) {
                      if (iterator.hasNext()) {
                         Object obj2 = iterator.next();
                         int i2 = i1 + 1;
                         if (i1 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         i1 = i1 + b1;
                         i1 = a.g(obj2, list.get(i1)) ^ i;
                         if (!i1) {
                            i1 = i2;
                         }
                      }
                   }
                }
             label_00a4 :
                b1 = true;
             }
             b1 = false;
             if (b1) {
                this.b.f().clear();
                this.b.f().addAll(this.c);
                b1 = this.d.getSecond().booleanValue();
                if (b1) {
                   obj1 = this.c.iterator();
                   while (true) {
                      if (!obj1.hasNext()) {
                         throw new NoSuchElementException("Collection contains no element matching the predicate.");
                      }
                      QPhoto qPhoto = obj1.next();
                      BaseFeed uBaseFeed = (qPhoto.getEntity() != null)? 1: null;
                      if (uBaseFeed) {
                         BaseFeed entity = qPhoto.getEntity();
                         if (entity != null) {
                            objArray = r1.h1(entity);
                         }
                         obj1 = this.c.iterator();
                         while (obj1.hasNext()) {
                            BaseFeed entity1 = obj1.next().getEntity();
                            if (entity1 != null) {
                               r1.j5(entity1, objArray);
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }
                this.b.d.X(this.c, "nasa_residual");
                oo = this.b.c;
                if (oo != null) {
                   oo.a(b1);
                }
                CollectionsKt___CollectionsKt.V2(this.c, "\n", null, null, 0, null, SlideRefreshRerankProcessor$onObtainResidualData$1$2.INSTANCE, 30, null);
             }
          }
       }
       return;
    }
}
