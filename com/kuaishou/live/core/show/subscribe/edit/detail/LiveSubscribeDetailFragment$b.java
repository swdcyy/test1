package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$b;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$g;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.CheckBox;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tk2.w;
import android.view.View$OnClickListener;
import tk2.x;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$ActivityDisplayConfig;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import ekd.j;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Set;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import wk2.s;

public class LiveSubscribeDetailFragment$b extends LiveSubscribeDetailFragment$g	// class@0010fb
{
    public final KwaiImageView a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final CheckBox e;
    public final LiveSubscribeDetailFragment f;

    public void LiveSubscribeDetailFragment$b(LiveSubscribeDetailFragment p0,View p1){
       this.f = p0;
       super(p1);
       this.a = p1.findViewById(0x7f0a262b);
       this.b = p1.findViewById(0x7f0a262f);
       this.d = p1.findViewById(0x7f0a2630);
       this.c = p1.findViewById(0x7f0a2636);
       this.e = p1.findViewById(0x7f0a262c);
    }
    public void a(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       LiveSubscribeDetailFragment$b uob = LiveSubscribeDetailFragment$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       LiveSubscribeDetailFragment$b tb = this.b;
       int i = (p0.mDisableDelete != null)? 8: 0;
       tb.setVisibility(i);
       this.b.setOnClickListener(new w(this, p0));
       this.e.setChecked(p0.mIsSelected);
       this.e.setOnClickListener(new x(this, p0));
       LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo mDisplayConf = p0.mDisplayConfig;
       if (mDisplayConf != null) {
          this.c.setText(mDisplayConf.mTitle);
          this.d.setText(mDisplayConf.mDetailActivityInfo);
          if (!PatchProxy.applyVoidOneRefs(mDisplayConf, this, uob, "2")) {
             this.a.setPlaceHolderImage(this.f.ch(mDisplayConf.mBackgroundPlaceHolderColor));
             this.a.getHierarchy().u(t$b.a);
             if (!j.h(mDisplayConf.mSelectItemImageUrls)) {
                a$a uoa = a.d();
                uoa.b(":ks-features:ft-live:live");
                uoa.d(ImageSource.FEED_COVER);
                this.a.X(mDisplayConf.mSelectItemImageUrls, uoa.a());
             }
          }
       }
       if (!this.f.r.contains(p0.mSubscribeId)) {
          s.y(p0, this.f.m.get(), this.f.n.get(), this.f.j.b);
          this.f.r.add(p0.mSubscribeId);
       }
       return;
    }
}
