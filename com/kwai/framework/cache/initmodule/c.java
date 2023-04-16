package com.kwai.framework.cache.initmodule.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.framework.cache.a;
import java.lang.System;

public final class c implements Runnable	// class@0014f0
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       Log.b("CheckDiskModule", "background clear");
       CheckDiskModule.B = true;
       if (CheckDiskModule.z) {
          a.f().k(CheckDiskModule.z);
       }else {
          a.f().o();
          a.f().k(CheckDiskModule.z);
          a.f().n("LOW_DISK_BKG_CLEAR_RESULT", (System.currentTimeMillis() - System.currentTimeMillis()));
       }
       return;
    }
}
