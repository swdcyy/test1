package com.kuaishou.live.audience.component.gift.gift.audience.v2.b;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$e;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.d0;
import z12.c0;
import android.view.View$OnTouchListener;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView;
import a2.i0;
import mk1.h;
import java.util.Iterator;
import java.util.List;
import jk1.c;

public class b implements LiveGiftBoxPopupView$e	// class@000afc
{
    public final View a;
    public final DrawingGiftEditView b;
    public final LiveAudienceGiftBoxFragment c;

    public void b(LiveAudienceGiftBoxFragment p0,View p1,DrawingGiftEditView p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "2")) {
          return;
       }
       b tc = this.c;
       if (tc.B == null) {
          tc.B = true;
          tc = this.a;
          b tb = this.b;
          if (!PatchProxy.applyVoidTwoRefs(tc, tb, objArray, d0.class, "1")) {
             tc.setOnTouchListener(new c0(tb, tc));
          }
       }
       return;
    }
    public void b(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       LiveAudienceGiftBoxFragment x = this.c.x;
       Objects.requireNonNull(x);
       if (!PatchProxy.applyVoid(null, x, LiveAudienceGiftBoxView.class, "3")) {
          i0.u0(x.d, x.f.getAlpha());
       }
       uob = this.c;
       if (uob.z.L != null) {
          return;
       }else {
          Iterator iterator = uob.s.iterator();
          while (iterator.hasNext()) {
             iterator.next().e(p0, p1);
          }
          return;
       }
    }
}
