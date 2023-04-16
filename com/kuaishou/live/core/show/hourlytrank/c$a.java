package com.kuaishou.live.core.show.hourlytrank.c$a;
import ka2.c;
import com.kuaishou.live.core.show.hourlytrank.c;
import java.lang.Object;
import ka2.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka2.a;
import ka2.e;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2;
import com.kuaishou.live.core.show.hourlytrank.d;
import com.kuaishou.live.core.show.hourlytrank.LiveNormalRankNoticeViewV2$a;
import xp5.g;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import java.lang.Runnable;
import ekd.k1;
import ba2.v;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import ba2.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class c$a implements c	// class@000bfc
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return false;
    }
    public void b(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "3")) {
          return;
       }
       c$a ta = this.a;
       c p = ta.p;
       if (p != null) {
          p.setDismissListener(p0);
       }else {
          c q = ta.q;
          if (q != null) {
             q.setDismissListener(p0);
          }
       }
       return;
    }
    public boolean c(e p0,boolean p1,View p2){
       e obj;
       c$a ta;
       String obj1;
       boolean b1;
       long obj1;
       int i;
       TopDistrictRank noticeType;
       int i2;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c$a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, c$a.class, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = p0.h;
       boolean b = false;
       if (obj != null && !TextUtils.x(obj.description)) {
          p0 = p0.h;
          if (p0.useStrikingStyle == null) {
             ta = this.a;
             Objects.requireNonNull(ta);
             obj1 = PatchProxy.applyTwoRefs(p0, p2, ta, uoc, "10");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(p2 instanceof LiveNormalRankNoticeViewV2){
                obj1 = PatchProxy.applyTwoRefs(p0, p2, ta, uoc, "11");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                label_011f :
                   b1 = b;
                }else {
                   ta.p = p2;
                   p2.setNormalRankNoticeDelegate(new d(ta, p0));
                   obj1 = 4;
                   if (p0.noticeType == obj1 && !ta.A.e()) {
                      p2.setVisibility(8);
                      goto label_011f ;
                   }else {
                      p2.setVisibility(b);
                      if (!PatchProxy.applyVoidOneRefs(p2, ta, uoc, "16")) {
                         ViewGroup$MarginLayoutParams layoutParams = p2.getLayoutParams();
                         layoutParams.leftMargin = a1.d(0x7f070356);
                         layoutParams.topMargin = b;
                         layoutParams.height = a1.d(0x7f0702b8);
                         p2.setLayoutParams(layoutParams);
                      }
                      if (!PatchProxy.applyVoidOneRefs(p0, p2, LiveNormalRankNoticeViewV2.class, "2")) {
                         p2.a();
                         Animation uAnimation = AnimationUtils.loadAnimation(p2.getContext(), R.anim.arg_RES_7f010106);
                         p2.g = uAnimation;
                         p2.startAnimation(uAnimation);
                         p2.d.setText(p0.descriptionV2);
                         if (p0.noticeType == obj1) {
                            p2.b(p0);
                            if (!TextUtils.x(p0.descriptionV2)) {
                               p2.i.a(p0.descriptionV2);
                            }
                         }else {
                            p2.b(p0);
                         }
                         i = 0x2710;
                         noticeType = p0.noticeType;
                         if (noticeType == 2 || noticeType == obj1) {
                            i = 3000;
                         }
                         k1.s(p2.b, p2, (long)i);
                         TopDistrictRank noticeType1 = p0.noticeType;
                         noticeType = (1 != noticeType1 && (3 == noticeType1 || 5 == noticeType1))? 1: null;
                         if (noticeType) {
                            LiveNormalRankNoticeViewV2 i1 = p2.i;
                            noticeType = p0.rank;
                            TopDistrictRank descriptionV = p0.descriptionV2;
                            if (noticeType1 == 3) {
                               b = 1;
                            }else if(noticeType1 == 1){
                               b = 2;
                            }
                            i1.c(noticeType, descriptionV, b, v.a(noticeType1));
                         }
                      }
                   }
                }
             }
             b = 1;
             goto label_011f ;
             return b1;
          }else {
             ta = this.a;
             Objects.requireNonNull(ta);
             obj1 = PatchProxy.applyTwoRefs(p0, p2, ta, uoc, "12");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(p2 instanceof LiveFancyRankResultViewV2){
                if (!PatchProxy.applyVoidOneRefs(p0, ta, uoc, "14")) {
                   obj1 = ta.A.d();
                   String liveStreamId = ta.A.getLiveStreamId();
                   TopDistrictRank rank = p0.rank;
                   TopDistrictRank descriptionV1 = p0.descriptionV2;
                   noticeType = p0.noticeType;
                   if (noticeType == 3) {
                      i2 = 1;
                   }else if(noticeType == 1){
                      i2 = 2;
                   }else {
                      i2 = 0;
                   }
                   i.f(obj1, liveStreamId, rank, descriptionV1, i2, v.a(noticeType));
                }
                b = ta.V8(p0, p2, 0x2ee0);
             }
          }
       }
       return b;
    }
    public a d(e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.h.useStrikingStyle == null) {
          return new LiveNormalRankNoticeViewV2(this.a.getContext());
       }
       return new LiveFancyRankResultViewV2(this.a.getContext());
    }
}
