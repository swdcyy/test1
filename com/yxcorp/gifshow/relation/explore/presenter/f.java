package com.yxcorp.gifshow.relation.explore.presenter.f;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import fac.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.widget.TextView;
import ekd.m1;
import java.lang.Integer;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import java.lang.Float;
import lnc.a1;
import eg.a;
import fac.b;
import fac.c;
import com.kwai.framework.model.user.RecoUser;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import hac.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import f7c.c;
import a7c.h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$l;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View$OnClickListener;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.User;
import wb5.g;
import crd.b;
import hac.v;
import java.util.concurrent.Callable;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import hac.z;
import erd.g;
import com.yxcorp.utility.n;
import lu7.i;
import android.text.SpannableStringBuilder;
import com.kwai.framework.model.user.RichTextMeta;
import android.view.ViewStub;
import com.kwai.user.base.RichTextMetaExt;
import brd.a0;
import java.util.Collection;
import ekd.q;
import lu7.b;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.framework.model.user.RichTextMeta$Param;
import java.lang.Iterable;
import lu7.a;
import ok.h;
import erd.o;
import com.kwai.user.base.a;
import erd.c;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.relation.explore.presenter.b;
import hac.t;
import c7c.x;
import hac.x;
import hac.y;
import android.graphics.drawable.Drawable;
import zf6.j;
import lnc.b3;
import android.text.SpannableString;
import hac.u;
import java.lang.Runnable;
import cw9.c;
import android.widget.LinearLayout$LayoutParams;
import java.lang.StringBuilder;
import java.lang.Number;

public class f	// class@001824
{

