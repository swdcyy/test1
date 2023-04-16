package com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder;
import xf4.b;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.DetailPreSellProgressViewBinder$mExpireCallback$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v04.a;
import com.kwai.robust.PatchProxyResult;
import sh4.c;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import kotlin.jvm.internal.a;
import ye4.c;
import android.view.ViewGroup;
import ye4.a;
import di4.b;
import java.util.Objects;
import nh4.b;
import cf4.a;
import com.kuaishou.merchant.transaction.detail.detailv2.j;
import ei4.k;
import android.view.View;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;

public final class DetailPreSellProgressViewBinder extends b	// class@000758
{
    public final p A;
    public j x;
    public SelectShapeFrameLayout y;
    public c z;

    public void DetailPreSellProgressViewBinder(Fragment p0){
       super(p0);
       this.A = s.c(new DetailPreSellProgressViewBinder$mExpireCallback$2(this));
    }
    public void E8(){
       DetailPreSellProgressViewBinder uDetailPreSe = DetailPreSellProgressViewBinder.class;
       if (PatchProxy.applyVoid(null, this, uDetailPreSe, "4")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(null, this, uDetailPreSe, "6")) {
          DetailPreSellProgressViewBinder tz = this.z;
          if (tz == null) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             c obj = PatchProxy.apply(null, this, uDetailPreSe, "7");
             if (obj != patchProxyRe) {
                tz = obj;
             }else {
                obj = new c(this.P8());
                this.z = obj;
                a.m(obj);
                obj.e();
                DetailPreSellProgressViewBinder ty = this.y;
                String str = "mContainer";
                if (ty == null) {
                   a.S(str);
                }
                a.b(ty);
                ty = this.y;
                if (ty == null) {
                   a.S(str);
                }
                DetailPreSellProgressViewBinder tz1 = this.z;
                a.m(tz1);
                a.a(ty, tz1);
                ty = this.z;
                a.m(ty);
                b uob = PatchProxy.apply(null, this, uDetailPreSe, "1");
                if (uob == patchProxyRe) {
                   uob = this.A.getValue();
                }
                ty.h = uob;
                tz = this.z;
                Objects.requireNonNull(tz, "null cannot be cast to non-null type com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.PreSellProgressBorderPlugin");
             }
          }
          tz.b(this.u.d);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, DetailPreSellProgressViewBinder.class, "3")) {
          return;
       }
       this.x = this.S8();
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, DetailPreSellProgressViewBinder.class, "5")) {
          return;
       }
       super.H8();
       DetailPreSellProgressViewBinder ty = this.y;
       if (ty == null) {
          a.S("mContainer");
       }
       a.b(ty);
       return;
    }
    public void V8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailPreSellProgressViewBinder.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.y = m1.f(p0, 0x7f0a0b08);
       return;
    }
}
