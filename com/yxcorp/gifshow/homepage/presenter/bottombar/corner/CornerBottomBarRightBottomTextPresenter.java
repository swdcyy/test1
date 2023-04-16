package com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$mNormalTextColor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ab5.v;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$a;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$getShowState$isEmptyDistance$2;
import java.lang.Boolean;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$a$c;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$a$b;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$a$a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import im8.f;
import android.content.Context;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.CharSequence;
import android.graphics.Typeface;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.PermissionUtils;
import tkd.b;
import tkd.d;
import vw5.d;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import ekd.m1;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.util.cdnresource.f;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import xl8.d;
import y8c.a;
import brd.t;
import lnc.b9;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$b;
import com.yxcorp.gifshow.homepage.presenter.bottombar.corner.CornerBottomBarRightBottomTextPresenter$c;
import erd.g;
import crd.b;
import com.kwai.component.feedstaggercard.helper.LiveAudienceUpdateHelper;
import kp.r1;

public class CornerBottomBarRightBottomTextPresenter extends PresenterV2	// class@0017ba
{
    public PhotoItemViewParam A;
    public f B;
    public d C;
    public LifecycleObserver D;
    public Integer E;
    public final p p;
    public View q;
    public TextView r;
    public ImageView s;
    public QPhoto t;
    public LiveStreamModel u;
    public f v;
    public AggregateTemplateMeta w;
    public CommonMeta x;
    public BaseFragment y;
    public PhotoMeta z;

