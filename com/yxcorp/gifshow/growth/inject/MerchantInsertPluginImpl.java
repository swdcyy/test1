package com.yxcorp.gifshow.growth.inject.MerchantInsertPluginImpl;
import bqa.a;
import java.lang.Object;
import java.util.LinkedHashMap;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;
import java.lang.Long;
import kotlin.Result;
import com.yxcorp.gifshow.growth.inject.MerchantInsertPluginImpl$getMerchantId$1$1;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ekd.x0;
import zsd.u;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import q2b.h$b;
import k2b.e0;
import k2b.u1;
import android.content.Intent;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.growth.abtest.FeedBigCardAB;
import com.yxcorp.gifshow.growth.abtest.LocalABTest;
import ekd.k$a;
import ekd.k;
import yb7.e;
import fg6.a;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import xna.e;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import android.util.Log;
import ekd.k$b;
import zsd.d;
import java.util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.OutputStream;
import android.app.Application;
import o56.a;

public class MerchantInsertPluginImpl implements a	// class@0013b6
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final Map i;
    public final Map j;
    public final int k;
    public final int l;

    public void MerchantInsertPluginImpl(){
       super();
       this.b = "webview";
       this.c = "merchant";
       this.d = "selfdetail";
       this.e = "1815060338";
       this.f = "https://app.kwaixiaodian.com/merchant/shop/detail?id=";
       this.g = "https://app.kwaixiaodian.com/page/kwaishop-goods-detail-h5-vue/detail?id=";
       this.h = -1;
       this.i = new LinkedHashMap();
       this.j = new LinkedHashMap();
       this.k = 33;
       this.l = 32;
    }
    public final long F(Uri p0){
       long l;
       List pathSegments;
       long l1;
       String str = "uri.pathSegments";
       MerchantInsertPluginImpl obj = PatchProxy.applyOneRefs(p0, this, MerchantInsertPluginImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.j.containsKey(p0)) {
          Long longx = this.j.get(p0);
          l = (longx != null)? longx.longValue(): this.h;
          return l;
       }else {
          obj = this.h;
          String host = p0.getHost();
          MerchantInsertPluginImpl$getMerchantId$1$1 iNSTANCE = MerchantInsertPluginImpl$getMerchantId$1$1.INSTANCE;
          if (a.g(host, this.c)) {
             pathSegments = p0.getPathSegments();
             a.o(pathSegments, str);
             if (pathSegments.isEmpty() ^ 0x01) {
                List pathSegments1 = p0.getPathSegments();
                a.o(pathSegments1, str);
                if (a.g(this.d, CollectionsKt___CollectionsKt.m2(pathSegments1)) && a.g(this.e, x0.a(p0, "fid"))) {
                   l = iNSTANCE.invoke(p0, this.h);
                label_00a3 :
                   l1 = l;
                }
             }
          }else if(a.g(host, this.b)){
             str = x0.a(p0, "url");
             if (str != null) {
                Object obj1 = null;
                if (u.q2(str, this.f, false, 2, obj1) || u.q2(str, this.g, false, 2, obj1)) {
                   l = iNSTANCE.invoke(p0, this.h);
                   goto label_00a3 ;
                }
             }else {
                return this.h;
             }
          }
          Result.constructor-impl(l1.a);
          this.j.put(p0, Long.valueOf(l1));
          return l1;
       }
    }
    public final void S(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInsertPluginImpl.class, "9")) {
          return;
       }
       String str = "MERCHANT_CARD_INJECT_TRIGGERED";
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = str;
       i3 oi3 = i3.f();
       String str1 = p0.toString();
       if (str1 == null) {
          str1 = "";
       }
       oi3.d("uri", str1);
       uElementPack.params = oi3.e();
       h$b uob = h$b.e(0, str);
       uob.k(uElementPack);
       u1.p0("", null, uob);
       Result.constructor-impl(l1.a);
       return;
    }
    public boolean e5(Intent p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantInsertPluginImpl merchantInse = MerchantInsertPluginImpl.class;
       Uri obj = PatchProxy.applyOneRefs(p0, this, merchantInse, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = null;
       Uri data = (p0 != null)? p0.getData(): obj;
       if (data == null) {
          this.q0(false, "uri is null", obj);
          return false;
       }else {
          Object obj1 = PatchProxy.apply(obj, this, merchantInse, "2");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("merchantInjectEnable", true);
          if (!b) {
             this.q0(false, "not enable", obj);
             return false;
          }else {
             Boolean uBoolean = PatchProxy.apply(obj, this, merchantInse, "7");
             if (uBoolean == patchProxyRe) {
                uBoolean = FeedBigCardAB.o.d();
             }
             if (!uBoolean.booleanValue()) {
                this.q0(false, "not hit exp", obj);
                return false;
             }else {
                long l = this.F(data);
                if (!l - this.h) {
                   this.q0(false, "merchantId illegal", data);
                   return false;
                }else {
                   boolean b1 = this.i.containsKey(Long.valueOf(l));
                   int i = b1 ^ 0x01;
                   String str = (b1)? "uri duplicated": "inject";
                   this.q0(i, str, data);
                   return (b1 ^ 0x01);
                }
             }
          }
       }
    }
    public final void g0(boolean p0,String p1,Uri p2){
       if (PatchProxy.isSupport(MerchantInsertPluginImpl.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, MerchantInsertPluginImpl.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MERCHANT_CARD_INJECT_RESULT";
       i3 oi3 = i3.f();
       oi3.a("success", Boolean.valueOf(p0));
       String str = "reason";
       if (p1 == null) {
          p1 = "";
       }
       oi3.d(str, p1);
       str = "uri";
       if (p2 != null) {
          p1 = p2.toString();
          if (p1 != null) {
          label_0049 :
             oi3.d(str, p1);
             uElementPack.params = oi3.e();
             h$b uob = h$b.e(0, "MERCHANT_CARD_INJECT_RESULT");
             uob.k(uElementPack);
             u1.p0("", null, uob);
             Result.constructor-impl(l1.a);
             return;
          }
       }
       p1 = "";
       goto label_0049 ;
    }
    public void gA(String p0,boolean p1,String p2){
       l1 a;
       if (PatchProxy.isSupport(MerchantInsertPluginImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, MerchantInsertPluginImpl.class, "4")) {
          return;
       }
       a.p(p0, "base64GzipInjectParams");
       if (!p1) {
          this.g0(true, "success", null);
          return;
       }else {
          byte[] uobyteArray = e.a(k.a().a(p0));
          if (uobyteArray != null) {
             Charset uTF_8 = StandardCharsets.UTF_8;
             a.o(uTF_8, "StandardCharsets.UTF_8");
             Uri uri = this.i.get(Long.valueOf(a.a.h(new String(uobyteArray, uTF_8), e.class).photoId));
             this.g0(false, "inject failed, rollback, "+p2, uri);
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             Activity uActivity = uActivityCon.e();
             if (uActivity != null) {
                a.b(b.j(uActivity, String.valueOf(uri)), null);
                a = l1.a;
             label_0090 :
                a = Result.constructor-impl(a);
                Throwable throwable = Result.exceptionOrNull-impl(a);
                if (throwable != null) {
                   this.g0(false, "inject failed, rollback error, "+Log.getStackTraceString(throwable), null);
                }
                return;
             }
          }
          a = null;
          goto label_0090 ;
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public final String n(long p0,Uri p1){
       ByteArrayOutputStream obj;
       MerchantInsertPluginImpl merchantInse = MerchantInsertPluginImpl.class;
       if (PatchProxy.isSupport(merchantInse)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, merchantInse, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          this.i.put(Long.valueOf(p0), p1);
          k$b uob = k.b();
          String str = a.a.q(new e(this.k, p0, 0));
          a.o(str, "Gsons.KWAI_GSON.toJson\(merchantInjectObject\)");
          Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
          byte[] bytes = str.getBytes(d.a);
          a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          byte[] uobyteArray = null;
          if (bytes != null) {
             obj = new ByteArrayOutputStream(bytes.length);
             GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(obj);
             gZIPOutputSt.write(bytes);
             gZIPOutputSt.flush();
             gZIPOutputSt.close();
             obj.flush();
             obj.close();
             uobyteArray = obj.toByteArray();
             gZIPOutputSt.close();
             obj.close();
          }
          return "kwai://home/feature?feedInject="+uob.a(uobyteArray)+"&injectTask="+this.k;
       }catch(java.lang.Exception e0){
       }
    }
    public final void q0(boolean p0,String p1,Uri p2){
       String str1;
       if (PatchProxy.isSupport(MerchantInsertPluginImpl.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, MerchantInsertPluginImpl.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MERCHANT_CARD_SHOULD_INJECT";
       i3 oi3 = i3.f();
       oi3.a("shouldInject", Boolean.valueOf(p0));
       oi3.d("msg", p1);
       String str = "uri";
       if (p2 != null) {
          str1 = p2.toString();
          if (str1 != null) {
          label_0045 :
             oi3.d(str, str1);
             uElementPack.params = oi3.e();
             h$b uob = h$b.e(0, "MERCHANT_CARD_SHOULD_INJECT");
             uob.k(uElementPack);
             u1.p0("", null, uob);
             Result.constructor-impl(l1.a);
             return;
          }
       }
       str1 = "";
       goto label_0045 ;
    }
    public boolean yN(Intent p0){
       Uri obj = PatchProxy.applyOneRefs(p0, this, MerchantInsertPluginImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       Uri data = (p0 != null)? p0.getData(): obj;
       if (data == null) {
          this.g0(false, "uri is null", obj);
          return false;
       }else {
          long l = this.F(data);
          if (!l - this.h) {
             this.g0(false, "merchantId illegal", data);
             return false;
          }else {
             b uob = b.j(a.b(), this.n(l, data));
             uob.o(0x10000000);
             a.b(uob, obj);
             this.S(data);
             Boolean uBoolean = Result.constructor-impl(Boolean.TRUE);
             Throwable throwable = Result.exceptionOrNull-impl(uBoolean);
             if (throwable != null) {
                this.g0(false, "inject error "+Log.getStackTraceString(throwable), data);
                uBoolean = Boolean.FALSE;
             }
             return uBoolean.booleanValue();
          }
       }
    }
}
