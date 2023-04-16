package com.yxcorp.gifshow.tti.module.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.tti.module.Dex2OatInitModule;
import java.lang.Object;
import java.util.Objects;
import java.lang.Exception;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import km8.b;
import android.content.SharedPreferences;
import oe6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import o56.a;
import android.content.SharedPreferences$Editor;
import s45.c;
import oe6.g;
import pxa.e;
import q87.c;
import java.lang.Integer;
import k2b.u1;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import hlc.c;

public final class a implements Runnable	// class@001dd3
{
    public final Dex2OatInitModule b;

    public void a(Dex2OatInitModule p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       try{
          Objects.requireNonNull(tb);
          tb.n0();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       boolean b = true;
       if (a.t().d("dex2oat_opt", b)) {
          int i = 0;
          Dex2OatInitModule.t = b.c("dex2oat", i);
          String str = a.s();
          if (!PatchProxy.applyVoidOneRefs(str, tb, Dex2OatInitModule.class, "3") && (!TextUtils.isEmpty(str) && !TextUtils.equals(a.m, str))) {
             g.a(Dex2OatInitModule.t.edit().putInt(Dex2OatInitModule.v.h(), i).putLong(Dex2OatInitModule.v.a(), 0));
          }
       label_0063 :
          if (Dex2OatInitModule.v.f() || (Dex2OatInitModule.v.e(Dex2OatInitModule.t.getLong(Dex2OatInitModule.v.a(), 0)) && !Dex2OatInitModule.v.k(Dex2OatInitModule.t.getInt(Dex2OatInitModule.v.h(), i)))) {
             g.a(Dex2OatInitModule.t.edit().putInt(Dex2OatInitModule.v.j(), 2));
          }
          if (Dex2OatInitModule.t.getInt(Dex2OatInitModule.v.j(), -1) != 2) {
             Object[] objArray = new Object[i];
             e.C().s("Dex2OatInitModule", "not need to do dex2oat opt", objArray);
          }else if(!Dex2OatInitModule.v.b()){
             Object[] objArray1 = new Object[b];
             objArray1[i] = Integer.valueOf(19);
             u1.onEvent("dex2oat_result", "space_not_sufficient", objArray1);
          }else {
             Dex2OatInitModule.r = new HandlerThread("oat_thr");
             Dex2OatInitModule.r.start();
             Dex2OatInitModule.s = new Handler(Dex2OatInitModule.r.getLooper());
             if (tb.p0() && (Dex2OatInitModule.s != null && !Dex2OatInitModule.q)) {
                Dex2OatInitModule.s.postDelayed(new c(tb), tb.p0());
             }
          }
       }
    label_0117 :
       return;
    }
}
