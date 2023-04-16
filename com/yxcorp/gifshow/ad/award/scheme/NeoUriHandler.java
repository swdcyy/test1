package com.yxcorp.gifshow.ad.award.scheme.NeoUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xh7.a;
import yh7.a;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gifshow.activity.UriRouterActivity;
import android.net.Uri;
import android.net.Uri$Builder;
import java.util.Map;
import com.yxcorp.gifshow.ad.award.scheme.NeoSchemeDispatchActivity;
import java.util.Objects;
import com.yxcorp.gifshow.ad.award.scheme.NeoSchemeDispatchActivity$a;

public final class NeoUriHandler extends AnnotationUriHandler	// class@00152a
{

    public void NeoUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       Intent intent;
       NeoUriHandler neoUriHandle = NeoUriHandler.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, neoUriHandle, str)) {
          return;
       }
       a.p(p0, "uriRequest");
       a.p(p1, "uriCallback");
       String str1 = "com.kwai.platform.krouter.return_intent";
       if (p0.a(str1, false)) {
          a uoa = new a(201);
          a b = uoa.b;
          a.o(b, "result.mMaps");
          intent = PatchProxy.applyOneRefs(p0, this, neoUriHandle, "2");
          if (intent != PatchProxyResult.class) {
          }else {
             intent = new Intent();
             intent.setClass(p0.b(), UriRouterActivity.class);
             intent.setData(p0.g().buildUpon().appendQueryParameter("from", "push").build());
          }
          b.put(str1, intent);
          p1.a(uoa);
          return;
       }else {
          NeoSchemeDispatchActivity$a z = NeoSchemeDispatchActivity.z;
          Context uContext = p0.b();
          a.o(uContext, "uriRequest.context");
          Uri uri = p0.g();
          a.o(uri, "uriRequest.uri");
          Objects.requireNonNull(z);
          if (!PatchProxy.applyVoidTwoRefs(uContext, uri, z, NeoSchemeDispatchActivity$a.class, str)) {
             a.p(uContext, "context");
             a.p(uri, "uri");
             intent = new Intent(uContext, NeoSchemeDispatchActivity.class);
             intent.setFlags(0x10000000);
             intent.setData(uri);
             uContext.startActivity(intent);
          }
          p1.a(new a(200));
          return;
       }
    }
}
