package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt;
import android.view.ViewGroup;
import java.lang.String;
import ls1.d;
import java.util.List;
import yr1.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.view.View;
import android.content.Context;
import i2b.a;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import msd.l;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$2;
import android.widget.TextView;
import d61.f0;
import java.lang.Integer;
import java.lang.CharSequence;
import java.util.ArrayList;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.Drawable;
import com.kwai.framework.model.user.UserInfo;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import wb5.g;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import th0.o;
import android.animation.TimeInterpolator;
import th0.q;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.anim.LiveMultiLinePuzzleAnswerAnimKt$a;
import android.animation.Animator$AnimatorListener;
import yr1.a;
import android.text.SpannableString;
import kotlin.text.StringsKt__StringsKt;
import android.text.style.ForegroundColorSpan;
import com.yxcorp.gifshow.util.span.CustomTypefaceSpan;
import android.graphics.Typeface;
import ekd.d0;
import android.text.style.AbsoluteSizeSpan;

public final class LiveMultiLinePuzzleAnswerAnimKt	// class@0015a4
{

    public static final c a(ViewGroup p0,String p1,String p2,d p3,List p4){
       String obj;
       View view2;
       int i4;
       PropertyValuesHolder[] obj1;
       int i5;
       ObjectAnimator objectAnimat;
       int i7;
       float f;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMultiLinePuzzleAnswerAnimKt liveMultiLin = LiveMultiLinePuzzleAnswerAnimKt.class;
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       int i3 = 3;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          obj = PatchProxy.apply(objArray, null, liveMultiLin, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a.p(oobject, "container");
       a.p(oobject1, "answererName");
       a.p(oobject2, "answerId");
       a.p(oobject3, "resourceManager");
       a.p(oobject4, "users");
       String str = oobject2+".png";
       obj = "answer_correct_anim_title";
       if (!oobject3.c(str, obj)) {
          return null;
       }else {
          View view = PatchProxy.applyOneRefs(oobject, null, liveMultiLin, "3");
          if (view != patchProxyRe) {
          }else {
             view = oobject.findViewById(R.id.live_multi_line_puzzle_answer_anim_container);
             if (view == null) {
                view2 = a.c(p0.getContext(), R.layout.arg_RES_7f0d0cb4, null);
                a.o(view2, "KwaiLayoutInflater.infla¡­wer_anim_view, null\n    \)");
                FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(a1.e(180.00f), a1.e(228.00f));
                layoutParams1.gravity = 17;
                oobject.addView(view2, layoutParams1);
                view = view2;
             }
             view.setVisibility(8);
          }
          View view1 = view.findViewById(R.id.anim_background);
          a.o(view1, "animView.findViewById\(R.id.anim_background\)");
          view2 = view.findViewById(R.id.anim_title);
          a.o(view2, "animView.findViewById\(R.id.anim_title\)");
          oobject3.a(view1, "answer_correct_anim_bg_v2.png", null, LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$1.INSTANCE);
          oobject3.a(view2, str, obj, LiveMultiLinePuzzleAnswerAnimKt$createPuzzleAnswerAnim$2.INSTANCE);
          str = 0x7f06038b;
          if (!PatchProxy.applyVoidTwoRefs(view, oobject1, null, liveMultiLin, "4")) {
             view1 = view.findViewById(R.id.anim_top_title);
             a.o(view1, "animView.findViewById\(R.id.anim_top_title\)");
             String str2 = f0.c(oobject1, i3);
             a.o(str2, "username");
             view1.setText(LiveMultiLinePuzzleAnswerAnimKt.b(R.string.arg_RES_7f102ae6, str2, str, null, null));
          }
          if (!PatchProxy.applyVoidTwoRefs(view, oobject4, null, liveMultiLin, "5")) {
             view1 = view.findViewById(R.id.anim_avatar_1);
             a.o(view1, "view.findViewById\(R.id.anim_avatar_1\)");
             View view3 = view.findViewById(R.id.anim_avatar_2);
             a.o(view3, "view.findViewById\(R.id.anim_avatar_2\)");
             View view4 = view.findViewById(R.id.anim_avatar_3);
             a.o(view4, "view.findViewById\(R.id.anim_avatar_3\)");
             View view5 = view.findViewById(R.id.anim_avatar_4);
             a.o(view5, "view.findViewById\(R.id.anim_avatar_4\)");
             view2 = view.findViewById(R.id.anim_avatar_4_container);
             a.o(view2, "view.findViewById\(R.id.anim_avatar_4_container\)");
             View view6 = view.findViewById(R.id.anim_avatar_4_num);
             a.o(view6, "view.findViewById\(R.id.anim_avatar_4_num\)");
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(view1);
             uArrayList.add(view3);
             uArrayList.add(view4);
             uArrayList.add(view5);
             int i8 = p4.size();
             i4 = (i8 < 4)? 8: 0;
             view2.setVisibility(i4);
             if (i8 > 4) {
                PaintDrawable paintDrawabl = new PaintDrawable(a1.a(0x7f062046));
                paintDrawabl.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07042c));
                view5.setForegroundDrawable(paintDrawabl);
                view6.setVisibility(0);
                view6.setText('+'+(i8 - 3));
             }else {
                view5.setForegroundDrawable(null);
                view6.setVisibility(8);
             }
             i4 = uArrayList.size();
             i7 = 0;
             while (i7 < i4) {
                UserInfo userInfo = (i7 < i8)? oobject4.get(i7): null;
                String str1 = "avatars[i]";
                if (userInfo != null) {
                   Object obj2 = uArrayList.get(i7);
                   a.o(obj2, str1);
                   obj2.setVisibility(0);
                   g.d(uArrayList.get(i7), userInfo, HeadImageSize.SMALL);
                }else {
                   Object obj3 = uArrayList.get(i7);
                   a.o(obj3, str1);
                   obj3.setVisibility(8);
                }
                i7 = i7 + 1;
             }
          }
          view1 = view.findViewById(R.id.anim_bottom_info);
          a.o(view1, "animView.findViewById\(R.id.anim_bottom_info\)");
          i4 = p4.size();
          if (!PatchProxy.isSupport(liveMultiLin) || !PatchProxy.applyVoidTwoRefs(view1, Integer.valueOf(i4), null, liveMultiLin, "6")) {
             if (i4 > 0) {
                i7 = a1.e(17.00f);
                f = 12.00f;
                i5 = a1.e(13.00f);
             }else {
                i7 = a1.e(28.00f);
                f = 14.00f;
                i5 = a1.e(16.00f);
             }
             ViewGroup$LayoutParams layoutParams = view1.getLayoutParams();
             Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
             layoutParams.bottomMargin = i7;
             view1.setTextSize(1, f);
             view1.setText(LiveMultiLinePuzzleAnswerAnimKt.b(R.string.arg_RES_7f102ae7, String.valueOf(i4), str, "alte-din.ttf", Integer.valueOf(i5)));
          }
          AnimatorSet uAnimatorSet = PatchProxy.applyTwoRefs(view, view1, null, liveMultiLin, "7");
          str = "it";
          if (uAnimatorSet != patchProxyRe) {
             obj1 = view;
             i5 = 1;
          }else {
             uAnimatorSet = new AnimatorSet();
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3e99999a,0x3fa66666}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3e99999a,0x3fa66666})};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValu1);
             a.o(objectAnimat1, str);
             objectAnimat1.setDuration(260);
             a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­    it.duration = 260\n  }");
             obj1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3fa66666,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3fa66666,0x3f800000})};
             ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(view, obj1);
             a.o(objectAnimat2, str);
             obj1 = view;
             objectAnimat2.setDuration(140);
             a.o(objectAnimat2, "ObjectAnimator.ofPropert¡­    it.duration = 140\n  }");
             AnimatorSet uAnimatorSet2 = new AnimatorSet();
             Animator[] uAnimatorArr1 = new Animator[]{objectAnimat1,objectAnimat2};
             uAnimatorSet2.playSequentially(uAnimatorArr1);
             uAnimatorSet2.setInterpolator(new o());
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[2]{0x43a00000,0}),PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f000000,0x3f800000}),PropertyValuesHolder.ofFloat(View.ROTATION_Y, new float[2]{0xc3340000,0})};
             objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(obj1, propertyValu2);
             a.o(objectAnimat1, str);
             objectAnimat1.setDuration(400);
             objectAnimat1.setInterpolator(new q());
             a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­EaseOutInterpolator\(\)\n  }");
             propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000})};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(view1, propertyValu1);
             a.o(objectAnimat, str);
             objectAnimat.setDuration(300);
             objectAnimat.setStartDelay(100);
             a.o(objectAnimat, "ObjectAnimator.ofPropert¡­  it.startDelay = 100\n  }");
             Animator[] uAnimatorArr2 = new Animator[]{uAnimatorSet2,objectAnimat1,objectAnimat};
             i5 = 1;
             uAnimatorSet.playTogether(uAnimatorArr2);
          }
          objectAnimat = PatchProxy.applyOneRefs(obj1, null, liveMultiLin, "8");
          if (objectAnimat != patchProxyRe) {
          }else {
             float[] uofloatArray = new float[i5];
             uofloatArray[0] = 0x42a00000;
             int i6 = 2;
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i6];
             propertyValu[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray);
             propertyValu[i5] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[i6]{0x3f800000,0});
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(obj1, propertyValu);
             a.o(objectAnimat, str);
             objectAnimat.setStartDelay(3000);
             objectAnimat.setDuration(200);
             objectAnimat.setInterpolator(new o());
             a.o(objectAnimat, "ObjectAnimator.ofPropert¡­eEaseInInterpolator\(\)\n  }");
          }
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[]{uAnimatorSet,objectAnimat};
          uAnimatorSet1.playSequentially(uAnimatorArr);
          uAnimatorSet1.addListener(new LiveMultiLinePuzzleAnswerAnimKt$a(uAnimatorSet, objectAnimat, obj1));
          return new a(uAnimatorSet1);
       }
    }
    public static final CharSequence b(int p0,String p1,int p2,String p3,Integer p4){
       LiveMultiLinePuzzleAnswerAnimKt liveMultiLin = LiveMultiLinePuzzleAnswerAnimKt.class;
       if (PatchProxy.isSupport(liveMultiLin)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),p3,p4};
          Object obj = PatchProxy.apply(objArray, null, liveMultiLin, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = a1.r(p0, p1);
       SpannableString spannableStr = new SpannableString(str);
       a.o(str, "text");
       int i = StringsKt__StringsKt.i3(str, p1, 0, false, 6, null);
       int i1 = p1.length() + i;
       spannableStr.setSpan(new ForegroundColorSpan(a1.a(p2)), i, i1, 33);
       if (p3 != null) {
          spannableStr.setSpan(new CustomTypefaceSpan("", d0.a(p3, a1.c())), i, i1, 33);
       }
       if (p4 != null) {
          spannableStr.setSpan(new AbsoluteSizeSpan(p4.intValue()), i, i1, 33);
       }
       return spannableStr;
    }
}
