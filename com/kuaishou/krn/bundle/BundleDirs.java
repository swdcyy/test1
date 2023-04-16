package com.kuaishou.krn.bundle.BundleDirs;
import com.kuaishou.krn.bundle.BundleDirs$rnDownloadDir$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.krn.bundle.BundleDirs$RN_TMP_SYMLINK_DIR$2;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qkd.b;
import java.io.IOException;

public final class BundleDirs	// class@00083d
{
    public static final p a;
    public static final p b;
    public static final BundleDirs c;

    static {
       BundleDirs.c = new BundleDirs();
       BundleDirs.a = s.c(BundleDirs$rnDownloadDir$2.INSTANCE);
       BundleDirs.b = s.c(BundleDirs$RN_TMP_SYMLINK_DIR$2.INSTANCE);
    }
    public void BundleDirs(){
       super();
    }
    public final File a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BundleDirs.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.exists()) {
          try{
             b.y(p0);
          }catch(java.io.IOException e0){
             e0.printStackTrace();
          }
       }
    }
}
