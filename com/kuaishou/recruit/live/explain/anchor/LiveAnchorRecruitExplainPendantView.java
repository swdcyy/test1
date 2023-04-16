package com.kuaishou.recruit.live.explain.anchor.LiveAnchorRecruitExplainPendantView;
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
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import mt4.d;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import java.lang.Boolean;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;

public class LiveAnchorRecruitExplainPendantView extends LinearLayout	// class@000eb4
{
    public KwaiImageView b;
    public TextView c;
    public TextView d;
    public TextView e;

    public void LiveAnchorRecruitExplainPendantView(Context p0){
       super(p0, null);
    }
    public void LiveAnchorRecruitExplainPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAnchorRecruitExplainPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveAnchorRecruitExplainPendantView.class, "1")) {
       }else {
          a.c(this.getContext(), R.layout.arg_RES_7f0d09cf, this);
          this.b = this.findViewById(0x7f0a18be);
          this.c = this.findViewById(0x7f0a18bd);
          this.d = this.findViewById(0x7f0a18bb);
          this.e = this.findViewById(0x7f0a18bc);
          this.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       }
       return;
    }
    public void setEditViewBackgroundStrokeColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "10")) {
          return;
       }
       b uob = new b();
       uob.g(KwaiRadiusStyles.FULL);
       uob.w(d.a(p0, R.color.arg_RES_7f0605e2));
       uob.x(0x3f800000);
       this.d.setBackground(uob.a());
       return;
    }
    public void setEditViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "3")) {
          return;
       }
       this.d.setOnClickListener(p0);
       return;
    }
    public void setEditViewContentText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "7")) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setEditViewTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "9")) {
          return;
       }
       this.d.setTextColor(d.a(p0, R.color.arg_RES_7f0605e2));
       return;
    }
    public void setEditViewVisible(boolean p0){
       if (PatchProxy.isSupport(LiveAnchorRecruitExplainPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAnchorRecruitExplainPendantView.class, "13")) {
          return;
       }
       if (p0) {
          this.d.setVisibility(0);
       }else {
          this.d.setVisibility(8);
       }
       return;
    }
    public void setExchangeViewBackgroundStrokeColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "12")) {
          return;
       }
       b uob = new b();
       uob.g(KwaiRadiusStyles.FULL);
       uob.w(d.a(p0, R.color.arg_RES_7f0605e2));
       uob.x(0x3f800000);
       this.e.setBackground(uob.a());
       return;
    }
    public void setExchangeViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "4")) {
          return;
       }
       this.e.setOnClickListener(p0);
       return;
    }
    public void setExchangeViewContentText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "8")) {
          return;
       }
       this.e.setText(p0);
       return;
    }
    public void setExchangeViewTextColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "11")) {
          return;
       }
       this.e.setTextColor(d.a(p0, R.color.arg_RES_7f0605e2));
       return;
    }
    public void setExchangeViewVisible(boolean p0){
       if (PatchProxy.isSupport(LiveAnchorRecruitExplainPendantView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAnchorRecruitExplainPendantView.class, "14")) {
          return;
       }
       if (p0) {
          this.e.setVisibility(0);
       }else {
          this.e.setVisibility(8);
       }
       return;
    }
    public void setExitViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "2")) {
          return;
       }
       this.c.setOnClickListener(p0);
       return;
    }
    public void setPendantImageViewUrls(UserInfos$PicUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "5")) {
          return;
       }
       if (!j.h(p0)) {
          this.b.U(e0.i(p0));
       }
       return;
    }
    public void setPendantViewClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitExplainPendantView.class, "6")) {
          return;
       }
       this.b.setOnClickListener(p0);
       return;
    }
}
