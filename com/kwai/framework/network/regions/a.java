package com.kwai.framework.network.regions.a;
import erd.o;
import com.kwai.framework.network.regions.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.retrofit.model.KwaiException;
import brd.t;
import njd.a;
import com.kwai.framework.network.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Response;
import okhttp3.Request;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import okhttp3.Headers;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.retrofit.model.Region;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$InvalidRegionEvent;
import okhttp3.HttpUrl;
import k2b.e0;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.u1;
import wb6.c;
import java.lang.Integer;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$UrlRequestStatus;
import java.lang.System;
import wkd.b;
import pb6.o;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import java.util.concurrent.TimeUnit;
import wb6.a;
import wb6.b;
import erd.g;
import crd.b;

public final class a implements o	// class@00180f
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       Object[] objArray;
       String str2;
       String str3;
       Object[] obj1;
       Region region;
       ClientStat$StatPackage statPackage;
       ClientStat$InvalidRegionEvent invalidRegio;
       b b2;
       int i3;
       ClientStat$StatPackage statPackage1;
       ClientStat$InvalidRegionEvent invalidRegio1;
       ClientStat$UrlRequestStatus urlRequestSt;
       long l;
       long l1;
       int i4;
       c uoc;
       Object[] objArray1;
       a uoa;
       ClientStat$UrlRequestStatus urlRequestSt1;
       ClientStat$StatPackage statPackage2;
       a uoa1;
       b uob1;
       a b = this.b;
       Throwable throwable = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (!throwable instanceof KwaiException) {
          t ot = t.error(throwable);
       }else {
          KwaiException mResponse = throwable.mResponse;
          boolean i = mResponse.b();
          boolean i1 = 0x20b70;
          boolean b1 = true;
          int i2 = 0;
          k ok = (i1 <= i && i <= 0x20bd3)? 1: null;
          StringBuilder str = 2;
          String str1 = "3";
          Object obj = null;
          if (ok && !PatchProxy.applyVoidOneRefs(mResponse, obj, k.class, str1)) {
             try{
                String[] stringArray = new String[12];
                stringArray[i2] = "clue";
                stringArray[b1] = "Dispatch.interceptor.reject";
                stringArray[str] = "requestId";
                stringArray[3] = mResponse.n().request().header("X-REQUESTID");
                stringArray[4] = "userId";
                stringArray[5] = QCurrentUser.me().getId();
                stringArray[6] = "did";
                stringArray[7] = a.a;
                stringArray[8] = "responseHeader";
                stringArray[9] = mResponse.n().headers().toString();
                stringArray[10] = "responseBody";
                stringArray[11] = a.a.p(mResponse.i());
                k.a(i2, stringArray);
             }catch(java.lang.Exception e0){
                ExceptionHandler.handleCaughtException(e0);
             }
          }
       }
    }
}
