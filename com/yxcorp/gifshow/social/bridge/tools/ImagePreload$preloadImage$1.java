package com.yxcorp.gifshow.social.bridge.tools.ImagePreload$preloadImage$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.util.ArrayList;
import android.app.Activity;
import f55.g;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import java.util.List;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.Iterator;
import com.yxcorp.gifshow.social.bridge.tools.ImagePreload$preloadImage$1$1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import ftd.z1;
import ojc.c;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import kotlinx.coroutines.AwaitKt;
import com.kwai.feature.api.social.bridge.beans.JsPreloadImagesResult;
import java.lang.Iterable;
import kotlin.Triple;
import java.lang.Number;
import java.lang.Boolean;
import dsd.a;
import com.kwai.feature.api.social.bridge.beans.JsPreloadImagesResult$a;

public final class ImagePreload$preloadImage$1 extends SuspendLambda implements p	// class@001d62
{
    public final Activity $activity;
    public final g $callback;
    public final ArrayList $urls;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public k0 p$;

    public void ImagePreload$preloadImage$1(ArrayList p0,Activity p1,g p2,c p3){
       this.$urls = p0;
       this.$activity = p1;
       this.$callback = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       ImagePreload$preloadImage$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, ImagePreload$preloadImage$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new ImagePreload$preloadImage$1(this.$urls, this.$activity, this.$callback, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ImagePreload$preloadImage$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       int i1;
       ArrayList uArrayList;
       ArrayList obj1;
       boolean b;
       ImagePreload$preloadImage$1 obj = PatchProxy.applyOneRefs(p0, this, ImagePreload$preloadImage$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       ImagePreload$preloadImage$1 tlabel = this.label;
       String str = null;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i) {
             obj = this.L$2;
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          uArrayList = new ArrayList();
          obj1 = new ArrayList();
          Iterator iterator2 = this.$urls.iterator();
          while (iterator2.hasNext()) {
             uArrayList.add(c.a(null, null, new ImagePreload$preloadImage$1$1(this, iterator2.next(), obj1, null), 3, null));
          }
          z1[] oz1Array = new z1[str];
          Object[] objArray = uArrayList.toArray(oz1Array);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          this.L$0 = p0;
          this.L$1 = uArrayList;
          this.L$2 = obj1;
          this.label = i;
          if (AwaitKt.d(Arrays.copyOf(objArray, objArray.length), this) == obj) {
             return obj;
          }else {
             ArrayList uArrayList1 = obj1;
          }
       }
       p0 = new JsPreloadImagesResult();
       if (!obj instanceof Collection || !obj.isEmpty()) {
          Iterator iterator1 = obj.iterator();
          while (true) {
             if (iterator1.hasNext()) {
                boolean b1 = (iterator1.next().component1().intValue() != i)? true: false;
                if (a.a(b1).booleanValue()) {
                   i1 = 1;
                   break ;
                }
             }
          }
          p0.result = i1 ^ i;
          uArrayList = new ArrayList();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             b = (obj1.component1().intValue() != i)? true: false;
             if (a.a(b).booleanValue()) {
                uArrayList.add(obj1);
             }
          }
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             Triple triple = iterator.next();
             str = triple.component2();
             String str1 = triple.component3();
             if (p0.infos == null) {
                p0.infos = new ArrayList();
             }
             p0.infos.add(new JsPreloadImagesResult$a(str, str1));
          }
          this.$callback.onSuccess(p0);
          return l1.a;
       }
       i1 = 0;
       goto label_00c0 ;
    }
}
