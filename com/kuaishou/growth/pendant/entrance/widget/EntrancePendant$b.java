package com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.growth.pendant.entrance.widget.EntrancePendant;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.model.EntranceParam;
import com.kuaishou.growth.pendant.model.PendantClickEventConfig;
import java.lang.CharSequence;
import android.content.Context;
import android.widget.FrameLayout;
import com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$b$a;
import java.lang.Runnable;
import qf0.b;
import k2b.e0;
import id0.b;
import ld0.d;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;

public final class EntrancePendant$b extends m	// class@00065d
{
    public final EntrancePendant c;

    public void EntrancePendant$b(EntrancePendant p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EntrancePendant$b.class, "1")) {
          return;
       }
       a.p(p0, "view");
       Activity uActivity = n.d(p0);
       PendantClickEventConfig mClickEventC = this.c.getMParams().getMClickEventConfig();
       int i = 0;
       i3 oi3 = 1;
       if (mClickEventC != null && mClickEventC.getClickType() == oi3) {
          if (uActivity != null) {
             uActivity.finish();
          }
       }else {
          mClickEventC = this.c.getMParams().getMClickEventConfig();
          if (mClickEventC != null && mClickEventC.getClickType() == 2) {
             mClickEventC = this.c.getMParams().getMClickEventConfig();
             String clickLinkUrl = (mClickEventC != null)? mClickEventC.getClickLinkUrl(): null;
             if (clickLinkUrl != null && clickLinkUrl.length()) {
                oi3 = null;
             }
             if (oi3 == null) {
                Context context = this.c.getContext();
                a.o(context, "context");
                b.n(context, clickLinkUrl, new EntrancePendant$b$a(this, clickLinkUrl));
             }
          }
       }
       if (uActivity instanceof e0) {
          e0 uoe0 = d.b();
          oi3 = i3.f();
          oi3.d("popup_type", "answer");
          PendantClickEventConfig mClickEventC1 = this.c.getMParams().getMClickEventConfig();
          if (mClickEventC1 != null) {
             i = mClickEventC1.getClickType();
          }
          oi3.c("click_type", Integer.valueOf(i));
          uoe0.d(uActivity, oi3.e());
       }
       return;
    }
}
