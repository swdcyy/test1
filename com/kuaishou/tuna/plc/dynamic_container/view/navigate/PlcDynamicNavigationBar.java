package com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$mSearchStatusChangeLnr$2;
import msd.a;
import qrd.p;
import qrd.s;
import ekd.i;
import android.view.View;
import a2.l;
import a2.j;
import p1.b;
import ekd.p1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.icon.KwaiIconView;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextPaint;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar;
import android.util.AttributeSet;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import com.kuaishou.tuna.plc.dynamic_container.util.PlcDynamicUtils;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import android.graphics.Color;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;
import com.yxcorp.utility.n;
import oy4.a;
import java.lang.Runnable;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import py4.b;
import lnc.a1;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.ViewSwitcher;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$mSearchStatusChangeLnr$2$a;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.search.PlcDynamicSearchBar$a;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Boolean;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$c;
import my4.c;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import my4.d;
import io.reactivex.internal.functions.Functions;
import erd.g;
import com.kuaishou.tuna.plc.dynamic_container.view.navigate.PlcDynamicNavigationBar$b;

public final class PlcDynamicNavigationBar extends LinearLayout	// class@00100f
{
    public View b;
    public final View c;
    public final KwaiIconView d;
    public final TextView e;
    public final KwaiImageView f;
    public final KwaiImageView g;
    public final KwaiImageView h;
    public final KwaiImageView i;
    public final KwaiImageView j;
    public final PlcDynamicSearchBar k;
    public PlcDynamicContainerConfig l;
    public PlcDynamicTitleConfig m;
    public PlcDynamicNavigationBar$b n;
    public final p o;
    public HashMap p;

