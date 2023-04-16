package com.yxcorp.gifshow.message.init.router.RealNameUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import xh7.a;
import kdb.a;
import yh7.a;

public final class RealNameUriHandler extends AnnotationUriHandler	// class@001d66
{

    public void RealNameUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RealNameUriHandler.class, "1")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "callback");
       Context uContext = p0.b();
       a.o(uContext, "request.context");
       a.a(uContext);
       p1.a(new a(200));
       return;
    }
}
