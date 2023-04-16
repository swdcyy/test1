package com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1$a;
import erd.g;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter$onBind$1;
import android.app.Activity;
import com.kuaishou.merchant.live.entry.OOMConfig$Alert;
import msd.l;
import java.lang.Object;
import com.kuaishou.merchant.live.entry.CrowdResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.entry.LiveMerchantEntryInterceptPresenter;
import u07.t$a;
import u07.f;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.merchant.live.entry.a;
import u07.u;
import com.kuaishou.merchant.live.entry.b;
import com.kuaishou.merchant.live.entry.c;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kuaishou.merchant.live.entry.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;

public final class LiveMerchantEntryInterceptPresenter$onBind$1$a implements g	// class@001a0f
{
    public final LiveMerchantEntryInterceptPresenter$onBind$1 b;
    public final Activity c;
    public final OOMConfig$Alert d;
    public final l e;

    public void LiveMerchantEntryInterceptPresenter$onBind$1$a(LiveMerchantEntryInterceptPresenter$onBind$1 p0,Activity p1,OOMConfig$Alert p2,l p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantEntryInterceptPresenter$onBind$1$a.class, "1")) {
       }else {
          this.b.b.P8();
          if (p0.isCrowdSeller()) {
             t$a uoa = f.e(new t$a(this.c));
             uoa.z0(this.d.mMessage);
             uoa.A(true);
             uoa.T0(this.d.mPositive);
             uoa.u0(new a(this));
             uoa.R0(this.d.mNegative);
             uoa.t0(new b(this));
             uoa.J(new c(this));
             p0.s = uoa.Y(new d());
          }else {
             this.e.invoke(Boolean.FALSE);
          }
       }
       return;
    }
}
