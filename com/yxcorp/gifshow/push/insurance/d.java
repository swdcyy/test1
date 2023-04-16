package com.yxcorp.gifshow.push.insurance.d;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.push.insurance.WakeupThirdPartyAppResponse$ApplicationInfo;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class d implements r	// class@001677
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean test(Object p0){
       boolean b = (!TextUtils.isEmpty(p0.mPackageName) && (!TextUtils.isEmpty(p0.mProcessName) && (!TextUtils.isEmpty(p0.mActionName) || !TextUtils.isEmpty(p0.mClassName))))? true: false;
       return b;
    }
}
