package com.yxcorp.gifshow.BaseHomeAnnotationUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import uv8.f2;
import xh7.b;
import qh7.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.a;
import yh7.a;
import android.net.Uri;
import java.util.Objects;
import android.content.Intent;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import java.util.Map;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import os5.l;
import android.app.Activity;
import nf6.e;

public class BaseHomeAnnotationUriHandler extends AnnotationUriHandler	// class@0012df
{
    public f2 b;

    public void BaseHomeAnnotationUriHandler(){
       super();
       this.b = new f2();
    }
    public void c(b p0,c p1){
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseHomeAnnotationUriHandler uBaseHomeAnn = BaseHomeAnnotationUriHandler.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uBaseHomeAnn, "1")) {
          return;
       }
       Context uContext = p0.b();
       String str = "com.kwai.platform.krouter.return_intent";
       boolean b = false;
       if (p0.a(str, b)) {
          a uoa = new a(201);
          a b1 = uoa.b;
          BaseHomeAnnotationUriHandler tb = this.b;
          Uri uri = p0.g();
          Objects.requireNonNull(tb);
          Intent intent = PatchProxy.applyTwoRefs(uContext, uri, tb, f2.class, "4");
          if (intent != patchProxyRe) {
          }else {
             intent = new Intent();
             intent.setClass(uContext, UriRouterActivity.class);
             intent.setData(uri);
          }
          b1.put(str, intent);
          p1.a(uoa);
          return;
       }else {
          Object obj = PatchProxy.applyOneRefs(p0, this, uBaseHomeAnn, "2");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else {
             List pathSegments = p0.g().getPathSegments();
             if (!q.f(pathSegments) && TextUtils.n(pathSegments.get(b), "recruit")) {
                b = 1;
             }
             b2 = b;
          }
          int i = 200;
          if (b2 && d.a(-1492894991).X6(p0.g())) {
             p1.a(new a(i));
             return;
          }else {
             Uri uri1 = p0.g();
             Intent intent1 = (uContext instanceof Activity)? uContext.getIntent(): null;
             uri1 = f2.b(uContext, uri1, intent1, p0.c(int[].class, "com.kwai.platform.krouter.r_animation"));
             if (uri1 != null) {
                p0.i(uri1);
                if (("work").equals(uri1.getHost()) && e.c()) {
                   p0.o(0x10000000);
                }
                p1.a(new a(302));
             }else {
                p1.a(new a(i));
             }
             return;
          }
       }
    }
}
