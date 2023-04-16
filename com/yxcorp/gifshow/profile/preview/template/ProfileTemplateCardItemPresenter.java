package com.yxcorp.gifshow.profile.preview.template.ProfileTemplateCardItemPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.preview.template.ProfileTemplateCardItemPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.preview.template.ProfileTemplateCardItemPresenter$mIsDarkMode$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import java.util.Collection;
import ekd.q;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import a3c.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import android.content.Context;
import android.widget.TextView;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot;
import android.view.View;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo;
import java.util.Iterator;
import java.lang.Iterable;
import lnc.a1;
import ii5.a;
import java.lang.Boolean;
import ekd.m1;

public final class ProfileTemplateCardItemPresenter extends PresenterV2	// class@00159d
{
    public ProfileTemplateCard p;
    public View q;
    public KwaiImageView r;
    public TextView s;
    public View t;
    public TextView u;
    public TextView v;
    public int w;
    public final p x;
    public static final ProfileTemplateCardItemPresenter$a y;

    static {
       ProfileTemplateCardItemPresenter.y = new ProfileTemplateCardItemPresenter$a(null);
    }
    public void ProfileTemplateCardItemPresenter(){
       super();
       this.w = -1;
       this.x = s.c(ProfileTemplateCardItemPresenter$mIsDarkMode$2.INSTANCE);
    }
    public void E8(){
       ProfileTemplateCard obj1;
       ProfileTemplateCardItemPresenter obj2;
       ProfileTemplateCard mDarkIconUrl;
       ProfileTemplateCardItemPresenter profileTempl = ProfileTemplateCardItemPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profileTempl, "4")) {
          return;
       }
       ProfileTemplateCardItemPresenter tp = this.p;
       String str = "mCard";
       if (tp == null) {
          a.S(str);
       }
       int i = 8;
       if (!PatchProxy.applyVoidOneRefs(tp, this, profileTempl, "5")) {
          String str2 = "mIconIv";
          if (this.P8()) {
             if (!q.f(tp.mDarkIconUrls)) {
                obj2 = this.r;
                if (obj2 == null) {
                   a.S(str2);
                }
                mDarkIconUrl = tp.mDarkIconUrls;
                a.o(mDarkIconUrl, "card.mDarkIconUrls");
                d.a(obj2, mDarkIconUrl, ImageSource.ICON);
             }else if(!TextUtils.x(tp.mDarkIconUrl)){
                obj2 = this.r;
                if (obj2 == null) {
                   a.S(str2);
                }
                mDarkIconUrl = tp.mDarkIconUrl;
                a.o(mDarkIconUrl, "card.mDarkIconUrl");
                d.b(obj2, mDarkIconUrl, ImageSource.ICON);
             }else {
             label_009c :
                int i1 = 0;
             label_009d :
                ProfileTemplateCardItemPresenter tr = this.r;
                if (tr == null) {
                   a.S(str2);
                }
                i1 = (obj2)? 0: 8;
                tr.setVisibility(i1);
                obj2 = this.s;
                if (obj2 == null) {
                   a.S("mMainTitleTv");
                }
                ProfileTemplateCard mMainTitle = tp.mMainTitle;
                Context uContext = (mMainTitle == null || !mMainTitle.length())? 1: null;
                if (uContext) {
                   uContext = this.getContext();
                   str2 = (uContext != null)? uContext.getString(R.string.arg_RES_7f10089f): objArray;
                }else {
                   Object[] objArray1 = tp.mMainTitle;
                }
                obj2.setText(str2);
                obj2 = this.u;
                if (obj2 == null) {
                   a.S("mSubTitleTv");
                }
                obj2.setText(tp.mSubTitle);
                obj2 = this.t;
                if (obj2 == null) {
                   a.S("mRedDotView");
                }
                obj1 = tp.mProfileCardRedDot;
                int i2 = (obj1 != null && obj1.mShow == 1)? 0: 8;
                obj2.setVisibility(i2);
             }
          }else if(!q.f(tp.mIconUrls)){
             obj2 = this.r;
             if (obj2 == null) {
                a.S(str2);
             }
             mDarkIconUrl = tp.mIconUrls;
             a.o(mDarkIconUrl, "card.mIconUrls");
             d.a(obj2, mDarkIconUrl, ImageSource.ICON);
          }else if(!TextUtils.x(tp.mIconUrl)){
             obj2 = this.r;
             if (obj2 == null) {
                a.S(str2);
             }
             mDarkIconUrl = tp.mIconUrl;
             a.o(mDarkIconUrl, "card.mIconUrl");
             d.b(obj2, mDarkIconUrl, ImageSource.ICON);
          }else {
             goto label_009c ;
          }
          obj2 = 1;
          goto label_009d ;
       }
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       if (!PatchProxy.applyVoidOneRefs(tp, this, profileTempl, "6")) {
          ProfileTemplateCard mButtonInfo = tp.mButtonInfo;
          ProfileTemplateCard$ButtonInfo mCurrentStat = (mButtonInfo != null)? mButtonInfo.mCurrentStatus: -1;
          this.w = mCurrentStat;
          String str1 = "mActionBtnTv";
          if (tp.mCardViewStyle != 1) {
             profileTempl = this.v;
             if (profileTempl == null) {
                a.S(str1);
             }
             profileTempl.setVisibility(i);
          }else {
             ProfileTemplateCardItemPresenter tv = this.v;
             if (tv == null) {
                a.S(str1);
             }
             ProfileTemplateCard$ButtonStatusInfo obj = PatchProxy.applyOneRefs(tp, this, profileTempl, "7");
             if (obj != PatchProxyResult.class) {
                objArray = obj;
             }else {
                ProfileTemplateCard mButtonInfo1 = tp.mButtonInfo;
                if (mButtonInfo1 != null) {
                   ProfileTemplateCard$ButtonInfo mButtonStatu = mButtonInfo1.mButtonStatusInfos;
                   if (mButtonStatu != null) {
                      Iterator iterator = mButtonStatu.iterator();
                      while (iterator.hasNext()) {
                         obj1 = iterator.next();
                         obj2 = (obj1.mStatus == this.w)? 1: null;
                         if (obj2) {
                            objArray = obj1;
                            break ;
                         }
                      }
                   }
                }
             }
             if (objArray != null) {
                tv.setText(objArray.mText);
                tv.setVisibility(0);
                if (this.P8()) {
                   obj = objArray.mDarkFontColor;
                   if (obj != null) {
                      a.o(obj, "btnStatusInfo.mDarkFontColor");
                      tv.setTextColor(a.h(obj, a1.a(R.color.arg_RES_7f061de2)));
                   }
                }
                obj = objArray.mFontColor;
                if (obj != null) {
                   a.o(obj, "btnStatusInfo.mFontColor");
                   tv.setTextColor(a.h(obj, a1.a(R.color.arg_RES_7f061de2)));
                }else {
                   tv.setTextColor(a1.a(R.color.arg_RES_7f061de2));
                }
             }
          }
       }
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, ProfileTemplateCardItemPresenter.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.x.getValue();
       }
       return obj.booleanValue();
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCardItemPresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.template_card_id);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.template_card_id\)");
       this.q = view;
       view = m1.f(p0, R.id.icon);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.icon\)");
       this.r = view;
       view = m1.f(p0, R.id.main_title);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.main_title\)");
       this.s = view;
       view = m1.f(this.m8(), R.id.red_dot);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.red_dot\)");
       this.t = view;
       view = m1.f(p0, R.id.sub_title);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.sub_title\)");
       this.u = view;
       p0 = m1.f(p0, R.id.action_btn);
       a.o(p0, "ViewBindUtils.bindWidget\(view, R.id.action_btn\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardItemPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(ProfileTemplateCard.class);
       a.o(obj, "inject\(ProfileTemplateCard::class.java\)");
       this.p = obj;
       return;
    }
}
