package com.kwai.framework.network.cronet.diagnostic.d;
import com.kuaishou.aegon.diagnostic.DiagnosticManager$a;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yv.a$a;
import yv.a$a$b;
import java.lang.System;
import o56.a;
import com.kwai.framework.model.user.QCurrentUser;
import android.os.Build$VERSION;
import java.lang.StringBuilder;
import android.os.Build;
import android.content.Context;
import f3b.k;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$LocalInfo;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$SingleNetworkRequestInfo;
import yv.a$a$d;
import yv.a$a$c;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$NetworkRequestInfoList;
import yv.a$a$a;
import com.kuaishou.aegon.diagnostic.DiagnosticResult$DomainStatistics;
import ta6.c;
import fg6.a;
import com.google.gson.Gson;
import q87.c;
import okhttp3.MediaType;
import com.google.protobuf.nano.MessageNano;
import okhttp3.RequestBody;
import wkd.b;
import eb6.a;
import brd.t;
import com.kwai.framework.network.cronet.diagnostic.c;
import com.kwai.framework.network.cronet.diagnostic.b;
import erd.g;
import crd.b;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;

public class d implements DiagnosticManager$a	// class@0017aa
{

    public void d(){
       super();
    }
    public void a(DiagnosticResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       int i = 0;
       try{
          a$a uoa = new a$a();
          a$a$b uoa$b = new a$a$b();
          uoa$b.a = System.currentTimeMillis();
          uoa$b.b = a.a;
          String id = (QCurrentUser.ME != null)? QCurrentUser.ME.getId(): "";
          uoa$b.c = id;
          uoa$b.d = a.x;
          uoa$b.e = a.A;
          uoa$b.f = a.m;
          uoa$b.g = String.valueOf(Build$VERSION.SDK_INT);
          uoa$b.h = Build.MANUFACTURER+"\("+Build.MODEL+"\)";
          uoa$b.i = k.b(a.B);
          DiagnosticResult localInfo = p0.localInfo;
          uoa$b.k = localInfo.ssid;
          uoa$b.j = localInfo.connectionType;
          uoa$b.l = localInfo.downstreamThroughputKbps;
          uoa$b.m = localInfo.nqeScore;
          uoa.a = uoa$b;
          uoa.b = this.c(p0.failureRequestInfo);
          a$a$c[] uoa$cArray = new a$a$c[p0.dialTestRequestInfoList.length];
          for (int i1 = 0; i1 < p0.dialTestRequestInfoList.length; i1 = i1 + 1) {
             uoa$cArray[i1] = new a$a$c();
             uoa$cArray[i1].a = this.b(p0.dialTestRequestInfoList[i1].dialTestType);
             uoa$cArray[i1].b = this.d(p0.dialTestRequestInfoList[i1].networkRequestInfoList);
          }
          uoa.c = uoa$cArray;
          a$a$a uoa$a = new a$a$a();
          p0 = p0.domainStatistics;
          uoa$a.a = p0.domain;
          uoa$a.b = p0.totalCnt;
          uoa$a.c = p0.failCnt;
          uoa$a.d = p0.beginTimestamp;
          uoa$a.e = p0.endTimestamp;
          uoa.d = uoa$a;
          Object[] objArray1 = new Object[i];
          c.C().w("AegonDiagnosticResultReporter", "Reporting Diagnostic Result: "+a.a.q(uoa), objArray1);
          b.a(-1545223115).a(RequestBody.create(MediaType.parse("application/x-protobuf"), MessageNano.toByteArray(uoa))).subscribe(c.b, b.b);
       }catch(java.lang.Exception e8){
          Object[] objArray = new Object[i];
          c.C().t("AegonDiagnosticResultReporter", e8.toString(), objArray);
       }
       return;
    }
    public final int b(int p0){
       int i = 1;
       if (p0 != i) {
          i = 2;
          if (p0 != i) {
             return 0;
          }
       }
       return i;
    }
    public final a$a$d c(DiagnosticResult$SingleNetworkRequestInfo p0){
       a$a$d obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a$d();
       obj.a = p0.startTimestamp;
       obj.b = p0.resourceType;
       obj.c = p0.isPreload;
       obj.d = p0.domain;
       obj.o = p0.url;
       obj.p = p0.latestUrl;
       obj.e = p0.domainResolvedIp;
       obj.g = p0.protocol;
       obj.f = p0.errorName;
       obj.h = p0.errorCode;
       obj.k = p0.httpCode;
       obj.n = p0.responseSize;
       obj.j = p0.srttMs;
       obj.i = p0.totalCostMs;
       obj.l = p0.dnsCostMs;
       obj.m = p0.connectCostMs;
       return obj;
    }
    public final a$a$d[] d(DiagnosticResult$SingleNetworkRequestInfo[] p0){
       a$a$d[] obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a$d[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          obj[i] = this.c(p0[i]);
       }
       return obj;
    }
}
