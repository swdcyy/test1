package com.yxcorp.gifshow.push.insurance.b;
import erd.g;
import java.lang.Object;
import android.content.Intent;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Exception;

public final class b implements g	// class@001675
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       int s = MutualInsuranceInitModule.s;
       try{
          a.e(a.a().a(), p0);
          a.a().a().sendBroadcast(p0);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
