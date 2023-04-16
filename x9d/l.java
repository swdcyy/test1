package x9d.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nfd.t0;
import com.kwai.robust.PatchProxyResult;
import nfd.y0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import lu7.f;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.UserExtraInfo$UserInfoExposed;
import android.app.Activity;
import android.content.Context;
import nfd.r3;
import android.view.View;
import nfd.o3;
import android.widget.TextView;
import com.yxcorp.plugin.search.entity.SearchItem;
import lnc.a1;
import zf6.j;
import com.kwai.framework.model.user.MemorialInfo;
import android.view.ViewStub;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import k06.a;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import zf6.k;
import com.kwai.framework.model.user.UserHintColor;
import com.yxcorp.plugin.search.utils.j0;
import com.kwai.framework.model.user.UserRankData;
import com.kwai.framework.model.user.UserRankData$RankDesc;
import com.kwai.framework.model.user.UserRankData$RankIcon;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.text.TextPaint;

public class l extends PresenterV2	// class@004362
{
    public View A;
    public TextView B;
    public TextView C;
    public View D;
    public KwaiImageView E;
    public TextView F;
    public SearchItem G;
    public boolean H;
    public boolean I;
    public User p;
    public a0 q;
    public TextView r;
    public TextView s;
    public View t;
    public ViewStub u;
    public ViewStub v;
    public ViewStub w;
    public View x;
    public KwaiImageView y;
    public TextView z;
    public static int J;

