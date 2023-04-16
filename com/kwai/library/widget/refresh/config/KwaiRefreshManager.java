package com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import kotlin.LazyThreadSafetyMode;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager$sPendingRefreshViewMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import p17.c;
import p17.a;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.String;
import java.lang.CharSequence;
import zsd.u;
import androidx.collection.ArrayMap;
import java.lang.StringBuilder;
import java.io.File;
import com.yxcorp.utility.Log;

public final class KwaiRefreshManager	// class@0009d6
{
    public static final String a = "KwaiRefreshManager";
    public static boolean b;
    public static final p c;
    public static c d;
    public static final KwaiRefreshManager e;

    static {
       KwaiRefreshManager.e = new KwaiRefreshManager();
       KwaiRefreshManager.c = s.b(LazyThreadSafetyMode.NONE, KwaiRefreshManager$sPendingRefreshViewMap$2.INSTANCE);
    }
    public void KwaiRefreshManager(){
       super();
    }
    public static final c a(){
       return KwaiRefreshManager.d;
    }
    public static final boolean c(){
       return KwaiRefreshManager.e(null, 1, null);
    }
    public static final boolean d(a p0){
       boolean b = false;
       if (!KwaiRefreshManager.b) {
          if (p0 != null) {
             k1.o(new KwaiRefreshManager$a(p0));
          }
          return b;
       }else {
          c d = KwaiRefreshManager.d;
          if (d != null) {
             if (d.a == null) {
                return b;
             }else {
                String str = d.e();
                str = (str == null || u.S1(str))? 1: 0;
                if (!str) {
                   String str1 = d.f();
                   str1 = (str1 == null || u.S1(str1))? 1: 0;
                   if (!str1) {
                      b = true;
                   }
                }
             }
          }
          return b;
       }
    }
    public static boolean e(a p0,int p1,Object p2){
       return KwaiRefreshManager.d(null);
    }
    public final ArrayMap b(){
       return KwaiRefreshManager.c.getValue();
    }
    public final void f(String p0,String p1){
       if (p1 != null) {
          Log.b(KwaiRefreshManager.a, "File status "+p0+" exists: "+new File(p1).exists());
       }
       return;
    }
}
