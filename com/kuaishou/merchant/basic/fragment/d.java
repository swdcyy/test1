package com.kuaishou.merchant.basic.fragment.d;
import erd.g;
import com.kuaishou.merchant.basic.fragment.f;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import n04.a;
import java.lang.String;
import q87.c;
import android.os.SystemClock;
import brd.t;
import ht3.b;
import ht3.i;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class d implements g	// class@0015bf
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       d tb = this.b;
       Objects.requireNonNull(tb);
       int i = 0;
       String str = "MerchantPagePerfLogger";
       if (p0.intValue() == 2) {
          objArray = new Object[i];
          a.C().w(str, "onPerfLogFragmentEvent onLazyViewCreate finish", objArray);
          tb.b = SystemClock.elapsedRealtime();
          if (tb.k.getDispatchDrawObservable() != null) {
             tb.q = tb.k.getDispatchDrawObservable().subscribe(new i(tb), Functions.e);
          }
       }else if(p0.intValue() == 1){
          objArray = new Object[i];
          a.C().w(str, "onPerfLogFragmentEvent onLazyViewCreate start", objArray);
          if (tb.g <= 0) {
             tb.g = SystemClock.elapsedRealtime();
          }
       }
       return;
    }
}
