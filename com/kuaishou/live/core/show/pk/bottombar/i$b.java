package com.kuaishou.live.core.show.pk.bottombar.i$b;
import ht5.d;
import com.kuaishou.live.core.show.pk.bottombar.i;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import id2.v;
import brd.y;

public class i$b implements d	// class@000d81
{
    public final Gift a;
    public final i b;

    public void i$b(i p0,Gift p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean onError(Throwable p0){
       return false;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
       }else {
          p0 = this.b;
          Gift mId = this.a.mId;
          Objects.requireNonNull(p0);
          i oi = i.class;
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mId), p0, oi, "10")) {
             p0 = p0.C;
             if (p0 != null) {
                v ov = new v();
                ov.a = true;
                ov.b = mId;
                p0.onNext(ov);
             }
          }
       }
       return;
    }
}