    public void CornerBottomBarRightBottomTextPresenter(Integer p0){
       super();
       this.E = p0;
       this.p = s.c(new CornerBottomBarRightBottomTextPresenter$mNormalTextColor$2(this));
    }
    public void E8(){
       CornerBottomBarRightBottomTextPresenter tr;
       CornerBottomBarRightBottomTextPresenter$a$c obj;
       CornerBottomBarRightBottomTextPresenter tx;
       CommonMeta mCreated;
       CornerBottomBarRightBottomTextPresenter$a$b a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CornerBottomBarRightBottomTextPresenter uCornerBotto = CornerBottomBarRightBottomTextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCornerBotto, "14")) {
          return;
       }
       int i = 2;
       int i1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, uCornerBotto, "29")) {
          tr = this.E;
          if (tr == null || !tr.intValue()) {
             tr = this.y;
             if (tr instanceof v && tr instanceof RecyclerFragment) {
                Objects.requireNonNull(tr, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<*>");
                int page = tr.getPage();
                if (page != i1) {
                   if (page != i) {
                      if (page != 3) {
                         if (page != 15) {
                            this.E = Integer.valueOf(i);
                         }else {
                            this.E = Integer.valueOf(i1);
                         }
                      }
                   }else {
                      this.E = Integer.valueOf(3);
                   }
                }
                this.E = Integer.valueOf(i);
             }
          }
       }
       tr = this.r;
       if (tr == null) {
          a.S("mRightBottomText");
       }
       tr.setVisibility(8);
       tr = this.s;
       if (tr == null) {
          a.S("mRightBottomTextIcon");
       }
       tr.setVisibility(8);
       tr = this.E;
       if (tr != null && tr.intValue() == i1) {
          if (!PatchProxy.applyVoid(objArray, this, uCornerBotto, "27") && this.a9()) {
             tr = this.q;
             if (tr != null) {
                tr.setVisibility(8);
             }
          }
          obj = PatchProxy.apply(objArray, this, uCornerBotto, "18");
          if (obj != patchProxyRe) {
          }else if(this.a9() && !this.b9()){
             i1 = 0;
          }
          p op = s.c(new CornerBottomBarRightBottomTextPresenter$getShowState$isEmptyDistance$2(this));
          if (i1 || op.getValue().booleanValue()) {
             if (this.u != null) {
                a = CornerBottomBarRightBottomTextPresenter$a$b.a;
             }else if(this.d9()){
                a = CornerBottomBarRightBottomTextPresenter$a$a.a;
             }else {
                a = CornerBottomBarRightBottomTextPresenter$a$c.a;
             }
          }else if(this.c9()){
             a = CornerBottomBarRightBottomTextPresenter$a$c.a;
          }else if(this.u != null){
             a = CornerBottomBarRightBottomTextPresenter$a$b.a;
          }else if(this.d9()){
             a = CornerBottomBarRightBottomTextPresenter$a$a.a;
          }else {
             a = CornerBottomBarRightBottomTextPresenter$a$c.a;
          }
          obj = a;
          if (a.g(obj, CornerBottomBarRightBottomTextPresenter$a$b.a)) {
             this.k9();
          }else if(a.g(obj, CornerBottomBarRightBottomTextPresenter$a$a.a)){
             this.j9(this.z);
          }else if(a.g(obj, CornerBottomBarRightBottomTextPresenter$a$c.a)){
             tx = this.x;
             if (tx == null) {
                a.S("mCommonMeta");
             }
             mCreated = tx.mCoverCommonTags;
             if (mCreated != null) {
                objArray = mCreated.mAuthorRelationTagV2;
             }
             this.l9(objArray);
          }
       }else if(tr != null && tr.intValue() == i){
          this.j9(this.z);
       }else if(tr != null && tr.intValue() == 3){
          obj = PatchProxy.apply(objArray, this, uCornerBotto, "20");
          if (obj != patchProxyRe) {
             obj.booleanValue();
          }else {
             tx = this.x;
             if (tx == null) {
                a.S("mCommonMeta");
             }
             mCreated = tx.mCreated;
             if (mCreated - null > 0) {
                tr = this.v;
                if (tr != null) {
                   objArray = tr.get();
                }
                if (!a.g(objArray, Boolean.TRUE)) {
                   CornerBottomBarRightBottomTextPresenter ts = this.s;
                   if (ts == null) {
                      a.S("mRightBottomTextIcon");
                   }
                   ts.setVisibility(8);
                   ts = this.r;
                   if (ts == null) {
                      a.S("mRightBottomText");
                   }
                   ts.setVisibility(0);
                   ts = this.r;
                   if (ts == null) {
                      a.S("mRightBottomText");
                   }
                   ts.setText(DateUtils.w(this.getContext(), mCreated));
                }
             }
             tx = this.s;
             if (tx == null) {
                a.S("mRightBottomTextIcon");
             }
             tx.setVisibility(8);
             tx = this.r;
             if (tx == null) {
                a.S("mRightBottomText");
             }
             tx.setVisibility(8);
          }
       }
    label_01b9 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, CornerBottomBarRightBottomTextPresenter.class, "15")) {
          return;
       }
       this.e9();
       return;
    }
    public boolean P8(PhotoMeta p0){
       CornerBottomBarRightBottomTextPresenter ts;
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.applyOneRefs(p0, this, CornerBottomBarRightBottomTextPresenter.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       String str = "mRightBottomTextIcon";
       boolean b = false;
       if (obj != null) {
          a.m(obj);
          Object obj1 = obj.get();
          a.o(obj1, "mAdMarkShowSubjectViewRef!!.get\(\)");
          if (obj1.booleanValue()) {
             ts = this.s;
             if (ts == null) {
                a.S(str);
             }
             ts.setVisibility(8);
             ts = this.r;
             if (ts == null) {
                a.S("mRightBottomText");
             }
             ts.setVisibility(8);
             return b;
          }
       }
       obj = this.s;
       if (obj == null) {
          a.S(str);
       }
       obj.setVisibility(b);
       obj = this.r;
       if (obj == null) {
          a.S("mRightBottomText");
       }
       obj.setVisibility(b);
       obj = this.r;
       if (obj == null) {
          a.S("mRightBottomText");
       }
       obj.setTextColor(this.W8());
       obj = this.r;
       if (obj == null) {
          a.S("mRightBottomText");
       }
       obj.setTypeface(Typeface.create("sans-serif-medium", b));
       if (p0 != null) {
          b = p0.getLikeCount();
       }
       if (b <= 0) {
          ts = this.r;
          if (ts == null) {
             a.S("mRightBottomText");
          }
          ts.setText("");
       }else {
          ts = this.r;
          if (ts == null) {
             a.S("mRightBottomText");
          }
          ts.setText(TextUtils.N((long)b));
       }
       this.h9();
       return true;
    }
    public int R8(){
       return 0x7f080a43;
    }
    public int S8(){
       return 0x7f080a39;
    }
    public final CommonMeta V8(){
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.x;
       if (obj == null) {
          a.S("mCommonMeta");
       }
       return obj;
    }
    public int W8(){
       Object obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = this.p.getValue();
       }
       return obj.intValue();
    }
    public final QPhoto X8(){
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final TextView Y8(){
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mRightBottomText");
       }
       return obj;
    }
    public final ImageView Z8(){
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mRightBottomTextIcon");
       }
       return obj;
    }
    public final boolean a9(){
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.y;
       boolean b = false;
       if (obj instanceof RecyclerFragment) {
          Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<*>");
          if (obj.getPage() == 15) {
             b = true;
          }
       }
       return b;
    }
    public final boolean b9(){
       Object obj = PatchProxy.apply(null, this, CornerBottomBarRightBottomTextPresenter.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PermissionUtils.a(this.getContext(), "android.permission.ACCESS_COARSE_LOCATION") || PermissionUtils.a(this.getContext(), "android.permission.ACCESS_FINE_LOCATION"))? true: false;
       return b;
    }
    public boolean c9(){
       boolean b;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, CornerBottomBarRightBottomTextPresenter.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.C != null) {
          obj = d.a(0x574d23bb);
          CornerBottomBarRightBottomTextPresenter tC = this.C;
          if (tC != null) {
             objArray = tC.getType();
          }
          b = obj.W5(objArray);
       }else {
          b = false;
       }
       return b;
    }
    public boolean d9(){
       return true;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CornerBottomBarRightBottomTextPresenter.class, "13")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a02d6);
       View view = m1.f(p0, R.id.right_bottom_text);
       a.o(view, "ViewBindUtils.bindWidget¡­, R.id.right_bottom_text\)");
       this.r = view;
       p0 = m1.f(p0, R.id.right_bottom_text_icon);
       a.o(p0, "ViewBindUtils.bindWidget¡­d.right_bottom_text_icon\)");
       this.s = p0;
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, CornerBottomBarRightBottomTextPresenter.class, "16")) {
          return;
       }
       CornerBottomBarRightBottomTextPresenter tD = this.D;
       if (tD != null) {
          CornerBottomBarRightBottomTextPresenter ty = this.y;
          if (ty != null) {
             Lifecycle lifecycle = ty.getLifecycle();
             if (lifecycle != null) {
                lifecycle.removeObserver(tD);
             }
          }
       }
       this.D = null;
       return;
    }
    public void h9(){
       Drawable uDrawable;
       if (PatchProxy.applyVoid(null, this, CornerBottomBarRightBottomTextPresenter.class, "22")) {
          return;
       }
       CornerBottomBarRightBottomTextPresenter tz = this.z;
       String str = "mPhoto";
       if (tz != null && tz.isLiked() == true) {
          tz = this.t;
          if (tz == null) {
             a.S(str);
          }
          uDrawable = f.a(tz.getLikeActivityResourceId(), CdnResource$ResourceKey.home_card_like_image, a1.f(R.drawable.arg_RES_7f080a37));
       }else {
          tz = this.t;
          if (tz == null) {
             a.S(str);
          }
          uDrawable = f.a(tz.getLikeActivityResourceId(), CdnResource$ResourceKey.home_card_unlike_image, a1.f(R.drawable.arg_RES_7f080a35));
       }
       CornerBottomBarRightBottomTextPresenter ts = this.s;
       if (ts == null) {
          a.S("mRightBottomTextIcon");
       }
       ts.setImageDrawable(uDrawable);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, CornerBottomBarRightBottomTextPresenter.class, "1")) {
          return;
       }
       this.u = this.s8(LiveStreamModel.class);
       this.v = this.w8("AD_MARK_SHOW_SUBJECT_VIEW");
       this.w = this.s8(AggregateTemplateMeta.class);
       Object obj = this.q8(CommonMeta.class);
       a.o(obj, "inject\(CommonMeta::class.java\)");
       this.x = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       this.y = this.t8("FRAGMENT");
       this.z = this.s8(PhotoMeta.class);
       obj = this.r8("FEED_ITEM_VIEW_PARAM");
       a.o(obj, "inject\(AccessIds.FEED_ITEM_VIEW_PARAM\)");
       this.A = obj;
       this.B = this.w8("FEED_SHOW_DEFAULT_DISTANCE");
       this.C = this.t8("local_current_city");
       return;
    }
    public final boolean j9(PhotoMeta p0){
       boolean b;
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.applyOneRefs(p0, this, CornerBottomBarRightBottomTextPresenter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.P8(p0)) {
          if (p0 != null) {
             obj = this.y;
             if (obj != null) {
                this.X7(b9.d(p0, obj).subscribe(new CornerBottomBarRightBottomTextPresenter$b(this, p0), CornerBottomBarRightBottomTextPresenter$c.b));
             }
          }
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final boolean k9(){
       CornerBottomBarRightBottomTextPresenter uCornerBotto = CornerBottomBarRightBottomTextPresenter.class;
       Object[] objArray = null;
       CornerBottomBarRightBottomTextPresenter obj = PatchProxy.apply(objArray, this, uCornerBotto, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       int i = 0;
       if (obj != null) {
          CornerBottomBarRightBottomTextPresenter tr = this.r;
          if (tr == null) {
             a.S("mRightBottomText");
          }
          tr.setVisibility(i);
          tr = this.s;
          if (tr == null) {
             a.S("mRightBottomTextIcon");
          }
          tr.setVisibility(i);
          CornerBottomBarRightBottomTextPresenter tr1 = this.r;
          if (tr1 == null) {
             a.S("mRightBottomText");
          }
          LiveStreamModel mAudienceCou = obj.mAudienceCount;
          if (mAudienceCou == null) {
             mAudienceCou = "";
          }
          tr1.setText(mAudienceCou);
          this.e9();
          if (!PatchProxy.applyVoid(objArray, this, uCornerBotto, "17")) {
             uCornerBotto = this.r;
             if (uCornerBotto == null) {
                a.S("mRightBottomText");
             }
             CornerBottomBarRightBottomTextPresenter tt = this.t;
             if (tt == null) {
                a.S("mPhoto");
             }
             LifecycleObserver lifecycleObs = LiveAudienceUpdateHelper.a(uCornerBotto, tt);
             this.D = lifecycleObs;
             if (lifecycleObs != null) {
                tt = this.y;
                if (tt != null) {
                   Lifecycle lifecycle = tt.getLifecycle();
                   if (lifecycle != null) {
                      lifecycle.addObserver(lifecycleObs);
                   }
                }
             }
          }
       label_0073 :
          uCornerBotto = this.s;
          if (uCornerBotto == null) {
             a.S("mRightBottomTextIcon");
          }
          uCornerBotto.setImageResource(this.R8());
          i = true;
       }
       return i;
    }
    public boolean l9(CoverCommonTagLabelModel p0){
       AggregateTemplateMeta mShowLocatio;
       p0 = PatchProxy.applyOneRefs(p0, this, CornerBottomBarRightBottomTextPresenter.class, "21");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       CornerBottomBarRightBottomTextPresenter tw = this.w;
       int i = 8;
       String str = "mRightBottomTextIcon";
       if (tw != null && tw.mContentType == 6) {
          tw = this.s;
          if (tw == null) {
             a.S(str);
          }
          tw.setVisibility(i);
       }else {
          tw = this.s;
          if (tw == null) {
             a.S(str);
          }
          tw.setVisibility(0);
          tw = this.s;
          if (tw == null) {
             a.S(str);
          }
          tw.setImageResource(this.S8());
       }
       tw = this.w;
       if (tw != null) {
          if (tw != null) {
             mShowLocatio = tw.mShowLocation;
          }else {
             mShowLocatio = null;
          }
       }else {
          tw = this.x;
          if (tw == null) {
             a.S("mCommonMeta");
          }
          mShowLocatio = r1.G1(tw);
       }
       if (!TextUtils.x(mShowLocatio)) {
          CornerBottomBarRightBottomTextPresenter tr = this.r;
          if (tr == null) {
             a.S("mRightBottomText");
          }
          tr.setTextColor(this.W8());
          tr = this.r;
          if (tr == null) {
             a.S("mRightBottomText");
          }
          tr.setVisibility(0);
          tr = this.r;
          if (tr == null) {
             a.S("mRightBottomText");
          }
          tr.setText(mShowLocatio);
          return true;
       }else {
          tw = this.s;
          if (tw == null) {
             a.S(str);
          }
          tw.setVisibility(i);
          tw = this.r;
          if (tw == null) {
             a.S("mRightBottomText");
          }
          tw.setVisibility(i);
          return 0;
       }
    }
}
