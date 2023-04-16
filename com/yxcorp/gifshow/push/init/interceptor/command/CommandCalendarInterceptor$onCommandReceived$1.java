package com.yxcorp.gifshow.push.init.interceptor.command.CommandCalendarInterceptor$onCommandReceived$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.yxcorp.gifshow.push.init.interceptor.command.CommandCalendarInterceptor;
import com.google.gson.JsonObject;
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
import m6c.a;
import com.kwai.android.common.utils.PushLogcat;
import com.google.gson.Gson;
import com.yxcorp.gifshow.push.model.CmdCalendarData;
import com.google.gson.JsonElement;
import java.util.HashMap;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public final class CommandCalendarInterceptor$onCommandReceived$1 extends SuspendLambda implements p	// class@00165a
{
    public final JsonObject $json;
    public int label;
    public k0 p$;
    public final CommandCalendarInterceptor this$0;

    public void CommandCalendarInterceptor$onCommandReceived$1(CommandCalendarInterceptor p0,JsonObject p1,c p2){
       this.this$0 = p0;
       this.$json = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       CommandCalendarInterceptor$onCommandReceived$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, CommandCalendarInterceptor$onCommandReceived$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new CommandCalendarInterceptor$onCommandReceived$1(this.this$0, this.$json, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CommandCalendarInterceptor$onCommandReceived$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       CmdCalendarData obj = PatchProxy.applyOneRefs(p0, this, CommandCalendarInterceptor$onCommandReceived$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = a.a;
       if (!p0.d()) {
          PushLogcat.INSTANCE.i("KwaiPushSDK", "has no calendar permission");
          return l1.a;
       }else {
          obj = new Gson().c(this.$json, CmdCalendarData.class);
          if (obj != null) {
             HashMap hashMap = p0.c();
             List list = this.this$0.a(obj, hashMap);
             JsonObject jsonObject = this.this$0.b(obj, hashMap);
             p0.k(hashMap);
             p0.j(obj.getBizId(), obj.getPushBack(), jsonObject, list);
          }
          return l1.a;
       }
    }
}
