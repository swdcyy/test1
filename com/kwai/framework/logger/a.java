package com.kwai.framework.logger.a;
import brd.x;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import w96.e;
import w96.f;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import njd.a;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import brd.t;
import brd.w;
import com.kwai.robust.PatchProxyResult;
import erd.g;
import java.lang.Number;
import java.lang.System;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.log.model.CommonParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import q2b.h$b;
import k2b.u1;
import java.lang.StringBuilder;

public class a implements x	// class@001658
{
    public int b;
    public int c;
    public String d;
    public ClientEvent$ElementPackage e;
    public ClientContent$ContentPackage f;
    public e0 g;
    public FeedLogCtx h;
    public final g i;
    public final g j;

    public void a(String p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2){
       super();
       this.i = new e(this);
       this.j = new f(this);
       this.d = p0;
       this.e = p1;
       this.f = p2;
    }
    public void a(String p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,e0 p3){
       super();
       this.i = new e(this);
       this.j = new f(this);
       this.d = p0;
       this.e = p1;
       this.f = null;
       this.g = p3;
    }
    public void a(String p0,ClientEvent$ElementPackage p1,ClientContent$ContentPackage p2,e0 p3,FeedLogCtx p4){
       super();
       this.i = new e(this);
       this.j = new f(this);
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
    }
    public static void a(a p0,a p1){
       p0.d(p1);
    }
    public static void b(a p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, a.class, "4")) {
       }else if(p1 instanceof KwaiException){
          p0.d(p1.mResponse);
       }
       return;
    }
    public w apply(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.doOnNext(this.i).doOnError(this.j);
    }
    public int c(a p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj != null) {
          return obj;
       }
       if (p0.b() == 1) {
          return 7;
       }
       return 8;
    }
    public final void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       long l = System.currentTimeMillis();
       JsonElement jsonElement = p0.i();
       if (jsonElement != null && jsonElement.E()) {
          jsonElement = jsonElement.r().e0("csLogCorrelateInfo");
          if (jsonElement != null) {
             CommonParams uCommonParam = new CommonParams();
             uCommonParam.mCsLogCorrelateInfo = jsonElement;
             h$b uob = (TextUtils.isEmpty(this.d))? h$b.d(this.c(p0), this.c): h$b.e(this.c(p0), this.d);
             uob.g(uCommonParam);
             a te = this.e;
             if (te != null) {
                uob.k(te);
             }
             te = this.f;
             if (te != null) {
                uob.h(te);
             }
             uob.l(this.h);
             u1.p0("", this.g, uob);
             this.d+"耗费时长: "+(System.currentTimeMillis() - l)+" 操作结果：  "+uob.c()+" 关联id： "+jsonElement;
          }
       }
       return;
    }
}
