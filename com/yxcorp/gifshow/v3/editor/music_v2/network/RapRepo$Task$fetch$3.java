package com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task$fetch$3;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$Task;
import java.lang.String;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import java.util.List;
import kotlin.Pair;
import njd.a;
import qrd.j0;
import java.lang.IllegalStateException;
import trc.n0;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import trc.t0;
import trc.x0;
import ftd.l0;
import brd.v;
import java.lang.Integer;
import dsd.a;
import brd.g;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import faa.a;
import com.google.gson.JsonElement;
import q87.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo$a;
import com.yxcorp.gifshow.util.PostUtils;
import e17.i;

public final class RapRepo$Task$fetch$3 extends SuspendLambda implements p	// class@0010b6
{
    public final float $duration;
    public final String $sessionId;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public k0 p$;
    public final RapRepo$Task this$0;

    public void RapRepo$Task$fetch$3(RapRepo$Task p0,String p1,float p2,c p3){
       this.this$0 = p0;
       this.$sessionId = p1;
       this.$duration = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       RapRepo$Task$fetch$3 obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$fetch$3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new RapRepo$Task$fetch$3(this.this$0, this.$sessionId, this.$duration, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, RapRepo$Task$fetch$3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       RapRepo$Task$fetch$3 l$1;
       RapRepo$Task$fetch$3 l$0;
       a obj2;
       RapRepo$Task$fetch$3 task$fetch$33;
       Pair pair;
       String str;
       x0 ox0;
       RapRepo$Task$fetch$3 task$fetch$3 = this;
       RapRepo$Task$fetch$3 obj = p0;
       RapRepo$Task$fetch$3 obj1 = PatchProxy.applyOneRefs(obj, this, RapRepo$Task$fetch$3.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       try{
          obj1 = b.h();
          RapRepo$Task$fetch$3 label = task$fetch$3.label;
          RapRepo$Task$fetch$3 task$fetch$31 = 2;
          int i = 1;
          if (label != null) {
             try{
                if (label != i) {
                   if (label != task$fetch$31) {
                      if (label == 3) {
                         obj1 = task$fetch$3.I$0;
                         label = task$fetch$3.L$0;
                         j0.n(p0);
                      label_0194 :
                         task$fetch$3.this$0.d().b = obj1;
                         if (l0.k(label)) {
                            task$fetch$3.this$0.c().onNext(a.f(98));
                         }
                         obj1 = task$fetch$3.this$0;
                         obj1.b(obj, obj1.d());
                         if (l0.k(label)) {
                            t0 ot0 = task$fetch$3.this$0.d();
                            if (obj == null) {
                               obj = RapRepo.j.a();
                            }
                            ot0.i(obj);
                            obj1 = task$fetch$3.this$0;
                            obj1.c.g = obj1.d();
                            task$fetch$3.this$0.c().onNext(a.f(100));
                            task$fetch$3.this$0.c().onComplete();
                         }else {
                            task$fetch$3.this$0.c().onError(new RuntimeException("task inactive"));
                         }
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      task$fetch$31 = task$fetch$3.I$0;
                      l$1 = task$fetch$3.L$1;
                      l$0 = task$fetch$3.L$0;
                      j0.n(p0);
                      RapRepo$Task$fetch$3 task$fetch$32 = task$fetch$3.L$2;
                      obj2 = obj;
                   label_013d :
                      task$fetch$33 = l$1;
                      obj = task$fetch$32;
                      pair = obj2;
                      label = l$0;
                   label_0143 :
                      if (l0.k(label)) {
                         task$fetch$3.this$0.c().onNext(a.f(80));
                      }
                      str = pair.component1();
                      List list = pair.component2();
                      if (!TextUtils.isEmpty(str) && (list == null || (list.isEmpty() ^ i) != i)) {
                         task$fetch$3.this$0.c().onError(new RuntimeException("rap resource unavailable"));
                         return l1.a;
                      }else {
                         task$fetch$3.L$0 = label;
                         task$fetch$3.L$1 = task$fetch$33;
                         task$fetch$3.I$0 = task$fetch$31;
                         task$fetch$3.L$2 = obj;
                         task$fetch$3.L$3 = pair;
                         task$fetch$3.L$4 = str;
                         task$fetch$3.L$5 = list;
                         task$fetch$3.label = 3;
                         obj = task$fetch$3.this$0.a(new Music(), str, list, this);
                         if (obj == obj1) {
                            return obj1;
                         }else {
                            obj1 = task$fetch$31;
                            goto label_0194 ;
                         }
                      }
                   }
                }else {
                   label = task$fetch$3.L$0;
                   j0.n(p0);
                label_0066 :
                   RapRepo$Task$fetch$3 task$fetch$34 = label;
                   task$fetch$33 = obj;
                   x0 subMusicStyl = task$fetch$33.a().subMusicStyle;
                   if (l0.k(task$fetch$34)) {
                      task$fetch$3.this$0.c().onNext(a.f(30));
                   }
                   if (task$fetch$33.a().c() != i) {
                      task$fetch$3.this$0.c().onError(new RuntimeException("rap request failed, status: "+task$fetch$33.a().c()));
                      return l1.a;
                   }else {
                      obj2 = a.D();
                      StringBuilder str1 = "request result: ";
                      JsonElement jsonElement = task$fetch$33.i();
                      str = (jsonElement != null)? jsonElement.toString(): null;
                      Object[] objArray = new Object[0];
                      obj2.s("RapRepo", str1+str, objArray);
                      pair = task$fetch$3.this$0.e(task$fetch$33);
                      if (pair != null) {
                         label = task$fetch$34;
                         ox0 = subMusicStyl;
                         Pair pair1 = pair;
                         goto label_0143 ;
                      }else {
                         task$fetch$3.L$0 = task$fetch$34;
                         task$fetch$3.L$1 = task$fetch$33;
                         task$fetch$3.I$0 = subMusicStyl;
                         task$fetch$3.L$2 = pair;
                         task$fetch$3.label = task$fetch$31;
                         obj2 = task$fetch$3.this$0.f(task$fetch$33, task$fetch$3.$sessionId, task$fetch$3.$duration, subMusicStyl, this);
                         if (obj2 == obj1) {
                            return obj1;
                         }else {
                            l$0 = task$fetch$34;
                            l$1 = task$fetch$33;
                            ox0 = subMusicStyl;
                            goto label_013d ;
                         }
                      }
                   }
                }
             }catch(com.yxcorp.retrofit.model.RetrofitException e0){
                i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
                task$fetch$3.this$0.c().onError(e0);
             }
          }else {
             j0.n(p0);
             label = task$fetch$3.p$;
             n0 on0 = task$fetch$3.this$0.c.c();
             l$1 = task$fetch$3.$sessionId;
             if (l$1 == null) {
                str = "";
             }
             task$fetch$3.L$0 = label;
             task$fetch$3.label = i;
             obj = on0.b(l$1, task$fetch$3.this$0.d().e(), task$fetch$3.$duration, this);
             if (obj == obj1) {
                return obj1;
             }else {
                goto label_0066 ;
             }
          }
       }catch(java.util.concurrent.CancellationException e0){
          task$fetch$3.this$0.c().onError(e0);
       }catch(com.yxcorp.retrofit.model.RetrofitException e0){
       }catch( e0){
       }
    }
}
