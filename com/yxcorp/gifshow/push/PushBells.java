package com.yxcorp.gifshow.push.PushBells;
import android.os.Build$VERSION;
import android.media.SoundPool;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.media.SoundPool$Builder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import msd.a;
import com.yxcorp.gifshow.push.PushBells$playOneShotNoSuspend$1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.android.common.coroutines.PushScope;
import com.yxcorp.gifshow.push.PushBells$playOneShotNoSuspend$2;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.push.PushBells$playOneShot$1;
import csd.b;
import ftd.u;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.concurrent.TimeUnit;
import ftd.v;
import com.yxcorp.gifshow.push.PushBells$a;
import android.media.SoundPool$OnLoadCompleteListener;
import ftd.r0;
import java.lang.Number;
import com.yxcorp.gifshow.push.PushBells$getDuration$2;
import android.os.Handler;
import android.os.Looper;
import i6c.e;
import java.lang.Runnable;
import qrd.l1;

public final class PushBells	// class@001617
{
    public static final SoundPool a;
    public static final PushBells b;

    static {
       SoundPool soundPool;
       PushBells.b = new PushBells();
       int i = 1;
       int i1 = 5;
       if (Build$VERSION.SDK_INT < 23) {
          soundPool = new SoundPool(i, i1, 100);
       }else {
          soundPool = new SoundPool$Builder().setAudioAttributes(new AudioAttributes$Builder().setUsage(i1).setContentType(2).build()).setMaxStreams(i).build();
          a.o(soundPool, "SoundPool.Builder\(\) // Éè¡­Streams\(1\)\n      .build\(\)");
       }
       PushBells.a = soundPool;
    }
    public void PushBells(){
       super();
    }
    public static void b(PushBells p0,Context p1,int p2,int p3,a p4,int p5,Object p6){
       int i = (p5 & 0x04)? 1: p3;
       PushBells$playOneShotNoSuspend$1 iNSTANCE = (p5 & 0x08)? PushBells$playOneShotNoSuspend$1.INSTANCE: p4;
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(PushBells.class) || !PatchProxy.applyVoidFourRefs(p1, Integer.valueOf(p2), Integer.valueOf(i), iNSTANCE, p0, PushBells.class, "2")) {
          a.p(p1, "context");
          a.p(iNSTANCE, "finishCallback");
          PushBells$playOneShotNoSuspend$2 oplayOneShot = new PushBells$playOneShotNoSuspend$2(p1, p2, i, iNSTANCE, null);
          a.f(PushScope.INSTANCE, 0, 0, v10, 3, 0);
       }
       return;
    }
    public final Object a(Context p0,int p1,int p2,a p3,c p4){
       object obj1;
       PushBells$playOneShot$1 i$3;
       PushBells$playOneShot$1 oplayOneShot;
       e uoe1;
       PushBells$playOneShot$1 i$1;
       PushBells$playOneShot$1 i$0;
       PushBells$playOneShot$1 l$1;
       PushBells$playOneShot$1 oplayOneShot1;
       PushBells$playOneShot$1 oplayOneShot2;
       int i4;
       u obj3;
       SoundPool a;
       Object obj = this;
       object oobject = p0;
       int i = p1;
       object oobject1 = p3;
       object oobject2 = p4;
       PushBells pushBells = PushBells.class;
       int i1 = 1;
       int i2 = 2;
       if (PatchProxy.isSupport(pushBells)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),oobject1,oobject2};
          obj1 = PatchProxy.apply(objArray, obj, pushBells, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (oobject2 instanceof PushBells$playOneShot$1) {
          obj1 = oobject2;
          PushBells$playOneShot$1 label = obj1.label;
          int i3 = Integer.MIN_VALUE;
          if (label & i3) {
             obj1.label = label - i3;
          label_004f :
             PushBells$playOneShot$1 result = obj1.result;
             Object obj2 = b.h();
             PushBells$playOneShot$1 label1 = obj1.label;
             c uoc = null;
             if (label1 != null) {
                if (label1 != i1) {
                   if (label1 == i2) {
                      i$3 = obj1.I$3;
                      j0.n(result);
                      label1 = obj1.L$2;
                      oplayOneShot = obj1.I$2;
                   label_012e :
                      long l = (long)result.intValue();
                      long l1 = (l <= 0)? TimeUnit.SECONDS.toMillis(5): l;
                      PushBells.a.play(oplayOneShot, 0x3f800000, 0x3f800000, 1, (i$3 - 1), 0x3f800000);
                      Handler handler = new Handler(Looper.getMainLooper());
                      if (label1 != null) {
                         e uoe = new e(label1);
                         uoe1 = uoe;
                      }
                      handler.postDelayed(uoe1, l1);
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   i$3 = obj1.L$3;
                   i$1 = obj1.I$1;
                   i$0 = obj1.I$0;
                   l$1 = obj1.L$1;
                   j0.n(result);
                   oplayOneShot1 = obj1.L$0;
                   oplayOneShot = obj1.L$2;
                   oplayOneShot2 = obj1.J$0;
                }
             }else {
                j0.n(result);
                oplayOneShot2 = TimeUnit.SECONDS.toMillis(5);
                a = PushBells.a;
                a.load(oobject, i, i1);
                u ou = v.c(uoc, i1, uoc);
                a.setOnLoadCompleteListener(new PushBells$a(ou));
                obj1.L$0 = obj;
                obj1.L$1 = oobject;
                obj1.I$0 = i;
                i4 = p2;
                obj1.I$1 = i4;
                obj1.L$2 = oobject1;
                obj1.J$0 = oplayOneShot2;
                obj1.L$3 = ou;
                obj1.label = i1;
                Object obj4 = ou.C(obj1);
                if (obj4 == obj2) {
                   return obj2;
                }else {
                   l$1 = oobject;
                   obj3 = ou;
                   i$1 = i4;
                   result = obj4;
                   i$0 = i;
                   oplayOneShot1 = obj;
                }
             }
             i4 = result.intValue();
             if (i$1 >= i1) {
                i1 = i$1;
             }
             obj1.L$0 = oplayOneShot1;
             obj1.L$1 = l$1;
             obj1.I$0 = i$0;
             obj1.I$1 = i$1;
             obj1.L$2 = oplayOneShot;
             obj1.J$0 = oplayOneShot2;
             obj1.L$3 = i$3;
             obj1.I$2 = i4;
             obj1.I$3 = i1;
             obj1.label = 2;
             Objects.requireNonNull(oplayOneShot1);
             obj3 = a.b(PushScope.INSTANCE, null, null, new PushBells$getDuration$2(l$1, i$0, uoc), 3, null).C(obj1);
             if (obj3 == obj2) {
                return obj2;
             }else {
                result = obj3;
                i$3 = i1;
                uoe1 = oplayOneShot;
                oplayOneShot = i4;
                goto label_012e ;
             }
          }
       }
       PushBells$playOneShot$1 oplayOneShot3 = new PushBells$playOneShot$1(obj, oobject2);
       goto label_004f ;
    }
}
