package com.kuaishou.live.core.show.luckystar.v2.luckyuser.LiveLuckyStarLuckyUserFragmentV2;
import com.kuaishou.live.core.show.luckystar.v2.LiveLuckyStarBaseDialogFragmentV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import android.os.Bundle;
import ekd.m1;
import android.widget.ImageView;
import ic2.b;
import android.view.View$OnClickListener;
import z12.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.luckystar.v2.luckyuser.b;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;

public class LiveLuckyStarLuckyUserFragmentV2 extends LiveLuckyStarBaseDialogFragmentV2	// class@000cff
{
    public PresenterV2 B;
    public i C;
    public String D;
    public String E;
    public ImageView F;
    public static final int G;

    static {
       LiveLuckyStarLuckyUserFragmentV2.G = a1.e(388.00f);
    }
    public void LiveLuckyStarLuckyUserFragmentV2(){
       super();
    }
    public int Lh(){
       return LiveLuckyStarLuckyUserFragmentV2.G;
    }
    public int Mh(){
       return 0x7f0d04e7;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarLuckyUserFragmentV2.class, "3")) {
          return;
       }
       super.onDestroyView();
       LiveLuckyStarLuckyUserFragmentV2 tB = this.B;
       if (tB != null) {
          tB.unbind();
          this.B.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLuckyStarLuckyUserFragmentV2.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       ImageView imageView = m1.f(p0, R.id.live_lucky_star_lucky_user_close_view);
       this.F = imageView;
       imageView.setOnClickListener(new b(this));
       this.F.setColorFilter(x.A(this.E, a1.a(R.color.arg_RES_7f06060a)));
       if (this.C != null && !TextUtils.x(this.D)) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.B = presenterV2;
          presenterV2.U7(new b(this.D));
          this.B.f(p0);
          Object[] objArray = new Object[]{this.C};
          this.B.i(objArray);
       }else {
          b.C(LiveLogTag.LUCKY_STAR, "init lucky user fragment failed", c.k("context", this.C, "luckyStarId", this.D));
       }
       return;
    }
}
