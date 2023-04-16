package com.yxcorp.gifshow.upload.s1;
import erd.g;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.String;
import java.net.URL;
import ekd.p0;
import com.yxcorp.gifshow.upload.r1;
import com.yxcorp.gifshow.upload.o1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.io.File;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import java.lang.System;
import dnc.f2;
import java.lang.Runnable;
import t45.c;

public final class s1 implements g	// class@001ea9
{
    public final r1$b b;

    public void s1(r1$b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && p0.n() != null) {
          String str = p0.n().request().url().host();
          p0 = p0.o(p0.n().request().url().url().toString());
          r1 a = tb.o.a;
          r1$b e = tb.e;
          r1$b b = tb.b;
          Objects.requireNonNull(a);
          if (!PatchProxy.isSupport(o1.class) || (!PatchProxy.applyVoidFourRefs(str, p0, Long.valueOf(e), b, a, o1.class, "14") && !o1.e(b))) {
             ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
             resultPackag.domain = 3;
             resultPackag.timeCost = System.currentTimeMillis() - e;
             f2 uof2 = new f2(a, b, str, p0, new File(b.getFilePath()).length(), resultPackag);
             c.a(e);
          }
       }
       return;
    }
}
