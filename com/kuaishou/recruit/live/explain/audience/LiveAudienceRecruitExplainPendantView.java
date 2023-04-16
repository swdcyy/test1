package com.kuaishou.recruit.live.explain.audience.LiveAudienceRecruitExplainPendantView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import com.kuaishou.recruit.live.explain.audience.LiveAudienceRecruitExplainPendantView$a;
import mt4.d;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveAudienceRecruitExplainPendantView extends LinearLayout	// class@000ebf
{
    public KwaiImageView b;
    public TextView c;

    public void LiveAudienceRecruitExplainPendantView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceRecruitExplainPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceRecruitExplainPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveAudienceRecruitExplainPendantView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d0a49, this);
          this.b = this.findViewById(0x7f0a19c9);
          this.c = this.findViewById(0x7f0a19c8);
          this.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       }
       return;
    }
    public void setApplyViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitExplainPendantView.class, "2")) {
          return;
       }
       this.c.setOnClickListener(new LiveAudienceRecruitExplainPendantView$a(this, true, p0));
       return;
    }
    public void setApplyViewContentTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitExplainPendantView.class, "5")) {
          return;
       }
       this.c.setTextColor(d.a(p0, R.color.arg_RES_7f0607e0));
       this.setApplyViewRightDrawableColor(p0);
       return;
    }
    public final void setApplyViewRightDrawableColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitExplainPendantView.class, "6")) {
          return;
       }
       object oobject = this.c.getCompoundDrawables()[2];
       if (oobject != null) {
          oobject.setTint(d.a(p0, R.color.arg_RES_7f0607e0));
       }
       return;
    }
    public void setApplyViewVisible(boolean p0){
       if (PatchProxy.isSupport(LiveAudienceRecruitExplainPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAudienceRecruitExplainPendantView.class, "7")) {
          return;
       }
       if (p0) {
          this.c.setVisibility(0);
       }else {
          this.c.setVisibility(8);
       }
       return;
    }
    public void setPendantImageViewUrls(UserInfos$PicUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitExplainPendantView.class, "3")) {
          return;
       }
       if (!j.h(p0)) {
          this.b.U(e0.i(p0));
       }
       return;
    }
}
