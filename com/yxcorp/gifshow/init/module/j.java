package com.yxcorp.gifshow.init.module.j;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.DFPInitModule;
import com.kuaishou.android.security.KSecurity;
import com.kuaishou.android.security.KSecurity$ENV;
import java.lang.String;
import k2b.u1;
import java.lang.Throwable;
import android.util.Log;

public final class j implements Runnable	// class@0019c7
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final void run(){
       if (KSecurity.isInitialize()) {
          try{
             if (KSecurity.detectEnvironment(KSecurity$ENV.ROOT)) {
                u1.U("report_s_env", "ROOT");
             }
             if (KSecurity.detectEnvironment(KSecurity$ENV.MALWARE)) {
                u1.U("report_s_env", "MALWARE");
             }
             if (KSecurity.detectEnvironment(KSecurity$ENV.HOOK)) {
                u1.U("report_s_env", "HOOK");
             }
             if (KSecurity.detectEnvironment(KSecurity$ENV.EMULATOR)) {
                u1.U("report_s_env", "EMULATOR");
             }
             if (KSecurity.detectEnvironment(KSecurity$ENV.ANTIDEBUG)) {
                u1.U("report_s_env", "ANTIDEBUG");
             }
          }catch(com.kuaishou.android.security.base.exception.KSException e0){
             u1.Q("kwsecurity_custom_key_01", Log.getStackTraceString(e0));
          }
       }
    }
}
