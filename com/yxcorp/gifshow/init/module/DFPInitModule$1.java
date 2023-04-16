package com.yxcorp.gifshow.init.module.DFPInitModule$1;
import java.lang.Thread;
import com.yxcorp.gifshow.init.module.DFPInitModule;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import java.util.Objects;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.init.module.j;
import java.lang.Runnable;
import t45.c;
import com.kwai.framework.security.a;
import com.kuaishou.android.security.KSecurity;
import java.lang.Long;
import k2b.u1;
import java.lang.StringBuilder;
import java.lang.Throwable;
import android.app.Application;

public class DFPInitModule$1 extends Thread	// class@001968
{
    public final DFPInitModule b;

    public void DFPInitModule$1(DFPInitModule p0,String p1){
       this.b = p0;
       super(p1);
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, DFPInitModule$1.class, "1")) {
          return;
       }
       Process.setThreadPriority(10);
       DFPInitModule$1 tb = this.b;
       Objects.requireNonNull(tb);
       String str = "3";
       boolean b = false;
       if (!PatchProxy.applyVoidWithListener(objArray, tb, DFPInitModule.class, str)) {
          if (SystemUtil.L(a.B)) {
             tb.n0();
             String str1 = "5";
             if (!PatchProxy.applyVoidWithListener(objArray, tb, DFPInitModule.class, str1)) {
                c.a(j.b);
                PatchProxy.onMethodExit(DFPInitModule.class, str1);
             }
          }
          if (!a.e || !KSecurity.isInitialize()) {
             a.b(a.B);
          }
          objArray = new Object[]{Long.valueOf((a.e() - a.d()))};
          u1.U("kwsecurity_custom_key_01", String.format("KWSecurity initialize elapsed:[%d]", objArray));
          if (a.d) {
             objArray = new Object[]{Long.valueOf((a.e() - a.d()))};
             u1.U("kwsecurity_custom_key_01", String.format("KWSecurityLoadSuccess:[%d]", objArray));
          }else if(!KSecurity.isInitialize()){
             objArray = new Object[]{Long.valueOf((a.e() - a.d())),a.c()};
             u1.Q("kwsecurity_custom_key_01", String.format("KWSecurityLoadFailure:[%d][%s]", objArray));
          }else {
             objArray = new Object[]{a.c()};
             u1.Q("kwsecurity_custom_key_01", String.format("KWSecurityLoadSuccessException:[%s]", objArray));
          }
          PatchProxy.onMethodExit(DFPInitModule.class, str);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefsWithListener(a.b(), tb, DFPInitModule.class, "2")) {
          if (KSecurity.isInitialize()) {
             if (SystemUtil.L(a.B)) {
                if (0x1869f == a.q) {
                   b = true;
                }
                KSecurity.doSentiveWork(b);
             }else {
                u1.Q("kwsecurity_custom_key_01", "doDLPWork not in main process!!");
             }
          }else {
             u1.Q("kwsecurity_custom_key_01", "doDLPWork without ksecurity init!");
          }
          PatchProxy.onMethodExit(DFPInitModule.class, "2");
       }
       PatchProxy.onMethodExit(DFPInitModule$1.class, "1");
       return;
    }
}
