package com.kuaishou.krn.bundle.BundleDirs$rnDownloadDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.bundle.BundleDirs;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class BundleDirs$rnDownloadDir$2 extends Lambda implements a	// class@00083c
{
    public static final BundleDirs$rnDownloadDir$2 INSTANCE;

    static {
       BundleDirs$rnDownloadDir$2.INSTANCE = new BundleDirs$rnDownloadDir$2();
    }
    public void BundleDirs$rnDownloadDir$2(){
       super(0);
    }
    public final File invoke(){
       BundleDirs obj = PatchProxy.apply(null, this, BundleDirs$rnDownloadDir$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = BundleDirs.c;
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       Context uContext = uoc.d();
       a.o(uContext, "KrnManager.get\(\).context");
       return obj.a(new File(obj.a(new File(uContext.getCacheDir(), "react_native")), "download"));
    }
    public Object invoke(){
       return this.invoke();
    }
}
