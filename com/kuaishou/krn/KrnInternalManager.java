package com.kuaishou.krn.KrnInternalManager;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.krn.KrnInternalManager$krnConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.krn.KrnInternalManager$krnReactInstanceManager$2;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.c;
import java.lang.CharSequence;
import zsd.u;
import jk0.b;
import jk0.c;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import mj0.a;
import kj0.f;
import vj0.a;
import ek0.d;

public final class KrnInternalManager	// class@0007a8
{
    public static final p a;
    public static final p b;
    public static final KrnInternalManager c;

    static {
       KrnInternalManager.c = new KrnInternalManager();
       KrnInternalManager.a = s.b(LazyThreadSafetyMode.PUBLICATION, KrnInternalManager$krnConfig$2.INSTANCE);
       KrnInternalManager.b = s.c(KrnInternalManager$krnReactInstanceManager$2.INSTANCE);
    }
    public void KrnInternalManager(){
       super();
    }
    public static final boolean c(String p0,Bundle p1){
       String str = null;
       c obj = PatchProxy.applyTwoRefs(p0, p1, str, KrnInternalManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bundleId");
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       boolean b = false;
       if (!obj.k()) {
          return b;
       }
       if (p1 != null) {
          str = p1.getString("debugServer");
       }
       b uob = (str == null || u.S1(str))? 1: null;
       if (!uob) {
          return true;
       }else if(c.a().p0()){
          List list = c.a().X();
          if (!list instanceof Collection || !list.isEmpty()) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (a.g(iterator.next().a(), p0)) {
                      iterator = 1;
                      break ;
                   }
                }
             }
             if (list) {
                uob = 1;
             label_0080 :
                if (uob) {
                   return true;
                }else {
                   String str1 = c.a().M();
                   if (!a.g(str1, p0)) {
                      int i = (!str1.length())? 1: 0;
                      if (!i) {
                      label_009d :
                         return b;
                      }
                   }
                   b = true;
                   goto label_009d ;
                }
             }
          }
          list = 0;
          goto label_007b ;
       }
       uob = null;
       goto label_0080 ;
    }
    public final f a(){
       Object obj = PatchProxy.apply(null, this, KrnInternalManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnInternalManager.a.getValue();
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, KrnInternalManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnInternalManager.b.getValue();
    }
    public final boolean d(){
       c obj = PatchProxy.apply(null, this, KrnInternalManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       if (obj.j()) {
          return false;
       }
       obj = c.b();
       a.o(obj, "KrnManager.get\(\)");
       if (!obj.k() || c.a().O()) {
          return false;
       }
       d.e("目前处于开发者模式，埋点、异常动作已经触发，但是不会真正上报，如果非得在开发模式下上报，请打开【开发者模式下埋点、异常上报】开关");
       return true;
    }
}
