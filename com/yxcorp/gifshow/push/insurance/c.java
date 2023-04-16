package com.yxcorp.gifshow.push.insurance.c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.push.insurance.WakeupThirdPartyAppResponse$ApplicationInfo;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import o56.c;
import o56.a;
import android.app.Application;

public final class c implements o	// class@001676
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object apply(Object p0){
       Intent intent = new Intent();
       if (!TextUtils.isEmpty(p0.mClassName)) {
          intent.setClassName(p0.mPackageName, p0.mClassName);
       }else {
          intent.setPackage(p0.mPackageName);
       }
       intent.setAction(p0.mActionName);
       WakeupThirdPartyAppResponse$ApplicationInfo mIntentParam = p0.mIntentParams;
       if (mIntentParam != null && !mIntentParam.isEmpty()) {
          p0 = p0.mIntentParams.entrySet().iterator();
          while (p0.hasNext()) {
             Map$Entry uEntry = p0.next();
             String key = uEntry.getKey();
             intent.putExtra(key, uEntry.getValue());
          }
       }else {
          intent.putExtra("source", a.a().a().getPackageName());
       }
       intent.addFlags(32);
       return intent;
    }
}
