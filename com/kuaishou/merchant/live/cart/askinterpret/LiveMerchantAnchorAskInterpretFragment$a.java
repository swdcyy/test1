package com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment$a;
import gka.h;
import com.kuaishou.merchant.live.cart.askinterpret.LiveMerchantAnchorAskInterpretFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import mkc.b;
import android.view.View;
import mkc.c;
import android.view.View$OnClickListener;
import java.lang.Throwable;

public class LiveMerchantAnchorAskInterpretFragment$a extends h	// class@0018f6
{
    public final LiveMerchantAnchorAskInterpretFragment a;

    public void LiveMerchantAnchorAskInterpretFragment$a(LiveMerchantAnchorAskInterpretFragment p0){
       this.a = p0;
       super();
    }
    public void d(boolean p0){
       LiveMerchantAnchorAskInterpretFragment$a uoa = LiveMerchantAnchorAskInterpretFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       LiveMerchantAnchorAskInterpretFragment b = this.a.B;
       if (b == null) {
          return;
       }
       c.h(b, b.d);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAnchorAskInterpretFragment$a.class, "2")) {
          return;
       }
       this.a.A.setVisibility(8);
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMerchantAnchorAskInterpretFragment$a.class, "1")) {
          return;
       }
       this.a.A.setOnClickListener(objArray);
       this.a.A.setVisibility(0);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAnchorAskInterpretFragment$a.class, "6")) {
          return;
       }
       this.a.A.setVisibility(8);
       return;
    }
    public void k(boolean p0,Throwable p1){
       LiveMerchantAnchorAskInterpretFragment$a uoa = LiveMerchantAnchorAskInterpretFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "5")) {
          return;
       }
       b[] uobArray = new b[]{b.d};
       c.d(this.a.B, uobArray);
       this.a.A.setVisibility(0);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantAnchorAskInterpretFragment$a.class, "4")) {
          return;
       }
       b[] uobArray = new b[]{b.d};
       c.d(this.a.B, uobArray);
       return;
    }
}
