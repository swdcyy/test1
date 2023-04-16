package com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import com.kuaishou.live.common.core.component.pk.LivePkResourcePathConstant;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import nt1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserItemView$a;

public class LiveMultiPkMvpTopScoreUserItemView extends FrameLayout	// class@00162d
{
    public KwaiImageView b;
    public KwaiImageView c;
    public UserInfo d;
    public final ArrayList e;
    public final ArrayList f;
    public int g;
    public LiveMultiPkMvpTopScoreUserItemView$a h;

    public void LiveMultiPkMvpTopScoreUserItemView(Context p0){
       super(p0, null, 0);
    }
    public void LiveMultiPkMvpTopScoreUserItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveMultiPkMvpTopScoreUserItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList(3);
       this.e = uArrayList;
       ArrayList uArrayList1 = new ArrayList(3);
       this.f = uArrayList1;
       this.g = 3;
       if (!PatchProxy.isSupport(LiveMultiPkMvpTopScoreUserItemView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveMultiPkMvpTopScoreUserItemView.class, "2")) {
          a.d(p0, R.layout.arg_RES_7f0d0cfd, this, true);
          this.b = this.findViewById(0x7f0a2284);
          KwaiImageView kwaiImageVie = this.findViewById(R.id.live_pk_mvp_top_score_user_list_item_avatar_ring);
          this.c = kwaiImageVie;
          kwaiImageVie.L(c0.a.b(LivePkResourcePathConstant.LIVE_PK_RANK_FIRST_PATH.getResourcePath()));
          this.setOnClickListener(new b(this));
       }
       if (!PatchProxy.applyVoid(null, this, LiveMultiPkMvpTopScoreUserItemView.class, "1")) {
          uArrayList.add(LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_FIRST);
          uArrayList.add(LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_SECOND);
          uArrayList.add(LiveMultiPkResourceTypes.LIVE_PK_RANK_SELF_THIRD);
          uArrayList1.add(LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_FIRST);
          uArrayList1.add(LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_SECOND);
          uArrayList1.add(LiveMultiPkResourceTypes.LIVE_PK_RANK_OPPONENT_THIRD);
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMultiPkMvpTopScoreUserItemView.class, "3")) {
          return;
       }
       this.d = objArray;
       this.clearAnimation();
       this.b.setVisibility(8);
       this.c.setVisibility(8);
       return;
    }
    public void setLivePkMvpTopScoreUserItemClickListener(LiveMultiPkMvpTopScoreUserItemView$a p0){
       this.h = p0;
    }
    public void setRank(int p0){
       if (p0 < 1 || p0 > 3) {
          p0 = 3;
       }
       this.g = p0;
       return;
    }
}
