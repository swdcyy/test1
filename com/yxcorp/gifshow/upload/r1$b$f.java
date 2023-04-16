package com.yxcorp.gifshow.upload.r1$b$f;
import erd.r;
import com.yxcorp.gifshow.upload.r1$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.upload.o0;
import com.yxcorp.gifshow.upload.AggregatedUploader;
import java.net.SocketTimeoutException;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;

public class r1$b$f implements r	// class@001ea4
{
    public final r1$b b;

    public void r1$b$f(r1$b p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       r1$b obj = PatchProxy.applyOneRefs(p0, this, r1$b$f.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.b.f;
          b = (!obj instanceof o0 && (!obj instanceof AggregatedUploader && (p0.getCause() instanceof SocketTimeoutException && p0.C(a.a().a()))))? true: false;
       }
       return b;
    }
}
