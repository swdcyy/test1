package com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$a;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$g;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tk2.v;
import android.view.View$OnClickListener;
import tk2.u;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$ActivityDisplayConfig;
import java.lang.CharSequence;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.j;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import d61.k;
import android.graphics.drawable.PaintDrawable;
import lnc.a1;
import java.util.Set;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import wk2.s;

public class LiveSubscribeDetailFragment$a extends LiveSubscribeDetailFragment$g	// class@0010fa
{
    public final KwaiImageView a;
    public final View b;
    public final KwaiImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final LiveSubscribeDetailFragment h;

    public void LiveSubscribeDetailFragment$a(LiveSubscribeDetailFragment p0,View p1){
       this.h = p0;
       super(p1);
       this.a = p1.findViewById(0x7f0a262b);
       this.b = p1.findViewById(0x7f0a262f);
       this.c = p1.findViewById(0x7f0a2633);
       this.f = p1.findViewById(0x7f0a2634);
       this.e = p1.findViewById(0x7f0a2630);
       this.d = p1.findViewById(0x7f0a2636);
       this.g = p1.findViewById(0x7f0a2632);
    }
    public void a(LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p0){
       LiveSubscribeDetailFragment$a uoa = LiveSubscribeDetailFragment$a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       LiveSubscribeDetailFragment$a tb = this.b;
       int i = (p0.mDisableDelete != null)? 8: 0;
       tb.setVisibility(i);
       this.b.setOnClickListener(new v(this, p0));
       this.g.setOnClickListener(new u(this, p0));
       LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo mDisplayConf = p0.mDisplayConfig;
       if (mDisplayConf != null) {
          this.d.setText(mDisplayConf.mTitle);
          this.e.setText(mDisplayConf.mDetailActivityInfo);
          this.f.setText(mDisplayConf.mButtonText);
          if (!PatchProxy.applyVoidOneRefs(mDisplayConf, this, uoa, "2")) {
             this.a.getHierarchy().u(t$b.a);
             this.a.setPlaceHolderImage(this.h.ch(mDisplayConf.mBackgroundPlaceHolderColor));
             if (!j.h(mDisplayConf.mDetailItemImageUrls)) {
                a$a uoa2 = a.d();
                uoa2.b(":ks-features:ft-live:live");
                uoa2.d(ImageSource.FEED_COVER);
                this.a.X(mDisplayConf.mDetailItemImageUrls, uoa2.a());
             }
          }
          if (!PatchProxy.applyVoidOneRefs(mDisplayConf, this, uoa, "3")) {
             LiveSubscribeDetailFragment$a tc = this.c;
             PaintDrawable paintDrawabl = PatchProxy.applyOneRefs(mDisplayConf, this, uoa, "4");
             if (paintDrawabl != PatchProxyResult.class) {
             }else {
                PaintDrawable paintDrawabl1 = new PaintDrawable(k.b(mDisplayConf.mButtonPlaceHolderColor));
                paintDrawabl1.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f070113));
                paintDrawabl = paintDrawabl1;
             }
             tc.setPlaceHolderImage(paintDrawabl);
             if (!j.h(mDisplayConf.mButtonImageUrls)) {
                a$a uoa1 = a.d();
                uoa1.b(":ks-features:ft-live:live");
                uoa1.d(ImageSource.ICON);
                this.c.X(mDisplayConf.mButtonImageUrls, uoa1.a());
             }
          }
       }
    label_00da :
       if (!this.h.r.contains(p0.mSubscribeId)) {
          s.y(p0, this.h.m.get(), this.h.n.get(), this.h.j.b);
          this.h.r.add(p0.mSubscribeId);
       }
       return;
    }
}
