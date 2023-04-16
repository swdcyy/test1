package com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager;
import java.util.HashMap;
import com.kwai.plugin.dva.feature.core.loader.SplitLoaderManager$mCurrentProcessName$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import zsd.u;
import com.kwai.plugin.dva.feature.core.loader.classloader.FeatureClassLoader;

public final class SplitLoaderManager	// class@000e69
{
    public static final SplitLoaderManager a;
    public static a b;
    public static final Map c;
    public static String d;
    public static String[] e;
    public static String[] f;
    public static String g;
    public static final p h;
    public static Context i;
    public static final LinkedList j;
    public static FeatureClassLoader k;

    static {
       SplitLoaderManager.a = new SplitLoaderManager();
       SplitLoaderManager.c = new HashMap();
       SplitLoaderManager.h = s.c(SplitLoaderManager$mCurrentProcessName$2.INSTANCE);
       SplitLoaderManager.j = new LinkedList();
    }
    public void SplitLoaderManager(){
       super();
    }
    public final String a(){
       return SplitLoaderManager.d;
    }
    public final String b(String p0){
       Context obj = PatchProxy.applyOneRefs(p0, this, SplitLoaderManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SplitLoaderManager.i;
       Object obj1 = null;
       if (obj == null) {
          a.S("mContext");
          obj = obj1;
       }
       String packageName = obj.getPackageName();
       a.o(packageName, "mContext.getPackageName\(\)");
       if (TextUtils.isEmpty(p0)) {
          return packageName;
       }else if(u.q2(p0, packageName, false, 2, obj1)){
          p0 = a.C(packageName, p0);
       }
       return p0;
    }
    public final FeatureClassLoader c(){
       Object[] objArray = null;
       FeatureClassLoader obj = PatchProxy.apply(objArray, this, SplitLoaderManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SplitLoaderManager.k;
       if (obj == null) {
          a.S("mFeatureClassLoader");
       }else {
          objArray = obj;
       }
       return objArray;
    }
    public final String d(){
       Object obj = PatchProxy.apply(null, this, SplitLoaderManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SplitLoaderManager.h.getValue();
    }
}