    static {
       l.J = t0.t0;
    }
    public void l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y0 oy0 = y0.class;
       super();
       Object obj = PatchProxy.apply(null, null, oy0, "32");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): f.a("user_new_card_thirdline");
       this.H = b;
       Object obj1 = PatchProxy.apply(null, null, oy0, "34");
       boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): f.a("user_new_card_fourthline");
       this.I = b1;
       return;
    }
    public String P8(User p0){
       Object[] objArray;
       User obj = PatchProxy.applyOneRefs(p0, this, l.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mVerifiedDetail;
       if (obj != null && !TextUtils.x(obj.mDescription)) {
          return p0.mVerifiedDetail.mDescription;
       }
       if (this.H != null && !TextUtils.x(p0.mPhotoInfo)) {
          return p0.mPhotoInfo;
       }
       int i = 1;
       if (!TextUtils.x(p0.mKwaiId)) {
          objArray = new Object[i];
          objArray[0] = p0.mKwaiId;
          return a.b().getString(0x7f1045d4, objArray);
       }else if(!TextUtils.x(p0.mId)){
          objArray = new Object[i];
          objArray[0] = p0.mId;
          return a.b().getString(0x7f1045d3, objArray);
       }else if(!TextUtils.x(f.a(this.p))){
          return f.a(this.p);
       }else {
          return "";
       }
    }
    public String R8(boolean p0,UserExtraInfo p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ol, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0 && !TextUtils.x(p1.mUserInfoExposed.mlineFirst))? r3.l(this.getActivity(), this.p, p1, p1.mUserInfoExposed.mlineFirst): f.c(this.p);
       return str;
    }
    public String S8(boolean p0,UserExtraInfo p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ol, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0 && !TextUtils.x(p1.mUserInfoExposed.mLineSecond))? r3.l(this.getActivity(), this.p, p1, p1.mUserInfoExposed.mLineSecond): "";
       return str;
    }
    public String V8(boolean p0,UserExtraInfo p1){
       Application obj;
       int i;
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, ol, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.b();
       if (this.H != null) {
          i = (this.p.mFansCount >= 1000)? 0x7f104578: 0x7f1038f0;
       }else {
          i = 0x7f10456c;
       }
       Object[] objArray = new Object[]{TextUtils.N((long)this.p.mFansCount)};
       String str = obj.getString(i, objArray);
       if (p0 && !TextUtils.x(p1.mUserInfoExposed.mlineThird)) {
          str = r3.l(this.getActivity(), this.p, p1, p1.mUserInfoExposed.mlineThird);
       }
       return str;
    }
    public final void W8(View p0,View[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "10")) {
          return;
       }
       if (p1.length <= 0) {
          o3.H(p0, 8);
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             object oobject = p1[i];
             if (oobject != null && !oobject.getVisibility()) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             o3.H(p0, 8);
             return;
          }
       }
       return;
    }
    public void X8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "9")) {
          return;
       }
       o3.G(this.C, p0);
       View[] viewArray = new View[]{this.C,this.B};
       this.W8(this.A, viewArray);
       return;
    }
    public void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "11")) {
          return;
       }
       if (TextUtils.x(p0) || TextUtils.n("searchInvisible", p0)) {
          this.r.setVisibility(8);
          return;
       }else {
          this.r.setVisibility(0);
          o3.G(this.r, p0);
          if (this.G.mAtmosphereType == 1) {
             this.r.setTextColor(a1.a(R.color.arg_RES_7f061e52));
          }else {
             l tr = this.r;
             tr.setTextColor(j.d(tr, R.color.arg_RES_7f061641));
          }
          return;
       }
    }
    public void Z8(String p0){
       l tF;
       l tC;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "12")) {
          return;
       }
       User mMemorialInf = this.p.mMemorialInfo;
       int i = 0x7f06204a;
       int i1 = 1;
       Object[] objArray = null;
       if (mMemorialInf != null && !TextUtils.x(mMemorialInf.mText)) {
          if (!PatchProxy.applyVoid(objArray, this, ol, "5") && this.D == null) {
             View view = this.v.inflate();
             this.D = view;
             this.E = m1.f(view, 0x7f0a2acd);
             this.F = m1.f(this.D, 0x7f0a2ad0);
          }
          if (!PatchProxy.applyVoid(objArray, this, ol, "6")) {
             if (j.h(this.p.mMemorialInfo.mIconUrls)) {
                o3.H(this.E, 8);
             }else {
                this.E.U(this.p.mMemorialInfo.mIconUrls);
                o3.H(this.E, 0);
             }
             o3.G(this.F, this.p.mMemorialInfo.mText);
             if (this.G.mAtmosphereType == i1) {
                this.F.setTextColor(a1.a(i));
             }else {
                tF = this.F;
                tF.setTextColor(j.d(tF, R.color.arg_RES_7f061692));
             }
             View[] viewArray = new View[]{this.E,this.F};
             this.W8(this.t, viewArray);
          }
          o3.H(this.D, 0);
          o3.H(this.A, 8);
       }else if(!PatchProxy.applyVoid(objArray, this, ol, "4") && this.A == null){
          View view1 = this.u.inflate();
          this.A = view1;
          this.B = m1.f(view1, 0x7f0a3ded);
          this.C = m1.f(this.A, 0x7f0a3dec);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ol, "7")) {
          a uoa = new a();
          float f = (float)t0.d;
          uoa.f(f);
          if (this.G.mAtmosphereType == i1) {
             this.C.setTextColor(a1.a(i));
             this.B.setTextColor(a1.a(i));
             this.B.setBackground(uoa.h(this.getContext(), R.color.arg_RES_7f062039).a());
          }else if(this.H != null){
             tC = this.C;
             tC.setTextColor(j.d(tC, R.color.arg_RES_7f0607cf));
             a uoa1 = uoa.h(this.getContext(), R.color.arg_RES_7f0608cf);
             uoa1.f(f);
             this.C.setBackground(uoa1.a());
             this.C.setPadding(t0.e, 0, t0.e, 0);
             this.C.setTextSize(i1, 9.00f);
             this.C.setTypeface(Typeface.create("sans-serif-medium", 0));
             User mUserHintCol = this.p.mUserHintColor;
             if (mUserHintCol != null) {
                objArray = mUserHintCol;
             }
             String str = (k.d())? "#351F28": "#FFEEF2";
             String str1 = (k.d())? "#F73B68": "#FE3666";
             if (objArray != null) {
                str = (k.d())? objArray.mBgColorDark: objArray.mBgColorLight;
                if (k.d()) {
                   str1 = objArray.mTextColorDark;
                }else {
                   str1 = objArray.mTextColorLight;
                }
             }
             this.B.setTextColor(j0.v(str1, j.b(this.getContext(), R.color.arg_RES_7f0607cf)));
             l tB = this.B;
             uoa.i(j0.v(str, j.d(tB, R.color.arg_RES_7f0608cf)));
             tB.setBackground(uoa.a());
          }else {
             tC = this.C;
             tC.setTextColor(j.d(tC, R.color.arg_RES_7f061a85));
             this.C.setBackground(objArray);
             this.C.setTextSize(i1, 12.00f);
             tC = this.B;
             tC.setTextColor(j.d(tC, R.color.arg_RES_7f0607cf));
             this.B.setBackground(uoa.h(this.getContext(), R.color.arg_RES_7f0608cf).a());
          }
          if (!TextUtils.x(this.p.hint)) {
             o3.G(this.B, this.p.hint);
          }else {
             mMemorialInf = this.p.mExtraInfo;
             if (mMemorialInf != null && !TextUtils.x(mMemorialInf.mRecommendReason)) {
                o3.G(this.B, this.p.mExtraInfo.mRecommendReason);
             }else if(!TextUtils.x(this.p.mExactMatchTip)){
                o3.G(this.B, this.p.mExactMatchTip);
             }else {
                o3.G(this.B, "");
             }
          }
          if (TextUtils.x(p0)) {
             tF = this.p;
             if (!PatchProxy.applyVoidOneRefs(tF, this, ol, "8")) {
                this.X8(this.P8(tF));
             }
          }else if(TextUtils.n("searchInvisible", p0)){
             this.X8("");
          }else {
             this.X8(p0);
          }
       }
       o3.H(this.A, 0);
       o3.H(this.D, 8);
       return;
    }
    public void a9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "13")) {
          return;
       }
       l ts = this.s;
       if (ts == null) {
          return;
       }
       if (this.G.mAtmosphereType == 1) {
          ts.setTextColor(a1.a(R.color.arg_RES_7f06204a));
       }else {
          ts.setTextColor(j.d(ts, R.color.arg_RES_7f06168c));
       }
       o3.G(this.s, p0);
       return;
    }
    public void b9(User p0){
       l ty;
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "18")) {
          return;
       }
       int i = 8;
       if (this.I != null && (p0 == null || (TextUtils.x(p0.mText) && p0.mUserRankData == null))) {
          o3.H(this.x, i);
          o3.H(this.w, i);
          return;
       }else if(!PatchProxy.applyVoid(null, this, ol, "3") && this.x == null){
          ol = this.w;
          if (ol != null) {
             View view = ol.inflate();
             this.x = view;
             this.y = m1.f(view, 0x7f0a340a);
             this.z = m1.f(this.x, 0x7f0a0fe2);
          }
       }
       if (this.x != null && this.z != null) {
          User mUserRankDat = p0.mUserRankData;
          if (mUserRankDat != null) {
             UserRankData mRankDesc = mUserRankDat.mRankDesc;
             if (mRankDesc != null && !TextUtils.x(mRankDesc.mText)) {
                UserRankData mRankIcon = mUserRankDat.mRankIcon;
                if (mRankIcon != null && (!TextUtils.x(mRankIcon.mUrlLight) && (!TextUtils.x(mUserRankDat.mRankIcon.mUrlDark) && mUserRankDat.mRankIcon.getIconRadio() - null > 0))) {
                   ViewGroup$LayoutParams layoutParams = this.y.getLayoutParams();
                   layoutParams.width = (int)((float)layoutParams.height * mUserRankDat.mRankIcon.getIconRadio());
                   this.y.setLayoutParams(layoutParams);
                   ty = this.y;
                   UserRankData$RankIcon mUrlDark = (k.d())? mUserRankDat.mRankIcon.mUrlDark: mUserRankDat.mRankIcon.mUrlLight;
                   ty.L(mUrlDark);
                   o3.H(this.y, 0);
                }else {
                   o3.H(this.y, i);
                }
                o3.G(this.z, mUserRankDat.mRankDesc.mText);
                ty = this.z;
                UserRankData$RankDesc mTextColorDa = (k.d())? mUserRankDat.mRankDesc.mTextColorDark: mUserRankDat.mRankDesc.mTextColor;
                ty.setTextColor(j0.v(mTextColorDa, j.d(this.z, R.color.arg_RES_7f0608dd)));
             }
          }
          if (!TextUtils.x(p0.mText)) {
             o3.H(this.y, i);
             if (this.z.getPaint().measureText(p0.mText) - (float)l.J < 0) {
                o3.H(this.x, i);
                o3.H(this.w, i);
             }else {
                o3.G(this.z, p0.mText);
                this.z.setTextColor(j.b(this.getContext(), R.color.arg_RES_7f0607cf));
             }
          }else {
             o3.H(this.x, i);
             o3.H(this.w, i);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2d10);
       this.s = m1.f(p0, 0x7f0a3deb);
       this.t = m1.f(p0, 0x7f0a179e);
       this.u = m1.f(p0, 0x7f0a1461);
       this.v = m1.f(p0, 0x7f0a2ace);
       this.w = m1.f(p0, 0x7f0a436c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.G = this.q8(SearchItem.class);
       return;
    }
}
