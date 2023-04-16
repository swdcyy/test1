package com.yxcorp.gifshow.log.w;
import android.telephony.PhoneStateListener;
import android.content.Context;
import q2b.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.p0;
import java.lang.Integer;
import k2b.q2;
import java.lang.Runnable;
import t45.c;
import java.lang.RuntimeException;
import android.telephony.SignalStrength;
import k2b.r2;

public class w extends PhoneStateListener	// class@001b5b
{
    public boolean a;
    public String b;
    public int c;
    public int d;
    public int e;
    public c f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Context k;
    public boolean l;

    public void w(Context p0){
       super();
       this.a = false;
       this.b = "";
       this.c = Integer.MAX_VALUE;
       this.d = -1;
       this.e = -1;
       this.g = Integer.MAX_VALUE;
       this.h = Integer.MAX_VALUE;
       this.i = Integer.MAX_VALUE;
       this.j = Integer.MAX_VALUE;
       this.k = p0;
       this.f = new c();
       this.l = false;
    }
    public int a(){
       return this.c;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, w.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.l == null) {
          return p0.C(this.k);
       }
       return this.a;
    }
    public void onDataConnectionStateChanged(int p0,int p1){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, w.class, "3")) {
          return;
       }
       try{
          super.onDataConnectionStateChanged(p0, p1);
          c.a(new q2(this, p0));
       }catch(java.lang.RuntimeException e5){
          e5.printStackTrace();
       }
       return;
    }
    public void onSignalStrengthsChanged(SignalStrength p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       try{
          c.a(new r2(this, p0));
          return;
       }catch(java.lang.RuntimeException e0){
       }
    }
}
