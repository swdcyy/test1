package eja.r1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eja.r1$a;
import nsd.u;
import lnc.a1;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.View;
import tkd.b;
import tkd.d;
import os5.l;
import im8.f;
import java.lang.Number;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import android.widget.TextView;

public final class r1 extends PresenterV2	// class@0026f1
{
    public LiveStreamFeed p;
    public f q;
    public LiveCoverIconView r;
    public TextView s;
    public LiveStreamModel t;
    public PhotoItemViewParam u;
    public CommonMeta v;
    public CardStyle w;
    public static final int x;
    public static final int y;
    public static final r1$a z;

    static {
       r1.z = new r1$a(null);
       r1.x = a1.d(0x7f07034b);
       r1.y = a1.d(0x7f07025d);
    }
    public void r1(CardStyle p0){
       a.p(p0, "mCardStyle");
       super();
       this.w = p0;
    }
    public void E8(){
       r1 or1 = r1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or1, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, or1, "4")) {
          or1 = this.t;
          int i = 8;
          String str = "mLiveMark";
          if (or1 == null) {
             or1 = this.r;
             if (or1 == null) {
                a.S(str);
             }
             or1.setVisibility(i);
          }else {
             LiveCoverWidgetModel liveCoverWid = or1.getLiveCoverWidgetModel(2);
             if (liveCoverWid == null) {
                or1 = this.r;
                if (or1 == null) {
                   a.S(str);
                }
                or1.setVisibility(i);
             }else {
                r1 tr = this.r;
                if (tr == null) {
                   a.S(str);
                }
                int i1 = 0;
                tr.setVisibility(i1);
                tr = this.v;
                if (tr != null && tr.mIsCloseLive == 1) {
                   or1 = this.r;
                   if (or1 == null) {
                      a.S(str);
                   }
                   or1.X();
                }else {
                   tr = this.r;
                   if (tr == null) {
                      a.S(str);
                   }
                   tr.N(liveCoverWid);
                }
                or1 = this.u;
                if (or1 != null && or1.mIsShowNewTagIcon == 1) {
                   i1 = 1;
                }
                if (i1) {
                   or1 = this.r;
                   if (or1 == null) {
                      a.S(str);
                   }
                   this.P8(or1, r1.y);
                }
                if (CardStyle.isV4Bottom(this.w.mBottomType)) {
                   or1 = this.r;
                   if (or1 == null) {
                      a.S(str);
                   }
                   this.P8(or1, r1.x);
                }
                l ol = d.a(-1492894991);
                tr = this.p;
                if (tr == null) {
                   a.S("mFeed");
                }
                r1 tq = this.q;
                if (tq == null) {
                   a.S("mPosition");
                }
                Object obj = tq.get();
                a.o(obj, "mPosition.get\(\)");
                ol.Zj(tr, obj.intValue());
             }
          }
       }
       return;
    }
    public final void P8(View p0,int p1){
       r1 or1 = r1.class;
       if (PatchProxy.isSupport(or1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, or1, "5")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       if (layoutParams.topMargin != p1 || layoutParams.leftMargin != p1) {
          layoutParams.topMargin = p1;
          layoutParams.leftMargin = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, r1.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.live_mark);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.live_mark\)");
       this.r = view;
       this.s = m1.f(p0, 0x7f0a3bd9);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r1.class, "1")) {
          return;
       }
       this.t = this.s8(LiveStreamModel.class);
       this.u = this.t8("FEED_ITEM_VIEW_PARAM");
       f obj = this.q8(LiveStreamFeed.class);
       a.o(obj, "inject\(LiveStreamFeed::class.java\)");
       this.p = obj;
       obj = this.x8("ADAPTER_POSITION");
       a.o(obj, "injectRef\(PageAccessIds.ADAPTER_POSITION\)");
       this.q = obj;
       this.v = this.s8(CommonMeta.class);
       return;
    }
}
