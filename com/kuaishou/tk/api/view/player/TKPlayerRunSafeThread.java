package com.kuaishou.tk.api.view.player.TKPlayerRunSafeThread;
import com.kuaishou.tk.api.view.player.TKPlayerRunSafeThread$mMainHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.os.Handler;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.kuaishou.tk.api.view.player.a;
import qrd.l1;

public final class TKPlayerRunSafeThread	// class@000fb0
{
    public static final p a;
    public static final TKPlayerRunSafeThread b;

    static {
       TKPlayerRunSafeThread.b = new TKPlayerRunSafeThread();
       TKPlayerRunSafeThread.a = s.c(TKPlayerRunSafeThread$mMainHandler$2.INSTANCE);
    }
    public void TKPlayerRunSafeThread(){
       super();
    }
    public static final Handler a(){
       Object obj = PatchProxy.apply(null, null, TKPlayerRunSafeThread.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TKPlayerRunSafeThread.a.getValue();
    }
    public static final Object b(a p0,l p1){
       Object obj1;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TKPlayerRunSafeThread.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          a.p(p0, "action");
          obj1 = p0.invoke();
       }catch(java.lang.Exception e3){
          a.c("TKOlympicPlayer", "runSafe error!", e3);
          if (p1) {
             p1.invoke(e3);
          }
       }
       return obj1;
    }
}
