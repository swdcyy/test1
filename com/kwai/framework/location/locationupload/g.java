package com.kwai.framework.location.locationupload.g;
import java.lang.Runnable;
import com.kwai.framework.location.locationupload.h;
import com.kwai.framework.location.model.LocationCityInfo;
import android.location.Location;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import d60.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.location.k;
import ekd.e0;
import android.content.Context;
import com.kwai.framework.location.locationupload.LocationUploadConfig;
import com.kwai.framework.location.locationupload.LocationUploadConfig$DynamicConfig;
import r96.a;
import com.kwai.robust.PatchProxyResult;
import d60.b;
import r96.z;
import com.google.protobuf.nano.MessageNano;
import r96.x;
import java.lang.Boolean;
import brd.t;
import r96.l;
import erd.o;
import java.util.concurrent.TimeUnit;
import com.kwai.framework.location.locationupload.e;
import brd.w;
import r96.m;
import cjd.e;
import r96.k;
import r96.i;
import erd.g;
import crd.b;

public final class g implements Runnable	// class@001641
{
    public final h b;
    public final LocationCityInfo c;
    public final Location d;
    public final int e;

    public void g(h p0,LocationCityInfo p1,Location p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       LocationUploadConfig cellUpload;
       a uoa;
       String str1;
       long l;
       long l1;
       g og;
       m om;
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       g te = this.e;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(tc, td, Integer.valueOf(te), tb, h.class, "11")) {
          e uoe = new e();
          String str = "";
          LocationCityInfo sdkType = (tc != null && !TextUtils.x(tc.sdkType))? tc.sdkType: str;
          uoe.h = sdkType;
          uoe.g = str;
          uoe.a = k.f();
          uoe.b = k.e(e0.b);
          int i = 1;
          boolean b = (tc != null && !tc.isInvalid())? true: false;
          uoe.c = b;
          if (tb.a != null) {
             cellUpload = tb.a.cellUpload;
             LocationUploadConfig dynamicConfi = tb.a.dynamicConfig;
             if (dynamicConfi != null && dynamicConfi.enableBasestation != null) {
                uoa = 1;
             label_0072 :
                Object obj = null;
                if (uoa) {
                   try{
                      uoa = a.class;
                      if (PatchProxy.isSupport(uoa)) {
                         Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(cellUpload), obj, uoa, "1");
                         if (obj1 != PatchProxyResult.class) {
                            obj = obj1;
                         }
                      }
                      if (z.f("android.permission.ACCESS_COARSE_LOCATION") || z.f("android.permission.ACCESS_FINE_LOCATION")) {
                         obj = a.c(cellUpload);
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
             }
          }else {
             cellUpload = 0;
          }
          uoa = null;
          goto label_0072 ;
       }
       return;
    }
}
