package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$c;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$g;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailItemView;
import android.view.View;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.widget.RelativeLayout;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import android.text.SpannableStringBuilder;
import tk2.e0;
import android.view.View$OnClickListener;
import lnc.a1;
import android.widget.ImageView;
import tk2.y;
import z1.a;
import tk2.z;
import java.util.Set;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import wk2.s;

public class LiveSubscribeDetailFragment$c extends LiveSubscribeDetailFragment$g	// class@0010fc
{
    public final LiveSubscribeDetailFragment a;

    public void LiveSubscribeDetailFragment$c(LiveSubscribeDetailFragment p0,LiveSubscribeDetailItemView p1){
       this.a = p0;
       super(p1);
    }
    public void a(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       LiveSubscribeDetailItemView g;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment$c.class, "1")) {
          return;
       }
       RecyclerView$ViewHolder titemView = this.itemView;
       int i = 0;
       titemView.setVisibility(i);
       if (!PatchProxy.applyVoidOneRefs(p0, titemView, LiveSubscribeDetailItemView.class, "5")) {
          titemView.j = p0;
          if (!PatchProxy.applyVoidOneRefs(p0, titemView, LiveSubscribeDetailItemView.class, "6")) {
             titemView.c.setText(p0.mTitle);
             titemView.c(titemView.c, (p0.mIsBanned ^ 0x01));
          }
          if (!PatchProxy.applyVoidOneRefs(p0, titemView, LiveSubscribeDetailItemView.class, "9")) {
             LiveSpannable$b uob = new LiveSpannable$b(p0.mDisplayTotalCount);
             if (p0.mIsBanned == null) {
                uob.d(R.color.arg_RES_7f0607c5);
             }
             titemView.d.setText(new LiveSpannable().b(p0.mSubscribeTimeDesc).d().j(uob).b(p0.mDisplayTotalCountSuffix).k());
             titemView.c(titemView.d, (p0.mIsBanned ^ 0x01));
          }
          if (!PatchProxy.applyVoidOneRefs(p0, titemView, LiveSubscribeDetailItemView.class, "10")) {
             if (p0.mIsBanned != null) {
                titemView.f.setVisibility(8);
                titemView.e.setVisibility(8);
             }else {
                titemView.f.setVisibility(i);
                titemView.e.setVisibility(i);
                titemView.f.setOnClickListener(new e0(titemView));
                g = titemView.f;
                String str = (p0.mIsPhotoRelated != null)? a1.p(R.string.arg_RES_7f102cb6): a1.p(R.string.arg_RES_7f102ce1);
                g.setText(str);
                titemView.e.setVisibility(i);
                if (p0.mIsPhotoRelated != null) {
                   titemView.e.setText(p0.mPhotoDesc);
                }else {
                   titemView.e.setText(R.string.arg_RES_7f102ce0);
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, titemView, LiveSubscribeDetailItemView.class, "8")) {
             g = titemView.g;
             int i1 = (p0.mIsBanned != null)? 0: 8;
             g.setVisibility(i1);
             g = titemView.k;
             if (p0.mIsBanned != null) {
                i = 8;
             }
             g.setVisibility(i);
             titemView.g.setText(p0.mBannedReason);
          }
       }
       titemView.setDeleteSubscribeListener(new y(this, p0));
       titemView.setRelatePhotoClickListener(new z(this.a));
       if (!this.a.r.contains(p0.mSubscribeId)) {
          s.y(p0, this.a.m.get(), this.a.n.get(), this.a.j.b);
          this.a.r.add(p0.mSubscribeId);
       }
       return;
    }
}
