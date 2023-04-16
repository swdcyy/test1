package aua.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aua.j$a;
import nsd.u;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import android.view.ViewStub;
import android.view.View;
import ga5.d;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ga5.b;
import dsa.e;
import q87.c;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.component.feedstaggercard.helper.CoverCommonTagLabelModelUtilKt;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import aua.j$b;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import com.kwai.component.feedstaggercard.helper.GeneralCoverLabelDrawer;
import android.app.Activity;
import com.kwai.component.feedstaggercard.helper.GeneralCoverLabelDrawer$Companion;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.mix.PhotoMeta;

public class j extends PresenterV2	// class@000313
{
    public ViewStub A;
    public final CardStyle B;
    public final float p;
    public final float q;
    public final float r;
    public LiveStreamModel s;
    public CommonMeta t;
    public PhotoMeta u;
    public PhotoItemViewParam v;
    public BaseFeed w;
    public boolean x;
    public ViewStub y;
    public KwaiImageView z;
    public static final j$a C;

    static {
       j.C = new j$a(null);
    }
    public void j(CardStyle p0){
       a.p(p0, "style");
       super();
       this.B = p0;
       this.p = 14.00f;
       this.q = 10.00f;
       this.r = 11.00f;
    }
    public void E8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "9")) {
          return;
       }
       this.W8();
       j tt = this.t;
       if (tt != null) {
          CommonMeta mCoverCommon = tt.mCoverCommonTags;
          if (mCoverCommon != null) {
             CoverCommonTagsModel mAuthorRight = mCoverCommon.mAuthorRightSideTag;
          label_001b :
             this.S8(mAuthorRight);
             tt = this.t;
             if (tt != null) {
                mCoverCommon = tt.mCoverCommonTags;
                if (mCoverCommon != null) {
                   mAuthorRight = mCoverCommon.mAuthorRelationTag;
                label_002a :
                   this.R8(mAuthorRight);
                   tt = this.t;
                   if (tt != null) {
                      mCoverCommon = tt.mCoverCommonTags;
                      if (mCoverCommon != null) {
                         objArray = mCoverCommon.mRightBottomTag;
                      }
                   }
                   this.V8(objArray);
                   return;
                }
             }
             objArray1 = objArray;
             goto label_002a ;
          }
       }
       objArray1 = objArray;
       goto label_001b ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       j ty = this.y;
       if (ty == null) {
          a.S("mAvatarRightSideFeedGeneralCoverLabelViewStub");
       }
       View view = d.a(ty);
       if (view != null) {
          view.setVisibility(8);
       }
       ty = this.z;
       if (ty == null) {
          a.S("mAvatarRightBottomFeedGeneralCoverLabelView");
       }
       if (ty != null) {
          ty.setVisibility(8);
       }
       return;
    }
    public boolean P8(CoverCommonTagLabelModel p0){
       return false;
    }
    public final boolean R8(CoverCommonTagLabelModel p0){
       j obj = PatchProxy.applyOneRefs(p0, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z;
       String str = "mAvatarRightBottomFeedGeneralCoverLabelView";
       if (obj == null) {
          a.S(str);
       }
       if (obj != null) {
          obj.setVisibility(8);
       }
       boolean b = false;
       if (p0 != null) {
          p0.mIsLabelShowing = b;
       }
       String str1 = "NormalBottomBarGeneralLabel";
       boolean b1 = true;
       if (p0 && (p0.disableTag != null || this.x != null)) {
          e uoe = e.C();
          StringBuilder str2 = "showAvatarRightBottomFeedGeneralCoverLabelViewIfNeeded: coverCommonTagLabelModel == null? : ";
          if (p0) {
             b1 = false;
          }
          Object[] objArray = new Object[b];
          uoe.w(str1, str2+b1, objArray);
          return b;
       }else if(b.b(p0)){
          Object[] objArray1 = new Object[b];
          e.C().w(str1, "showAvatarRightBottomFeedGeneralCoverLabelViewIfNeeded: isCoverCommonTagLabelModelIllegal == true", objArray1);
          return b;
       }else {
          j tv = this.v;
          if (tv != null && tv.mPage == 16) {
             tv = this.z;
             if (tv == null) {
                a.S(str);
             }
             ViewGroup$LayoutParams layoutParams = tv.getLayoutParams();
             if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
                layoutParams = null;
             }
             if (layoutParams != null) {
                layoutParams.bottomMargin = a1.d(0x7f070253);
             }
          }
       label_0070 :
          tv = this.z;
          if (tv == null) {
             a.S(str);
          }
          if (tv != null) {
             tv.setVisibility(b);
          }
          p0.mIsLabelShowing = b1;
          CDNUrl[] uCDNUrlArray = CoverCommonTagLabelModelUtilKt.a(p0);
          if (uCDNUrlArray == null) {
             uCDNUrlArray = p0.bgImage;
          }
          a$a uoa = a.d();
          uoa.b(":ks-components:feed-stagger-card");
          uoa.d(ImageSource.FEED_AVATAR);
          a uoa1 = uoa.a();
          tv = this.z;
          if (tv == null) {
             a.S(str);
          }
          if (tv != null) {
             tv.Y(uCDNUrlArray, uoa1, new j$b(this));
          }
          return b1;
       }
    }
    public final boolean S8(CoverCommonTagLabelModel p0){
       boolean b;
       Object obj = this;
       Object[] obj1 = p0;
       j obj2 = PatchProxy.applyOneRefs(obj1, obj, j.class, "13");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       obj2 = obj.y;
       String str = "mAvatarRightSideFeedGeneralCoverLabelViewStub";
       if (obj2 == null) {
          a.S(str);
       }
       View view = d.a(obj2);
       if (view != null) {
          view.setVisibility(8);
       }
       String str1 = "NormalBottomBarGeneralLabel";
       int i = 0;
       if (obj1 != null && (obj1.disableTag != null || obj.x != null)) {
          e uoe = e.C();
          StringBuilder str2 = "showAvatarRightSideFeedGeneralCoverLabelViewIfNeeded: coverCommonTagLabelModel == null? : ";
          b = (obj1 == null)? true: false;
          Object[] objArray = new Object[i];
          uoe.w(str1, str2+b, objArray);
          return i;
       }else if(b.b(p0)){
          obj1 = new Object[i];
          e.C().w(str1, "showAvatarRightSideFeedGeneralCoverLabelViewIfNeeded: isCoverCommonTagLabelModelIllegal == true", obj1);
          return i;
       }else {
          GeneralCoverLabelDrawer$Companion i1 = GeneralCoverLabelDrawer.i;
          Activity activity = this.getActivity();
          j y = obj.y;
          if (y == null) {
             a.S(str);
          }
          GeneralCoverLabelDrawer$Companion.e(i1, activity, d.b(y), p0, obj.q, 0, "footer_tag", false, 2.00f, obj.B, false, 0, 0, 0, obj.p, 0, 0, 0, 0, 0, 0, 0, false, 0x3fde40, null);
          return true;
       }
    }
    public final boolean V8(CoverCommonTagLabelModel p0){
       boolean b;
       j a;
       Object obj = this;
       Object[] obj1 = p0;
       j obj2 = PatchProxy.applyOneRefs(obj1, obj, j.class, "14");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       obj2 = obj.A;
       String str = "mRightBottomLabelViewStub";
       if (obj2 == null) {
          a.S(str);
       }
       View view = d.a(obj2);
       if (view != null) {
          view.setVisibility(8);
       }
       String str1 = "NormalBottomBarGeneralLabel";
       int i = 0;
       if (obj1 == null || obj1.disableTag != null) {
          e uoe = e.C();
          StringBuilder str2 = "showRightBottomLabelIfNeeded: coverCommonTagLabelModel == null? : ";
          b = (obj1 == null)? true: false;
          Object[] objArray = new Object[i];
          uoe.w(str1, str2+b, objArray);
          return i;
       }else if(b.b(p0)){
          obj1 = new Object[i];
          e.C().w(str1, "showRightBottomLabelIfNeeded: isCoverCommonTagLabelModelIllegal == true", obj1);
          return i;
       }else if(this.P8(p0)){
          return i;
       }else {
          GeneralCoverLabelDrawer$Companion i1 = GeneralCoverLabelDrawer.i;
          Activity activity = this.getActivity();
          a = obj.A;
          if (a == null) {
             a.S(str);
          }
          GeneralCoverLabelDrawer$Companion.e(i1, activity, d.b(a), p0, obj.r, R.drawable.arg_RES_7f080cdb, "photo_tag", false, 2.00f, obj.B, false, 2.00f, 2.00f, 4.00f, obj.p, 0, 0, 0, 0, 0, 0, 0, false, 0x3fc240, null);
          return true;
       }
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, j.class, "10")) {
          return;
       }
       this.x = w.k0(this.w);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "8")) {
          return;
       }
       View view = m1.f(p0, R.id.avatar_right_side_feed_general_cover_label_view_stub);
       a.o(view, "ViewBindUtils.bindWidget¡­al_cover_label_view_stub\)");
       this.y = view;
       view = m1.f(p0, R.id.avatar_right_bottom_feed_general_cover_label_view);
       a.o(view, "ViewBindUtils.bindWidget¡­general_cover_label_view\)");
       this.z = view;
       p0 = m1.f(p0, R.id.right_bottom_feed_general_cover_label_view_stub);
       a.o(p0, "ViewBindUtils.bindWidget¡­al_cover_label_view_stub\)");
       this.A = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.s = this.s8(LiveStreamModel.class);
       this.t = this.s8(CommonMeta.class);
       this.w = this.t8("feed");
       this.v = this.t8("FEED_ITEM_VIEW_PARAM");
       this.u = this.s8(PhotoMeta.class);
       return;
    }
}
