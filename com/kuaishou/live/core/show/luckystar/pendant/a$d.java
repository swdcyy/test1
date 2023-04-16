package com.kuaishou.live.core.show.luckystar.pendant.a$d;
import com.kuaishou.live.core.show.luckystar.pendant.a$b;
import android.content.Context;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.luckystar.pendant.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.luckystar.pendant.LiveLuckyStarNewPendantV2View;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ks5.m;
import ks5.l;
import java.lang.Long;
import com.kuaishou.live.core.show.luckystar.pendant.LiveBaseLuckyStarPendantView;
import java.util.concurrent.TimeUnit;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.animation.AnimatorSet;
import java.util.Objects;
import lnc.e0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d61.c0;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;
import ks5.i;
import android.widget.RelativeLayout;
import fc2.d;
import java.lang.Runnable;
import android.graphics.drawable.Drawable;

public class a$d implements a$b	// class@000cf3
{
    public final Context a;
    public final View$OnClickListener b;
    public final boolean c;
    public LiveLuckyStarNewPendantV2View d;
    public AnimatorSet e;
    public boolean f;
    public Runnable g;

    public void a$d(Context p0,View$OnClickListener p1,boolean p2,CDNUrl[] p3,a$a p4){
       super();
       this.g = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       if (PatchProxy.applyVoidOneRefs(p3, this, a$d.class, "15")) {
       }else {
          this.t().setBackgroundImage(p3);
       }
       return;
    }
    public View b(ViewGroup p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a$d.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.t();
    }
    public boolean c(){
       return l.d(this);
    }
    public void d(ViewGroup p0){
       l.e(this, p0);
    }
    public void e(ViewGroup p0){
       l.f(this, p0);
    }
    public void f(long p0,CDNUrl[] p1){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uod, "6")) {
          return;
       }
       this.t().e(p0);
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       if (mILLISECONDS.toSeconds(p0) <= 0) {
          b.P(LiveLogTag.LUCKY_STAR.appendTag("LuckyStarNewPendantController"), "stopCountdownAnimation\(time out\)");
          this.u();
       }else if(mILLISECONDS.toSeconds(p0) - 10 <= 0){
          if (this.f != null) {
             return;
          }else {
             a$d te = this.e;
             if (te == null || !te.isRunning()) {
                b.S(LiveLogTag.LUCKY_STAR.appendTag("LuckyStarNewPendantController"), "playCountdownAnimation", "current count down", Long.valueOf(p0));
                if (!PatchProxy.applyVoidOneRefs(p1, this, uod, "12")) {
                   this.f = true;
                   LiveLuckyStarNewPendantV2View liveLuckySta = this.t();
                   Objects.requireNonNull(liveLuckySta);
                   if (!PatchProxy.applyVoidOneRefs(p1, liveLuckySta, LiveLuckyStarNewPendantV2View.class, "3")) {
                      String str = e0.d(p1);
                      if (TextUtils.x(str)) {
                         str = c0.a.b("/udata/pkg/kwai-client-image/live_pendant/live_lucky_star_v2_countdown_lottie_new.json");
                      }
                      liveLuckySta.f(str, true);
                   }
                }
             }else {
                b.P(LiveLogTag.LUCKY_STAR.appendTag("LuckyStarNewPendantController"), "count down animation is interrupted by enter animation");
             }
          }
       }
       return;
    }
    public void g(CDNUrl[] p0){
       a$d uod = a$d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "7")) {
          return;
       }
       a$d te = this.e;
       String str = "LuckyStarNewPendantController";
       if (te != null && te.isRunning()) {
          b.P(LiveLogTag.LUCKY_STAR.appendTag(str), "playSwingAnimation interrupt by enter animation");
          return;
       }else if(this.f != null){
          b.P(LiveLogTag.LUCKY_STAR.appendTag(str), "playSwingAnimation interrupt by count down animation");
          return;
       }else {
          b.P(LiveLogTag.LUCKY_STAR.appendTag(str), "playSwingAnimation");
          if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "13")) {
             LiveLuckyStarNewPendantV2View liveLuckySta = this.t();
             Objects.requireNonNull(liveLuckySta);
             if (!PatchProxy.applyVoidOneRefs(p0, liveLuckySta, LiveLuckyStarNewPendantV2View.class, "4")) {
                String str1 = e0.d(p0);
                if (TextUtils.x(str1)) {
                   str1 = c0.a.b("/udata/pkg/kwai-client-image/live_pendant/live_lucky_star_v2_swing_lottie_new.json");
                }
                liveLuckySta.f(str1, false);
             }
          }
          return;
       }
    }
    public String getId(){
       return "liveLuckyStarV2";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.LUCKY_STAR.ordinal();
    }
    public String h(){
       return l.c(this);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "5")) {
          return;
       }
       this.t().c();
       return;
    }
    public int l(){
       return l.b(this);
    }
    public int m(){
       return 2;
    }
    public int n(){
       return 2;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.LUCKY_STAR.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
    public void r(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "8")) {
          return;
       }
       a$d te = this.e;
       if (te != null && te.isRunning()) {
          this.e.removeAllListeners();
          this.e.end();
          p0.oo(this);
       }
       b.P(LiveLogTag.LUCKY_STAR.appendTag("LuckyStarNewPendantController"), "playEnterAnimation");
       LiveLuckyStarNewPendantV2View liveLuckySta = this.t();
       liveLuckySta.setAlpha(0);
       liveLuckySta.setCountDownTextViewVisible(false);
       liveLuckySta.post(new d(this, liveLuckySta, p0));
       return;
    }
    public void release(){
       a$d uod = a$d.class;
       if (PatchProxy.applyVoid(null, this, uod, "10")) {
          return;
       }
       a$d te = this.e;
       if (te != null) {
          te.removeAllListeners();
          this.e.end();
          this.e = null;
       }
       this.u();
       if (!PatchProxy.applyVoid(null, this, uod, "14")) {
          this.t().g();
       }
       return;
    }
    public void s(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "9")) {
          return;
       }
       this.t().setBackground(p0);
       return;
    }
    public LiveLuckyStarNewPendantV2View t(){
       LiveLuckyStarNewPendantV2View obj = PatchProxy.apply(null, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          obj = new LiveLuckyStarNewPendantV2View(this.a);
          this.d = obj;
          obj.setOnClickListener(this.b);
       }
       return this.d;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "11")) {
          return;
       }
       this.f = false;
       this.t().g();
       return;
    }
}
