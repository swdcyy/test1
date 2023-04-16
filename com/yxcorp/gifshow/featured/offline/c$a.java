package com.yxcorp.gifshow.featured.offline.c$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.io.File;
import qkd.b;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.featured.offline.c$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import wkd.b;
import j80.c;
import com.yxcorp.gifshow.util.v;
import s0d.f;
import s0d.e;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.featured.offline.c$a$a;
import android.content.Context;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;

public final class c$a	// class@000fe8
{

    public void c$a(){
       super();
    }
    public void c$a(u p0){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "5")) {
          return;
       }
       a.p(p0, "path");
       b.q(new File(p0));
       return;
    }
    public final void b(CDNUrl[] p0,c$b p1){
       c$a uoa = c$a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "1")) {
          return;
       }
       a.p(p0, "cdnUrls");
       a.p(p1, "saveImageCallback");
       int i = 0;
       CDNUrl mUrl = p0[i].mUrl;
       a.o(mUrl, "cdnUrls[0].mUrl");
       String str = PatchProxy.applyOneRefs(mUrl, this, uoa, "6");
       if (str != PatchProxyResult.class) {
       }else {
          str = b.a(-1504323719).d("feed_activity_offline_cover_cache").getAbsolutePath()+"/"+v.h(mUrl)+".png";
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       a.j(uoc.a(), f.x().t(p0[i].mUrl).v(), str, new c$a$a(str, p1));
       return;
    }
}
