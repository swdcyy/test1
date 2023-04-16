package com.kwai.performance.monitor.base.CommonConfig$Builder$build$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.monitor.base.d$a;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import kotlin.jvm.internal.a;
import kotlin.Result;
import android.app.Application;
import java.lang.Throwable;
import qrd.j0;
import java.lang.StringBuilder;

public final class CommonConfig$Builder$build$1 extends Lambda implements l	// class@0010fc
{
    public final d$a this$0;

    public void CommonConfig$Builder$build$1(d$a p0){
       this.this$0 = p0;
       super(1);
    }
    public final File invoke(String p0){
       a.q(p0, "it");
       Object obj = Result.constructor-impl(d$a.a(this.this$0).getExternalFilesDir(""));
       if (Result.isFailure-impl(obj)) {
          obj = null;
       }
       if (obj == null) {
          obj = d$a.a(this.this$0).getFilesDir();
       }
       File uFile = new File(obj, "performance/"+p0);
       uFile.mkdirs();
       return uFile;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
