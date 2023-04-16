package com.kuaishou.recruit.live.rightpendant.anchor.LiveAnchorRecruitPendantBottomView;
import com.kuaishou.recruit.live.rightpendant.common.LiveBaseRecruitRightBottomPendantView;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import d61.f0;
import d61.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yt4.c;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;

public class LiveAnchorRecruitPendantBottomView extends LiveBaseRecruitRightBottomPendantView	// class@000ecf
{
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public View v;

    public void LiveAnchorRecruitPendantBottomView(Context p0){
       super(p0, null);
    }
    public void LiveAnchorRecruitPendantBottomView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAnchorRecruitPendantBottomView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(Context p0,RelativeLayout p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorRecruitPendantBottomView.class, "1")) {
          return;
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d09d0, p1);
       this.q = m1.f(view, 0x7f0a249a);
       this.r = m1.f(view, 0x7f0a2495);
       TextView textView = m1.f(view, R.id.live_recruit_right_bottom_pendant_salary);
       this.u = textView;
       f0.f(textView, "sans-serif-medium");
       this.s = m1.f(view, 0x7f0a248f);
       this.t = m1.f(view, 0x7f0a2492);
       this.v = m1.f(view, 0x7f0a2497);
       return;
    }
    public final void e(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorRecruitPendantBottomView.class, "6")) {
          return;
       }
       h.k(p0, p1);
       int i = (TextUtils.x(p1))? 8: 0;
       p0.setVisibility(i);
       return;
    }
    public LiveAnchorRecruitPendantBottomView f(int p0,c p1,boolean p2){
       int this;
       if (PatchProxy.isSupport(LiveAnchorRecruitPendantBottomView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, LiveAnchorRecruitPendantBottomView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.e(this.q, p1.c);
       this.e(this.r, p1.d);
       this.e(this.u, p1.b);
       this.e(this.t, p1.e);
       this.e(this.k, p1.f);
       this.e(this.s, p1.g);
       this.l.setText(p1.e);
       if (!PatchProxy.isSupport(LiveAnchorRecruitPendantBottomView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p2), this, LiveAnchorRecruitPendantBottomView.class, "5")) {
          if (p0) {
             if (p0 != 1) {
                if (p0 == 2) {
                   LiveBaseRecruitRightBottomPendantView tl = this.l;
                   this = (p2)? 8: 0;
                   tl.setVisibility(this);
                   LiveAnchorRecruitPendantBottomView ts = this.s;
                   this = (p2)? 8: 0;
                   ts.setVisibility(this);
                   ts = this.t;
                   this = (p2)? 0: 8;
                   ts.setVisibility(this);
                   this.r.setVisibility(8);
                   this.u.setVisibility(0);
                   this.setInterpretationContainerVisibleStatus(1);
                   this.q.setMaxLines(2);
                }
             }else {
                this.l.setVisibility(8);
                this.s.setVisibility(8);
                this.t.setVisibility(0);
                this.r.setVisibility(8);
                this.u.setVisibility(0);
                this.setInterpretationContainerVisibleStatus(1);
                this.q.setMaxLines(2);
             }
          }else {
             this.l.setVisibility(8);
             this.s.setVisibility(0);
             this.t.setVisibility(8);
             this.r.setVisibility(0);
             this.u.setVisibility(8);
             this.setInterpretationContainerVisibleStatus(0);
             this.q.setMaxLines(1);
          }
       }
       this.setJobIconView(p1.a);
       this.setPendantViewStatus(p2);
       return this;
    }
    public void setBottomButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorRecruitPendantBottomView.class, "3")) {
          return;
       }
       this.s.setOnClickListener(p0);
       return;
    }
    public void setPendantViewStatus(boolean p0){
       if (PatchProxy.isSupport(LiveAnchorRecruitPendantBottomView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAnchorRecruitPendantBottomView.class, "2")) {
          return;
       }
       super.setPendantViewStatus(p0);
       LiveAnchorRecruitPendantBottomView tv = this.v;
       int i = 0;
       int i1 = (p0)? 8: 0;
       tv.setVisibility(i1);
       RelativeLayout$LayoutParams layoutParams = this.s.getLayoutParams();
       if (layoutParams != null) {
          i1 = (p0)? a1.d(R.dimen.arg_RES_7f0702e3): 0;
          layoutParams.bottomMargin = i1;
          this.s.setLayoutParams(layoutParams);
       }
       layoutParams = this.t.getLayoutParams();
       if (layoutParams != null) {
          if (p0) {
             i = a1.d(R.dimen.arg_RES_7f070334);
          }
          layoutParams.bottomMargin = i;
          this.t.setLayoutParams(layoutParams);
       }
       return;
    }
}
