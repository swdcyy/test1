package com.kuaishou.android.security.internal.loader.b;
import java.lang.Object;
import com.kuaishou.android.security.internal.loader.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import android.content.Context;
import rg.d$d;
import rg.e;
import rg.d;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.Locale;
import java.lang.CharSequence;
import java.util.List;
import java.util.Iterator;

public class b	// class@0006eb
{
    public static a b;

    public void b(){
       super();
    }
    public static void a(a p0){
       b.b = p0;
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       b.a(p0, b.i().j().c(), "5.1.1.372.8d68fa37");
       return;
    }
    public static void a(String p0,Context p1,String p2){
       a b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "3")) {
          return;
       }
       b = b.b;
       if (b != null) {
          b.a(p0);
       }
       e uoe = d.b(null);
       if (Build$VERSION.SDK_INT < 23 && !((Build.MANUFACTURER).toLowerCase(Locale.US)).contains("gionee")) {
          uoe.c();
       }
       uoe.i(p1, p0, "");
       return;
    }
    public static void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          b.a(iterator.next());
       }
       return;
    }
}
