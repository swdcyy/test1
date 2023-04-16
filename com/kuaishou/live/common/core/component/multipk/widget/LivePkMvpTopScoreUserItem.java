package com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserItem;
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
import qu1.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import android.widget.ImageView;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import hc.b;
import com.kuaishou.live.common.core.component.pk.b;
import com.kuaishou.live.common.core.component.multipk.widget.LivePkMvpTopScoreUserItem$a;

public class LivePkMvpTopScoreUserItem extends FrameLayout	// class@0016aa
{
    public KwaiImageView b;
    public KwaiImageView c;
    public UserInfo d;
    public final ArrayList e;
    public final ArrayList f;
    public int g;
    public LivePkMvpTopScoreUserItem$a h;

    public void LivePkMvpTopScoreUserItem(Context p0){
       super(p0, null, 0);
    }
    public void LivePkMvpTopScoreUserItem(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkMvpTopScoreUserItem(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       ArrayList uArrayList = new ArrayList(3);
       this.e = uArrayList;
       ArrayList uArrayList1 = new ArrayList(3);
       this.f = uArrayList1;
       this.g = 3;
       if (!PatchProxy.isSupport(LivePkMvpTopScoreUserItem.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LivePkMvpTopScoreUserItem.class, "2")) {
          a.d(p0, R.layout.arg_RES_7f0d0cfd, this, true);
          this.b = this.findViewById(0x7f0a2284);
          KwaiImageView kwaiImageVie = this.findViewById(R.id.live_pk_mvp_top_score_user_list_item_avatar_ring);
          this.c = kwaiImageVie;
          kwaiImageVie.L(c0.a.b(LivePkResourcePathConstant.LIVE_PK_RANK_FIRST_PATH.getResourcePath()));
          this.setOnClickListener(new b(this));
       }
       if (!PatchProxy.applyVoid(null, this, LivePkMvpTopScoreUserItem.class, "1")) {
          uArrayList.add(LivePkResource$PkSkinResource.LIVE_PK_RANK_SELF_FIRST);
          uArrayList.add(LivePkResource$PkSkinResource.LIVE_PK_RANK_SELF_SECOND);
          uArrayList.add(LivePkResource$PkSkinResource.LIVE_PK_RANK_SELF_THIRD);
          uArrayList1.add(LivePkResource$PkSkinResource.LIVE_PK_RANK_OPPONENT_FIRST);
          uArrayList1.add(LivePkResource$PkSkinResource.LIVE_PK_RANK_OPPONENT_SECOND);
          uArrayList1.add(LivePkResource$PkSkinResource.LIVE_PK_RANK_OPPONENT_THIRD);
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePkMvpTopScoreUserItem.class, "3")) {
          return;
       }
       this.d = objArray;
       this.clearAnimation();
       this.b.setVisibility(8);
       this.c.setVisibility(8);
       return;
    }
    public void b(UserInfo p0,boolean p1){
       if (PatchProxy.isSupport(LivePkMvpTopScoreUserItem.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LivePkMvpTopScoreUserItem.class, "4")) {
          return;
       }
       LivePkMvpTopScoreUserItem td = this.d;
       if (td == null || !TextUtils.n(td.mId, p0.mId)) {
          this.d = p0;
          if (PatchProxy.isSupport(LivePkMvpTopScoreUserItem.class) && (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LivePkMvpTopScoreUserItem.class, "6") && p0 != null)) {
             int i = 0;
             this.b.setVisibility(i);
             g.d(this.b, p0, HeadImageSize.SMALL);
             this.c.setVisibility(i);
             if (!PatchProxy.isSupport(LivePkMvpTopScoreUserItem.class) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), this, LivePkMvpTopScoreUserItem.class, "5") && !this.c.getVisibility())) {
                if (p1) {
                   b.b(this.c, this.e.get((this.g - 1)), null);
                }else {
                   b.b(this.c, this.f.get((this.g - 1)), null);
                }
             }
          }
       }
       return;
    }
    public void setLivePkMvpTopScoreUserItemClickListener(LivePkMvpTopScoreUserItem$a p0){
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
