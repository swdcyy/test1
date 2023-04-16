package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$d$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import kotlin.jvm.internal.a;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;

public final class AdAutoPlayPresenter$d$a implements Runnable	// class@00158d
{
    public final AdAutoPlayPresenter$d b;
    public final int c;

    public void AdAutoPlayPresenter$d$a(AdAutoPlayPresenter$d p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AdAutoPlayPresenter$d$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SlidePlayAutoPlay", "广告播放完毕"+this.c, objArray);
       if (this.c == 0x2775) {
          AdAutoPlayPresenter$d b = this.b.b;
          b.v = true;
          AdAutoPlayPresenter z = b.z;
          if (z == null) {
             a.S("mEndScreenPrepare");
          }
          Object obj = z.get();
          a.o(obj, "mEndScreenPrepare.get\(\)");
          if (obj.booleanValue()) {
             z = this.b.b.p;
             if (z == null) {
                a.S("mPhoto");
             }
             if (s.I(z)) {
                this.b.b.R8();
             }
          }
          this.b.b.P8();
       }
       return;
    }
}
