package com.yxcorp.gifshow.push.PushBells$getDuration$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.content.Context;
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
import java.lang.StringBuilder;
import android.net.Uri;
import android.media.MediaPlayer;
import java.lang.Integer;
import dsd.a;
import java.lang.IllegalStateException;

public final class PushBells$getDuration$2 extends SuspendLambda implements p	// class@001613
{
    public final Context $context;
    public final int $resId;
    public int label;
    public k0 p$;

    public void PushBells$getDuration$2(Context p0,int p1,c p2){
       this.$context = p0;
       this.$resId = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       PushBells$getDuration$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, PushBells$getDuration$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new PushBells$getDuration$2(this.$context, this.$resId, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PushBells$getDuration$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       MediaPlayer obj = PatchProxy.applyOneRefs(p0, this, PushBells$getDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = Uri.parse("android.resource://"+this.$context.getPackageName()+'/'+this.$resId);
       a.o(p0, "Uri.parse\(\"android.resou¡­t.packageName}/${resId}\"\)");
       obj = new MediaPlayer();
       obj.setDataSource(this.$context, p0);
       obj.setAudioStreamType(3);
       obj.prepare();
       obj.release();
       return a.f(obj.getDuration());
    }
}
