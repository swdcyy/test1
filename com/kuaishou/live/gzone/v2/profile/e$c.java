package com.kuaishou.live.gzone.v2.profile.e$c;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import com.kwai.framework.model.user.UserProfile;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.lang.Boolean;
import brd.y;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneProfileParams;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import qa6.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i2b.a;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kuaishou.live.common.core.basic.widget.ExpandEmojiTextView;
import ync.a;
import com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView;
import android.view.ViewStub;
import aq.a;
import com.kwai.framework.model.user.UserVerifiedDetail;
import androidx.core.content.ContextCompat;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.kwai.library.widget.textview.DrawableCenterTextView;
import com.kuaishou.live.core.voiceparty.customview.VoicePartyTintableTextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.app.Activity;
import d61.y;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import e63.n;
import android.view.View$OnClickListener;
import e63.v0;
import e63.w0;
import e63.x0;
import e63.r0;
import e63.t0;
import lu7.f;
import android.text.SpannableStringBuilder;
import lnc.b3;
import android.text.SpannableString;
import com.kwai.framework.model.user.UserSameFollow;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.util.ColorURLSpan;
import jya.a;
import android.text.style.StyleSpan;
import android.net.Uri;
import ekd.w0;
import android.net.Uri$Builder;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import e63.o;
import com.kwai.framework.model.user.QCurrentUser;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatTextView;
import lnc.a1;
import jp3.a;
import android.content.SharedPreferences;
import w51.a;
import xf6.l;
import va1.n0;
import android.view.ViewGroup;
import android.view.ViewParent;
import e63.g1;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import wg3.a;
import com.kuaishou.live.gzone.v2.profile.j;
import com.kwai.library.widget.specific.misc.LoadingView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import e63.s0;
import java.lang.Runnable;
import u37.f;
import u37.c;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.gzone.v2.profile.d;
import com.kuaishou.live.gzone.v2.profile.c;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.f;
import java.lang.Enum;

public class e$c implements g	// class@001ce0
{
    public final UserProfile b;
    public final String c;
    public final e d;

