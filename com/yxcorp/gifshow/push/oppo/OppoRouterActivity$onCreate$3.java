package com.yxcorp.gifshow.push.oppo.OppoRouterActivity$onCreate$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.oppo.OppoRouterActivity;
import java.lang.Object;
import qrd.l1;
import android.content.Intent;
import android.app.Activity;
import p45.f;
import com.kwai.android.pushlog.PushLogger;
import kotlin.Pair;
import com.kwai.android.common.bean.Channel;
import java.lang.String;
import java.lang.Enum;
import qrd.r0;
import java.lang.Throwable;

public final class OppoRouterActivity$onCreate$3 extends Lambda implements a	// class@001698
{
    public final OppoRouterActivity this$0;

    public void OppoRouterActivity$onCreate$3(OppoRouterActivity p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       try{
          OppoRouterActivity$onCreate$3 tthis$0 = this.this$0;
          tthis$0.jump(tthis$0.getIntent());
       }catch(java.lang.Exception e0){
          Pair[] pairArray = new Pair[]{r0.a("channel", Channel.OPPO.name())};
          PushLogger.c().f("tag_error_intent_data", "intent extra add", e0, pairArray);
       }
       try{
          this.this$0.finish();
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
