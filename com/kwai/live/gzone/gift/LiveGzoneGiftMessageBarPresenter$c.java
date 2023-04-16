package com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$c;
import xq5.c;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$a$a;
import android.os.Handler;
import java.util.Iterator;
import java.lang.Iterable;
import k57.d;
import oq5.a;
import oq5.c;
import trd.j;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class LiveGzoneGiftMessageBarPresenter$c implements c	// class@000d0b
{
    public final LiveGzoneGiftMessageBarPresenter b;

    public void LiveGzoneGiftMessageBarPresenter$c(LiveGzoneGiftMessageBarPresenter p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneGiftMessageBarPresenter$c.class, "1")) {
          return;
       }
       this.b.V8().sendEmptyMessage(2);
       Iterator iterator = this.b.y.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          LiveGzoneGiftMessageBarPresenter.S8(this.b).Q0(uod);
          uod.e();
       }
       this.b.y.clear();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       b.b(this);
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
