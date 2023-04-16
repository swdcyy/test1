package com.kuaishou.live.locallife.explain.view.LocalLifeSpikeTimingLabelView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yb6.d;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import msd.a;
import crd.b;
import com.kuaishou.live.locallife.model.LiveLocalLifeExplainCardPromotionStageInfo;
import xe3.d;
import java.lang.Integer;
import lnc.i3;
import k2b.u1;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import lnc.a1;
import gf3.c;
import com.kuaishou.live.locallife.explain.view.LocalLifeSpikeTimingLabelView$a;
import ok.h;
import lnc.b9;

public final class LocalLifeSpikeTimingLabelView extends FrameLayout	// class@000c25
{
    public TextView b;
    public TextView c;
    public View d;
    public View e;
    public b f;
    public LiveLocalLifeExplainCardPromotionStageInfo g;
    public HashMap h;

    public void LocalLifeSpikeTimingLabelView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LocalLifeSpikeTimingLabelView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LocalLifeSpikeTimingLabelView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LocalLifeSpikeTimingLabelView.class, "2")) {
       }else if(this.d == null){
          this.d = a.k(this, 0x7f0d167e, true);
          this.b = this.findViewById(0x7f0a3ad6);
          this.c = this.findViewById(0x7f0a3ad7);
          this.e = this.findViewById(0x7f0a3ad8);
       }
       return;
    }
    public final long a(long p0){
       if (PatchProxy.isSupport(LocalLifeSpikeTimingLabelView.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, LocalLifeSpikeTimingLabelView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return ((p0 - d.a()) - (long)1000);
    }
    public final void b(LocalLifeLiveExplainMessage p0,a p1){
       LocalLifeSpikeTimingLabelView g;
       int i3;
       LiveLocalLifeExplainCardPromotionStageInfo liveLocalLif = this;
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, liveLocalLif, LocalLifeSpikeTimingLabelView.class, "4")) {
          return;
       }
       LocalLifeSpikeTimingLabelView f = liveLocalLif.f;
       if (f != null) {
          f.dispose();
       }
       object oobject = PatchProxy.applyOneRefs(obj, liveLocalLif, LocalLifeSpikeTimingLabelView.class, "3");
       LocalLifeSpikeTimingLabelView localLifeSpi = null;
       if (oobject != PatchProxyResult.class) {
       }else {
          long l1 = d.a();
          LiveLocalLifeExplainCardPromotionStageInfo[] mPromotionSt = p0.getMPromotionStages();
          if (mPromotionSt != null) {
             int len = mPromotionSt.length;
             int i2 = 0;
             while (true) {
                if (i2 < len) {
                   object oobject1 = mPromotionSt[i2];
                   long l2 = oobject1.getMPromotionStageTime() - l1;
                   l2 = l2 - (long)1000;
                   i3 = (l2 - localLifeSpi > 0)? 1: 0;
                   if (i3) {
                      oobject = oobject1;
                   }else {
                      i2 = i2 + 1;
                   }
                }
             }
          }
          oobject = null;
       }
       Object obj1 = oobject;
       f = liveLocalLif.g;
       int i = (f != null)? f.getMPromotionStatus(): -1;
       int i1 = (obj1 != null)? obj1.getMPromotionStatus(): -1;
       if (!PatchProxy.isSupport(d.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(i), Integer.valueOf(i1), null, d.class, "10")) {
          i3 oi3 = i3.f();
          oi3.d("promotion_id", String.valueOf(p0.getMPromotionId()));
          oi3.d("promotion_template_id", String.valueOf(p0.getMPromotionTemplateId()));
          oi3.c("current_status", Integer.valueOf(i));
          oi3.c("next_stage", Integer.valueOf(i1));
          u1.R("countCalibration", oi3.e(), 17);
       }
       liveLocalLif.g = obj1;
       if (obj1 == null) {
          p1.invoke();
          return;
       }else {
          f = liveLocalLif.c;
          if (f != null) {
             a.m(obj1);
             f.setText(obj1.getMText());
          }
          f = liveLocalLif.g;
          a.m(f);
          if (!f.getMTopLeftTextType()) {
             f = liveLocalLif.b;
             if (f != null) {
                g = liveLocalLif.g;
                a.m(g);
                f.setText(g.getMRightText());
             }
             f = liveLocalLif.e;
             if (f != null) {
                f.setVisibility(8);
             }
             return;
          }else {
             f = liveLocalLif.e;
             if (f != null) {
                f.setVisibility(0);
             }
             f = liveLocalLif.e;
             if (f != null) {
                g = liveLocalLif.g;
                a.m(g);
                Drawable uDrawable = (g.getMPromotionStatus() != 1)? a1.f(R.drawable.arg_RES_7f081609): a1.f(R.drawable.arg_RES_7f08160a);
                f.setBackground(uDrawable);
             }
             f = liveLocalLif.g;
             a.m(f);
             long l = liveLocalLif.a(f.getMPromotionStageTime());
             if (l - localLifeSpi <= 0) {
                this.b(p0, p1);
                return;
             }else {
                f = liveLocalLif.b;
                if (f != null) {
                   f.setText(c.a(l));
                }
                LocalLifeSpikeTimingLabelView$a uoa = new LocalLifeSpikeTimingLabelView$a(this, l, p0, p1);
                liveLocalLif.f = b9.c(liveLocalLif.f, v10);
                return;
             }
          }
       }
    }
}
