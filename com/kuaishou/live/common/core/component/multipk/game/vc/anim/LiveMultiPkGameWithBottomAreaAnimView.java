package com.kuaishou.live.common.core.component.multipk.game.vc.anim.LiveMultiPkGameWithBottomAreaAnimView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveMultiPkGameWithBottomAreaAnimView extends ConstraintLayout	// class@0015f5
{
    public KwaiImageView B;
    public TextView C;
    public KwaiImageView D;
    public HashMap E;

    public void LiveMultiPkGameWithBottomAreaAnimView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMultiPkGameWithBottomAreaAnimView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMultiPkGameWithBottomAreaAnimView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       a.d(p0, R.layout.arg_RES_7f0d0cc3, this, true);
       View view = this.findViewById(R.id.live_multi_game_anim_view);
       a.o(view, "findViewById\(R.id.live_multi_game_anim_view\)");
       this.B = view;
       view = this.findViewById(R.id.live_multi_game_anim_bottom_text_view);
       a.o(view, "findViewById\(R.id.live_m¡­me_anim_bottom_text_view\)");
       this.C = view;
       view = this.findViewById(R.id.live_multi_game_anim_left_top_image);
       a.o(view, "findViewById\(R.id.live_m¡­game_anim_left_top_image\)");
       this.D = view;
    }
    public void LiveMultiPkGameWithBottomAreaAnimView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final KwaiImageView getBottomLeftTopIconView(){
       return this.D;
    }
    public final TextView getBottomTextView(){
       return this.C;
    }
    public final KwaiImageView getMainAnimView(){
       return this.B;
    }
    public final void setBottomLeftTopIconView(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkGameWithBottomAreaAnimView.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.D = p0;
       return;
    }
    public final void setBottomTextView(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkGameWithBottomAreaAnimView.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.C = p0;
       return;
    }
    public final void setMainAnimView(KwaiImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkGameWithBottomAreaAnimView.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.B = p0;
       return;
    }
}
