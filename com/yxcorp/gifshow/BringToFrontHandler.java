package com.yxcorp.gifshow.BringToFrontHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.a;
import uv8.f2;
import android.net.Uri;
import android.app.Activity;
import android.content.Intent;
import yh7.a;

public class BringToFrontHandler extends AnnotationUriHandler	// class@0012e0
{

    public void BringToFrontHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BringToFrontHandler.class, "1")) {
          return;
       }
       Context uContext = p0.b();
       f2 uof2 = new f2();
       Uri uri = p0.g();
       Intent intent = (uContext instanceof Activity)? uContext.getIntent(): null;
       uof2.a(uContext, uri, intent);
       p1.a(new a(200));
       return;
    }
}
