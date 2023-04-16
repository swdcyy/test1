package com.kwai.feature.api.social.reminder.push.SocialPushKt$updatePushBarAsClosed$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sx5.i;
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
import android.os.Looper;
import hm8.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.IllegalStateException;

public final class SocialPushKt$updatePushBarAsClosed$2 extends SuspendLambda implements p	// class@0011c4
{
    public final i $data;
    public int label;
    public k0 p$;

    public void SocialPushKt$updatePushBarAsClosed$2(i p0,c p1){
       this.$data = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       SocialPushKt$updatePushBarAsClosed$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, SocialPushKt$updatePushBarAsClosed$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new SocialPushKt$updatePushBarAsClosed$2(this.$data, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SocialPushKt$updatePushBarAsClosed$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       SharedPreferences$Editor obj = PatchProxy.applyOneRefs(p0, this, SocialPushKt$updatePushBarAsClosed$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       a.g(Looper.myLooper(), Looper.getMainLooper());
       obj = b.a.edit();
       obj.putString(b.d("user")+"barState", b.e(this.$data.d));
       g.a(obj);
       return l1.a;
    }
}
