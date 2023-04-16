package com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$d;
import erd.g;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import nw3.a;
import q87.c;

public final class MerchantAutoPlayPagePresenter$d implements g	// class@001755
{
    public final MerchantAutoPlayPagePresenter b;

    public void MerchantAutoPlayPagePresenter$d(MerchantAutoPlayPagePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       boolean b = p0.booleanValue();
       MerchantAutoPlayPagePresenter$d uod = MerchantAutoPlayPagePresenter$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "1")) {
          int i = 0;
          if (b) {
             objArray = new Object[i];
             a.C().w("MerchantAutoPlayPagePresenter", "liveFloatingWindowShow stop all play", objArray);
             this.b.stopAllPlayCard();
          }else {
             objArray = new Object[i];
             a.C().w("MerchantAutoPlayPagePresenter", "liveFloatingWindowClose try start play", objArray);
             this.b.tryStartDispatch();
          }
       }
       return;
    }
}
