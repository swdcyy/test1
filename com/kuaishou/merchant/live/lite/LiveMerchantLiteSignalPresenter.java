package com.kuaishou.merchant.live.lite.LiveMerchantLiteSignalPresenter;
import b93.d;
import f24.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c93.b;
import v51.a;
import xp5.g;
import d93.b;
import ks3.k0;

public class LiveMerchantLiteSignalPresenter extends d	// class@001a2a
{
    public final k0 v;

    public void LiveMerchantLiteSignalPresenter(){
       super();
       this.v = new j();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteSignalPresenter.class, "3")) {
          return;
       }
       super.F8();
       LiveMerchantLiteSignalPresenter tv = this.v;
       if (tv instanceof j) {
          tv.c();
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteSignalPresenter.class, "2")) {
          return;
       }
       a uoa = p0.a(a.class);
       g og = p0.a(g.class);
       LiveMerchantLiteSignalPresenter tv = this.v;
       if (tv instanceof j) {
          tv.d(og, uoa);
       }
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteSignalPresenter.class, "1")) {
          return;
       }
       p0.d(k0.class, this.v);
       return;
    }
}