    public void PlcDynamicNavigationBar(Context p0){
       View view;
       a.p(p0, "context");
       super(p0);
       this.o = s.c(new PlcDynamicNavigationBar$mSearchStatusChangeLnr$2(this));
       int i = 1;
       this.setOrientation(i);
       if (i.c()) {
          view = new View(this.getContext());
          l ol = j.a(view);
          if (ol != null) {
             b uob = ol.f(i);
             if (uob != null) {
                uob = uob.b;
             label_003d :
                this.addView(view, new LinearLayout$LayoutParams(-1, uob));
                this.b = view;
             }
          }
          int i1 = p1.f(view.getContext());
          goto label_003d ;
       }
       view = a.k(this, R.layout.arg_RES_7f0d1683, false);
       a.o(view, "KwaiLayoutInflater.infla…_dynamic_navigate, false\)");
       this.c = view;
       this.addView(view);
       View view1 = view.findViewById(R.id.iv_dynamic_close);
       a.o(view1, "mInnerRoot.findViewById\(R.id.iv_dynamic_close\)");
       this.d = view1;
       view1.setOnClickListener(new PlcDynamicNavigationBar$a(this));
       view1 = view.findViewById(R.id.tv_dynamic_title);
       a.o(view1, "mInnerRoot.findViewById\(R.id.tv_dynamic_title\)");
       this.e = view1;
       TextPaint paint = view1.getPaint();
       a.o(paint, "mTitleView.paint");
       paint.setFakeBoldText(i);
       View view2 = view.findViewById(R.id.iv_dynamic_left_icon1);
       a.o(view2, "mInnerRoot.findViewById\(…id.iv_dynamic_left_icon1\)");
       this.f = view2;
       view2 = view.findViewById(R.id.iv_dynamic_left_icon2);
       a.o(view2, "mInnerRoot.findViewById\(…id.iv_dynamic_left_icon2\)");
       this.g = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon1);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon1\)");
       this.h = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon2);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon2\)");
       this.i = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon3);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon3\)");
       this.j = view2;
       view2 = view.findViewById(R.id.view_dynamic_search);
       a.o(view2, "mInnerRoot.findViewById\(R.id.view_dynamic_search\)");
       this.k = view2;
       return;
    }
    public void PlcDynamicNavigationBar(Context p0,AttributeSet p1){
       View view;
       a.p(p0, "context");
       super(p0, p1);
       this.o = s.c(new PlcDynamicNavigationBar$mSearchStatusChangeLnr$2(this));
       int i = 1;
       this.setOrientation(i);
       if (i.c()) {
          view = new View(this.getContext());
          l ol = j.a(view);
          if (ol != null) {
             b uob = ol.f(i);
             if (uob != null) {
                uob = uob.b;
             label_003d :
                this.addView(view, new LinearLayout$LayoutParams(-1, uob));
                this.b = view;
             }
          }
          int i1 = p1.f(view.getContext());
          goto label_003d ;
       }
       view = a.k(this, R.layout.arg_RES_7f0d1683, false);
       a.o(view, "KwaiLayoutInflater.infla…_dynamic_navigate, false\)");
       this.c = view;
       this.addView(view);
       View view1 = view.findViewById(R.id.iv_dynamic_close);
       a.o(view1, "mInnerRoot.findViewById\(R.id.iv_dynamic_close\)");
       this.d = view1;
       view1.setOnClickListener(new PlcDynamicNavigationBar$a(this));
       view1 = view.findViewById(R.id.tv_dynamic_title);
       a.o(view1, "mInnerRoot.findViewById\(R.id.tv_dynamic_title\)");
       this.e = view1;
       TextPaint paint = view1.getPaint();
       a.o(paint, "mTitleView.paint");
       paint.setFakeBoldText(i);
       View view2 = view.findViewById(R.id.iv_dynamic_left_icon1);
       a.o(view2, "mInnerRoot.findViewById\(…id.iv_dynamic_left_icon1\)");
       this.f = view2;
       view2 = view.findViewById(R.id.iv_dynamic_left_icon2);
       a.o(view2, "mInnerRoot.findViewById\(…id.iv_dynamic_left_icon2\)");
       this.g = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon1);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon1\)");
       this.h = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon2);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon2\)");
       this.i = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon3);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon3\)");
       this.j = view2;
       view2 = view.findViewById(R.id.view_dynamic_search);
       a.o(view2, "mInnerRoot.findViewById\(R.id.view_dynamic_search\)");
       this.k = view2;
       return;
    }
    public void PlcDynamicNavigationBar(Context p0,AttributeSet p1,int p2){
       View view;
       b uob;
       a.p(p0, "context");
       super(p0, p1, p2);
       this.o = s.c(new PlcDynamicNavigationBar$mSearchStatusChangeLnr$2(this));
       int i = 1;
       this.setOrientation(i);
       if (i.c()) {
          view = new View(this.getContext());
          l ol = j.a(view);
          if (ol != null) {
             uob = ol.f(i);
             if (uob != null) {
                uob = uob.b;
             label_003d :
                this.addView(view, new LinearLayout$LayoutParams(-1, uob));
                this.b = view;
             }
          }
          uob = p1.f(view.getContext());
          goto label_003d ;
       }
       view = a.k(this, R.layout.arg_RES_7f0d1683, false);
       a.o(view, "KwaiLayoutInflater.infla…_dynamic_navigate, false\)");
       this.c = view;
       this.addView(view);
       View view1 = view.findViewById(R.id.iv_dynamic_close);
       a.o(view1, "mInnerRoot.findViewById\(R.id.iv_dynamic_close\)");
       this.d = view1;
       view1.setOnClickListener(new PlcDynamicNavigationBar$a(this));
       view1 = view.findViewById(R.id.tv_dynamic_title);
       a.o(view1, "mInnerRoot.findViewById\(R.id.tv_dynamic_title\)");
       this.e = view1;
       TextPaint paint = view1.getPaint();
       a.o(paint, "mTitleView.paint");
       paint.setFakeBoldText(i);
       View view2 = view.findViewById(R.id.iv_dynamic_left_icon1);
       a.o(view2, "mInnerRoot.findViewById\(…id.iv_dynamic_left_icon1\)");
       this.f = view2;
       view2 = view.findViewById(R.id.iv_dynamic_left_icon2);
       a.o(view2, "mInnerRoot.findViewById\(…id.iv_dynamic_left_icon2\)");
       this.g = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon1);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon1\)");
       this.h = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon2);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon2\)");
       this.i = view2;
       view2 = view.findViewById(R.id.iv_dynamic_right_icon3);
       a.o(view2, "mInnerRoot.findViewById\(…d.iv_dynamic_right_icon3\)");
       this.j = view2;
       view2 = view.findViewById(R.id.view_dynamic_search);
       a.o(view2, "mInnerRoot.findViewById\(R.id.view_dynamic_search\)");
       this.k = view2;
       return;
    }
    public final int a(PlcDynamicContainerConfig p0){
       int i1;
       String str3;
       int i3;
       int i4;
       String titleText;
       int i6;
       PlcDynamicTitleConfig titleConfig3;
       String navBarBackgr;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PlcDynamicNavigationBar obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicNavigationBar.class, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       String str = "8";
       String str1 = "10";
       String str2 = 2;
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicNavigationBar.class, str)) {
          if (p0 != null) {
             PlcDynamicTitleConfig titleConfig2 = p0.getTitleConfig();
             if (titleConfig2 != null) {
                i6 = titleConfig2.getCloseType();
             label_0033 :
                i6 = (i6 != 1)? 0x7f080623: 0x7f080626;
                i4 = (PlcDynamicUtils.m(p0))? 2: 1;
                this.d.c(i6, i4);
                PlcDynamicContainerStyle obj1 = PatchProxy.applyOneRefs(p0, objArray, PlcDynamicUtils.class, str1);
                if (obj1 != patchProxyRe) {
                   i1 = obj1.intValue();
                }else {
                   try{
                      String str4 = "#FFFFFFFF";
                      if (p0 != null) {
                         titleConfig2 = p0.getTitleConfig();
                         if (titleConfig2 != null) {
                            titleText = titleConfig2.getNavBarBackgroundColor();
                            if (titleText != null) {
                               titleConfig3 = (titleText.length() > 0)? 1: null;
                               if (!titleConfig3) {
                                  objArray1 = objArray;
                               }
                               if (titleText != null) {
                               label_0088 :
                                  if (titleText == null) {
                                     titleText = str4;
                                  }
                                  i1 = Color.parseColor(titleText);
                               }
                            }
                         }
                      }
                      if (p0 != null) {
                         obj1 = p0.getContainerStyle();
                         if (obj1 != null) {
                            titleText = obj1.getContainerBackgroundColor();
                            goto label_0088 ;
                         }
                      }
                      objArray1 = objArray;
                      goto label_0088 ;
                   }catch(java.lang.Exception e0){
                      i1 = Color.parseColor(e0);
                   }
                   try{
                      titleText = "#FF19191E";
                      if (p0 != null) {
                         titleConfig3 = p0.getTitleConfig();
                         if (titleConfig3 != null) {
                            navBarBackgr = titleConfig3.getNavBarBackgroundColorDark();
                            if (navBarBackgr != null) {
                               str3 = (navBarBackgr.length() > 0)? 1: null;
                               if (!str3) {
                                  navBarBackgr = objArray;
                               }
                               if (navBarBackgr != null) {
                               label_00c3 :
                                  if (navBarBackgr == null) {
                                     navBarBackgr = titleText;
                                  }
                                  i6 = Color.parseColor(navBarBackgr);
                               }
                            }
                         }
                      }
                      if (p0 != null) {
                         PlcDynamicContainerStyle containerSty = p0.getContainerStyle();
                         if (containerSty != null) {
                            navBarBackgr = containerSty.getContainerBackgroundColorDark();
                            goto label_00c3 ;
                         }
                      }
                      navBarBackgr = objArray;
                      goto label_00c3 ;
                   }catch(java.lang.Exception e0){
                      i6 = Color.parseColor(titleText);
                   }
                   if (PlcDynamicUtils.m(p0)) {
                      i1 = i6;
                   }
                }
                this.setBackgroundColor(i1);
             }
          }
          i6 = 0;
          goto label_0033 ;
       }
       PlcDynamicTitleConfig titleConfig = (p0 != null)? p0.getTitleConfig(): objArray;
       i1 = PlcDynamicUtils.b(titleConfig);
       if (!PlcDynamicUtils.i(i1)) {
          PlcDynamicLogger.f(p0, "更新容器导航失败，config校验失败");
          return i1;
       }else {
          this.l = p0;
          PlcDynamicTitleConfig titleConfig1 = (p0 != null)? p0.getTitleConfig(): objArray;
          this.m = titleConfig1;
          if (titleConfig1 != null) {
             PlcDynamicSearchBar plcDynamicSe = 8;
             if (!PatchProxy.applyVoidOneRefs(titleConfig1, this, PlcDynamicNavigationBar.class, "14")) {
                if (!q.f(titleConfig1.getLeftIcons())) {
                   i6 = 0;
                   while (i6 < str2) {
                      List list1 = (titleConfig1.getLeftIcons().size() > i6)? 1: null;
                      PlcDynamicTitleIconInfo plcDynamicTi1 = (list1)? titleConfig1.getLeftIcons().get(i6): objArray;
                      if (i6) {
                         if (i6 == 1) {
                            this.c(this.g, plcDynamicTi1);
                         }
                      }else {
                         this.c(this.f, plcDynamicTi1);
                      }
                      i6 = i6 + 1;
                   }
                }else {
                   n.Y(this.f, plcDynamicSe, i);
                   n.Y(this.g, plcDynamicSe, i);
                }
             }
             if (!PatchProxy.applyVoidOneRefs(titleConfig1, this, PlcDynamicNavigationBar.class, "13")) {
                if (!q.f(titleConfig1.getRightIcons())) {
                   obj = 3;
                   int i5 = 0;
                   while (i5 < obj) {
                      List list = (titleConfig1.getRightIcons().size() > i5)? 1: null;
                      PlcDynamicTitleIconInfo plcDynamicTi = (list)? titleConfig1.getRightIcons().get(i5): objArray;
                      if (i5) {
                         if (i5 != 1) {
                            if (i5 == str2) {
                               this.c(this.j, plcDynamicTi);
                            }
                         }else {
                            this.c(this.i, plcDynamicTi);
                         }
                      }else {
                         this.c(this.h, plcDynamicTi);
                      }
                      i5 = i5 + 1;
                   }
                }else {
                   n.Y(this.h, plcDynamicSe, i);
                   n.Y(this.i, plcDynamicSe, i);
                   n.Y(this.j, plcDynamicSe, i);
                }
             }
             if (!PatchProxy.applyVoidOneRefs(titleConfig1, this, PlcDynamicNavigationBar.class, "12")) {
                titleText = titleConfig1.getTitleText();
                obj = (titleText == null || !titleText.length())? 1: null;
                if (obj) {
                   n.Y(this.e, plcDynamicSe, i);
                }else {
                   this.e.post(new a(this, titleConfig1));
                }
             }
             str2 = "7";
             if (!PatchProxy.applyVoidOneRefs(titleConfig1, this, PlcDynamicNavigationBar.class, str2)) {
                if (this.b()) {
                   n.Y(this.k, i, i);
                   obj = this.k;
                   Objects.requireNonNull(obj);
                   if (!PatchProxy.applyVoidOneRefs(titleConfig1, obj, PlcDynamicSearchBar.class, "6")) {
                      a.p(titleConfig1, "titleConfig");
                      obj.f = titleConfig1;
                      obj.g.clear();
                      List searchWords = titleConfig1.getSearchWords();
                      if (searchWords != null) {
                         Iterator iterator = searchWords.iterator();
                         while (iterator.hasNext()) {
                            str3 = iterator.next();
                            if (!TextUtils.x(str3)) {
                               obj.g.add(new b(str3));
                            }
                         }
                      }
                      if (!PatchProxy.applyVoid(objArray, obj, PlcDynamicSearchBar.class, str2)) {
                         if (!PatchProxy.applyVoid(objArray, obj, PlcDynamicSearchBar.class, str1)) {
                            PlcDynamicSearchBar b = obj.b;
                            if (b != null) {
                               i3 = a1.a(R.color.arg_RES_7f0602c5);
                               b uob = new b();
                               uob.g(KwaiRadiusStyles.FULL);
                               if (PlcDynamicUtils.n(obj.f)) {
                                  i3 = a1.a(R.color.arg_RES_7f060202);
                               }
                               uob.v(i3);
                               b.setBackground(uob.a());
                            }
                            b = obj.d;
                            if (b != null) {
                               i3 = a1.a(R.color.arg_RES_7f061d77);
                               i4 = a1.a(R.color.arg_RES_7f061e52);
                               b uob1 = new b();
                               uob1.g(KwaiRadiusStyles.FULL);
                               if (PlcDynamicUtils.n(obj.f)) {
                                  i4 = a1.a(R.color.arg_RES_7f061d74);
                                  i3 = a1.a(R.color.arg_RES_7f061dc4);
                               }
                               uob1.v(i4);
                               b.setBackground(uob1.a());
                               b.setTextColor(i3);
                            }
                         }
                         if (!PatchProxy.applyVoid(objArray, obj, PlcDynamicSearchBar.class, str)) {
                            PlcDynamicSearchBar c = obj.c;
                            if (c != null) {
                               int childCount = c.getChildCount();
                               if (childCount >= 0) {
                                  i3 = 0;
                                  View childAt = c.getChildAt(i3);
                                  while (childAt != null) {
                                     obj.a(childAt);
                                     break ;
                                     i3 = i3 + 1;
                                  }
                                  if (i3 != childCount) {
                                     goto label_02d7 ;
                                  }
                               }
                            }
                         }
                      }
                   label_02da :
                      obj.b(i);
                   }
                   this.k.setOnSearchBarStatusChangeListener(this.getMSearchStatusChangeLnr());
                   List rightIcons = titleConfig1.getRightIcons();
                   int i2 = (rightIcons == null || rightIcons.isEmpty())? 1: 0;
                   i2 = i2 ^ 1;
                   ViewGroup$LayoutParams layoutParams = this.k.getLayoutParams();
                   if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                      objArray = layoutParams;
                   }
                   if (objArray != null) {
                      if (i2) {
                         i = a1.d(R.dimen.arg_RES_7f07034b);
                      }
                      objArray.rightMargin = i;
                   }
                }else {
                   n.Y(this.k, plcDynamicSe, i);
                   this.e();
                }
             }
          }
       label_031b :
          return i1;
       }
    }
    public final boolean b(){
       PlcDynamicNavigationBar obj = PatchProxy.apply(null, this, PlcDynamicNavigationBar.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.m;
       boolean b = true;
       if (obj == null || obj.getUseSearchBar() != b) {
          b = false;
       }
       return b;
    }
    public final void c(KwaiImageView p0,PlcDynamicTitleIconInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcDynamicNavigationBar.class, "15")) {
          return;
       }
       boolean b = (p1 != null)? p1.isValid(): false;
       String str = null;
       if (PlcDynamicUtils.m(this.l)) {
          if (p1 != null) {
             str = p1.getIconUrlDark();
          }
       }else if(p1 != null){
          str = p1.getIconUrl();
       }
       if (b) {
          PlcDynamicUtils.r(str, p0);
          p0.setOnClickListener(new PlcDynamicNavigationBar$c(this, p1));
          n.Y(p0, 0, 0);
       }else {
          n.Y(p0, 8, 0);
       }
       return;
    }
    public final void d(){
       c a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicNavigationBar.class, "4")) {
          return;
       }
       PlcDynamicNavigationBar tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, PlcDynamicSearchBar.class, "11") && tk.j == null) {
          boolean b = true;
          tk.j = b;
          if (tk.g.size() > b) {
             c mTimer = tk.getMTimer();
             PlcDynamicSearchBar n = tk.n;
             Objects.requireNonNull(mTimer);
             if (!PatchProxy.applyVoidOneRefs(n, mTimer, c.class, "1")) {
                a.p(n, "block");
                a = mTimer.a;
                if (a != null) {
                   b9.a(a);
                }
                mTimer.a = t.interval(5000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new d(n), Functions.e);
             }
          }
       }
       return;
    }
    public final void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcDynamicNavigationBar.class, "5")) {
          return;
       }
       PlcDynamicNavigationBar tk = this.k;
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, PlcDynamicSearchBar.class, "12")) {
          tk.j = false;
          c mTimer = tk.getMTimer();
          Objects.requireNonNull(mTimer);
          if (!PatchProxy.applyVoid(objArray, mTimer, c.class, "2")) {
             mTimer = mTimer.a;
             if (mTimer != null) {
                b9.a(mTimer);
             }
          }
       }
       return;
    }
    public final PlcDynamicNavigationBar$mSearchStatusChangeLnr$2$a getMSearchStatusChangeLnr(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicNavigationBar.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public final b getSearchInfo(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PlcDynamicNavigationBar.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b()) {
          objArray = this.k.getCurSearchInfo();
       }
       return objArray;
    }
    public final void setOnNavigateClickListener(PlcDynamicNavigationBar$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicNavigationBar.class, "9")) {
          return;
       }
       a.p(p0, "listener");
       this.n = p0;
       return;
    }
}