    public void e$c(e p0,UserProfile p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       UserProfile mProfile;
       e uoe1;
       int i1;
       String str;
       int i2;
       View view;
       e uoe2;
       PatchProxyResult patchProxyRe1;
       int i4;
       PatchProxyResult patchProxyRe2;
       float f;
       e q1;
       int i7;
       int i8;
       Drawable drawable;
       int i9;
       e$c uoc = this;
       e$c obj = p0;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(obj, uoc, e$c.class, "1")) {
       }else if(!uoc.d.t.isAdded()){
          uoc.d.A.onNext(Boolean.FALSE);
          e$c b = uoc.b;
          if (b != null) {
             mProfile = b.mProfile;
             if (mProfile != null) {
                UserInfo mExtraInfo = mProfile.mExtraInfo;
                if (mExtraInfo != null) {
                   obj.mUserProfile.mProfile.mExtraInfo.mAssistantType = mExtraInfo.mAssistantType;
                }
             }
          }
          if (TextUtils.x(obj.mUserProfile.mProfile.mId)) {
             obj.mUserProfile.mProfile.mId = uoc.d.q.mId;
          }
          if (uoc.d.r.getReplacedUserText() != null) {
             obj.mUserProfile.mProfile.mText = uoc.d.r.getReplacedUserText();
          }
          uoc.d.r.setUserProfile(obj.mUserProfile);
          uoc.d.r.setTargetUserAssType(LiveApiParams$AssistantType.fromInt(obj.mUserProfile.mProfile.getAssistantType()));
          if (uoc.d.r.getBaseFeed() == null || !(uoc.c).equals(r1.U1(uoc.d.r.getBaseFeed()))) {
             b.d(uoc.d.r.getUserProfile(), uoc.d.q);
          }else {
             obj = uoc.d;
             obj.q = r1.T1(obj.r.getBaseFeed());
             b.d(uoc.d.r.getUserProfile(), uoc.d.q);
          }
          uoc.d.D9();
          int b1 = true;
          uoc.d.R9(b1);
          obj = uoc.d;
          Objects.requireNonNull(obj);
          Object[] objArray = null;
          if (PatchProxy.applyVoid(objArray, obj, uoe, "29")) {
             uoe1 = uoe;
          }else {
             UserProfile userProfile = obj.r.getUserProfile();
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object[] objArray1 = PatchProxy.applyOneRefs(userProfile, obj, uoe, "71");
             if (objArray1 != patchProxyRe) {
                uoe1 = uoe;
             }else if(userProfile == null){
                uoe1 = uoe;
                objArray1 = objArray;
             }else {
                Context context = obj.getContext();
                int i3 = (obj.r.getProfileOriginSource() == 36)? 0x7f0d0be0: 0x7f0d0d58;
                objArray1 = a.a(context, i3);
                TextView textView = objArray1.findViewById(R.id.live_profile_user_constellation);
                TextView textView1 = objArray1.findViewById(R.id.live_profile_user_address);
                ImageView imageView = objArray1.findViewById(R.id.live_profile_gender);
                LinearLayout linearLayout = objArray1.findViewById(R.id.user_info_layout);
                TextView textView2 = objArray1.findViewById(R.id.live_profile_unknown_constellation_and_address);
                ExpandEmojiTextView uExpandEmoji = objArray1.findViewById(R.id.live_profile_user_text);
                if (obj.r.isDarkModeEnabled()) {
                   uExpandEmoji.setLabelTextColor(a.e(obj.p, b1));
                }
                obj.o1 = uExpandEmoji;
                if (obj.r.isGzoneAuthorAuthenticationTagEnabled()) {
                   obj.q1 = objArray1.findViewById(0x7f0a2362);
                   obj.r1 = objArray1.findViewById(0x7f0a2363);
                   obj.s1 = objArray1.findViewById(0x7f0a1f6e);
                label_02b0 :
                   uoe2 = uoe;
                   patchProxyRe1 = patchProxyRe;
                }else {
                   ViewStub viewStub = objArray1.findViewById(R.id.live_audience_profile_header_vip_stub);
                   if (viewStub == null || PatchProxy.applyVoidOneRefs(viewStub, obj, uoe, "21")) {
                      goto label_02b0 ;
                   }else {
                      mProfile = obj.r.getUserProfile();
                      UserProfile mProfile1 = mProfile.mProfile;
                      if (mProfile1 != null && (mProfile1.mVerifiedDetail == null && mProfile1.isVerified == null)) {
                         goto label_02b0 ;
                      }else {
                         View view2 = viewStub.inflate();
                         ImageView imageView1 = view2.findViewById(R.id.header_vip_iv);
                         TextView textView5 = view2.findViewById(R.id.header_vip_tv);
                         view = view2.findViewById(R.id.line);
                         String str4 = a.a(mProfile);
                         patchProxyRe1 = patchProxyRe;
                         if (!TextUtils.x(mProfile.mProfile.mSex)) {
                            uoe2 = uoe;
                            if (!("U").equals(mProfile.mProfile.mSex)) {
                            label_0219 :
                               if (obj.r.isDarkModeEnabled()) {
                                  view.setBackgroundResource(R.color.arg_RES_7f061d80);
                               }else {
                                  view.setBackgroundResource(R.color.arg_RES_7f060bd1);
                               }
                               view.setVisibility(0);
                            label_0232 :
                               UserProfile obj1 = mProfile.mProfile;
                               if (obj1 != null) {
                                  str = 0x7f0813f9;
                                  if (obj1.mVerifiedDetail != null) {
                                     view2.setVisibility(0);
                                     UserVerifiedDetail mIconType = mProfile.mProfile.mVerifiedDetail.mIconType;
                                     if (mIconType != 1) {
                                        if (mIconType != 2) {
                                           if (mIconType == 3) {
                                              imageView1.setImageResource(R.drawable.arg_RES_7f0813fa);
                                           }
                                        }else {
                                           imageView1.setImageResource(str);
                                        }
                                     }else {
                                        imageView1.setImageResource(R.drawable.arg_RES_7f0813fb);
                                     }
                                     if (!TextUtils.x(mProfile.mProfile.mVerifiedDetail.mDescription)) {
                                        textView5.setText(mProfile.mProfile.mVerifiedDetail.mDescription);
                                        if (obj.r.isDarkModeEnabled()) {
                                           textView5.setTextColor(ContextCompat.getColor(obj.p, R.color.arg_RES_7f061db2));
                                        }
                                     }
                                  }else if(obj1.isVerified != null){
                                     view2.setVisibility(0);
                                     imageView1.setVisibility(0);
                                     if (!mProfile.mProfile.isBlueVerifiedType()) {
                                        i2 = 0x7f0813fb;
                                     }
                                     imageView1.setImageResource(str);
                                  }else {
                                     i4 = 8;
                                     view2.setVisibility(i4);
                                  label_02b6 :
                                     str = a.a(userProfile);
                                     if (!TextUtils.x(str)) {
                                        textView2.setVisibility(i4);
                                        b1 = 0;
                                        textView.setVisibility(b1);
                                        textView1.setVisibility(b1);
                                        textView.setText(str);
                                        if (!TextUtils.x(userProfile.mCityName)) {
                                           textView1.setText(userProfile.mCityName);
                                        }else {
                                           textView1.setVisibility(i4);
                                        }
                                     }else if(!TextUtils.x(userProfile.mCityName)){
                                        textView2.setVisibility(i4);
                                        textView.setVisibility(i4);
                                        textView1.setVisibility(0);
                                        textView1.setText(userProfile.mCityName);
                                     }else {
                                        linearLayout.setVisibility(i4);
                                        textView2.setVisibility(i4);
                                        textView.setVisibility(i4);
                                        textView1.setVisibility(i4);
                                     }
                                     if (obj.r.isGzoneHideUserInfoTag()) {
                                        linearLayout.setVisibility(i4);
                                     }
                                     if (TextUtils.isEmpty(userProfile.mProfile.mText)) {
                                        uExpandEmoji.setVisibility(i4);
                                     }else {
                                        uExpandEmoji.setVisibility(0);
                                        if (obj.m9() && obj.n9(userProfile)) {
                                           i8 = obj.r.getProfileTextCollapsedDefaultLines();
                                           if (i8 <= 0) {
                                              i8 = 2;
                                           }
                                           uExpandEmoji.v(userProfile.mProfile.mText, i8);
                                           obj.t1 = i8;
                                           obj.u1 = false;
                                        }else {
                                           uExpandEmoji.setText(userProfile.mProfile.mText);
                                           obj.u1 = true;
                                        }
                                     }
                                     obj.g1 = objArray1.findViewById(0x7f0a23a8);
                                     obj.i1 = objArray1.findViewById(0x7f0a238f);
                                     obj.j1 = objArray1.findViewById(0x7f0a2391);
                                     obj.k1 = objArray1.findViewById(0x7f0a238d);
                                     obj.l1 = objArray1.findViewById(0x7f0a2395);
                                     obj.m1 = objArray1.findViewById(0x7f0a238c);
                                     obj.n1 = objArray1.findViewById(0x7f0a2393);
                                     obj.p1 = objArray1.findViewById(0x7f0a2392);
                                     obj.h1 = objArray1.findViewById(0x7f0a2390);
                                     EmojiTextView uEmojiTextVi = objArray1.findViewById(R.id.live_profile_user_name_tv);
                                     TextView textView3 = objArray1.findViewById(R.id.live_profile_relations_text);
                                     TextView textView4 = objArray1.findViewById(R.id.live_profile_gender_tv);
                                     LinearLayout linearLayout1 = objArray1.findViewById(R.id.live_profile_gender_container);
                                     if (y.d(obj.getActivity())) {
                                        ViewGroup$MarginLayoutParams layoutParams = obj.g1.getLayoutParams();
                                        layoutParams.setMargins(n.c(a.a().a(), 82.00f), 0, 0, 0);
                                        obj.g1.setLayoutParams(layoutParams);
                                     }
                                     obj.m1.setOnClickListener(new n(obj));
                                     obj.k1.setOnClickListener(new v0(obj));
                                     obj.l1.setOnClickListener(new w0(obj));
                                     obj.n1.setOnClickListener(new x0(obj));
                                     obj.j1.setOnClickListener(new r0(obj));
                                     obj.i1.setOnClickListener(new t0(obj));
                                     int i5 = 0x7f10023e;
                                     if (("M").equals(userProfile.mProfile.mSex)) {
                                        textView4.setText(R.string.arg_RES_7f103196);
                                        imageView.setImageResource(R.drawable.arg_RES_7f081d92);
                                        obj.m1.setText(i5);
                                     }else if(("F").equals(userProfile.mProfile.mSex)){
                                        textView4.setText(R.string.arg_RES_7f100f40);
                                        imageView.setImageResource(R.drawable.arg_RES_7f081d86);
                                        obj.m1.setText(R.string.arg_RES_7f10023f);
                                     }else {
                                        linearLayout1.setVisibility(8);
                                        obj.m1.setText(i5);
                                     }
                                     mProfile = userProfile.mProfile;
                                     uEmojiTextVi.setText(f.b(mProfile.mId, mProfile.mName));
                                     if (obj.r.getTargetUserAssType() != LiveApiParams$AssistantType.PUSHER) {
                                        uoe1 = uoe2;
                                        if (PatchProxy.applyVoidTwoRefs(userProfile, textView3, obj, uoe1, "76")) {
                                           patchProxyRe2 = patchProxyRe1;
                                        }else if(!userProfile.isFollowingOrFollowRequesting()){
                                           obj1 = userProfile.mSameFollow;
                                           if (obj1 != null) {
                                              i8 = a.e(obj.p, obj.r.isDarkModeEnabled());
                                              SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                                              b3 uob3 = new b3(obj.getContext(), 0x7f0813fd);
                                              uob3.b(false);
                                              spannableStr.append(uob3.a());
                                              String str1 = " ";
                                              spannableStr.append(str1);
                                              spannableStr.append(obj.n8(R.string.arg_RES_7f103f96));
                                              String str2 = obj.n8(R.string.arg_RES_7f1036f4);
                                              spannableStr.append(str1);
                                              SpannableStringBuilder spannableStr1 = new SpannableStringBuilder();
                                              Iterator iterator = obj1.mSameFollowers.iterator();
                                              while (iterator.hasNext()) {
                                                 User user = iterator.next();
                                                 if (TextUtils.x(user.getName())) {
                                                    continue ;
                                                 }else if(obj.r.getOriginUserAssType() != LiveApiParams$AssistantType.PUSHER){
                                                    Object[] objArray2 = new Object[]{user.getId()};
                                                    a.a(user, spannableStr1, String.format("same_follower_%s", objArray2), i8, null).h(user.getId());
                                                 }else {
                                                    spannableStr1.append(user.getName());
                                                 }
                                                 spannableStr1.append(str2);
                                              }
                                              if (spannableStr1.length() > 0 && str2.length() > 0) {
                                                 i9 = 1;
                                                 if (spannableStr1.charAt((spannableStr1.length() - i9)) == str2.charAt(0)) {
                                                    spannableStr1.delete((spannableStr1.length() - i9), spannableStr1.length());
                                                 }
                                              }else {
                                                 i9 = 1;
                                              }
                                              spannableStr1.setSpan(new StyleSpan(i9), 0, spannableStr1.length(), 17);
                                              spannableStr.append(spannableStr1);
                                              spannableStr.append(str1);
                                              if (obj1.mTotalCount > obj1.mSameFollowers.size()) {
                                                 spannableStr.append(obj.n8(R.string.arg_RES_7f103c16));
                                                 Object[] objArray3 = new Object[]{String.valueOf(obj1.mTotalCount)};
                                                 SpannableString spannableStr2 = new SpannableString(obj.getContext().getString(0x7f103f95, objArray3));
                                                 if (obj.r.getOriginUserAssType() != LiveApiParams$AssistantType.PUSHER) {
                                                    str2 = obj.q.getId();
                                                    String str3 = "same_followers";
                                                    Uri uri = PatchProxy.applyTwoRefs(str2, str3, obj, uoe1, "77");
                                                    patchProxyRe2 = patchProxyRe1;
                                                    if (uri != patchProxyRe2) {
                                                    }else {
                                                       Uri$Builder uBuilder = w0.f("ks://users").buildUpon().appendPath(str3);
                                                       if (!TextUtils.isEmpty(str2)) {
                                                          uBuilder.appendPath(str2);
                                                       }
                                                       uri = uBuilder.build();
                                                    }
                                                    ColorURLSpan uColorURLSpa = new ColorURLSpan(uri.toString(), "same_follower", str3);
                                                    uColorURLSpa.d(R.anim.arg_RES_7f010109, 0x7f0100e5);
                                                    uColorURLSpa.c(R.anim.arg_RES_7f0100e5, 0x7f010112);
                                                    i5 = true;
                                                    uColorURLSpa.m(i5);
                                                    uColorURLSpa.g(i8);
                                                    uColorURLSpa.h(String.valueOf(obj1.mTotalCount));
                                                    i8 = 0;
                                                    spannableStr2.setSpan(uColorURLSpa, i8, spannableStr2.length(), 17);
                                                 }else {
                                                    patchProxyRe2 = patchProxyRe1;
                                                    i8 = 0;
                                                    i5 = 1;
                                                 }
                                                 spannableStr2.setSpan(new StyleSpan(i5), i8, spannableStr2.length(), 17);
                                                 spannableStr.append(spannableStr2);
                                              }else {
                                                 patchProxyRe2 = patchProxyRe1;
                                                 i8 = 0;
                                              }
                                              textView3.setVisibility(i8);
                                              textView3.setMovementMethod(LinkMovementMethod.getInstance());
                                              textView3.setText(spannableStr);
                                           }
                                        }
                                        patchProxyRe2 = patchProxyRe1;
                                        i4 = 8;
                                        textView3.setVisibility(i4);
                                     label_065c :
                                        if (textView3.getVisibility() != i4) {
                                           i4 = obj.r.getProfileTextCollapsedDefaultLines();
                                           if (i4 <= 0) {
                                              i4 = 1;
                                           }
                                           uExpandEmoji.v(userProfile.mProfile.mText, i4);
                                           obj.t1 = i4;
                                           i4 = false;
                                           obj.u1 = i4;
                                        }else {
                                           i4 = false;
                                        }
                                        if (obj.r.isProfileTextClickEnabled()) {
                                           uExpandEmoji.setOnClickListener(new o(obj, uExpandEmoji, userProfile));
                                        }
                                        obj.I1 = i4;
                                        g1 og1 = -1;
                                        f = 16.00f;
                                        if (!PatchProxy.applyVoidOneRefs(userProfile, obj, uoe1, "75")) {
                                           if (!QCurrentUser.me().isLogined()) {
                                              i7 = 8;
                                              obj.n1.setVisibility(i7);
                                              obj.p1.setVisibility(i7);
                                              i8 = 0;
                                              obj.h1.setVisibility(i8);
                                              obj.k1.setVisibility(i7);
                                              obj.l1.setVisibility(i7);
                                              obj.m1.setVisibility(i8);
                                              q1 = obj.W;
                                              if (q1 != null) {
                                                 q1.setVisibility(i7);
                                              }
                                              obj.D9();
                                           }else if((userProfile.mProfile.mId).equals(QCurrentUser.me().getId())){
                                              obj.n1.setVisibility(0);
                                              i7 = 8;
                                              obj.h1.setVisibility(i7);
                                              obj.p1.setVisibility(i7);
                                              obj.k1.setVisibility(i7);
                                              obj.l1.setVisibility(i7);
                                              obj.m1.setVisibility(i7);
                                              q1 = obj.W;
                                              if (q1 != null) {
                                                 q1.setVisibility(i7);
                                              }
                                           }else {
                                              i7 = 8;
                                              if (obj.r.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER) {
                                                 obj.n1.setVisibility(i7);
                                                 i8 = 0;
                                                 obj.h1.setVisibility(i8);
                                                 obj.p1.setVisibility(i7);
                                                 if (obj.r.isInVoiceParty()) {
                                                    obj.k1.setVisibility(i7);
                                                    obj.l1.setVisibility(i8);
                                                    if (obj.r.isVoicePartyGuest()) {
                                                       obj.l1.setEnabled(i8);
                                                       obj.l1.setText(R.string.arg_RES_7f102e44);
                                                       obj.l1.setCompoundDrawables(null, null, null, null);
                                                       obj.l1.setTintColor(a1.a(R.color.arg_RES_7f061db8));
                                                    }else {
                                                       obj.l1.setEnabled(true);
                                                       obj.l1.setText(R.string.arg_RES_7f1017a9);
                                                       drawable = ContextCompat.getDrawable(obj.getContext(), R.drawable.arg_RES_7f081300);
                                                       drawable.setBounds(0, 0, a1.e(f), a1.e(f));
                                                       obj.l1.setCompoundDrawables(drawable, null, null, null);
                                                       obj.l1.setTintColor(a1.a(R.color.arg_RES_7f060753));
                                                    }
                                                    i8 = 0;
                                                 }else {
                                                    obj.l1.setVisibility(8);
                                                    obj.k1.setEnabled(obj.r.isAllowLiveChat());
                                                    i8 = false;
                                                    if (!a.a.getBoolean("enableLiveChat", i8)) {
                                                       obj1 = PatchProxy.apply(null, null, a.class, "9");
                                                       i4 = (obj1 != patchProxyRe2)? obj1.booleanValue(): l.c("key_enable_live_chat", i8);
                                                       if (!i4) {
                                                       label_07e9 :
                                                          obj.m1.setVisibility(i8);
                                                          ViewGroup$LayoutParams layoutParams2 = obj.m1.getLayoutParams();
                                                          layoutParams2.width = n.c(a.a().a(), 34.00f);
                                                          obj.m1.setLayoutParams(layoutParams2);
                                                          obj.m1.setCompoundDrawablePadding(i8);
                                                          obj.m1.setText("");
                                                          q1 = obj.W;
                                                          if (q1 != null) {
                                                             q1.setVisibility(8);
                                                          }
                                                       }
                                                    }
                                                    obj.k1.setVisibility(i8);
                                                    if (obj.r.isChattingUser()) {
                                                       obj.k1.setText(R.string.arg_RES_7f101f73);
                                                       obj.k1.setEnabled(i8);
                                                       goto label_07e9 ;
                                                    }else {
                                                       goto label_07e9 ;
                                                    }
                                                 }
                                              }else {
                                                 obj.n1.setVisibility(i7);
                                                 obj.p1.setVisibility(i7);
                                                 obj.h1.setVisibility(i7);
                                                 if (obj.h1.getVisibility() == i7) {
                                                    obj.J9(og1);
                                                 }
                                                 obj.k1.setVisibility(i7);
                                                 obj.l1.setVisibility(i7);
                                                 obj.m1.setVisibility(0);
                                                 if (obj.W != null) {
                                                    if (obj.r.isVoicePartyGuest() || obj.r.isVoicePartyKtvSinger()) {
                                                       e w = obj.W;
                                                       i4 = (obj.r.isSendGiftToAudienceEnabled())? 0: 8;
                                                       w.setVisibility(i4);
                                                    }else {
                                                       obj.W.setVisibility(8);
                                                    }
                                                 }
                                              }
                                           }
                                           if (obj.r.isHideAtAudience()) {
                                              obj.m1.setVisibility(8);
                                           }
                                        }
                                        obj.D9();
                                        Application uApplication = a.a().a();
                                        float f1 = 19.00f;
                                        float f2 = (y.d(obj.getActivity()))? 16.00f: 19.00f;
                                        i4 = n.c(uApplication, f2);
                                        Application uApplication1 = a.a().a();
                                        if (y.d(obj.getActivity())) {
                                           f1 = 16.00f;
                                        }
                                        objArray1.setPadding(i4, 0, n.c(uApplication1, f1), n.c(a.a().a(), f));
                                        q1 = obj.q1;
                                        if (q1 != null) {
                                           q1.setWidth(((n0.f() - objArray1.getPaddingLeft()) - objArray1.getPaddingRight()));
                                        }
                                        if (obj.r.isTopFollowLayoutInRecyclerViewHeader()) {
                                           ViewGroup viewGroup = objArray1.findViewById(R.id.live_profile_operate_container);
                                           if (viewGroup != null) {
                                              View view1 = objArray1;
                                              if (!PatchProxy.applyVoidTwoRefs(view1, viewGroup, obj, uoe1, "73")) {
                                                 if (obj.F.getParent() != null) {
                                                    obj.F.getParent().removeView(obj.F);
                                                 }
                                                 int i6 = 0;
                                                 viewGroup.addView(obj.F, i6);
                                                 obj.F.setVisibility(i6);
                                                 if (obj.D.getParent() != null) {
                                                    obj.D.getParent().removeView(obj.D);
                                                 }
                                                 obj.D.setVisibility(0);
                                                 viewGroup.addView(obj.D, 0);
                                                 view1.setClipToPadding(0);
                                                 ViewGroup$MarginLayoutParams layoutParams1 = obj.g1.getLayoutParams();
                                                 f2 = (obj.r.isGameLiveStreamNewVersion2Enabled())? 66.00f: 72.00f;
                                                 layoutParams1.topMargin = a1.e(f2);
                                                 if (!PatchProxy.applyVoid(null, obj, uoe1, "74")) {
                                                    layoutParams1 = obj.I.getLayoutParams();
                                                    i7 = (obj.r.isGameLiveStreamNewVersion2Enabled())? a1.e(107.00f): a1.e(110.00f);
                                                    layoutParams1.leftMargin = i7;
                                                    obj.V.getLayoutParams().height = (obj.r.isGzoneHidePhotoList())? -2: og1;
                                                    layoutParams1 = obj.D.getLayoutParams();
                                                    float f3 = (obj.r.isGameLiveStreamNewVersion2Enabled())? 14.00f: 23.00f;
                                                    layoutParams1.topMargin = a1.e(f3);
                                                    layoutParams1 = obj.F.getLayoutParams();
                                                    i2 = (obj.r.isGameLiveStreamNewVersion2Enabled())? a1.e(20.00f): a1.e(f);
                                                    layoutParams1.topMargin = i2;
                                                    layoutParams1 = obj.F.getLayoutParams();
                                                    i2 = (obj.r.isGameLiveStreamNewVersion2Enabled())? a1.e(0x3f800000): a1.e(5.00f);
                                                    layoutParams1.leftMargin = - i2;
                                                 }
                                              }
                                           }
                                        }
                                     }else {
                                        patchProxyRe2 = patchProxyRe1;
                                        uoe1 = uoe2;
                                     }
                                     i4 = 8;
                                     goto label_065c ;
                                  }
                               }
                            }
                         }else {
                            uoe2 = uoe;
                         }
                         if (mProfile.mSameFollow == null && (TextUtils.x(mProfile.mProfile.mText) && TextUtils.x(str4))) {
                            view.setVisibility(8);
                            str = null;
                            goto label_0232 ;
                         }else {
                            goto label_0219 ;
                         }
                      }
                   }
                }
                i4 = 8;
                goto label_02b6 ;
             }
             if (!obj.r.isTopFollowLayoutInRecyclerViewHeader()) {
                obj.V.addOnScrollListener(new g1(obj));
             }
             if (obj.n9(obj.r.getUserProfile()) && (!a.d() || obj.m9())) {
                if (objArray1 != null) {
                   obj.Z.s1(0, objArray1);
                   if (!obj.r.shouldHideLoading()) {
                      LoadingView loadingView = obj.a9();
                      obj.Y0 = loadingView;
                      int i = 1;
                      obj.Z.s1(i, loadingView);
                      obj.c1 = i;
                      i1 = 2;
                   }else {
                      i1 = 1;
                   }
                   obj.Z.p0(0, i1);
                }else {
                   str = null;
                }
                obj.V.post(new s0(obj));
             }else {
                i2 = 0;
                if (objArray1 != null) {
                   obj.Z.s1(i2, objArray1);
                   view = obj.Z8(0x3f000000);
                   obj.y1 = view;
                   obj.Z.s1(1, view);
                   view = obj.b9();
                   obj.Z0 = view;
                   obj.Z.s1(2, view);
                   obj.Z.p0(i2, 3);
                }
             }
             uoc = this;
          }
          if (uoc.d.r.isGzoneAuthorAuthenticationTagEnabled()) {
             obj = uoc.d;
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoid(null, obj, uoe1, "5")) {
                obj.X7(c.a().g(obj.r.getUserProfile().mProfile.mId).map(new e()).map(d.b).subscribe(new c(obj), Functions.d()));
             }
          }
          if (uoc.d.r.getOriginUserAssType() == LiveApiParams$AssistantType.PUSHER) {
             RxBus.f.b(new f(uoc.c, uoc.d.r.getOriginUserAssType().ordinal()));
          }
          if (QCurrentUser.me().isLogined() && !(uoc.d.r.getUserProfile().mProfile.mId).equals(QCurrentUser.me().getId())) {
             obj = uoc.d;
             if (obj.d1 != null) {
                obj.x9(1);
             }else {
                obj.x9(0);
             }
          }
       }
       return;
    }
}
