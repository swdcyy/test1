package com.kuaishou.merchant.basic.fragment.c;
import erd.g;
import com.kuaishou.merchant.basic.fragment.f;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.basic.fragment.f$a;
import java.lang.Enum;
import crd.b;
import lnc.b9;
import android.os.SystemClock;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import ht3.l;
import io.reactivex.internal.functions.Functions;
import ua4.a;
import ht3.b;

public final class c implements g	// class@0015be
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "2")) {
       }else {
          long l = 0;
          switch (f$a.a[p0.ordinal()]){
              case 1:
                if (tb.a - l <= 0) {
                   tb.a = SystemClock.elapsedRealtime();
                }
                Objects.requireNonNull(a.b);
                a.a = tb.k.C1();
                break;
              case 2:
                if (tb.b - l <= 0) {
                   tb.b = SystemClock.elapsedRealtime();
                }
                p0 = tb.k;
                if (p0 instanceof MerchantRecycleFragment && (p0.Gh() && !tb.k.K0())) {
                   b9.a(tb.p);
                   tb.p = tb.k.hh().subscribe(new l(tb), Functions.e);
                }
                break;
              case 3:
                if (tb.c - l <= 0) {
                   tb.c = SystemClock.elapsedRealtime();
                }
                tb.d = SystemClock.elapsedRealtime();
                break;
              case 4:
                if (tb.e - l <= 0) {
                   tb.e = SystemClock.elapsedRealtime();
                }
                break;
              case 5:
                b9.a(tb.p);
              case 6:
                tb.g();
                break;
              default:
          }
       }
       return;
    }
}
