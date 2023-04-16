package com.kuaishou.live.livestage.utils.CommonUtil;
import com.kuaishou.live.livestage.utils.CommonUtil$UI_HANDLER$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.livestage.utils.CommonUtil$IMMEDIATE_MAIN_SCHEDULER$2;
import com.kuaishou.live.livestage.utils.CommonUtil$a;
import java.lang.Object;
import brd.z;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import erd.g;
import android.os.Handler;
import kotlin.jvm.internal.a;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.StringBuilder;
import oe3.e;
import java.lang.Throwable;
import java.lang.UnsupportedOperationException;
import android.os.Looper;
import oe3.b;
import java.lang.Runnable;

public final class CommonUtil	// class@000bf6
{
    public static final String a = "0.16.1.1";
    public static final p b;
    public static final p c;
    public static final g d;
    public static final CommonUtil e;

    static {
       CommonUtil.e = new CommonUtil();
       CommonUtil.b = s.c(CommonUtil$UI_HANDLER$2.INSTANCE);
       CommonUtil.c = s.c(CommonUtil$IMMEDIATE_MAIN_SCHEDULER$2.INSTANCE);
       CommonUtil.d = CommonUtil$a.b;
    }
    public void CommonUtil(){
       super();
    }
    public final z a(){
       Object obj = PatchProxy.apply(null, this, CommonUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommonUtil.c.getValue();
    }
    public final g b(){
       return CommonUtil.d;
    }
    public final Handler c(){
       Object obj = PatchProxy.apply(null, this, CommonUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommonUtil.b.getValue();
    }
    public final void d(String p0,Object[] p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonUtil.class, "5")) {
          return;
       }
       a.p(p0, "message");
       a.p(p1, "params");
       int i = 0;
       int i1 = 1;
       int i2 = (!p1.length)? 1: 0;
       if (i2 ^ i1) {
          object oobject = (!p1.length)? 1: null;
          if (!oobject) {
             oobject = p1[i];
             i = ArraysKt___ArraysKt.Rd(p1);
             if (i1 <= i) {
                while (true) {
                   object oobject1 = p1[i1];
                   int i3 = i1 % 2;
                   if (!i3) {
                      str = oobject+", "+oobject1;
                   label_0064 :
                      if (i1 != i) {
                         i1 = i1 + 1;
                      }
                   }else {
                      str = oobject+"=["+oobject1+']';
                      goto label_0064 ;
                   }
                }
             }
             e.d(e.d, "LiveStage", p0+" {"+str+'}', null, 4, null);
          }else {
             throw new UnsupportedOperationException("Empty array can\'t be reduced.");
          }
       }else {
          e.d(e.d, "LiveStage", p0, null, 4, null);
       }
       return;
    }
    public final void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonUtil.class, "4")) {
          return;
       }
       a.p(p0, "action");
       if (a.g(Looper.getMainLooper(), Looper.myLooper())) {
          p0.invoke();
       }else {
          this.c().post(new b(p0));
       }
       return;
    }
}
