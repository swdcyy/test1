package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$d;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$g;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeSelectItemView;
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
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import android.text.SpannableStringBuilder;
import tk2.h0;
import android.view.View$OnClickListener;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.subscribe.edit.detail.k;
import z1.a;
import com.kuaishou.live.core.show.subscribe.edit.detail.j;
import android.widget.CompoundButton$OnCheckedChangeListener;
import java.util.Set;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import wk2.s;

public class LiveSubscribeDetailFragment$d extends LiveSubscribeDetailFragment$g	// class@0010fd
{
    public final LiveSubscribeDetailFragment a;

    public void LiveSubscribeDetailFragment$d(LiveSubscribeDetailFragment p0,LiveSubscribeSelectItemView p1){
       this.a = p0;
       super(p1);
    }
    public void a(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeDetailFragment$d.class, "1")) {
          return;
       }
       RecyclerView$ViewHolder titemView = this.itemView;
       int i = 0;
       titemView.setVisibility(i);
       if (!PatchProxy.applyVoidOneRefs(p0, titemView, LiveSubscribeSelectItemView.class, "6")) {
          titemView.f = p0;
          titemView.c.setText(p0.mTitle);
          titemView.d.setText(new LiveSpannable().b(p0.mSubscribeTimeDesc).d().j(new LiveSpannable$b(p0.mDisplayTotalCount).d(R.color.arg_RES_7f0607c5)).b(p0.mDisplayTotalCountSuffix).k());
          titemView.setCheckedWithoutNotify(p0.mIsSelected);
          titemView.setOnClickListener(new h0(titemView));
          if (p0.mIsPhotoRelated != null) {
             titemView.i.setVisibility(i);
             titemView.i.setText(R.string.arg_RES_7f102cd2);
             LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo mPhotoDesc = p0.mPhotoDesc;
             if (!TextUtils.x(mPhotoDesc)) {
                titemView.i.append(mPhotoDesc);
             }else {
                titemView.i.append("бн");
             }
          }else {
             titemView.i.setVisibility(8);
          }
       }
       titemView.setDeleteSubscribeListener(new k(this, p0));
       titemView.setOnCheckedChangedListener(new j(this, p0, titemView));
       if (!this.a.r.contains(p0.mSubscribeId)) {
          s.y(p0, this.a.m.get(), this.a.n.get(), this.a.j.b);
          this.a.r.add(p0.mSubscribeId);
       }
       return;
    }
}
