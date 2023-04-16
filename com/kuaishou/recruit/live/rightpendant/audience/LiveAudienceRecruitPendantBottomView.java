package com.kuaishou.recruit.live.rightpendant.audience.LiveAudienceRecruitPendantBottomView;
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
import com.kwai.library.widget.refresh.KwaiRefreshView;
import d61.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View$OnClickListener;
import android.content.res.ColorStateList;
import lnc.a1;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetButtonInfo;
import d61.k;
import d61.j0;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class LiveAudienceRecruitPendantBottomView extends LiveBaseRecruitRightBottomPendantView	// class@000ed2
{
    public TextView q;
    public TextView r;
    public TextView s;
    public View t;
    public KwaiRefreshView u;
    public View v;
    public String w;

    public void LiveAudienceRecruitPendantBottomView(Context p0){
       super(p0, null);
    }
    public void LiveAudienceRecruitPendantBottomView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceRecruitPendantBottomView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w = "APPLY";
    }
    public void a(Context p0,RelativeLayout p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceRecruitPendantBottomView.class, "1")) {
          return;
       }
       View view = a.c(p0, R.layout.arg_RES_7f0d0a4a, p1);
       this.q = m1.f(view, 0x7f0a249a);
       TextView textView = m1.f(view, R.id.live_recruit_right_bottom_pendant_salary);
       this.r = textView;
       f0.f(textView, "sans-serif-medium");
       this.s = m1.f(view, 0x7f0a2491);
       this.u = m1.f(view, 0x7f0a2493);
       this.t = m1.f(view, 0x7f0a2490);
       this.v = m1.f(view, 0x7f0a2497);
       this.setInterpretationContainerVisibleStatus(true);
       return;
    }
    public final void e(TextView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceRecruitPendantBottomView.class, "7")) {
          return;
       }
       h.k(p0, p1);
       int i = (TextUtils.x(p1))? 8: 0;
       p0.setVisibility(i);
       return;
    }
    public String getButtonStatus(){
       return this.w;
    }
    public void setBottomBarButtonClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitPendantBottomView.class, "6")) {
          return;
       }
       this.t.setOnClickListener(p0);
       return;
    }
    public void setBottomButtonStatus(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitPendantBottomView.class, "5")) {
          return;
       }
       this.w = p0;
       String str = -1;
       int i = 0;
       String str1 = "APPLYING";
       switch (p0.hashCode()){
           case 0xfb83f86d:
             if (p0.equals("APPLYED")) {
                str = null;
             }
             break;
           case 0x3b98b4e:
             if (p0.equals("APPLY")) {
                str = 3;
             }
             break;
           case 0x13efe34a:
             if (p0.equals("MORE_POST")) {
                str = 2;
             }
             break;
           case 0x74fb25b4:
             if (p0.equals(str1)) {
                str = 1;
             }
             break;
           default:
       }
    label_0040 :
       if (str) {
          if (str != 1) {
             str = (str != 2)? "马上报名": "查看更多职位";
          }else {
             str = "投递中";
          }
       }else {
          str = "已报名";
       }
       boolean b = TextUtils.n(p0, str1);
       LiveAudienceRecruitPendantBottomView tu = this.u;
       if (!b) {
          i = 8;
       }
       tu.setVisibility(i);
       if (b) {
          this.u.refreshing();
       }else {
          this.u.refreshComplete();
       }
       this.s.setText(str);
       int i1 = TextUtils.n(p0, "APPLYED") ^ 1;
       this.s.setTextColor(a1.b(R.color.arg_RES_7f061560));
       this.s.setSelected(i1);
       this.t.setBackgroundResource(R.drawable.arg_RES_7f08142b);
       this.t.setSelected(i1);
       return;
    }
    public void setCustomBottomButton(LivePlusRecruitMessages$RecruitWidgetButtonInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRecruitPendantBottomView.class, "4")) {
          return;
       }
       this.u.setVisibility(8);
       this.s.setText(p0.buttonText);
       this.s.setTextColor(k.c(p0.buttonTextColor, a1.a(R.color.arg_RES_7f06060a)));
       this.t.setBackgroundColor(k.c(p0.backgroundColor, a1.a(R.color.arg_RES_7f0604ba)));
       j0.a(this.t, (float)(a1.d(R.dimen.arg_RES_7f07092e) / 2));
       return;
    }
    public void setPendantViewStatus(boolean p0){
       if (PatchProxy.isSupport(LiveAudienceRecruitPendantBottomView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAudienceRecruitPendantBottomView.class, "2")) {
          return;
       }
       super.setPendantViewStatus(p0);
       LiveAudienceRecruitPendantBottomView tv = this.v;
       int i = 0;
       int i1 = (p0)? 8: 0;
       tv.setVisibility(i1);
       RelativeLayout$LayoutParams layoutParams = this.t.getLayoutParams();
       if (layoutParams != null) {
          i1 = (p0)? 0x7f07034b: 0x7f07031b;
          layoutParams.topMargin = a1.d(i1);
          if (p0) {
             i = a1.d(R.dimen.arg_RES_7f0702e3);
          }
          layoutParams.bottomMargin = i;
          this.t.setLayoutParams(layoutParams);
       }
       return;
    }
}
