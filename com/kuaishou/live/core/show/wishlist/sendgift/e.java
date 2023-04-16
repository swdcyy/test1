package com.kuaishou.live.core.show.wishlist.sendgift.e;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlist.sendgift.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import on2.e;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.widget.FrameLayout;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import zn2.b;
import oh1.c;

public class e implements Runnable	// class@0012fd
{
    public final c b;

    public void e(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       c p;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "1")) {
          return;
       }
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, uoc, "15")) {
          p = tb.I;
          p.e = tb.q;
          p.notifyDataSetChanged();
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, uoc, "13")) {
          p = tb.p;
          if (p != null) {
             p.findViewById(R.id.live_wish_list_detail_gift_description_container).setVisibility(8);
             View view = tb.p.findViewById(R.id.live_wish_list_detail_gift_image_view);
             ViewGroup$MarginLayoutParams layoutParams1 = view.getLayoutParams();
             layoutParams1.bottomMargin = a1.e(14.00f);
             view.setLayoutParams(layoutParams1);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, uoc, "16")) {
          int[] ointArray = new int[2];
          tb.p.getLocationOnScreen(ointArray);
          ViewGroup$MarginLayoutParams layoutParams = tb.w.getLayoutParams();
          layoutParams.leftMargin = ointArray[0] + ((tb.p.getWidth() - tb.w.getWidth()) / 2);
          tb.w.setLayoutParams(layoutParams);
       }
       this.b.w.setVisibility(0);
       this.b.w.e();
       this.b.w.setLiveGifComboAnimationListener(new b(this));
       return;
    }
}
