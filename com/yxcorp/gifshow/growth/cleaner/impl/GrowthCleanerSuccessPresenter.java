package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerSuccessPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerSuccessPresenter$onBind$1;
import fna.e0;
import msd.l;
import erd.g;
import crd.b;
import brd.t;
import ena.j;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import lnc.a1;
import fna.c0;
import java.util.Objects;
import fna.c0$a;
import java.util.ArrayList;
import fna.e;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.widget.LinearLayout;
import android.content.Context;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.lang.Integer;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import android.widget.ImageView;
import zf6.k;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import zsd.u;
import java.lang.StringBuilder;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import fna.d0;
import android.view.View$OnClickListener;
import qrd.l1;
import ena.j$a;
import io.reactivex.subjects.PublishSubject;

public final class GrowthCleanerSuccessPresenter extends PresenterV2	// class@001341
{
    public PublishSubject p;
    public j q;

    public void GrowthCleanerSuccessPresenter(){
       super();
    }
    public void E8(){
       c0$a a;
       View view;
       GrowthCleanerSuccessPresenter growthCleane1;
       j oj;
       PatchProxyResult patchProxyRe1;
       Activity uActivity;
       int i7;
       Iterator iterator1;
       Object[] objArray2;
       int i8;
       int i9;
       String str1;
       Object obj = this;
       GrowthCleanerSuccessPresenter growthCleane = GrowthCleanerSuccessPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, growthCleane, "3")) {
          return;
       }
       GrowthCleanerSuccessPresenter p = obj.p;
       if (p == null) {
          a.S("mCleanerEventSubject");
       }
       b uob = p.subscribe(new e0(new GrowthCleanerSuccessPresenter$onBind$1(obj)));
       if (uob != null) {
          obj.X7(uob);
       }
       p = obj.q;
       if (p != null) {
          j w = p.w;
          if (w != null) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoidOneRefs(w, obj, growthCleane, "5")) {
                Activity activity = this.getActivity();
                if (activity != null) {
                   a.o(activity, "activity ?: return");
                   int i = a1.e(80.00f);
                   int i1 = a1.e(4.00f);
                   a = c0.a;
                   Objects.requireNonNull(a);
                   ArrayList uArrayList = PatchProxy.apply(objArray, a, c0$a.class, "1");
                   if (uArrayList != patchProxyRe) {
                   }else {
                      uArrayList = new ArrayList();
                      e uoe = new e();
                      uoe.a = "今日热榜";
                      uoe.b = "为你推荐";
                      uoe.f = "kwai://rank/aggregation?type=1";
                      uoe.c = "8C6332";
                      uoe.d = 0x7f080cef;
                      uoe.g = "FFEBCA";
                      uoe.h = "FFFBF7";
                      uArrayList.add(uoe);
                      uoe = new e();
                      uoe.a = "拍一拍";
                      uoe.b = "发布作品";
                      uoe.f = "kwai://post";
                      uoe.c = "E4414D";
                      uoe.d = 0x7f080ced;
                      uoe.g = "FFD0C8";
                      uoe.h = "FFF3F2";
                      uArrayList.add(uoe);
                      uoe = new e();
                      uoe.a = "刷精选";
                      uoe.b = "精彩内容";
                      uoe.f = "kwai://featured";
                      uoe.c = "485189";
                      uoe.d = 0x7f080cee;
                      uoe.g = "D2DFFE";
                      uoe.h = "F4F7FF";
                      uArrayList.add(uoe);
                      uoe = new e();
                      uoe.a = "看发现";
                      uoe.b = "发现更多";
                      uoe.f = "kwai://home/hot";
                      uoe.c = "D3814B";
                      uoe.d = 0x7f080cf4;
                      uoe.g = "FDDBC5";
                      uoe.h = "FFF4ED";
                      uArrayList.add(uoe);
                   }
                   Iterator iterator = uArrayList.iterator();
                   int i2 = 0;
                   Object[] objArray1 = objArray;
                   int i3 = 0;
                   while (iterator.hasNext()) {
                      Object obj1 = iterator.next();
                      int i4 = i3 + 1;
                      if (i3 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      int i5 = i3 % 2;
                      int i6 = -1;
                      if (!i5) {
                         objArray1 = new LinearLayout(activity);
                         objArray1.setOrientation(i2);
                         objArray1.setLayoutParams(new LinearLayout$LayoutParams(i6, -2));
                         w.addView(objArray1);
                      }
                      if (objArray1 != null) {
                         String str = "#";
                         if (PatchProxy.isSupport(growthCleane)) {
                            view = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(i3), obj, growthCleane, "6");
                            if (view != patchProxyRe) {
                               growthCleane1 = growthCleane;
                               oj = w;
                               patchProxyRe1 = patchProxyRe;
                               uActivity = activity;
                               i7 = i1;
                               iterator1 = iterator;
                               objArray2 = objArray1;
                               i8 = i4;
                               patchProxyRe = null;
                               activity = null;
                            label_0289 :
                               LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, i);
                               layoutParams.weight = 0x3f800000;
                               if (!i5) {
                                  i9 = i7;
                                  layoutParams.setMarginEnd(i9);
                               }else {
                                  i9 = i7;
                                  if (i5 == 1) {
                                     layoutParams.setMarginStart(i9);
                                  }else {
                                     layoutParams.setMarginStart(i9);
                                     layoutParams.setMarginEnd(i9);
                                  }
                               }
                               layoutParams.topMargin = i9;
                               layoutParams.bottomMargin = i9;
                               view.setLayoutParams(layoutParams);
                               objArray1 = objArray2;
                               objArray1.addView(view);
                            }
                         }
                         view = a.a(this.getContext(), R.layout.arg_RES_7f0d0554);
                         TextView textView = m1.f(view, R.id.cleaner_success_item_title);
                         growthCleane1 = growthCleane;
                         TextView textView1 = m1.f(view, R.id.cleaner_success_item_desc);
                         oj = w;
                         ImageView imageView = m1.f(view, R.id.cleaner_success_item_icon);
                         boolean b = k.d();
                         patchProxyRe1 = patchProxyRe;
                         GradientDrawable gradientDraw = new GradientDrawable();
                         uActivity = activity;
                         gradientDraw.setShape(0);
                         iterator1 = iterator;
                         gradientDraw.setOrientation(GradientDrawable$Orientation.TL_BR);
                         gradientDraw.setGradientType(0);
                         int i10 = 2;
                         e g = obj1.g;
                         objArray2 = objArray1;
                         i8 = i4;
                         if (!u.q2(g, str, false, i10, null)) {
                            g = null;
                         }
                         if (g == null) {
                            g = '#'+obj1.g;
                         }
                         e h = obj1.h;
                         i7 = i1;
                         if (!u.q2(h, str, false, i10, null)) {
                            h = null;
                         }
                         if (h == null) {
                            str1 = '#'+obj1.h;
                         }
                         int[] ointArray = new int[i10];
                         ointArray[0] = Color.parseColor(g);
                         ointArray[1] = Color.parseColor(h);
                         gradientDraw.setColors(ointArray);
                         gradientDraw.setCornerRadius((float)a1.e(7.00f));
                         int i11 = (b)? 150: 255;
                         gradientDraw.setAlpha(i11);
                         view.setBackgroundDrawable(gradientDraw);
                         if (textView != null) {
                            textView.setText(obj1.a);
                         }
                         if (textView1 != null) {
                            textView1.setText(obj1.b);
                         }
                         h = obj1.c;
                         patchProxyRe = null;
                         if (!u.q2(h, str, false, i10, patchProxyRe)) {
                            str1 = patchProxyRe;
                         }
                         if (h == null) {
                            str1 = '#'+obj1.c;
                         }
                         if (textView1 != null) {
                            textView1.setTextColor(Color.parseColor(h));
                         }
                      label_0267 :
                         imageView.setBackgroundResource(obj1.d);
                         a.o(imageView, "icon");
                         float f = (b)? 0x3f4ccccd: 0x3f800000;
                         imageView.setAlpha(f);
                         view.setOnClickListener(new d0(obj, i3, obj1));
                         a.o(view, "container");
                         goto label_0289 ;
                      }else {
                         growthCleane1 = growthCleane;
                         oj = w;
                         patchProxyRe1 = patchProxyRe;
                         uActivity = activity;
                         i9 = i1;
                         iterator1 = iterator;
                         i8 = i4;
                         patchProxyRe = null;
                         activity = null;
                      }
                      i1 = i9;
                      growthCleane = growthCleane1;
                      w = oj;
                      patchProxyRe = patchProxyRe1;
                      activity = uActivity;
                      iterator = iterator1;
                      i3 = i8;
                      i2 = 0;
                   }
                }
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthCleanerSuccessPresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.q = j.y.a(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerSuccessPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("CLEANER_EVENT_SUBJECT");
       a.o(obj, "inject\(CLEANER_EVENT_SUBJECT\)");
       this.p = obj;
       return;
    }
}
