package com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter$d;
import erd.g;
import com.kwai.live.gzone.gift.LiveGzoneGiftMessageBarPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.AbstractList;
import k57.d;

public final class LiveGzoneGiftMessageBarPresenter$d implements g	// class@000d0c
{
    public final LiveGzoneGiftMessageBarPresenter b;

    public void LiveGzoneGiftMessageBarPresenter$d(LiveGzoneGiftMessageBarPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneGiftMessageBarPresenter$d.class, "1")) {
       }else {
          p0 = this.b.y.iterator();
          while (p0.hasNext()) {
             p0.next().e();
          }
       }
       return;
    }
}
