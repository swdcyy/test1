package com.yxcorp.gifshow.social.bridge.tools.ImagePreload$preloadImage$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.social.bridge.tools.ImagePreload$preloadImage$1;
import java.lang.String;
import java.util.List;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlin.Result;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import android.content.Context;
import com.android.library.image.interfaces.IConfig;
import w7.c;
import w7.d;
import kb.c;
import com.yxcorp.gifshow.social.bridge.tools.ImagePreload$preloadImage$1$1$a;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import java.util.concurrent.Executor;
import ftd.o1;
import kb.e;
import dsd.e;
import kotlin.Triple;
import java.lang.Integer;
import dsd.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.social.bridge.tools.LoadImageException;

public final class ImagePreload$preloadImage$1$1 extends SuspendLambda implements p	// class@001d61
{
    public final List $resultList;
    public final String $url;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public k0 p$;
    public final ImagePreload$preloadImage$1 this$0;

    public void ImagePreload$preloadImage$1$1(ImagePreload$preloadImage$1 p0,String p1,List p2,c p3){
       this.this$0 = p0;
       this.$url = p1;
       this.$resultList = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       ImagePreload$preloadImage$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, ImagePreload$preloadImage$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new ImagePreload$preloadImage$1$1(this.this$0, this.$url, this.$resultList, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ImagePreload$preloadImage$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       String message;
       Throwable obj = PatchProxy.applyOneRefs(p0, this, ImagePreload$preloadImage$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       ImagePreload$preloadImage$1$1 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          this.L$0 = p0;
          this.L$1 = p0;
          this.L$2 = this;
          this.label = i;
          p0 = new h(IntrinsicsKt__IntrinsicsJvmKt.d(this));
          c.a(this.this$0.$activity).H(this.$url).f(new ImagePreload$preloadImage$1$1$a(p0, this), o1.a(z0.f()));
          p0 = p0.b();
          if (p0 == b.h()) {
             e.c(this);
          }
          if (p0 == obj) {
             return obj;
          }
       }
       p0 = Result.constructor-impl(new Triple(a.f(i), p0, ""));
       obj = Result.exceptionOrNull-impl(p0);
       if (obj != null) {
          String str = "error msg empty";
          if (obj instanceof LoadImageException) {
             Throwable throwable = obj;
             Integer integer = a.f(throwable.getErrorCode());
             String url = throwable.getUrl();
             message = obj.getMessage();
             if (message != null) {
                str = message;
             }
             p0 = new Triple(integer, url, str);
          }else {
             Integer integer1 = a.f(-2);
             ImagePreload$preloadImage$1$1 t$url = this.$url;
             message = obj.getMessage();
             if (message != null) {
                str = message;
             }
             p0 = new Triple(integer1, t$url, str);
          }
       }
       this.$resultList.add(p0);
       return l1.a;
    }
}
