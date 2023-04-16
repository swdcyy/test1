package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$c;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import iz.a;
import tkd.b;
import tkd.d;
import rx4.i;

public final class AdPopImageTkPresenter$c extends a	// class@0015fe
{
    public final AdPopImageTkPresenter b;

    public void AdPopImageTkPresenter$c(AdPopImageTkPresenter p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, AdPopImageTkPresenter$c.class, "3")) {
          return;
       }
       AdPopImageTkPresenter$c tb = this.b;
       tb.J = false;
       AdPopImageTkPresenter a = tb.A;
       if (a != null) {
          a.removeAllViews();
       }
       return;
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, AdPopImageTkPresenter$c.class, "4")) {
          return;
       }
       AdPopImageTkPresenter g = this.b.G;
       if (g != null) {
          g.g();
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, AdPopImageTkPresenter$c.class, "1")) {
          return;
       }
       AdPopImageTkPresenter g = this.b.G;
       if (g != null) {
          g.h();
       }
       g = this.b.A;
       if (g != null) {
          g.removeAllViews();
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, AdPopImageTkPresenter$c.class, "2")) {
          return;
       }
       if (this.b.A == null) {
          return;
       }
       if (a.b()) {
          this.b.J = true;
       }else if(d.a(0x256720e1).ei()){
          this.b.S8();
       }
       return;
    }
}
