package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$f;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$g;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import android.view.View;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribePendantSwitchItemView;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.CharSequence;
import android.widget.TextView;
import tk2.f0;
import tk2.e;
import com.kwai.library.widget.button.SlipSwitchButton$a;

public class LiveSubscribeDetailFragment$f extends LiveSubscribeDetailFragment$g	// class@0010ff
{
    public final LiveSubscribeDetailFragment a;

    public void LiveSubscribeDetailFragment$f(LiveSubscribeDetailFragment p0,View p1){
       this.a = p0;
       super(p1);
    }
    public void a(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment$f.class, "1")) {
          return;
       }
       RecyclerView$ViewHolder titemView = this.itemView;
       titemView.setVisibility(0);
       LiveSubscribeDetailFragment$f ta = this.a;
       LiveSubscribeDetailFragment k = ta.k;
       LiveSubscribeDetailFragment l = ta.l;
       if (!PatchProxy.applyVoidTwoRefs(k, l, titemView, LiveSubscribePendantSwitchItemView.class, "3")) {
          titemView.c.setSwitch(k.mIsSubscribePendantSwitchOn);
          titemView.d.setText(k.mPendantTitle);
          titemView.e.setText(k.mPendantSubtitle);
          titemView.c.setOnSwitchChangeListener2(new f0(titemView, l));
       }
       return;
    }
}
