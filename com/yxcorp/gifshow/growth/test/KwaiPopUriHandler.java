package com.yxcorp.gifshow.growth.test.KwaiPopUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.growth.test.KwaiPopUriHandler$a;
import nsd.u;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import android.net.Uri;
import xh7.a;
import android.util.Base64;
import zsd.d;
import java.nio.charset.Charset;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import qn.m$b;
import qn.m;
import vn.d;
import qn.m$c;
import zn.b;
import java.lang.Integer;
import qn.m$d;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import ao.e;
import tb7.d;
import com.yxcorp.gifshow.growth.test.KwaiPopUriHandler$b;
import rn.b;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;
import yh7.a;

public final class KwaiPopUriHandler extends AnnotationUriHandler	// class@001544
{
    public static final KwaiPopUriHandler$a b;

    static {
       KwaiPopUriHandler.b = new KwaiPopUriHandler$a(null);
    }
    public void KwaiPopUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       String str = "KwaiPopUriHandler";
       String str1 = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiPopUriHandler.class, str1)) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "callback");
       if (SystemUtil.K() && a.d()) {
          String queryParamet = p0.g().getQueryParameter("bundleId");
          String str2 = "";
          if (queryParamet == null) {
             queryParamet = str2;
          }
          a.o(queryParamet, "request.uri.getQueryParameter\(\"bundleId\"\) ?: \"\"");
          String queryParamet1 = p0.g().getQueryParameter("componentName");
          String queryParamet2 = p0.g().getQueryParameter("type");
          String queryParamet3 = p0.g().getQueryParameter("minVer");
          if (queryParamet3 == null) {
             queryParamet3 = "-1";
          }
          a.o(queryParamet3, "request.uri.getQueryParameter\(\"minVer\"\) ?: \"-1\"");
          String queryParamet4 = p0.g().getQueryParameter("delay");
          if (queryParamet4 == null) {
             queryParamet4 = "500";
          }
          a.o(queryParamet4, "request.uri.getQueryParameter\(\"delay\"\) ?: \"500\"");
          String queryParamet5 = p0.g().getQueryParameter("params");
          String str3 = "{}";
          if (queryParamet5 != null) {
             byte[] uobyteArray = Base64.decode(queryParamet5, 8);
             a.o(uobyteArray, "Base64.decode\(params, Base64.URL_SAFE\)");
             String str4 = new String(uobyteArray, d.a);
             Object[] objArray = new Object[0];
             w.C().t(str, "Ω‚Œˆkwai¡¥π“º˛≈‰÷√:"+str4, objArray);
             str3 = str4;
          }
          d uod = null;
          if (a.g(queryParamet2, m$b.b.a())) {
             if (queryParamet1 == null) {
                queryParamet1 = "demo";
             }
             uod = new d(queryParamet, queryParamet1, str3);
             uod.q = true;
             if (!PatchProxy.applyVoidOneRefs(queryParamet3, uod, d.class, str1)) {
                a.p(queryParamet3, "<set-?>");
                uod.r = queryParamet3;
             }
          }else if(a.g(queryParamet2, m$c.b.a())){
             uod = new b(queryParamet, str3);
             str = p0.g().getQueryParameter("viewKey");
             if (str != null) {
                a.o(str, "it");
                uod.t(str);
             }
             uod.p(true);
             uod.s(Integer.parseInt(queryParamet3));
          }else if(a.g(queryParamet2, m$d.b.a())){
             JsonObject jsonObject = c.d(str3).r();
             str1 = d.h(jsonObject, "url", uod, 2, uod);
             if (str1 != null) {
                str2 = str1;
             }
             JsonElement jsonElement = jsonObject.e0("data");
             a.o(jsonElement, "it[\"data\"]");
             jsonObject = jsonElement.r();
             a.o(jsonObject, "it[\"data\"].asJsonObject");
             e uoe = new e(str2, jsonObject);
             uoe.m(true);
             uod = uoe;
          }
          if (uod != null) {
             k1.r(new KwaiPopUriHandler$b(uod), Long.parseLong(queryParamet4));
          }
       }
    label_0160 :
       p0.i(Uri.parse("kwai://home"));
       p1.a(new a(302));
       return;
    }
}
