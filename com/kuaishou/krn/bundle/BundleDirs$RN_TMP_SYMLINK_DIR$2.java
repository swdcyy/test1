package com.kuaishou.krn.bundle.BundleDirs$RN_TMP_SYMLINK_DIR$2;
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
import qkd.b;

public final class BundleDirs$RN_TMP_SYMLINK_DIR$2 extends Lambda implements a	// class@00083b
{
    public static final BundleDirs$RN_TMP_SYMLINK_DIR$2 INSTANCE;

    static {
       BundleDirs$RN_TMP_SYMLINK_DIR$2.INSTANCE = new BundleDirs$RN_TMP_SYMLINK_DIR$2();
    }
    public void BundleDirs$RN_TMP_SYMLINK_DIR$2(){
       super(0);
    }
    public final File invoke(){
       BundleDirs obj = PatchProxy.apply(null, this, BundleDirs$RN_TMP_SYMLINK_DIR$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = BundleDirs.c;
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       Context uContext = uoc.d();
       a.o(uContext, "KrnManager.get\(\).context");
       File uFile = obj.a(new File(obj.a(new File(uContext.getCacheDir(), "react_native")), "symlink"));
       b.b(uFile);
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
