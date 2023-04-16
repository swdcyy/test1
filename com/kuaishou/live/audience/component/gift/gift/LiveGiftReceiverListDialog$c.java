package com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$c;
import y8c.g;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$e;
import ml8.c;

public class LiveGiftReceiverListDialog$c extends g	// class@000ae5
{
    public final LiveGiftReceiverListDialog w;

    public void LiveGiftReceiverListDialog$c(LiveGiftReceiverListDialog p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       LiveGiftReceiverListDialog$c uoc = LiveGiftReceiverListDialog$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new LiveGiftReceiverListDialog$e(this.w));
       return new f(a.i(p0, 0x7f0d0b3e), obj);
    }
}
