package bua.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;
import jp.a;
import bua.h$a;
import bua.h$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.framework.model.feed.BaseFeed;
import ub.b;
import dd.d;
import wb5.h;
import android.view.ViewGroup;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Collection;
import ekd.q;
import android.widget.RelativeLayout;
import java.util.List;
import android.content.Context;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import yb.a;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ekd.m1;
import com.kwai.library.widget.textview.AdjustSizeTextView;
import com.kuaishou.android.model.mix.CoverMeta;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mrd.a;
import k2b.q;

public class h extends PresenterV2	// class@00047a
{
    public a A;
    public PhotoItemViewParam B;
    public q C;
    public CommonMeta D;
    public int E;
    public final int F;
    public LiveCoverIconView p;
    public KwaiImageView q;
    public KwaiImageView r;
    public AdjustSizeTextView s;
    public AdjustSizeTextView t;
    public AdjustSizeTextView u;
    public RelativeLayout v;
    public BaseFeed w;
    public LiveStreamModel x;
    public CoverMeta y;
    public BaseFragment z;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;

    static {
       h.G = a1.e(18.00f);
       h.H = a1.e(0x3f800000);
       h.I = a1.e(14.00f);
       h.J = a1.e(10.00f);
    }
    public void h(){
       super();
       this.E = a1.d(0x7f070334);
       this.F = a1.d(0x7f070329);
    }
    public void E8(){
       PhotoItemViewParam mIsShowNewTa;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "10")) {
          this.q.setAspectRatio(0x3f400000);
          h.f(this.q, this.w, false, a.c, new h$a(this), new h$b(this));
       }
       if (this.x == null) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, oh, "6")){
          h tx = this.x;
          if (tx == null) {
             this.p.setVisibility(8);
          }else {
             LiveCoverWidgetModel liveCoverWid = tx.getLiveCoverWidgetModel(2);
             if (liveCoverWid == null) {
                this.p.setVisibility(8);
             }else {
                this.p.setVisibility(0);
                h tD = this.D;
                if (tD != null && tD.mIsCloseLive != null) {
                   this.p.X();
                }else {
                   this.p.N(liveCoverWid);
                }
                tx = this.B;
                tx = (tx == null)? null: tx.mIsShowNewTagIcon;
                if (tx != null) {
                   tx = this.p;
                   if (!PatchProxy.applyVoidOneRefs(tx, this, oh, "7")) {
                      ViewGroup$MarginLayoutParams layoutParams = tx.getLayoutParams();
                      h tE = this.E;
                      if (layoutParams.topMargin != tE || layoutParams.leftMargin != tE) {
                         layoutParams.topMargin = tE;
                         layoutParams.leftMargin = tE;
                         tx.setLayoutParams(layoutParams);
                      }
                   }
                }
             }
          }
       }
       LiveStreamModel mDisplayUser = this.x.mDisplayUsers;
       if (!PatchProxy.applyVoidOneRefs(mDisplayUser, this, oh, "8")) {
          if (q.f(mDisplayUser)) {
             this.v.setVisibility(8);
          }else {
             this.v.removeAllViews();
             this.v.setVisibility(0);
             for (int i1 = 0; i1 < mDisplayUser.size(); i1 = i1 + 1) {
                KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
                kwaiImageVie.U(mDisplayUser.get(i1).mHeadUrls);
                RoundingParams roundingPara = RoundingParams.a();
                roundingPara.j(a1.a(R.color.arg_RES_7f061e52), (float)h.H);
                kwaiImageVie.getHierarchy().L(roundingPara);
                ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(h.G, h.G);
                int i2 = h.I * i1;
                int i3 = h.J + i2;
                marginLayout.leftMargin = i3;
                kwaiImageVie.setLayoutParams(marginLayout);
                this.v.addView(kwaiImageVie);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
          oh = this.r;
          int i = (this.x.mDisplayStyle == 3)? 0: 8;
          oh.setVisibility(i);
          LiveStreamModel mDisplayStyl = this.x.mDisplayStyle;
          if (mDisplayStyl == 2) {
             this.P8();
          }else if(mDisplayStyl == 4){
             this.r.setVisibility(0);
             this.P8();
          }else {
             this.u.setVisibility(8);
             this.t.setVisibility(0);
             this.t.setText(this.x.mDisplayText);
          }
       }
       if (TextUtils.x(this.D.mPureTitle)) {
          if (!TextUtils.x(this.D.mCaption) && (TextUtils.n(this.D.mCaption, "бн") || TextUtils.n(this.D.mCaption, "..."))) {
             this.s.setVisibility(8);
          }else {
             this.R8(this.D.mCaption);
          }
       }else if(TextUtils.n(this.D.mPureTitle, "бн") || TextUtils.n(this.D.mPureTitle, "...")){
          this.s.setVisibility(8);
       }else {
          this.R8(this.D.mPureTitle);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.t.setVisibility(8);
       this.u.setVisibility(0);
       this.u.setText(this.x.mDisplayText);
       return;
    }
    public final void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "9")) {
          return;
       }
       p0 = ((c0.a.matcher(p0).replaceAll("")).replaceAll("\n", "")).replaceAll(" ", "");
       if (TextUtils.x(p0)) {
          this.s.setVisibility(8);
       }else {
          this.s.setVisibility(0);
          this.s.setText(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0248);
       this.q = m1.f(p0, 0x7f0a3105);
       this.t = m1.f(p0, 0x7f0a0a95);
       this.u = m1.f(p0, 0x7f0a0a9c);
       this.r = m1.f(p0, 0x7f0a0a9a);
       this.v = m1.f(p0, 0x7f0a0357);
       this.p = m1.f(p0, 0x7f0a215e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.w = this.r8("feed");
       this.y = this.q8(CoverMeta.class);
       this.z = this.r8("FRAGMENT");
       this.A = this.r8("feedCoversubject");
       this.C = this.t8("feedCoverLogger");
       this.D = this.q8(CommonMeta.class);
       this.x = this.s8(LiveStreamModel.class);
       this.B = this.t8("FEED_ITEM_VIEW_PARAM");
       return;
    }
}
