package com.kwai.plugin.dva.split.SplitManager;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import com.kwai.plugin.dva.split.SplitManager$mNativeLibraryInstaller$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.plugin.dva.split.SplitManager$mAssetsInstaller$2;
import com.kwai.plugin.dva.split.SplitManager$mReadSplitConfigFuture$2;
import java.lang.Object;
import com.kwai.plugin.dva.split.NativeLibraryInstaller;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.FutureTask;
import pj7.f;
import kotlin.jvm.internal.a;
import android.content.res.AssetManager;
import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import com.google.gson.Gson;
import java.io.Reader;

public final class SplitManager	// class@001387
{
    public static final SplitManager a;
    public static Context b;
    public static final List c;
    public static final CountDownLatch d;
    public static final p e;
    public static final p f;
    public static final p g;

    static {
       SplitManager.a = new SplitManager();
       SplitManager.c = new LinkedList();
       SplitManager.d = new CountDownLatch(1);
       SplitManager.e = s.c(SplitManager$mNativeLibraryInstaller$2.INSTANCE);
       SplitManager.f = s.c(SplitManager$mAssetsInstaller$2.INSTANCE);
       SplitManager.g = s.c(SplitManager$mReadSplitConfigFuture$2.INSTANCE);
    }
    public void SplitManager(){
       super();
    }
    public final NativeLibraryInstaller a(){
       Object obj = PatchProxy.apply(null, this, SplitManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SplitManager.e.getValue();
    }
    public final FutureTask b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SplitManager splitManager = SplitManager.class;
       Object obj = PatchProxy.apply(null, this, splitManager, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, splitManager, "5");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = SplitManager.g.getValue();
       }
       return obj1;
    }
    public final f c(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, SplitManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SplitManager.b;
       if (obj == null) {
          a.S("mContext");
       }else {
          objArray = obj;
       }
       InputStream inputStream = objArray.getAssets().open("dva_splits/config.json");
       a.o(inputStream, "mContext.assets.open\(SPLIT_CONFIG\)");
       InputStreamReader inputStreamR = new InputStreamReader(inputStream);
       f uof = new Gson().f(inputStreamR, f.class);
       a.o(uof, "splitPluginConfig");
       return uof;
    }
}
