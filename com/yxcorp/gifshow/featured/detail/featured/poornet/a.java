package com.yxcorp.gifshow.featured.detail.featured.poornet.a;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetInitModule;
import wkd.b;
import com.yxcorp.gifshow.featured.detail.featured.poornet.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.a;
import brd.t;
import t45.d;
import brd.z;
import xda.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import kda.a;
import android.content.SharedPreferences;
import lnc.i3;
import xda.b;
import java.lang.Boolean;
import k2b.u1;
import java.lang.StringBuilder;
import xda.a;

public final class a implements Runnable	// class@000f43
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       SharedPreferences a;
       boolean b;
       b uob = b.a(-953099949);
       Objects.requireNonNull(uob);
       b uob1 = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uob, uob1, "11")) {
       }else if(!uob.c()){
          u1.a(uob);
          uob.m();
          b f = uob.f;
          if (f == null || f.isDisposed()) {
             uob.f = RxBus.f.f(a.class).observeOn(d.a).subscribe(new c(uob), Functions.e);
          }
          if (!PatchProxy.applyVoid(objArray, uob, uob1, "22")) {
             a = a.a;
             long l = 0;
             long longx = a.getLong("lastPoorNetworkStartTime", l);
             long longx1 = a.getLong("lastPoorNetworkSaveTime", l);
             uob.b();
             if (longx - l > 0 && (longx1 - l > 0 && longx1 - longx > 0)) {
                i3 oi3 = i3.f();
                longx1 = longx1 - longx;
                oi3.d("duration", String.valueOf(longx1));
                b = (uob.a != null && uob.a.mEnableDebugLog != null)? true: false;
                oi3.a("isDebugInfo", Boolean.valueOf(b));
                u1.R("POOR_NETWORK_DURATION", oi3.e(), 14);
                a.C("POOR_NETWORK_DURATION "+longx1);
             }
          }
       }
    label_00b9 :
       return;
    }
}
