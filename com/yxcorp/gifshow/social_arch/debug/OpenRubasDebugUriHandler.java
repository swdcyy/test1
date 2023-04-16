package com.yxcorp.gifshow.social_arch.debug.OpenRubasDebugUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import xh7.a;
import ekd.x0;
import jt7.a;
import o56.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import yh7.a;

public class OpenRubasDebugUriHandler extends AnnotationUriHandler	// class@001d75
{

    public void OpenRubasDebugUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OpenRubasDebugUriHandler.class, "1")) {
          return;
       }
       Uri uri = p0.g();
       String str = "host";
       String str1 = x0.a(uri, str);
       String str2 = x0.a(uri, "id");
       a a = a.a;
       String a1 = a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidThreeRefs(str1, str2, a1, a, a.class, "1")) {
          a.p(str1, str);
          a.p(str2, "bindId");
          a.p(a1, "deviceId");
       }
       p1.a(new a(200));
       return;
    }
}
