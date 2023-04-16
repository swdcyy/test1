package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$defferMusic$1$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$defferMusic$1;
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
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.utils.a;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import qrd.j0;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2;
import wkd.b;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import com.yxcorp.gifshow.v3.editor.music_v2.network.a;
import ftd.k;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.gifshow.music.utils.a$a;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2;
import msd.l;
import dsd.e;

public final class RapRepo$Task$downloadMusic$2$defferMusic$1$1 extends SuspendLambda implements p	// class@0010b2
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public k0 p$;
    public final RapRepo$Task$downloadMusic$2$defferMusic$1 this$0;

    public void RapRepo$Task$downloadMusic$2$defferMusic$1$1(RapRepo$Task$downloadMusic$2$defferMusic$1 p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       RapRepo$Task$downloadMusic$2$defferMusic$1$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2$defferMusic$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new RapRepo$Task$downloadMusic$2$defferMusic$1$1(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$downloadMusic$2$defferMusic$1$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RapRepo$Task$downloadMusic$2$defferMusic$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       RapRepo$Task$downloadMusic$2$defferMusic$1$1 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          RapRepo$Task$downloadMusic$2 this$0 = this.this$0.this$0.this$0;
          RapRepo$Task$downloadMusic$2$defferMusic$1 obj1 = b.a(-905856758);
          a.o(obj1, "Singleton.get\(CloudMusic¡­nloadManager::class.java\)");
          Object obj2 = obj1;
          obj1 = this.this$0.this$0;
          RapRepo$Task$downloadMusic$2 $music = obj1.$music;
          RapRepo$Task$downloadMusic$2 $cdnUrls = obj1.$cdnUrls;
          this.L$0 = this.p$;
          this.L$1 = this$0;
          this.L$2 = obj2;
          this.L$3 = $music;
          this.L$4 = $cdnUrls;
          this.L$5 = this;
          this.label = i;
          p0 = new l(IntrinsicsKt__IntrinsicsJvmKt.d(this), i);
          p0.u();
          a uoa = new a(p0, this$0, obj2, $music, $cdnUrls);
          CDNUrl[] uCDNUrlArray = new CDNUrl[0];
          Object[] objArray = $cdnUrls.toArray(uCDNUrlArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          obj2.d($music, $cdnUrls.get(0).mUrl, objArray, i);
          RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2 task$downloa = new RapRepo$Task$downloadMusic$2$defferMusic$1$1$downloadMusicAsync$$inlined$suspendCancellableCoroutine$lambda$2(i, this$0, obj2, $music, $cdnUrls);
          p0.w(v12);
          p0 = p0.r();
          if (p0 == b.h()) {
             e.c(this);
          }
          if (p0 == obj) {
             return obj;
          }
       }
       return p0;
    }
}
