package com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import va1.n0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRichCardView extends ConstraintLayout	// class@000f67
{
    public final int[] B;
    public final int[] C;
    public KwaiImageView D;
    public HashMap E;

    public void LiveRichCardView(Context p0,int p1){
       a.p(p0, "context");
       super(p0);
       int[] ointArray = new int[]{a1.a(0x7f060677),a1.a(0x7f06045c)};
       this.B = ointArray;
       int[] ointArray1 = new int[]{a1.d(0x7f0702b8),a1.d(0x7f0702b8),a1.d(0x7f0702b8),a1.d(0x7f0702b8)};
       this.C = ointArray1;
       if (p1 == 7) {
          View view = a.k(this, R.layout.arg_RES_7f0d0db5, 1);
          View view1 = m1.f(view, R.id.live_rich_packet_tip_title);
          a.o(view1, "ViewBindUtils.bindWidget¡­ve_rich_packet_tip_title\)");
          this.D = view1;
          view = m1.f(view, R.id.live_rich_card_use_text);
          a.o(view, "ViewBindUtils.bindWidget¡­.live_rich_card_use_text\)");
          view.setBackground(n0.b(ointArray, ointArray1, GradientDrawable$Orientation.BL_TR));
       }else {
          a.k(this, R.layout.arg_RES_7f0d0db6, 1);
       }
       n0.a(this, (float)a1.d(R.dimen.arg_RES_7f07034b));
       return;
    }
    public final KwaiImageView getTitleImage(){
       LiveRichCardView obj = PatchProxy.apply(null, this, LiveRichCardView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.D;
       if (obj == null) {
          a.S("titleImage");
       }
       return obj;
    }
    public final void setTitleImage(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.D = p0;
       return;
    }
}
