package com.kwai.library.widget.icon.b$a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.LongSparseArray;
import com.kwai.library.widget.icon.b;
import android.content.res.Resources;
import android.app.Application;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Object;
import java.util.Map;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class b$a extends Handler	// class@000945
{

    public void b$a(Looper p0){
       super(p0);
    }
    public void handleMessage(Message p0){
       LongSparseArray longSparseAr;
       if (p0.what != 666) {
          return;
       }
       p0 = p0.obj;
       boolean b = false;
       String str = 1;
       if (p0 instanceof LongSparseArray) {
       }else {
          Resources resources = b.e.getResources();
          Field declaredFiel = b.e().getDeclaredField("sPreloadedDrawables");
          declaredFiel.setAccessible(str);
          object oobject = declaredFiel.get(resources);
          if (oobject instanceof LongSparseArray) {
          }else if(oobject instanceof LongSparseArray[] && oobject.length > 0){
             oobject = oobject[b];
          }else {
             oobject = null;
          }
          if (oobject == null) {
             longSparseAr = b.g(resources);
          }else {
             longSparseAr = oobject;
          }
       }
       if (b.e != null && (p0 != null && b.b)) {
          Map g = b.g;
          if (g == null || (!g.isEmpty() && (!p0.size() || p0.get(b.b) == null))) {
             b = true;
          }
       }
    label_006f :
       Log.g("KwaiIconHookHelper", "checkOrReHackResource isHackIconCleared: "+b);
       if (!b) {
          return;
       }else {
          b.c("checkOrReHackResource", b.f, b.e, b.g, p0);
          return;
       }
    }
}
