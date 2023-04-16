package com.kuaishou.krn.apm.wsd.WhiteScreenDetector;
import java.util.concurrent.atomic.AtomicLong;
import com.kuaishou.krn.apm.wsd.WhiteScreenDetector$mDetectRecord$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.krn.apm.wsd.WhiteScreenDetector$mViewsInfos$2;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import androidx.core.content.ContextCompat;
import java.util.WeakHashMap;

public final class WhiteScreenDetector	// class@0007fc
{
    public static boolean a;
    public static a b;
    public static b c;
    public static a d;
    public static AtomicLong e;
    public static final p f;
    public static String g;
    public static final p h;
    public static final WhiteScreenDetector i;

    static {
       WhiteScreenDetector.i = new WhiteScreenDetector();
       WhiteScreenDetector.e = new AtomicLong(0);
       WhiteScreenDetector.f = s.c(WhiteScreenDetector$mDetectRecord$2.INSTANCE);
       WhiteScreenDetector.h = s.c(WhiteScreenDetector$mViewsInfos$2.INSTANCE);
    }
    public void WhiteScreenDetector(){
       super();
    }
    public final boolean a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WhiteScreenDetector.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (Build$VERSION.SDK_INT < 23) {
          return b;
       }
       if (ContextCompat.checkSelfPermission(p0, "android.permission.WRITE_EXTERNAL_STORAGE")) {
          b = false;
       }
       return b;
    }
    public final WeakHashMap b(){
       Object obj = PatchProxy.apply(null, this, WhiteScreenDetector.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WhiteScreenDetector.f.getValue();
    }
    public final WeakHashMap c(){
       Object obj = PatchProxy.apply(null, this, WhiteScreenDetector.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WhiteScreenDetector.h.getValue();
    }
}
