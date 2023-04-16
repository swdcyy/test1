package com.yxcorp.gifshow.init.module.LocationKeepAliveInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.v1.a;
import lo7.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.util.rx.RxBus;
import o6b.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.init.module.e0;
import erd.g;
import crd.b;

public class LocationKeepAliveInitModule extends a	// class@001989
{
    public l q;
    public static final int r;

    public void LocationKeepAliveInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, LocationKeepAliveInitModule.class, "1")) {
          return;
       }
       String str = a.z().c("SUPPORT_CHANNEL_TYPES_SWITCH", "");
       if (TextUtils.isEmpty(str)) {
          Log.g("LKAInitModule", "channelTypes is empty");
          PatchProxy.onMethodExit(LocationKeepAliveInitModule.class, "1");
          return;
       }else {
          RxBus.f.i(a.class, RxBus$ThreadMode.MAIN, true).throttleFirst(3, TimeUnit.SECONDS).subscribe(new e0(this, str));
          PatchProxy.onMethodExit(LocationKeepAliveInitModule.class, "1");
          return;
       }
    }
}
