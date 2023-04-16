package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$mIsDarkMode$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$mTemplateCardCallback$2;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Number;
import tkd.b;
import tkd.d;
import ju5.g;
import a3c.e;
import lnc.a1;
import android.view.View;
import z5c.g3;
import android.widget.TextView;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import dx5.h$a;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import ii5.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$d;
import android.view.View$OnClickListener;
import java.util.Collection;
import ekd.q;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import a3c.d;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import android.content.Context;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot;
import ekd.m1;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$b;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardItemPresenter$c;
import android.view.View$OnLongClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ProfileTemplateCardItemPresenter extends PresenterV2	// class@001549
{
    public int A;
    public long B;
    public int C;
    public boolean D;
    public final p E;
    public c F;
    public c G;
    public final p H;
    public BaseFragment p;
    public ProfileTemplateCardAdapter q;
    public ProfileTemplateCard r;
    public f s;
    public View t;
    public KwaiImageView u;
    public TextView v;
    public View w;
    public TextView x;
    public TextView y;
    public String z;
    public static final ProfileTemplateCardItemPresenter$a I;

    static {
       ProfileTemplateCardItemPresenter.I = new ProfileTemplateCardItemPresenter$a(null);
    }
    public void ProfileTemplateCardItemPresenter(){
       super();
       this.A = 5;
       this.C = -1;
       this.E = s.c(ProfileTemplateCardItemPresenter$mIsDarkMode$2.INSTANCE);
       this.H = s.c(new ProfileTemplateCardItemPresenter$mTemplateCardCallback$2(this));
    }
    public static final ProfileTemplateCard P8(ProfileTemplateCardItemPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mCard");
       }
       return p0;
    }
    public static final ProfileTemplateCardAdapter R8(ProfileTemplateCardItemPresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mProfileTemplateCardAdapter");
       }
       return p0;
    }
    public static final String S8(ProfileTemplateCardItemPresenter p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("mUserId");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardItemPresenter.class, "5")) {
          return;
       }
       ProfileTemplateCardItemPresenter tr = this.r;
       String str = "mCard";
       if (tr == null) {
          a.S(str);
       }
       ProfileTemplateCardItemPresenter ts = this.s;
       if (ts == null) {
          a.S("mPosition");
       }
       tr.mIndex = ts.get().intValue() + 1;
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       this.Z8(tr);
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       this.Y8(tr);
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       int i = 14;
       if (tr.mCardType == i) {
          b uob = d.a(0x6ea0c3d0);
          a.o(uob, "PluginManager.get\(MiniPlugin::class.java\)");
          ProfileTemplateCardItemPresenter tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          if (uob.rM(tr1.mLinkUrl)) {
             tr1 = this.r;
             if (tr1 == null) {
                a.S(str);
             }
             uob.t9(tr1.mLinkUrl, "ProfileTemplateCardItemNewPresenter");
          }
       }
       if (!e.a(this.A)) {
          tr = this.t;
          if (tr == null) {
             a.S("mCardView");
          }
          g3.d(tr, a1.d(R.dimen.arg_RES_7f070319));
          tr = this.v;
          if (tr == null) {
             a.S("mMainTitleTv");
          }
          g3.e(tr, i);
          tr = this.y;
          if (tr == null) {
             a.S("mActionBtnTv");
          }
          g3.e(tr, i);
          tr = this.x;
          if (tr == null) {
             a.S("mSubTitleTv");
          }
          g3.e(tr, 12);
          tr = this.u;
          if (tr == null) {
             a.S("mIconIv");
          }
          g3.c(tr, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f070295));
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardItemPresenter.class, "10")) {
          return;
       }
       ProfileTemplateCardItemPresenter tF = this.F;
       if (tF != null && tF.K() == true) {
          tF = this.F;
          if (tF != null) {
             tF.o();
          }
       }
       return;
    }
    public final boolean W8(){
       Object obj = PatchProxy.apply(null, this, ProfileTemplateCardItemPresenter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.E.getValue();
       }
       return obj.booleanValue();
    }
    public final h$a X8(){
       Object obj = PatchProxy.apply(null, this, ProfileTemplateCardItemPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.H.getValue();
    }
    public final void Y8(ProfileTemplateCard p0){
       ProfileTemplateCard$ButtonStatusInfo mDarkFontCol;
       ProfileTemplateCardItemPresenter profileTempl = ProfileTemplateCardItemPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, profileTempl, "8")) {
          return;
       }
       ProfileTemplateCard mButtonInfo = p0.mButtonInfo;
       ProfileTemplateCard$ButtonInfo mCurrentStat = (mButtonInfo != null)? mButtonInfo.mCurrentStatus: -1;
       this.C = mCurrentStat;
       String str = "mActionBtnTv";
       if (p0.mCardViewStyle != 1) {
          ProfileTemplateCardItemPresenter ty = this.y;
          if (ty == null) {
             a.S(str);
          }
          ty.setVisibility(8);
       }else {
          ProfileTemplateCardItemPresenter ty1 = this.y;
          if (ty1 == null) {
             a.S(str);
          }
          ProfileTemplateCard$ButtonStatusInfo obj = PatchProxy.applyOneRefs(p0, this, profileTempl, "9");
          if (obj != PatchProxyResult.class) {
          }else {
             ProfileTemplateCard mButtonInfo1 = p0.mButtonInfo;
             mDarkFontCol = null;
             if (mButtonInfo1 != null) {
                ProfileTemplateCard$ButtonInfo mButtonStatu = mButtonInfo1.mButtonStatusInfos;
                if (mButtonStatu != null) {
                   Iterator iterator = mButtonStatu.iterator();
                   while (iterator.hasNext()) {
                      Object obj1 = iterator.next();
                      Object obj2 = (obj1.mStatus == this.C)? 1: null;
                      if (obj2) {
                         mDarkFontCol = obj1;
                         break ;
                      }
                   }
                }
             }
             obj = mDarkFontCol;
          }
          if (obj != null) {
             ty1.setText(obj.mText);
             ty1.setVisibility(0);
             if (!e.a(this.A)) {
                if (this.W8()) {
                   mDarkFontCol = obj.mDarkFontColor;
                   if (mDarkFontCol != null) {
                      a.o(mDarkFontCol, "btnStatusInfo.mDarkFontColor");
                      ty1.setTextColor(a.h(mDarkFontCol, a1.a(R.color.arg_RES_7f061de2)));
                   }
                }
                obj = obj.mFontColor;
                if (obj != null) {
                   a.o(obj, "btnStatusInfo.mFontColor");
                   ty1.setTextColor(a.h(obj, a1.a(R.color.arg_RES_7f061de2)));
                }else {
                   ty1.setTextColor(a1.a(R.color.arg_RES_7f061de2));
                }
             }
             ty1.setOnClickListener(new ProfileTemplateCardItemPresenter$d(this, p0));
          }
       }
       return;
    }
    public final void Z8(ProfileTemplateCard p0){
       ProfileTemplateCardItemPresenter tu;
       ProfileTemplateCard mDarkIconUrl;
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCardItemPresenter.class, "7")) {
          return;
       }
       int i = 0;
       String str = "mIconIv";
       if (this.W8()) {
          if (!q.f(p0.mDarkIconUrls)) {
             tu = this.u;
             if (tu == null) {
                a.S(str);
             }
             mDarkIconUrl = p0.mDarkIconUrls;
             a.o(mDarkIconUrl, "card.mDarkIconUrls");
             d.a(tu, mDarkIconUrl, ImageSource.ICON);
          }else if(!TextUtils.x(p0.mDarkIconUrl)){
             tu = this.u;
             if (tu == null) {
                a.S(str);
             }
             mDarkIconUrl = p0.mDarkIconUrl;
             a.o(mDarkIconUrl, "card.mDarkIconUrl");
             d.b(tu, mDarkIconUrl, ImageSource.ICON);
          }else {
          label_0086 :
             int i1 = 0;
          label_0087 :
             ProfileTemplateCardItemPresenter tu1 = this.u;
             if (tu1 == null) {
                a.S(str);
             }
             i1 = (tu)? 0: 8;
             tu1.setVisibility(i1);
             tu = this.v;
             if (tu == null) {
                a.S("mMainTitleTv");
             }
             mDarkIconUrl = p0.mMainTitle;
             Context uContext = (mDarkIconUrl == null || !mDarkIconUrl.length())? 1: null;
             if (uContext) {
                uContext = this.getContext();
                str1 = (uContext != null)? uContext.getString(R.string.arg_RES_7f10089f): null;
             }else {
                str1 = p0.mMainTitle;
             }
             tu.setText(str1);
             tu = this.x;
             if (tu == null) {
                a.S("mSubTitleTv");
             }
             tu.setText(p0.mSubTitle);
             tu = this.w;
             if (tu == null) {
                a.S("mRedDotView");
             }
             p0 = p0.mProfileCardRedDot;
             if (p0 == null || p0.mShow != 1) {
                i = 8;
             }
             tu.setVisibility(i);
             return;
          }
       }else if(!q.f(p0.mIconUrls)){
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          mDarkIconUrl = p0.mIconUrls;
          a.o(mDarkIconUrl, "card.mIconUrls");
          d.a(tu, mDarkIconUrl, ImageSource.ICON);
       }else if(!TextUtils.x(p0.mIconUrl)){
          tu = this.u;
          if (tu == null) {
             a.S(str);
          }
          mDarkIconUrl = p0.mIconUrl;
          a.o(mDarkIconUrl, "card.mIconUrl");
          d.b(tu, mDarkIconUrl, ImageSource.ICON);
       }else {
          goto label_0086 ;
       }
       tu = 1;
       goto label_0087 ;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCardItemPresenter.class, "4")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.template_card_id);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.template_card_id\)");
       this.t = view;
       view = m1.f(p0, R.id.icon);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.icon\)");
       this.u = view;
       view = m1.f(p0, R.id.main_title);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.main_title\)");
       this.v = view;
       view = m1.f(this.m8(), R.id.red_dot);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.red_dot\)");
       this.w = view;
       view = m1.f(p0, R.id.sub_title);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.sub_title\)");
       this.x = view;
       p0 = m1.f(p0, R.id.action_btn);
       a.o(p0, "ViewBindUtils.bindWidget\(view, R.id.action_btn\)");
       this.y = p0;
       ProfileTemplateCardItemPresenter tt = this.t;
       String str = "mCardView";
       if (tt == null) {
          a.S(str);
       }
       tt.setOnClickListener(new ProfileTemplateCardItemPresenter$b(this));
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       tt.setOnLongClickListener(new ProfileTemplateCardItemPresenter$c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardItemPresenter.class, "3")) {
          return;
       }
       f obj = this.q8(ProfileTemplateCardAdapter.class);
       a.o(obj, "inject\(ProfileTemplateCardAdapter::class.java\)");
       this.q = obj;
       obj = this.q8(ProfileTemplateCard.class);
       a.o(obj, "inject\(ProfileTemplateCard::class.java\)");
       this.r = obj;
       obj = this.r8("PROFILE_TEMPLATE_CARD_USER_ID");
       a.o(obj, "inject\(AccessIds.PROFILE_TEMPLATE_CARD_USER_ID\)");
       this.z = obj;
       obj = this.r8("PROFILE_TEMPLATE_CARD_SESSION_ID");
       a.o(obj, "inject\(AccessIds.PROFILE_TEMPLATE_CARD_SESSION_ID\)");
       this.B = obj.longValue();
       obj = this.r8("PROFILE_TEMPLATE_CARD_FRAGMENT");
       a.o(obj, "inject\(AccessIds.PROFILE_TEMPLATE_CARD_FRAGMENT\)");
       this.p = obj;
       obj = this.x8("ADAPTER_POSITION");
       a.o(obj, "injectRef\(com.yxcorp.gif¡­cessIds.ADAPTER_POSITION\)");
       this.s = obj;
       Object obj1 = this.r8("PROFILE_STYLE");
       a.o(obj1, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.A = obj1.intValue();
       obj1 = this.r8("PROFILE_TEMPLATE_CARD_ENABLE_FUN_MAMAGER");
       a.o(obj1, "inject\(AccessIds.PROFILE¡­_CARD_ENABLE_FUN_MAMAGER\)");
       this.D = obj1.booleanValue();
       return;
    }
}
