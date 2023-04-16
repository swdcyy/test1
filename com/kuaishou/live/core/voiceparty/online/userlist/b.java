package com.kuaishou.live.core.voiceparty.online.userlist.b;
import k51.c;
import du2.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import du2.c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.lang.Integer;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import java.lang.Number;
import lnc.a1;
import android.view.View;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.SpannableStringBuilder;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.DateUtils;
import yx2.l;
import com.yxcorp.utility.TextUtils;
import android.text.style.ForegroundColorSpan;
import du2.b;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.widget.AppCompatTextView;
import du2.d;
import du2.e;
import com.yxcorp.utility.n;
import im8.f;
import java.util.ArrayList;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import y8c.g;

public abstract class b extends c	// class@001809
{
    public TextView A;
    public TextView B;
    public View C;
    public boolean D;
    public g E;
    public VoicePartyOnlineUser p;
    public f q;
    public g r;
    public KwaiImageView s;
    public TextView t;
    public SelectShapeTextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public View z;
    public static String sLivePresenterClassName = "BaseOnlineUserItemPresenter";

    public void b(boolean p0,g p1){
       super();
       this.D = p0;
       this.E = p1;
    }
    public void E8(){
       View[] viewArray;
       b uob3;
       String str2;
       int i1;
       SpannableStringBuilder spannableStr;
       int i4;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uob, "3")) {
          return;
       }
       b uob1 = 8;
       b uob2 = null;
       if (!PatchProxy.applyVoid(objArray, obj, uob, "6")) {
          g.d(obj.s, obj.p.mApplyUserInfo, HeadImageSize.MIDDLE);
          obj.s.setOnClickListener(new c(obj));
          int i5 = this.S8();
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i5), obj, uob, "7")) {
             RoundingParams roundingPara = obj.s.getHierarchy().n();
             if (roundingPara != null) {
                if (i5 < 3) {
                   if (PatchProxy.isSupport(uob)) {
                      Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i5), obj, uob, "16");
                      if (obj1 != patchProxyRe) {
                         i5 = obj1.intValue();
                      }else if(i5){
                         if (i5 != 1) {
                            i5 = (i5 != 2)? a1.a(R.color.arg_RES_7f0620a4): a1.a(R.color.arg_RES_7f0620a6);
                         }else {
                            i5 = a1.a(R.color.arg_RES_7f0620a7);
                         }
                      }else {
                         i5 = a1.a(R.color.arg_RES_7f0620a5);
                      }
                   }else {
                      goto label_0076 ;
                   }
                   roundingPara.k(i5);
                }else {
                   roundingPara.k(uob2);
                }
                obj.s.getHierarchy().L(roundingPara);
             }
          }
          uob3 = obj.p;
          if (uob3.mIsUserNotInLivingRoom != null && uob3.mIsUserOnline != null) {
             obj.z.setVisibility(uob2);
          }else {
             obj.z.setVisibility(uob1);
          }
       }
       String str = "8";
       String str1 = 5;
       if (!PatchProxy.applyVoid(objArray, obj, uob, "4")) {
          uob3 = obj.p;
          String str3 = "";
          if (uob3.mIsUserNotInLivingRoom != null) {
             if (uob3.mIsUserOnline != null) {
                obj.x.setText(a1.p(R.string.arg_RES_7f1019f3));
             }else if(uob3.mLastUserOnlineTimeMs > 0){
                spannableStr = new SpannableStringBuilder(DateUtils.C(this.getContext(), obj.p.mLastUserOnlineTimeMs));
                spannableStr.append(a1.p(R.string.arg_RES_7f1019f3));
                obj.x.setText(spannableStr);
             }else {
                obj.x.setText(str3);
             }
          }else {
             VoicePartyOnlineUser mStatus1 = uob3.mStatus;
             if (mStatus1 == str1 || mStatus1 == -1) {
                spannableStr = new SpannableStringBuilder(DateUtils.C(this.getContext(), obj.p.mApplyTimeMs));
                if (spannableStr.length() > 0) {
                   spannableStr.append(" ");
                   mStatus1 = obj.p.mTeamType;
                   l ol = l.class;
                   if (PatchProxy.isSupport(ol)) {
                      str2 = PatchProxy.applyOneRefs(Integer.valueOf(mStatus1), objArray, ol, str);
                      if (str2 != patchProxyRe) {
                      label_0179 :
                         if (!TextUtils.x(str2)) {
                            int i3 = spannableStr.length();
                            spannableStr.append(str2);
                            VoicePartyOnlineUser mTeamType = obj.p.mTeamType;
                            if (mTeamType != 1) {
                               i4 = (mTeamType != 2)? -1: 0x7f060310;
                            }else {
                               i4 = 0x7f060676;
                            }
                            spannableStr.setSpan(new ForegroundColorSpan(a1.a(i4)), i3, spannableStr.length(), 33);
                         }
                      }
                   }
                   if (mStatus1 != 1) {
                      if (mStatus1 == 2) {
                         str3 = a1.p(R.string.arg_RES_7f101f46);
                      }
                   }else {
                      str3 = a1.p(R.string.arg_RES_7f101f47);
                   }
                   str2 = str3;
                   goto label_0179 ;
                }
                obj.x.setText(spannableStr);
             }else {
                obj.x.setText(a1.r(R.string.arg_RES_7f101f75, uob3.mDisplayKsCoin));
             }
          }
          if (!PatchProxy.applyVoid(objArray, obj, uob, "5")) {
             uob3 = obj.t;
             if (uob3 != null) {
                uob3.setText(obj.p.mApplyUserInfo.mName);
                obj.t.setOnClickListener(new b(obj));
             }
          }
       }
    label_01ce :
       uob1 = 4;
       if (!PatchProxy.applyVoid(objArray, obj, uob, "11") && !PatchProxy.applyVoid(objArray, obj, uob, "10")) {
          VoicePartyOnlineUser mUserRelatio = obj.p.mUserRelation;
          if (mUserRelatio != 2) {
             if (mUserRelatio != 3) {
                if (mUserRelatio != uob1) {
                   obj.v.setVisibility(8);
                }else {
                   obj.v.setVisibility(0);
                   obj.v.setText(a1.p(R.string.arg_RES_7f101f78));
                }
             }else {
                obj.v.setVisibility(0);
                obj.v.setText(a1.p(R.string.arg_RES_7f101f76));
             }
          }else {
             obj.v.setVisibility(0);
             obj.v.setText(a1.p(R.string.arg_RES_7f101f77));
          }
       }
       if (!PatchProxy.applyVoid(objArray, obj, uob, str)) {
          if (TextUtils.x(obj.p.mAge) || TextUtils.x(obj.p.mApplyUserInfo.mSex)) {
             obj.u.setVisibility(8);
          }else {
             obj.u.setVisibility(0);
             GradientDrawable background = obj.u.getBackground();
             int i2 = 0x7f060746;
             if (TextUtils.n("M", obj.p.mApplyUserInfo.mSex)) {
                i1 = 0x7f081500;
                background.setColor(a1.a(i2));
             }else if(TextUtils.n("F", obj.p.mApplyUserInfo.mSex)){
                i1 = 0x7f0814ff;
                background.setColor(a1.a(i2));
             }else {
                obj.u.setVisibility(8);
             }
             obj.u.setCompoundDrawablesWithIntrinsicBounds(a1.f(i1), objArray, objArray, objArray);
             obj.u.setText(obj.p.mAge);
          }
       }
       if (!PatchProxy.applyVoid(objArray, obj, uob, "9")) {
          uob3 = obj.u;
          if (uob3 != null && !uob3.getVisibility()) {
             uob3 = obj.v;
             if (uob3 != null && !uob3.getVisibility()) {
                obj.w.setVisibility(8);
             }
          }
          i1 = 8;
          if (TextUtils.x(obj.p.mLocation)) {
             obj.w.setVisibility(i1);
          }else {
             obj.w.setVisibility(0);
             obj.w.setText(obj.p.mLocation);
          }
       }
       if (!PatchProxy.applyVoid(objArray, obj, uob, "12")) {
          uob3 = (obj.p.mStatus == 1)? 1: null;
          if (uob3) {
             obj.y.setTextColor(a1.a(R.color.arg_RES_7f061fbe));
             obj.y.setBackground(a1.f(R.drawable.arg_RES_7f080257));
             obj.y.setOnClickListener(new d(obj));
             this.W8();
          }else if(this.R8()){
             obj.y.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
             obj.y.setBackground(a1.f(R.drawable.arg_RES_7f080256));
             obj.y.setOnClickListener(new e(obj));
             this.P8();
          }else {
             obj.y.setTextColor(a1.a(R.color.arg_RES_7f061f8d));
             obj.y.setBackground(objArray);
             obj.y.setOnClickListener(objArray);
          }
          uob3 = obj.y;
          str2 = PatchProxy.apply(objArray, obj, uob, "15");
          if (str2 != patchProxyRe) {
          }else {
             VoicePartyOnlineUser mStatus = obj.p.mStatus;
             str2 = 0x7f102e44;
             if (mStatus != -1) {
                if (mStatus != 2) {
                   if (mStatus != 3) {
                      if (mStatus != uob1) {
                         str2 = (mStatus != 5)? a1.p(R.string.arg_RES_7f102e1c): a1.p(R.string.arg_RES_7f100513);
                      }else {
                         str2 = a1.p(str2);
                      }
                   }else {
                      str2 = a1.p(R.string.arg_RES_7f102dee);
                   }
                }else {
                   str2 = a1.p(R.string.arg_RES_7f102e26);
                }
             }else {
                str2 = a1.p(str2);
             }
          }
          uob3.setText(str2);
       }
       if (!PatchProxy.applyVoid(objArray, obj, uob, "13")) {
          if (obj.D != null && !TextUtils.x(obj.p.mNextOrderedMusicName)) {
             viewArray = new View[]{obj.A,obj.C};
             int i = 0;
             n.Z(i, viewArray);
             obj.A.setText(obj.p.mNextOrderedMusicName);
             if (obj.p.mOrderedMusicCount > 1) {
                objArray = new Object[]{Integer.valueOf(obj.p.mOrderedMusicCount)};
                obj.B.setText(String.format(a1.p(R.string.arg_RES_7f102e4b), objArray));
                obj.B.setVisibility(0);
             }else {
                obj.B.setVisibility(8);
             }
          }else {
             viewArray = new View[]{obj.A,obj.B,obj.C};
             n.Z(8, viewArray);
          }
       }
       return;
    }
    public void P8(){
    }
    public boolean R8(){
       boolean b = (this.p.mStatus == 5)? true: false;
       return b;
    }
    public int S8(){
       Object obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.q.get().intValue();
    }
    public String[] V8(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!this.v.getVisibility()) {
          obj.add("好友");
       }
       if (!this.u.getVisibility()) {
          obj.add("性别");
          obj.add("年龄");
       }
       if (!this.w.getVisibility()) {
          obj.add("地区");
       }
       String[] stringArray = new String[0];
       return obj.toArray(stringArray);
    }
    public void W8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a44d8);
       this.s = m1.f(p0, 0x7f0a44dd);
       this.x = m1.f(p0, 0x7f0a44de);
       this.v = m1.f(p0, 0x7f0a44e5);
       this.t = m1.f(p0, 0x7f0a44e3);
       this.u = m1.f(p0, 0x7f0a44dc);
       this.w = m1.f(p0, 0x7f0a44df);
       this.z = m1.f(p0, 0x7f0a44e4);
       this.C = m1.f(p0, 0x7f0a44e1);
       this.A = m1.f(p0, 0x7f0a44e2);
       this.B = m1.f(p0, 0x7f0a44e0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.s8(VoicePartyOnlineUser.class);
       this.q = this.x8("ADAPTER_POSITION");
       this.r = this.r8("ADAPTER");
       return;
    }
}
