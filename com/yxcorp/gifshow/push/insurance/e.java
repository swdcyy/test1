package com.yxcorp.gifshow.push.insurance.e;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.push.insurance.WakeupThirdPartyAppResponse$ApplicationInfo;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;

public final class e implements r	// class@001678
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean test(Object p0){
       return (MutualInsuranceInitModule.n0(a.a().a(), p0.mProcessName) ^ 0x01);
    }
}
