package com.kuaishou.live.common.core.component.comments.item.e$a;
import k81.h;
import com.kuaishou.live.common.core.component.comments.item.e;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import d61.g;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.nex3z.flowlayout.FlowLayout;
import com.lsjwzh.widget.text.FastTextView;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.comments.model.LiveAnnounceMessage;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import va1.l0;
import android.graphics.drawable.Drawable;
import o81.g;
import hf1.a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.comments.item.b;
import com.kuaishou.live.core.show.announcement.model.LiveSubscribeBriefInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import hf1.f;
import com.kuaishou.live.core.basic.model.LiveAnnounceInfo$LiveAnnounceAction;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import com.kuaishou.live.common.core.component.comments.item.c;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.basic.model.LiveAnnounceInfo$LiveAnnounceLabel;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;
import com.kuaishou.live.common.core.basic.widget.HollowTextView;
import d61.k;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources;
import android.widget.TextView;
import eg.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.comments.item.d;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.component.comments.item.a;
import android.view.View$OnLayoutChangeListener;
import o56.a;
import i2b.a;
import android.graphics.drawable.BitmapDrawable;
import android.view.View$MeasureSpec;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class e$a extends h	// class@00109d
{
    public final KwaiImageView f;
    public final FlowLayout g;
    public final FastTextView h;
    public final FastTextView i;
    public final View j;
    public final View k;
    public View$OnLayoutChangeListener l;
    public boolean m;
    public final e n;

    public void e$a(e p0,View p1){
       this.n = p0;
       super(p1);
       g.b(p1, e$a.class.getCanonicalName());
       this.f = p1.findViewById(0x7f0a18df);
       this.g = p1.findViewById(0x7f0a18e0);
       this.h = p1.findViewById(0x7f0a18e2);
       this.i = p1.findViewById(0x7f0a2656);
       this.j = p1.findViewById(0x7f0a2629);
       this.k = p1.findViewById(0x7f0a18de);
    }
    public void a(View p0,QLiveMessage p1,int p2){
       LiveAnnounceMessage liveAnnounce;
       int this;
       RelativeLayout$LayoutParams layoutParams;
       ViewGroup$MarginLayoutParams layoutParams1;
       RelativeLayout$LayoutParams layoutParams2;
       LiveSpannable liveSpannabl;
       HollowTextView obj;
       LiveSpannable$a uoa1;
       if (!PatchProxy.isSupport(e$a.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e$a.class, "1")) {
          l0.a(this.f, this.n.a);
          Drawable uDrawable = p0.getBackground().mutate();
          int i = (this.n.d.r())? 0: 255;
          uDrawable.setAlpha(i);
          this.f.setOnClickListener(new a(this, p1));
          if (this.n.c != null) {
             p0.setOnClickListener(new b(this, p1));
          }
          e$a uoa = 0x7f070271;
          if (!PatchProxy.applyVoidOneRefs(p1, this, e$a.class, "3")) {
             if (this.n.c != null || !TextUtils.x(p1.mSubscribeInfo.mLiveSubscribeTitle)) {
                liveSpannabl = new LiveSpannable();
                liveSpannabl.j(f.c(p1.mAnnounceText, this.n.d));
                this.h.setText(liveSpannabl.k());
             }else {
                liveSpannabl = new LiveSpannable();
                liveSpannabl.j(f.c(p1.mAnnounceText, this.n.d));
                liveAnnounce = p1.mLiveAnnounceAction;
                if (liveAnnounce != null && !TextUtils.x(liveAnnounce.mGoChattingAction)) {
                   uoa1 = this.e(p1.mLiveAnnounceAction.mGoChattingAction);
                   uoa1.a(new c(this, p1));
                   liveSpannabl.c().h(uoa1);
                }
                this.h.setText(liveSpannabl.k());
             }
             if (TextUtils.x(p1.mSubscribeInfo.mLiveSubscribeTitle)) {
                layoutParams2 = this.h.getLayoutParams();
                int i1 = (this.n.c != null)? a1.d(uoa): a1.e(0x40f00000);
                layoutParams2.bottomMargin = i1;
                this.h.setLayoutParams(layoutParams2);
             }
          }
          this.g.removeAllViews();
          liveAnnounce = null;
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "2") && !q.f(p1.mLabelList)) {
             Iterator iterator = p1.mLabelList.iterator();
             while (iterator.hasNext()) {
                LiveAnnounceInfo$LiveAnnounceLabel liveAnnounce1 = iterator.next();
                if (TextUtils.x(liveAnnounce1.mLabelContent)) {
                   continue ;
                }else {
                   obj = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0abb, liveAnnounce, 0);
                   if (!TextUtils.x(liveAnnounce1.mLabelColor)) {
                      obj.setBackgroundColor(k.b(liveAnnounce1.mLabelColor));
                   }
                   obj.setLayoutParams(new LinearLayout$LayoutParams(-2, a.c(18.00f, obj.getResources())));
                   obj.setText(liveAnnounce1.mLabelContent);
                   this.g.addView(obj);
                }
             }
             layoutParams2 = this.h.getLayoutParams();
             layoutParams2.removeRule(3);
             layoutParams2.addRule(3, R.id.live_announcement_label_layout);
             this.h.setLayoutParams(layoutParams2);
          }
          this = 8;
          if (this.m != null) {
             this.d(p1);
          }else if(PatchProxy.applyVoidOneRefs(p1, this, e$a.class, "5")){
             this.i.setVisibility(this);
             this.j.setVisibility(this);
             if (!TextUtils.x(p1.mSubscribeInfo.mLiveSubscribeTitle)) {
                if (this.n.c != null || p1.mLiveAnnounceAction == null) {
                   this.i.setText(p1.mSubscribeInfo.mLiveSubscribeTitle);
                   this.i.setTextColor(a1.a(R.color.arg_RES_7f060633));
                   this.i.setVisibility(0);
                   this.j.setVisibility(this);
                }else {
                   liveSpannabl = new LiveSpannable();
                   liveSpannabl.b(p1.mSubscribeInfo.mLiveSubscribeTitle);
                   obj = PatchProxy.applyOneRefs(p1, this, e$a.class, "10");
                   if (obj != PatchProxyResult.class) {
                      liveAnnounce = obj;
                   }else if(p1.mLiveAnnounceAction == null){
                      liveAnnounce = (TextUtils.n(p1.mActionType, "ORDER"))? p1.mLiveAnnounceAction.mSubscribeBookAction: p1.mLiveAnnounceAction.mGoChattingAction;
                   }
                   if (!TextUtils.x(liveAnnounce)) {
                      uoa1 = this.e(liveAnnounce);
                      uoa1.a(new d(this, p1));
                      liveSpannabl.c().h(uoa1);
                   }
                   this.i.setText(liveSpannabl.k());
                   this.i.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
                   this.i.setVisibility(0);
                   this.j.setVisibility(0);
                }
                layoutParams2 = this.i.getLayoutParams();
                i = (this.n.c != null)? a1.d(uoa): a1.d(R.dimen.arg_RES_7f07033f);
                layoutParams2.bottomMargin = i;
                i = (this.n.c != null)? a1.d(R.dimen.arg_RES_7f07025d): a1.d(R.dimen.arg_RES_7f07028d);
                layoutParams2.topMargin = i;
                this.i.setLayoutParams(layoutParams2);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p1, this, e$a.class, "4")) {
             e$a tk = this.k;
             if (this.n.c != null) {
                this = 0;
             }
             tk.setVisibility(this);
             if (this.n.c != null) {
                tk = 1;
                if (TextUtils.x(p1.mSubscribeInfo.mLiveSubscribeTitle)) {
                   layoutParams = this.k.getLayoutParams();
                   layoutParams.removeRule(tk);
                   layoutParams.addRule(tk, R.id.live_announcement_text);
                   this.k.setLayoutParams(layoutParams);
                }else {
                   layoutParams = this.k.getLayoutParams();
                   layoutParams.removeRule(tk);
                   layoutParams.addRule(tk, R.id.live_subscribe_text);
                   this.k.setLayoutParams(layoutParams);
                   layoutParams1 = this.h.getLayoutParams();
                   layoutParams1.rightMargin = 0;
                   this.h.setLayoutParams(layoutParams1);
                }
             }else {
                layoutParams1 = this.h.getLayoutParams();
                layoutParams1.rightMargin = 0;
                this.h.setLayoutParams(layoutParams1);
                layoutParams1 = this.i.getLayoutParams();
                layoutParams1.rightMargin = 0;
                this.i.setLayoutParams(layoutParams1);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "6")) {
             if (this.l == null) {
                this.l = new a(this, p0);
             }
             p0.addOnLayoutChangeListener(this.l);
          }
       }
       return;
    }
    public void d(LiveAnnounceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "9")) {
          return;
       }
       LiveSpannable liveSpannabl = new LiveSpannable();
       liveSpannabl.b(p0.mSubscribeInfo.mLiveSubscribeTitle);
       LiveAnnounceMessage mLiveAnnounc = p0.mLiveAnnounceAction;
       if (mLiveAnnounc != null && !TextUtils.x(mLiveAnnounc.mSubscribeBookedAction)) {
          liveSpannabl.c().h(this.e(p0.mLiveAnnounceAction.mSubscribeBookedAction));
       }
       this.i.setText(liveSpannabl.k());
       this.i.setAlpha(0x3f000000);
       return;
    }
    public final LiveSpannable$a e(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e$a uoa = e$a.class;
       HollowTextView obj = PatchProxy.applyOneRefs(p0, this, uoa, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.c(a.B, R.layout.arg_RES_7f0d09d9, null);
       obj.setText(p0);
       e d = this.n.d;
       BitmapDrawable uBitmapDrawa = PatchProxy.applyOneRefs(obj, this, uoa, "12");
       if (uBitmapDrawa != patchProxyRe) {
       }else {
          obj.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(a1.d(R.dimen.arg_RES_7f0702ab), 0x40000000));
          Bitmap uBitmap = Bitmap.createBitmap(obj.getMeasuredWidth(), obj.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
          obj.layout(0, 0, obj.getMeasuredWidth(), obj.getMeasuredHeight());
          obj.draw(new Canvas(uBitmap));
          uBitmapDrawa = new BitmapDrawable(a1.m(), uBitmap);
       }
       return d.b(uBitmapDrawa);
    }
}
