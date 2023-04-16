package com.yxcorp.gifshow.util.KimMessageSender$sendMessageToKim$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.content.res.Resources;
import java.lang.String;
import ftd.k0;
import asd.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import qrd.l1;
import csd.b;
import okhttp3.RequestBody;
import retrofit2.q;
import lnc.p;
import okio.n;
import qrd.j0;
import java.lang.IllegalStateException;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import okio.l;
import okio.d;
import com.google.gson.Gson;
import java.lang.Class;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import retrofit2.q$b;
import cyd.a;
import retrofit2.h$a;
import okhttp3.MediaType;
import lnc.p4;
import com.yxcorp.gifshow.util.MarkDown;
import java.lang.StringBuilder;
import nsd.u;
import lnc.z8;
import retrofit2.p;
import java.lang.System;
import java.io.PrintStream;
import java.util.concurrent.CancellationException;
import ftd.l0;

public final class KimMessageSender$sendMessageToKim$1 extends SuspendLambda implements p	// class@001eec
{
    public final Resources $resource;
    public final k0 $scope;
    public final String $throwable;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public k0 p$;

    public void KimMessageSender$sendMessageToKim$1(Resources p0,String p1,k0 p2,c p3){
       this.$resource = p0;
       this.$throwable = p1;
       this.$scope = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       KimMessageSender$sendMessageToKim$1 osendMessage = new KimMessageSender$sendMessageToKim$1(this.$resource, this.$throwable, this.$scope, p1);
       osendMessage.p$ = p0;
       return osendMessage;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       n on;
       p op;
       Object obj = b.h();
       KimMessageSender$sendMessageToKim$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          try{
             p0 = this.p$;
             InputStream inputStream = SplitAssetHelper.open(this.$resource.getAssets(), "apk.json");
             a.o(inputStream, "resource.assets.open\(\"apk.json\"\)");
             on = l.k(inputStream);
          }catch(java.io.FileNotFoundException e0){
             on = null;
          }
          if (on != null) {
             d uod = l.d(on);
             op = new Gson().h(uod.readUtf8(), p.class);
             b.a(uod, null);
             b.a(on, null);
          }else {
             op = null;
          }
          q$b uob = new q$b();
          uob.c("https://kim-robot.kwaitalk.com");
          uob.b(a.a());
          q oq = uob.d();
          MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
          Gson gson = new Gson();
          StringBuilder str = "branch: ";
          p branch_name = (op != null)? op.branch_name: null;
          RequestBody requestBody = RequestBody.create(mediaType, gson.q(new p4(null, new MarkDown(str+branch_name+" \n```\n "+this.$throwable+" \n```"), 1, null)));
          a.o(requestBody, "body");
          this.L$0 = p0;
          this.L$1 = on;
          this.L$2 = op;
          this.L$3 = oq;
          this.L$4 = requestBody;
          this.label = 1;
          p0 = oq.a(z8.class).a("b8e53736-3091-4762-b101-241b49e82578", requestBody, this);
          if (p0 == e0) {
             return e0;
          }
       }
       System.out.println(p0.a());
       l0.f(this.$scope, null, 1, null);
       return l1.a;
    }
}
