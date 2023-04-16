package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$fetchRapMusicState$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
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
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.Objects;
import android.content.Intent;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Float;
import java.lang.Integer;
import dsd.a;
import brd.g;
import trc.o0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$fetch$3;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

public final class RapRepo$fetchRapMusicState$1 extends SuspendLambda implements p	// class@0010ba
{
    public final float $duration;
    public final RapRepo$Task $task;
    public Object L$0;
    public int label;
    public k0 p$;
    public final RapRepo this$0;

    public void RapRepo$fetchRapMusicState$1(RapRepo p0,RapRepo$Task p1,float p2,c p3){
       this.this$0 = p0;
       this.$task = p1;
       this.$duration = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       RapRepo$fetchRapMusicState$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$fetchRapMusicState$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new RapRepo$fetchRapMusicState$1(this.this$0, this.$task, this.$duration, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$fetchRapMusicState$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, RapRepo$fetchRapMusicState$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.h();
       RapRepo$fetchRapMusicState$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.$task;
          float f = this.$duration + 0x3f000000;
          RapRepo$fetchRapMusicState$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          String str = PatchProxy.apply(null, tthis$0, RapRepo.class, "11");
          if (str != patchProxyRe) {
          }else {
             str = tthis$0.h.getIntent().getStringExtra("editSessionId");
          }
          Object obj1 = str;
          this.L$0 = p0;
          this.label = 1;
          Objects.requireNonNull(tlabel);
          if (PatchProxy.isSupport(RapRepo$Task.class)) {
             p0 = PatchProxy.applyThreeRefs(Float.valueOf(f), obj1, this, tlabel, RapRepo$Task.class, "1");
             if (p0 == patchProxyRe) {
             label_0077 :
                tlabel.b.onNext(a.f(0));
                p0 = a.i(new o0(CoroutineExceptionHandler.u0, tlabel), new RapRepo$Task$fetch$3(tlabel, obj1, f, null), this);
                if (p0 != b.h()) {
                   p0 = l1.a;
                }
             }
          }else {
             goto label_0077 ;
          }
          if (p0 == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