    public void f(){
       super();
    }
    public static void a(Context p0,View p1,boolean p2,boolean p3,d p4){
       RelativeLayout$LayoutParams layoutParams;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       f uof = f.class;
       RelativeLayout$LayoutParams obj = null;
       int i = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),Boolean.valueOf(p3),oobject2};
          if (PatchProxy.applyVoid(objArray, obj, uof, "23")) {
             return;
          }
       }
       View view = oobject1.findViewById(0x7f0a3049);
       TextView textView = oobject1.findViewById(R.id.name);
       int i1 = 0x7f0a355d;
       View view1 = oobject1.findViewById(i1);
       int i2 = 0x7f0a0333;
       View view2 = m1.f(oobject1, i2);
       if (view2 == null) {
          view2 = m1.f(oobject1, i2);
       }
       View view3 = view2;
       View view4 = m1.f(oobject1, R.id.pymk_live_anim_ring);
       View view5 = m1.f(oobject1, R.id.tag_layout);
       View view6 = m1.f(oobject1, i1);
       view.setTag(R.id.tag_view_refere, Integer.valueOf(85));
       if (!PatchProxy.applyVoidTwoRefs(textView, oobject2, obj, uof, "24")) {
          RelativeLayout$LayoutParams layoutParams2 = textView.getLayoutParams();
          layoutParams2.topMargin = (int)(oobject2.g * a.b().getResources().getDimension(0x7f0700c9));
          i2 = (int)a.b().getResources().getDimension(0x7f0700cb);
          int i4 = 0x7f0700c8;
          if (oobject2.e != null) {
             if (oobject2.j != null) {
                layoutParams2.topMargin = (int)(oobject2.g * a.b().getResources().getDimension(i4));
                i2 = (int)a.b().getResources().getDimension(0x7f0700cd);
             }
          }else {
             i2 = (int)(oobject2.i * (float)i2);
             layoutParams2.height = (int)(oobject2.g * a.b().getResources().getDimension(i4)) + i2;
          }
          textView.setTextSize(i, (float)i2);
          textView.setLayoutParams(layoutParams2);
       }
       d g = oobject2.g;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(view6, Float.valueOf(g), null, uof, "25")) {
          obj = view6.getLayoutParams();
          obj.leftMargin = (int)((float)a1.d(0x7f0700cc) * g);
          obj.rightMargin = (int)((float)a1.d(0x7f0700cc) * g);
          view6.setLayoutParams(obj);
       }
       if (!p2) {
          if (!PatchProxy.applyVoidFourRefs(view1, view3, view4, p4, null, f.class, "29")) {
             f.f(view3, view4, oobject2);
             layoutParams = view1.getLayoutParams();
             layoutParams.topMargin = (int)(oobject2.g * a.b().getResources().getDimension(0x7f0700d8));
             view1.setLayoutParams(layoutParams);
          }
          if (!p3) {
             i = 8;
          }
          f.j(view5, i, oobject, oobject2);
          f.g(view, 8, oobject2);
       }else if(PatchProxy.applyVoidOneRefs(view1, null, uof, "31")){
          layoutParams = view1.getLayoutParams();
          layoutParams.topMargin = i;
          view1.setLayoutParams(layoutParams);
       }
       if (p3) {
          f.f(view3, view4, oobject2);
          f.j(view5, i, oobject, oobject2);
       }else if(PatchProxy.applyVoidThreeRefs(view3, view4, p4, null, f.class, "27")){
          RelativeLayout$LayoutParams layoutParams1 = view3.getLayoutParams();
          layoutParams1.topMargin = a.c(((float)oobject2.a * oobject2.g), a.b().getResources());
          int i3 = a.c(((float)oobject2.b * oobject2.g), a.b().getResources());
          layoutParams1.width = i3;
          layoutParams1.height = i3;
          f.h(view4, i3, layoutParams1.topMargin, oobject2.g);
          view3.setLayoutParams(layoutParams1);
       }
       f.j(view5, 8, oobject, oobject2);
       f.g(view, i, oobject2);
       return;
    }
    public static void b(CustomRecyclerView p0,b p1,c p2,RecoUser p3,Context p4){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, null, uof, "32")) {
             return;
          }
       }
       if (p0.getAdapter() == null) {
          o oo = new o(oobject1.b, oobject1.a, p3, p2, oobject1.e, oobject1.i, oobject1.j);
          p0.setLayoutManager(new LinearLayoutManager(oobject4, 0, 0));
          if (!p0.getItemDecorationCount()) {
             p0.addItemDecoration(new b(0, 0, 0, (int)((float)a1.d(R.dimen.arg_RES_7f0702e3) * p2.e())));
          }
          p0.setHasFixedSize(1);
          p0.setItemAnimator(null);
          p0.setNestedScrollingEnabled(0);
          p0.setDisableScroll(1);
          p0.setAdapter(v14);
       }else {
          o adapter = p0.getAdapter();
          adapter.j = oobject2;
          adapter.J0(oobject3);
       }
       return;
    }
    public static boolean c(UserExtraInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       int i = (TextUtils.n("M", p0.mSex) || TextUtils.n("F", p0.mSex))? 1: 0;
       int i1 = TextUtils.x(p0.mAge) ^ 1;
       int i2 = TextUtils.x(p0.mCityName) ^ 1;
       if (!i && (i1 || i2)) {
          b = true;
       }
       return b;
    }
    public static List d(RecoUser p0,ViewGroup p1,View$OnClickListener p2,boolean p3,d p4){
       TextView obj1;
       TextView textView4;
       TextView textView5;
       RecoUser mUser;
       View view2;
       TextView textView6;
       ArrayList uArrayList1;
       TextView textView7;
       TextView textView8;
       TextView textView9;
       ArrayList uArrayList2;
       View[] viewArray;
       int i6;
       int i7;
       a0 uoa0;
       int i8;
       int i9;
       View[] viewArray1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       int i = 4;
       int i1 = 5;
       int i2 = 3;
       int i3 = 2;
       int i4 = 1;
       int i5 = 0;
       RecoUser obj = null;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[i1];
          objArray[i5] = oobject;
          objArray[i4] = oobject1;
          objArray[i3] = oobject2;
          objArray[i2] = Boolean.valueOf(p3);
          objArray[i] = oobject3;
          obj1 = PatchProxy.apply(objArray, obj, uof, "2");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       ArrayList uArrayList = new ArrayList();
       if (oobject == null || oobject.mUser == null) {
          return uArrayList;
       }else {
          KwaiImageView kwaiImageVie = m1.f(oobject1, R.id.avatar);
          m1.a(oobject1, oobject2, R.id.avatar);
          View view = m1.f(oobject1, 0x7f0a2d10);
          m1.a(oobject1, oobject2, R.id.name);
          m1.a(oobject1, oobject2, R.id.tag_layout);
          obj1 = m1.f(oobject1, R.id.tag_address);
          TextView textView = m1.f(oobject1, R.id.tag_age);
          TextView textView1 = m1.f(oobject1, R.id.tag_sex);
          TextView textView2 = m1.f(oobject1, R.id.text);
          ImageView imageView = m1.f(oobject1, R.id.vip_badge);
          TextView textView3 = m1.f(oobject1, R.id.pymk_live_tip_text);
          View view1 = m1.f(oobject1, R.id.pymk_live_anim_ring);
          if (kwaiImageVie != null) {
             obj = oobject.mUser;
             textView4 = obj1;
             textView5 = textView;
             if (!PatchProxy.applyVoidTwoRefs(kwaiImageVie, obj, null, uof, "13")) {
                g.b(kwaiImageVie, obj, HeadImageSize.ADJUST_BIG);
             }
          }else {
             textView4 = obj1;
             textView5 = textView;
          }
          if (view != null) {
             mUser = oobject.mUser;
             b uob = PatchProxy.applyTwoRefs(view, mUser, null, uof, "16");
             if (uob != patchProxyRe) {
             label_00c9 :
                view2 = null;
             }else if(mUser.mIsHiddenUser != null){
                uob = t.fromCallable(new v(view, mUser)).subscribe();
                goto label_00c9 ;
             }else {
                view2 = null;
                uob = PatchProxy.applyTwoRefs(view, mUser, view2, uof, "17");
                if (uob != patchProxyRe) {
                }else {
                   view.setText(mUser.mName);
                   uob = mUser.observable().subscribe(new z(mUser, view));
                }
             }
             uArrayList.add(uob);
          }else {
             view2 = null;
          }
          if (imageView != null && (textView3 != null && view1 != null)) {
             textView6 = textView4;
             uArrayList1 = uArrayList;
             textView7 = textView2;
             textView8 = textView5;
             i = 1;
             textView9 = textView1;
             if (PatchProxy.applyVoidFourRefs(p0, imageView, textView3, view1, null, f.class, "12")) {
                mUser = 2;
                i3 = 8;
             }else if(oobject.mUser.mIsLiving != null){
                viewArray = new View[i];
                i7 = 0;
                viewArray[i7] = imageView;
                i3 = 8;
                n.Z(i3, viewArray);
                i6 = 2;
                viewArray1 = new View[i6];
                viewArray1[i7] = textView3;
                viewArray1[i] = view1;
                n.Z(i7, viewArray1);
             }else {
                i6 = 2;
                i7 = 0;
                i3 = 8;
                viewArray1 = new View[i6];
                viewArray1[i7] = textView3;
                viewArray1[i] = view1;
                n.Z(i3, viewArray1);
                i.d(imageView, oobject.mUser, i7);
             }
          }else {
             textView9 = textView1;
             textView7 = textView2;
             textView6 = textView4;
             textView8 = textView5;
             mUser = 2;
             i3 = 8;
             i = 1;
             uArrayList1 = uArrayList;
          }
          if (oobject3.e != null) {
             f.i(oobject, textView6, textView8, textView9, oobject3);
          }else {
             TextView textView10 = textView6;
             textView = textView8;
             TextView textView11 = textView9;
             if (PatchProxy.isSupport(uof)) {
                Object[] objArray1 = new Object[]{oobject,textView10,textView,textView11,oobject3};
                if (!PatchProxy.applyVoid(objArray1, null, uof, "18")) {
                }
             }else {
             }
          }
       label_01ff :
          if (p3) {
             i1 = 0x7f0a3556;
             m1.a(oobject1, oobject2, i1);
             RecoUser mUser1 = oobject.mUser;
             i2 = 8;
             if (PatchProxy.applyVoidFourRefs(p1, mUser1, uArrayList1, p4, null, f.class, "3")) {
                uArrayList2 = uArrayList1;
             }else {
                View view3 = m1.f(oobject1, i1);
                User mExtraInfo = mUser1.mExtraInfo;
                if (mExtraInfo != null) {
                   UserExtraInfo mRecoTextInf = mExtraInfo.mRecoTextInfo;
                   if (mRecoTextInf != null && !TextUtils.x(mRecoTextInf.mRawText)) {
                      if (oobject3.e == null) {
                         i6 = (int)((float)a1.d(0x7f07025d) * oobject3.g);
                         if (PatchProxy.isSupport(uof) && (!PatchProxy.applyVoidTwoRefs(view3, Integer.valueOf(i6), null, uof, "8") && view3.getPaddingEnd() != i6)) {
                            view3.setPadding(view3.getPaddingStart(), view3.getPaddingTop(), i6, view3.getPaddingBottom());
                         }
                      }
                      View view4 = m1.f(oobject1, 0x7f0a3560);
                      view = m1.f(oobject1, 0x7f0a3550);
                      KwaiImageView[] kwaiImageVie1 = new KwaiImageView[3];
                      viewArray = new View[i];
                      viewArray[0] = view3;
                      n.Z(0, viewArray);
                      mRecoTextInf = mUser1.mExtraInfo.mRecoTextInfo;
                      i7 = a1.a(oobject3.d);
                      if (PatchProxy.isSupport(RichTextMetaExt.class)) {
                         uoa0 = PatchProxy.applyThreeRefs(mRecoTextInf, null, Integer.valueOf(i7), null, RichTextMetaExt.class, "12");
                         if (uoa0 != patchProxyRe) {
                         }else if(mRecoTextInf == null || TextUtils.x(mRecoTextInf.mRawText)){
                            uoa0 = a0.B(new SpannableStringBuilder());
                         }else if(q.f(mRecoTextInf.mParamList)){
                            uoa0 = a0.B(new SpannableStringBuilder(mRecoTextInf.mRawText));
                         }else {
                            uArrayList = new ArrayList();
                            RichTextMeta mRawText = mRecoTextInf.mRawText;
                            Collections.sort(mRecoTextInf.mParamList, new b(mRecoTextInf));
                            i4 = 0;
                            while (i4 < mRecoTextInf.mParamList.size()) {
                               RichTextMeta$Param param = mRecoTextInf.mParamList.get(i4);
                               if (param != null && !TextUtils.x(param.mKeyName)) {
                                  i = mRawText.indexOf(param.mKeyName);
                                  if (i >= 0) {
                                     if (!i) {
                                        uArrayList.add(param);
                                     }
                                     if (i > 0) {
                                        RichTextMeta$Param param1 = new RichTextMeta$Param();
                                        param1.mTextValue = mRawText.substring(0, i);
                                        uArrayList.add(param1);
                                        uArrayList.add(param);
                                     }
                                     i = i + (param.mKeyName).length();
                                     mRawText = (i > 0 && mRawText.length() > i)? mRawText.substring(i): "";
                                     i8 = mRecoTextInf.mParamList.size() - 1;
                                     if (i4 == i8) {
                                        RichTextMeta$Param param2 = new RichTextMeta$Param();
                                        param2.mTextValue = mRawText;
                                        uArrayList.add(param2);
                                     }
                                  }
                               }
                               i4 = i4 + 1;
                               i8 = p1;
                            }
                            uoa0 = (q.f(uArrayList))? a0.B(new SpannableStringBuilder(mRecoTextInf.mRawText)): t.fromIterable(uArrayList).concatMap(new a(null, i7)).scan(new SpannableStringBuilder(), a.a).last(new SpannableStringBuilder());
                         }
                      }else {
                         goto label_02bb ;
                      }
                      b uob1 = new b(view3, mUser1, p4, view, p1, kwaiImageVie1, view4, uArrayList1);
                      uArrayList2 = uArrayList1;
                      uArrayList2.add(uoa0.G(d.a).R(i, new t(view3)));
                   }
                }
                uArrayList2 = uArrayList1;
                viewArray = new View[i];
                viewArray[0] = view3;
                n.Z(i2, viewArray);
             }
          }else {
             uArrayList2 = uArrayList1;
             if (textView7 != null) {
                mUser = oobject.mUser;
                textView2 = textView7;
                b uob2 = PatchProxy.applyTwoRefs(textView2, mUser, null, uof, "14");
                if (uob2 != patchProxyRe) {
                }else {
                   User mExtraInfo1 = mUser.mExtraInfo;
                   uob2 = x.P8(mUser, mExtraInfo1).R(new x(textView2), new y(textView2, mExtraInfo1));
                }
                uArrayList2.add(uob2);
             }
          }
          return uArrayList2;
       }
    }
    public static void e(View p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uof, "9")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.height != p1) {
          layoutParams.height = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public static void f(View p0,View p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "26")) {
          return;
       }
       int i = a.c(((float)p2.a * p2.g), a.b().getResources());
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       int i1 = a.c(((float)p2.b * p2.g), a.b().getResources());
       layoutParams.width = i1;
       layoutParams.height = i1;
       layoutParams.topMargin = i;
       f.h(p1, i1, i, p2.g);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public static void g(View p0,int p1,d p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, f.class, "30")) {
          return;
       }
       p0.setVisibility(p1);
       if (p1 == 8) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.bottomMargin = a1.e(((float)p2.c * p2.g));
       layoutParams.leftMargin = (int)((float)a1.d(0x7f0700cc) * p2.g);
       layoutParams.rightMargin = (int)((float)a1.d(0x7f0700cc) * p2.g);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public static void h(View p0,int p1,int p2,float p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Float.valueOf(p3), null, f.class, "33")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       int i = a.c((p3 * 8.00f), a.b().getResources());
       p1 = p1 + i;
       layoutParams.width = p1;
       layoutParams.height = p1;
       layoutParams.topMargin = p2 - (i / 2);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public static void i(RecoUser p0,TextView p1,TextView p2,TextView p3,d p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uof, "19")) {
             return;
          }
       }
       User mExtraInfo = p0.mUser.mExtraInfo;
       if (mExtraInfo == null) {
          return;
       }else if(p3 != null){
          if (TextUtils.n("M", mExtraInfo.mSex) || TextUtils.n("F", mExtraInfo.mSex)) {
             p3.setVisibility(0);
             p3.setText(f.l(p0.mUser, 1, mExtraInfo, p4));
          }else if(!TextUtils.x(mExtraInfo.mAge)){
             p3.setVisibility(0);
             p3.setText(mExtraInfo.mAge);
          }else {
             p3.setVisibility(8);
          }
       }
       ArrayList uArrayList = new ArrayList();
       int i = TextUtils.x(mExtraInfo.mCityName) ^ 1;
       if (i) {
          uArrayList.add(mExtraInfo.mCityName);
       }
       if (!TextUtils.x(mExtraInfo.mSchoolName)) {
          uArrayList.add(mExtraInfo.mSchoolName);
       }
       UserExtraInfo mPhotoOrLivi = mExtraInfo.mPhotoOrLivingInfo;
       if (mPhotoOrLivi != null && !TextUtils.x(mPhotoOrLivi.mRawText)) {
          uArrayList.add(mExtraInfo.mPhotoOrLivingInfo.mRawText);
       }
       if (p2 != null) {
          if (!q.f(uArrayList)) {
             String str = uArrayList.get(0);
             p2.setVisibility(0);
             if (i) {
                SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                b3 uob3 = new b3(a.b(), j.n(a.b(), 0x7f080543, p4.d));
                uob3.b(1);
                spannableStr.append(uob3.a());
                SpannableStringBuilder spannableStr1 = spannableStr;
                spannableStr1 = spannableStr1.append(" ");
                spannableStr1.append(uArrayList.get(0));
                p2.setText(spannableStr1);
                str = spannableStr1.toString();
             }else {
                p2.setText(uArrayList.get(0));
             }
             p2.post(new u(p2, str, p1));
             uArrayList.remove(0);
          }else {
             p2.setVisibility(8);
          }
       }
       if (p1 != null) {
          if (!q.f(uArrayList)) {
             p1.setVisibility(0);
             p1.setText(uArrayList.get(0));
          }else {
             p1.setVisibility(8);
          }
       }
       return;
    }
    public static void j(View p0,int p1,Context p2,d p3){
       float f;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, f.class, "28")) {
          return;
       }
       int i = 8;
       if (p1 == i || p3.e != null) {
          p0.setVisibility(p1);
          return;
       }else {
          RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
          TextView textView = p0.findViewById(R.id.tag_sex);
          TextView textView1 = p0.findViewById(R.id.tag_age);
          TextView textView2 = p0.findViewById(R.id.tag_address);
          if (layoutParams.width >= (p3.f + (c.b(p2.getResources(), 0x7f0700d4) * 2))) {
             textView2.setVisibility(i);
          }
          layoutParams.height = (int)(p3.g * (float)c.b(p2.getResources(), 0x7f0700cf));
          layoutParams.topMargin = (int)(p3.g * (float)c.b(p2.getResources(), 0x7f0700d2));
          int i1 = (int)(p3.g * (float)c.b(p2.getResources(), 0x7f0700d5));
          int i2 = (int)(p3.g * (float)c.b(p2.getResources(), 0x7f0700d3));
          int i3 = (int)(p3.g * (float)c.b(p2.getResources(), 0x7f0700d4));
          f = (float)(int)(p3.i * (float)c.b(p2.getResources(), 0x7f0700d6));
          textView.setTextSize(0, f);
          textView1.setTextSize(0, f);
          textView2.setTextSize(0, f);
          textView.setPadding(i3, i1, i3, i2);
          textView1.setPadding(i3, i1, i3, i2);
          textView2.setPadding(i3, i1, i3, i2);
          i3 = (int)(p3.g * (float)a1.d(0x7f0700d0));
          LinearLayout$LayoutParams layoutParams1 = textView1.getLayoutParams();
          layoutParams1.rightMargin = i3;
          textView1.setLayoutParams(layoutParams1);
          layoutParams1 = textView.getLayoutParams();
          layoutParams1.rightMargin = i3;
          textView.setLayoutParams(layoutParams1);
          p0.setLayoutParams(layoutParams);
          p0.setVisibility(p1);
          return;
       }
    }
    public static void k(TextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "15")) {
          return;
       }
       if (TextUtils.x(p1)) {
          p0.setText("");
          p0.setVisibility(4);
       }else {
          p0.setVisibility(0);
          p0.setText("\""+p1+"\"");
       }
       return;
    }
    public static SpannableStringBuilder l(User p0,boolean p1,UserExtraInfo p2,d p3){
       User mSex;
       b3 obj1;
       Drawable uDrawable;
       UserExtraInfo mAge;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, p3, null, f.class, "20");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       int i = 0x7f081d8e;
       if (p3.e == true) {
          mSex = p0.mSex;
          obj1 = PatchProxy.applyOneRefs(mSex, null, uof, "21");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if("M".equals(mSex)){
             i = 0x7f082342;
          }else if("F".equals(mSex)){
             i = 0x7f08234b;
          }
          uDrawable = a1.f(i);
       }else {
          mSex = p0.mSex;
          Object obj2 = PatchProxy.applyOneRefs(mSex, null, uof, "22");
          if (obj2 != patchProxyRe) {
             i = obj2.intValue();
          }else if("M".equals(mSex)){
             i = 0x7f0821f5;
          }else if("F".equals(mSex)){
             i = 0x7f0821e7;
          }
          uDrawable = a1.f(i);
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       obj1 = new b3(a.b(), uDrawable);
       obj1.b(true);
       spannableStr.append(obj1.a());
       SpannableStringBuilder spannableStr1 = spannableStr;
       spannableStr1 = spannableStr1.append(" ");
       if (p1 && !TextUtils.x(p2.mAge)) {
          mAge = p2.mAge;
       }else if(p0.isMale()){
          mAge = a1.p(R.string.arg_RES_7f103196);
       }else if(p0.isFemale()){
          mAge = a1.p(R.string.arg_RES_7f100f40);
       }else {
          mAge = a1.p(R.string.arg_RES_7f10471f);
       }
       spannableStr1.append(mAge);
       return spannableStr1;
    }
}
