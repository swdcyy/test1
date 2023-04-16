package com.yxcorp.gifshow.HomeHandler;
import com.yxcorp.gifshow.BaseHomeAnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import xh7.a;
import android.content.Context;
import java.lang.CharSequence;
import android.app.Activity;
import android.content.Intent;
import uv8.f2;
import yh7.a;

public class HomeHandler extends BaseHomeAnnotationUriHandler	// class@0012ea
{

    public void HomeHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeHandler.class, "1")) {
          return;
       }
       Context uContext = p0.b();
       if ((p0.g().toString()).contains("home/currentorhome")) {
          BaseHomeAnnotationUriHandler tb = this.b;
          Uri uri = p0.g();
          Intent intent = (uContext instanceof Activity)? uContext.getIntent(): null;
          tb.a(uContext, uri, intent);
          p1.a(new a(200));
          return;
       }else {
          super.c(p0, p1);
          return;
       }
    }
}
