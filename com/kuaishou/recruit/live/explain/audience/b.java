package com.kuaishou.recruit.live.explain.audience.b;
import mt4.b;
import kt4.r;
import java.lang.Object;
import kt4.c;
import oy.a;
import com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;
import tyc.q0;
import android.view.GestureDetector;
import com.kuaishou.recruit.live.explain.audience.b$a;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.recruit.live.explain.audience.LiveAudienceRecruitExplainPendantView;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelButton;
import android.widget.LinearLayout;
import kt4.b;
import android.view.View$OnTouchListener;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import kt4.a;
import android.view.View$OnClickListener;
import android.app.Activity;
import d61.g;
import fq5.b;
import sr5.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.recruit.live.explain.audience.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kwai.framework.model.feed.BaseFeed;
import android.content.Context;
import et4.b;
import xh7.b;
import qh7.b;
import qh7.a;
import java.lang.Integer;
import mt4.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public class b implements b	// class@000ec2
{
    public final r a;
    public Activity b;
    public a c;
    public d d;
    public a e;
    public ClientContent$LiveStreamPackage f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;
    public int m;
    public final Runnable n;
    public a o;
    public CommercialRecruitLiveShowClickReportMessageData p;
    public final q0 q;
    public final GestureDetector r;

    public void b(r p0){
       super();
       this.l = true;
       this.n = new c(this);
       this.o = a.o();
       this.p = new CommercialRecruitLiveShowClickReportMessageData();
       this.q = new q0(true);
       this.r = new GestureDetector(new b$a(this));
       this.a = p0;
    }
    public void a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (p0) {
          b tp = this.p;
          tp.mActionType = 1;
          this.o.x(tp);
       }
       return;
    }
    public void b(LivePlusRecruitMessages$LiveRecruitPanelDisplay p0,boolean p1){
       Object obj2;
       LivePlusRecruitMessages$LiveRecruitPanelDisplay this;
       String str = this;
       Object obj = p0;
       boolean b = p1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), str, uob, "4")) {
          return;
       }
       boolean b1 = (!TextUtils.n(str.g, obj.templateId) || !TextUtils.n(str.h, obj.jobId))? true: false;
       str.g = obj.templateId;
       str.h = obj.jobId;
       LiveAudienceRecruitExplainPendantView liveAudience = PatchProxy.apply(null, str, uob, "6");
       if (liveAudience != PatchProxyResult.class) {
       }else {
          liveAudience = str.a.a();
       }
       object obj1 = liveAudience;
       if (PatchProxy.isSupport(uob)) {
          obj2 = obj1;
          if (!PatchProxy.applyVoidFourRefs(obj1, p0, Boolean.valueOf(p1), Boolean.valueOf(b1), this, b.class, "7")) {
          label_0075 :
             if (!j.h(obj.jobInfoImageUrl)) {
                obj2.setPendantImageViewUrls(obj.jobInfoImageUrl);
             }
             str.i = obj.jobImageJumpUrl;
             str.j = obj.moreJobButtonUrl;
             str.k = b;
             str.m = 0;
             if (!j.h(obj.audienceButtonList)) {
                str.m = obj.audienceButtonList[0].type;
             }
             obj2.setClickable(true);
             obj2.setOnTouchListener(new b(str));
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidFourRefs(obj2, p0, Boolean.valueOf(p1), Boolean.valueOf(b1), this, b.class, "8")) {
                if (j.h(obj.audienceButtonList)) {
                   obj2.setApplyViewVisible(0);
                   if (b1) {
                      str.d(obj.templateId, obj.jobId, 0, 0);
                   }
                }else {
                   obj1 = obj.audienceButtonList[0];
                   LivePlusRecruitMessages$LiveRecruitPanelButton type = obj1.type;
                   boolean b2 = (type != 4 && b)? true: false;
                   LivePlusRecruitMessages$LiveRecruitPanelDisplay moreJobButto = (b2)? obj.moreJobButtonText: obj1.text;
                   LivePlusRecruitMessages$LiveRecruitPanelDisplay moreJobButto1 = (b2)? obj.moreJobButtonUrl: obj1.jumpUrl;
                   this = moreJobButto1;
                   boolean b3 = (type != 6)? true: false;
                   obj2.setApplyViewVisible(true);
                   if (!PatchProxy.isSupport(LiveAudienceRecruitExplainPendantView.class) || !PatchProxy.applyVoidTwoRefs(moreJobButto, Boolean.valueOf(b3), obj2, LiveAudienceRecruitExplainPendantView.class, "4")) {
                      obj2.c.setText(moreJobButto);
                      if (b3) {
                         Drawable uDrawable = a1.f(R.drawable.arg_RES_7f0814d7);
                         uDrawable.setBounds(0, 0, a1.e(10.00f), a1.e(10.00f));
                         obj2.c.setCompoundDrawables(null, null, uDrawable, null);
                      }else {
                         obj2.c.setCompoundDrawables(null, null, null, null);
                      }
                   }
                   obj2.setApplyViewContentTextColor(obj1.textColor);
                   a uoa = new a(this, p0, obj1, this, b2);
                   obj2.setApplyViewClickListener(uob);
                   if (b1) {
                      str.d(obj.templateId, obj.jobId, obj1.type, b);
                   }
                }
             }
          }
       }else {
          obj2 = obj1;
          goto label_0075 ;
       }
       return;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       if (!g.h(this.b)) {
          String str = b.a(p0, this.b, k0.a(this.c.b().r5(), a.a).orNull());
          b tb = this.b;
          if (!TextUtils.x(str)) {
             p0 = str;
          }
          a.b(b.j(tb, p0), null);
       }
       return;
    }
    public final void d(String p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, b.class, "11")) {
          return;
       }
       String str = c.a(p2);
       if (p3) {
          str = "MORE_POST";
       }
       c.c(this.f, p0, p1, str);
       return;
    }
}
