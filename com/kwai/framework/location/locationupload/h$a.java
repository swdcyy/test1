package com.kwai.framework.location.locationupload.h$a;
import q96.d;
import com.kwai.framework.location.locationupload.h;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import p96.a;
import java.lang.StringBuilder;
import com.kwai.chat.sdk.logreport.utils.GsonUtil;
import q87.c;
import android.location.Location;
import java.lang.Integer;
import o96.u;
import com.kwai.robust.PatchProxyResult;
import tk7.j;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Application;
import o56.a;
import android.location.LocationManager;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import q96.c;

public class h$a implements d	// class@001642
{
    public final int a;
    public final h b;

    public void h$a(h p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("LocationUploadManager", "onSuccess: "+GsonUtil.toJson(p1), objArray);
       uoa = this.b;
       if (p0) {
          p1 = null;
       }
       uoa.a(p1, null, this.a);
       return;
    }
    public void onError(int p0,String p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       h$a tb = this.b;
       String str = "default";
       String str1 = "location_upload";
       Object obj = PatchProxy.applyTwoRefs(str, str1, null, u.class, "44");
       if (obj != PatchProxyResult.class) {
       }else if(j.g().c("location", str, str1, (TextUtils.isEmpty(str1) ^ 0x01))){
          obj = null;
       }else {
          obj = LocationInterceptor.getLastKnownLocation(a.b().getSystemService("location"), "gps");
       }
       tb.a(null, obj, this.a);
       Object[] objArray = new Object[0];
       a.C().t("LocationUploadManager", "onError: reason = "+p1, objArray);
       return;
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
    }
}
