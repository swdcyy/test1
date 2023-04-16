package com.kwai.yoda.helper.WebViewMemOptHelper;
import com.kwai.yoda.helper.WebViewMemOptHelper$hiddenWebviews$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.helper.WebViewMemOptHelper$activityRefs$2;
import com.kwai.yoda.helper.WebViewMemOptHelper$rulesMap$2;
import com.kwai.yoda.helper.WebViewMemOptHelper$lastTrimMemoryTimes$2;
import com.kwai.yoda.helper.WebViewMemOptHelper$pendingTrimer$2;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kwai.yoda.helper.WebViewMemOptHelper$a;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import java.lang.reflect.Type;
import o97.a$a;
import com.kwai.yoda.helper.WebViewMemOptHelper$b;
import o97.b;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import java.util.List;
import el.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.yoda.helper.WebViewMemOptHelper$c;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.StringBuilder;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.lang.Math;
import android.view.Window;
import android.view.View;
import com.kwai.yoda.helper.WebViewMemOptHelper$d;
import java.lang.Runnable;
import ca7.v;

public final class WebViewMemOptHelper	// class@001267
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static WebViewMemOptHelper$a f;
    public static final WebViewMemOptHelper g;

    static {
       WebViewMemOptHelper.g = new WebViewMemOptHelper();
       WebViewMemOptHelper.a = s.c(WebViewMemOptHelper$hiddenWebviews$2.INSTANCE);
       WebViewMemOptHelper.b = s.c(WebViewMemOptHelper$activityRefs$2.INSTANCE);
       WebViewMemOptHelper.c = s.c(WebViewMemOptHelper$rulesMap$2.INSTANCE);
       WebViewMemOptHelper.d = s.c(WebViewMemOptHelper$lastTrimMemoryTimes$2.INSTANCE);
       WebViewMemOptHelper.e = s.c(WebViewMemOptHelper$pendingTrimer$2.INSTANCE);
    }
    public void WebViewMemOptHelper(){
       super();
    }
    public final LinkedList a(){
       Object obj = PatchProxy.apply(null, this, WebViewMemOptHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WebViewMemOptHelper.b.getValue();
    }
    public final Map b(){
       Object obj = PatchProxy.apply(null, this, WebViewMemOptHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WebViewMemOptHelper.a.getValue();
    }
    public final Map c(){
       Object obj = PatchProxy.apply(null, this, WebViewMemOptHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WebViewMemOptHelper.d.getValue();
    }
    public final WebViewMemOptHelper$a d(){
       WebViewMemOptHelper$a uoa1;
       Azeroth2 obj = PatchProxy.apply(null, this, WebViewMemOptHelper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (WebViewMemOptHelper.f == null) {
          obj = Azeroth2.B;
          a uoa = obj.q();
          if (uoa != null) {
             uoa1 = a$a.d(uoa, null, "yoda_mem_opt_config", WebViewMemOptHelper$a.class, new WebViewMemOptHelper$a(), 1, null);
             if (uoa1 != null) {
             label_0036 :
                WebViewMemOptHelper.f = uoa1;
                a uoa2 = obj.q();
                if (uoa2 != null) {
                   a$a.a(uoa2, null, "yoda_mem_opt_config", WebViewMemOptHelper$a.class, null, new WebViewMemOptHelper$b(), 9, null);
                }
             }
          }
          uoa1 = new WebViewMemOptHelper$a();
          goto label_0036 ;
       }
       WebViewMemOptHelper$a f = WebViewMemOptHelper.f;
       if (f == null) {
          a.S("config");
       }
       return f;
    }
    public final Map e(){
       Object obj = PatchProxy.apply(null, this, WebViewMemOptHelper.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WebViewMemOptHelper.e.getValue();
    }
    public final Map f(){
       Object obj = PatchProxy.apply(null, this, WebViewMemOptHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WebViewMemOptHelper.c.getValue();
    }
    public final boolean g(String p0,String p1){
       List list;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WebViewMemOptHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p1 != null) {
          if (!this.f().containsKey(p0)) {
             Type[] typeArray = new Type[]{String.class};
             a parameterize = a.getParameterized(List.class, typeArray);
             a.h(parameterize, "TypeToken.getParameteriz¡­java, String::class.java\)");
             Type type = parameterize.getType();
             Map map = this.f();
             Azeroth2 b = Azeroth2.B;
             a uoa = b.q();
             String str = "type";
             if (uoa != null) {
                a.h(type, str);
                list = uoa.a(null, p0, type, CollectionsKt__CollectionsKt.E());
                if (list != null) {
                label_0059 :
                   map.put(p0, list);
                   uoa = b.q();
                   if (uoa != null) {
                      a.h(type, str);
                      uoa.I5(null, p0, type, null, new WebViewMemOptHelper$c());
                   }
                }
             }
             list = CollectionsKt__CollectionsKt.E();
             goto label_0059 ;
          }
          Uri uri = Uri.parse(p1);
          List list1 = this.f().get(p0);
          if (list1 != null && !list1.isEmpty()) {
             Iterator iterator = list1.iterator();
             while (iterator.hasNext()) {
                a.h(uri, "uri");
                if (a.g(iterator.next(), uri.getAuthority()+uri.getPath())) {
                   i = true;
                   break ;
                }
             }
          }
       }
       return i;
    }
    public final void h(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewMemOptHelper.class, "12")) {
          return;
       }
       a.q(p0, "activity");
       if (!this.g("yoda_page_limit_domain", p1)) {
          return;
       }
       this.a().offer(new WeakReference(p0));
       if (this.a().size() > Math.max(this.d().pageLimit, 1)) {
          p0 = this.a().remove().get();
          if (p0 != null) {
             Window window = p0.getWindow();
             a.h(window, "window");
             View decorView = window.getDecorView();
             a.h(decorView, "window.decorView");
             decorView.setVisibility(4);
             v.f(new WebViewMemOptHelper$d(p0), 100);
          }
       }
       return;
    }
    public final void i(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewMemOptHelper.class, "13")) {
          return;
       }
       a.q(p0, "activity");
       if (!this.g("yoda_page_limit_domain", p1)) {
          return;
       }
       Iterator iterator = this.a().descendingIterator();
       a.h(iterator, "iterator");
       while (iterator.hasNext()) {
          Activity uActivity = iterator.next().get();
          if (uActivity != null && uActivity.hashCode() == p0.hashCode()) {
             iterator.remove();
             break ;
          }
       }
       return;
    }
}
