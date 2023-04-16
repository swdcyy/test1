package com.kwai.platform.krouter.handler.annotation.BaseAnnotationHandler;
import rh7.a;
import java.lang.String;
import xh7.b;
import qh7.c;
import com.kwai.robust.PatchProxyResult;
import wh7.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.a;
import java.util.Objects;
import java.lang.ClassLoader;
import java.lang.Throwable;
import vh7.a;
import android.app.Activity;
import com.kwai.platform.krouter.handler.activity.ActivityHandler;
import java.util.List;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.kwai.platform.krouter.handler.annotation.BaseAnnotationHandler$a;
import yh7.a;
import android.net.Uri;
import zh7.b;
import java.lang.CharSequence;
import android.text.TextUtils;

public abstract class BaseAnnotationHandler extends a	// class@001292
{
    public a b;
    public String c;

    public void BaseAnnotationHandler(String p0){
       super();
       this.c = p0;
    }
    public void c(b p0,c p1){
       a a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseAnnotationHandler.class, "1")) {
          return;
       }
       BaseAnnotationHandler tb = this.b;
       Context uContext = p0.b();
       Objects.requireNonNull(tb);
       a uoa1 = PatchProxy.applyOneRefs(uContext, tb, uoa, "1");
       if (uoa1 != patchProxyRe) {
       }else {
          uoa1 = tb.a;
          if (uoa1 == null) {
             try{
                tb.a = uContext.getClassLoader().loadClass(tb.b);
             }catch(java.lang.ClassNotFoundException e3){
                a.a(" error while parsing class. ", e3);
             }
             uoa1 = tb.a;
          }
       }
       ActivityHandler uActivityHan = null;
       if (Activity.class.isAssignableFrom(uoa1)) {
          uActivityHan = new ActivityHandler(uoa1);
          uActivityHan.a(this.b.b());
       }else if(AnnotationUriHandler.class.isAssignableFrom(uoa1)){
          tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(uActivityHan, tb, uoa, "2");
          if (obj != patchProxyRe) {
             uActivityHan = obj;
          }else if(tb.d == null){
             _monitor_enter(tb);
             if (tb.d == null) {
                a = tb.a;
                if (a != null) {
                   try{
                      tb.d = a.newInstance();
                   }catch(java.lang.Exception e0){
                      a.a("create uri handler failed", e0);
                   }
                }
             }
          }
          uActivityHan = tb.d;
          uActivityHan.a(this.b.b());
       }
       if (uActivityHan != null) {
          uActivityHan.b(p0, new BaseAnnotationHandler$a(this, p1));
       }else {
          p1.a(new a(404));
       }
       return;
    }
    public String e(b p0){
       String obj = PatchProxy.applyOneRefs(p0, this, BaseAnnotationHandler.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = p0.g();
       obj = uri.getQuery();
       String scheme = uri.getScheme();
       if ((this.c).equals("kwai")) {
          if ("kwai".equals(scheme)) {
             return b.a(uri);
          }
       }else if(TextUtils.isEmpty(obj) || (!obj.contains("noReplace=1") && ("kwai".equals(scheme) || (this.c).equals(scheme)))){
          return b.a(uri);
       }
       return b.b(uri);
    }
}
