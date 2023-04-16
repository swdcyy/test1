package com.yxcorp.gifshow.webview.cookie.g;
import java.lang.String;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.retrofit.e;
import ua6.b;
import ua6.b$a;
import wkd.b;
import ia0.g;
import com.yxcorp.retrofit.f;
import java.util.Set;
import java.util.Collection;
import java.lang.StringBuilder;
import java.util.Iterator;
import qk.t0;
import com.yxcorp.utility.TextUtils;
import java.net.URLEncoder;
import ekd.n0;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.text.DateFormat;
import java.util.Date;
import java.lang.System;
import com.kwai.yoda.bridge.YodaBaseWebView;
import uv8.g1;
import q87.c;
import com.kuaishou.webkit.WebView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import ry7.e;
import o56.c;
import o56.a;
import xf6.l;
import xf6.h;
import java.util.concurrent.Future;

public final class g	// class@001750
{
    public static final ImmutableList a;
    public static final ImmutableList b;
    public static final ImmutableList c;
    public static final Set d;
    public static final Pattern e;
    public static String f;
    public static String g;
    public static Future h;

    static {
       String[] stringArray = new String[]{"yuncheapp.cn","getkwai.com","kwaixiaodian.com","chenzhongkj.com"};
       g.a = ImmutableList.of("www.gifshow.com", "www.kuaishou.com", "www.kuaishoupay.com", "www.kwai.com", "m.viviv.com", "www.kwaishop.com", "im.kwaishop.com", "yximgs.com", "chenzhongtech.com", "etoote.com", "kuaijinniu.com", "acfun.cn", stringArray);
       g.b = ImmutableList.of("sys", "appver", "did");
       g.c = ImmutableList.of("token", "client_key", "kuaishou.api_st", "kuaishou.h5_st");
       g.d = new HashSet();
       g.e = Pattern.compile("\\b\(\\w+\\s*=\).*\\b\\1");
    }
    public void g(){
       super();
    }
    public static Map a(){
       HashMap obj = PatchProxy.apply(null, null, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (e.h().e()) {
          obj.putAll(b.c.a().d());
       }else {
          b.a(-1961311520).e().d(obj);
       }
       g.g(obj);
       g.d.addAll(obj.keySet());
       return obj;
    }
    public static String b(){
       String str;
       StringBuilder obj = PatchProxy.apply(null, null, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Map map = g.a();
       Iterator iterator = map.keySet().iterator();
       while (iterator.hasNext()) {
          str = iterator.next();
          if (!g.b.contains(str)) {
             obj = obj+g.c(str, map.get(str))+";";
          }
       }
       t0 ot0 = g.b.iterator();
       while (ot0.hasNext()) {
          str = ot0.next();
          obj = obj+g.c(str, map.get(str))+";";
       }
       HashMap hashMap = new HashMap();
       if (e.h().e()) {
          hashMap.putAll(b.c.a().b());
       }else {
          b.a(-1961311520).e().b(hashMap);
       }
       ot0 = g.c.iterator();
       while (ot0.hasNext()) {
          str = ot0.next();
          obj = obj+g.c(str, hashMap.get(str))+";";
       }
       return obj;
    }
    public static String c(String p0,String p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{URLEncoder.encode(TextUtils.k(p0), "UTF-8"),URLEncoder.encode(TextUtils.k(p1), "UTF-8")};
       return n0.a("%s=%s", obj);
    }
    public static String d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, og, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (g.f == null) {
          String str = PatchProxy.apply(objArray, objArray, og, "11");
          if (str != patchProxyRe) {
          }else {
             SimpleDateFormat simpleDateFo = new SimpleDateFormat("d MMM yyyy HH:mm:ss \'GMT\'", Locale.US);
             simpleDateFo.setTimeZone(TimeZone.getTimeZone("GMT"));
             str = simpleDateFo.format(new Date((System.currentTimeMillis() - 0x2710)));
          }
          g.f = str;
       }
       return g.f;
    }
    public static void e(YodaBaseWebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       g1.C().w("CookieInjectManager", "initCookie", objArray);
       g.f(p0, p0.getUrl());
       return;
    }
    public static void f(YodaBaseWebView p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       YodaCookie.f.d(p1, false);
       return;
    }
    public static Map g(Map p0){
       String obj = PatchProxy.applyOneRefs(p0, null, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.a().c()) {
          p0.put("trace-context", l.g("trace-context", ""));
          obj = (h.w())? "1": "0";
          p0.put("X-KTrace-Id-Enabled", obj);
       }
       return p0;
    }
    public static void h(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       g1.C().w("CookieInjectManager", "sortOutCookie, url="+p1, objArray);
       Future h = g.h;
       if (h != null) {
          h.cancel(true);
       }
       return;
    }
}
