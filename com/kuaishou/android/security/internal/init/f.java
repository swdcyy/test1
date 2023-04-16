package com.kuaishou.android.security.internal.init.f;
import java.lang.Object;
import java.util.HashSet;
import java.lang.String;
import com.kuaishou.android.security.internal.plugin.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.security.internal.init.c$a;
import android.content.Context;
import java.lang.System;
import java.lang.Thread;
import com.kuaishou.android.security.internal.init.e;
import java.lang.Runnable;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.exception.KSException;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.internal.plugin.l;
import com.kuaishou.android.security.internal.plugin.f;
import com.kuaishou.android.security.internal.plugin.e;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.h;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import android.os.ConditionVariable;
import com.kuaishou.android.security.KSecurity;
import java.lang.Throwable;
import com.kuaishou.android.security.base.exception.a;
import com.kuaishou.android.security.base.log.KSecuritySdkILog;
import java.util.Locale;
import com.kuaishou.android.security.base.perf.d$b;
import com.kuaishou.android.security.base.perf.d;

public class f	// class@0006e9
{
    public Set a;
    public c$a b;
    public Object c;
    public String d;
    public g e;
    public boolean f;

    public void f(){
       super();
       this.a = new HashSet();
       this.c = new Object();
       this.d = null;
       this.e = null;
       this.f = false;
    }
    public void f(String p0){
       super();
       this.a = new HashSet();
       this.c = new Object();
       this.d = null;
       this.e = null;
       this.f = false;
       this.d = p0;
    }
    public g a(){
       return this.e;
    }
    public void a(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "2")) {
          return;
       }
       uof = this.c;
       _monitor_enter(uof);
       f tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       _monitor_exit(uof);
       return;
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       if (p0 == null) {
          throw new KSException("initPMAsync paramContext == null", 101);
       }
       Thread thread = new Thread(new e(this, p0));
       thread.setName("securityaio_sg_run");
       thread.start();
       d.a("Create thread "+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
       return;
    }
    public void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       KSecurityTrack.sLog(55);
       if (p0 != null) {
          f tc = this.c;
          _monitor_enter(tc);
          KSecurityTrack.sLog(56);
          this.b = p0;
          _monitor_exit(tc);
       }
       return;
    }
    public synchronized int b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.f == null) {
          KSecurityTrack.sLog(b.H);
          if (p0 != null) {
             int i = 2;
             l ol = new l();
             KSecurityTrack.sLog(b.I);
             ol.a(p0);
             KSecurityTrack.sLog(b.J);
             KSecurityTrack.sLog(14);
             if (ol.a(ol.b()) == null) {
                return b.b;
             }else {
                KSecurityTrack.sLog(15);
                if (p0.getApplicationContext() != null) {
                   p0 = p0.getApplicationContext();
                }
                KSecurityTrack.sLog(16);
                Object[] objArray = new Object[]{null,b.i().j().a(),null,null,p0,null,null};
                d.a("10412 getRouter ="+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
                KSecurityTrack.sLog(17);
                this.e = ol;
                b.i().b(0);
                if (ol.a().a(0x28ac, objArray) == null) {
                   b.i().h().setPrepareSoStatus("fail");
                   KSecurityTrack.sLog(18);
                   this.f = false;
                }else {
                   b.i().h().setPrepareSoStatus("succ");
                   KSecurityTrack.sLog(19);
                   this.f = true;
                }
                b.i().a(this.f);
                b.i().k().open();
                d.a("KSecurity.getmKSecurityCV\(\).Open\(\); ="+(System.currentTimeMillis() - KSecurity.getInitTime())+"ms");
             }
          }else {
             throw new KSException("KG_KSECURITY_INITIALIZECOMPONENTSTUB_INITPLUGINMANAGER1", 101);
          }
       }
       KSecurityTrack.sLog(20);
       b.i().a(this.f);
       int a = (this.f != null)? b.a: b.b;
       return a;
    }
    public void b(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "1")) {
          return;
       }
       uof = this.c;
       _monitor_enter(uof);
       f tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       _monitor_exit(uof);
       return;
    }
    public void b(c$a p0){
       if (p0 != null) {
          this.b = null;
       }
       return;
    }
    public boolean c(Context p0){
       return true;
    }
}
