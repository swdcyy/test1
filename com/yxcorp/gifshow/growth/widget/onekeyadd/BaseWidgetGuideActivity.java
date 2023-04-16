package com.yxcorp.gifshow.growth.widget.onekeyadd.BaseWidgetGuideActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.growth.widget.onekeyadd.BaseWidgetGuideActivity$a;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import com.yxcorp.gifshow.growth.widget.onekeyadd.WidgetViewPager;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import com.yxcorp.gifshow.growth.widget.onekeyadd.WidgetGuideViewPager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import ira.d;
import android.os.Looper;
import com.yxcorp.gifshow.growth.widget.onekeyadd.BaseWidgetGuideActivity$b;
import ira.o;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import ira.b;
import androidx.viewpager.widget.ViewPager$i;
import ira.c;
import android.view.View$OnClickListener;
import ira.l;
import ira.a;
import android.os.Handler;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import android.widget.LinearLayout;
import android.os.Build$VERSION;
import android.app.Application;
import o56.a;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.app.PendingIntent;
import java.lang.CharSequence;
import kotlin.text.Regex;

public abstract class BaseWidgetGuideActivity extends GifshowActivity	// class@0015e3
{
    public TextView A;
    public WidgetViewPager B;
    public HorizontalPageIndicator C;
    public TextView D;
    public PagerSlidingTabStrip E;
    public WidgetGuideViewPager F;
    public boolean G;
    public Handler H;
    public final int I;
    public final long J;
    public String K;
    public String L;
    public boolean M;
    public final List N;
    public KwaiActionBar y;
    public TextView z;

    public void BaseWidgetGuideActivity(){
       Integer[] integerArray;
       Integer integer;
       String[] stringArray;
       String[] stringArray1;
       String[] stringArray2;
       String[] stringArray3;
       String[] stringArray4;
       super();
       this.J = 4000;
       this.K = "";
       this.L = "";
       BaseWidgetGuideActivity$a[] uoaArray = new BaseWidgetGuideActivity$a[]{new BaseWidgetGuideActivity$a(0x7f1051e1, CollectionsKt__CollectionsKt.L(integerArray), CollectionsKt__CollectionsKt.L(stringArray), CollectionsKt__CollectionsKt.L(stringArray1)),new BaseWidgetGuideActivity$a(0x7f1051e9, CollectionsKt__CollectionsKt.L(integerArray), CollectionsKt__CollectionsKt.L(stringArray), CollectionsKt__CollectionsKt.L(stringArray2)),new BaseWidgetGuideActivity$a(0x7f1051fd, CollectionsKt__CollectionsKt.L(integerArray), CollectionsKt__CollectionsKt.L(stringArray), CollectionsKt__CollectionsKt.L(stringArray1)),new BaseWidgetGuideActivity$a(0x7f105200, CollectionsKt__CollectionsKt.L(integerArray), CollectionsKt__CollectionsKt.L(stringArray3), CollectionsKt__CollectionsKt.L(stringArray4))};
       integerArray = new Integer[]{Integer.valueOf(0x7f1051e2),Integer.valueOf(0x7f1051e3),integer};
       integer = Integer.valueOf(R.string.arg_RES_7f1051f5);
       stringArray = new String[]{"https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/458776bfe78f4242ba258d233b4f507c.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/a5043294d26d4399a39abf64ad3ab8b9.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/aa55ea4959a14eefad041fcbe3952a9c.webp"};
       stringArray1 = new String[]{"h,328:218","h,328:246","h,328:180"};
       integerArray = new Integer[]{Integer.valueOf(0x7f1051ea),Integer.valueOf(0x7f1051eb),integer};
       stringArray = new String[]{"https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/ec0cdc740479462eaad90c1d6b8d73b8.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/3e3e9be55fd34271959ad863d30b5b52.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/62a965a3f88746b0a67f1141697b68a7.webp"};
       stringArray2 = new String[]{"h,328:232","h,328:242","h,328:232"};
       integerArray = new Integer[]{Integer.valueOf(0x7f1051fe),Integer.valueOf(0x7f1051ff),integer};
       stringArray = new String[]{"https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/532fad9b22884fda8109814edd946ccd.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/c9dd83c9f3b6418d8dcd2c4306414a0e.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/68d8b4eb1cfe401f84d77dff01e8608d.webp"};
       stringArray1 = new String[]{"h,328:232","h,328:206","h,328:354"};
       integerArray = new Integer[]{Integer.valueOf(0x7f105201),Integer.valueOf(0x7f105202),integer};
       stringArray3 = new String[]{"https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/c1f5025390f14b689efd4b507bb47b74.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/0fd20439e42c40fca888ea5d447f3296.webp","https://ali2.a.kwimgs.com/kos/nlav11289/kidcdn/1/20/668ca5a4532b45c895b6963ae6136eaa.webp"};
       stringArray4 = new String[]{"h,328:218","h,328:242","h,328:236"};
       this.N = CollectionsKt__CollectionsKt.L(uoaArray);
    }
    public final boolean A3(){
       Object obj = PatchProxy.apply(null, this, BaseWidgetGuideActivity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (RomUtils.n() || RomUtils.s())? true: false;
       return b;
    }
    public int M(){
       return 1;
    }
    public String o(){
       return "WIDGET_GUIDE";
    }
    public void onCreate(Bundle p0){
       BaseWidgetGuideActivity tF1;
       BaseWidgetGuideActivity uBaseWidgetG = BaseWidgetGuideActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBaseWidgetG, "15")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0023);
       Object[] objArray = null;
       String str = "addBtn";
       if (!PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "17")) {
          View view = this.findViewById(R.id.title_root);
          a.o(view, "findViewById\(R.id.title_root\)");
          this.y = view;
          view = this.findViewById(R.id.widget_pager_title);
          a.o(view, "findViewById\(R.id.widget_pager_title\)");
          this.z = view;
          view = this.findViewById(R.id.widget_pager_desc);
          a.o(view, "findViewById\(R.id.widget_pager_desc\)");
          this.A = view;
          view = this.findViewById(R.id.widget_pager);
          a.o(view, "findViewById\(R.id.widget_pager\)");
          this.B = view;
          view = this.findViewById(R.id.widget_indicator);
          a.o(view, "findViewById\(R.id.widget_indicator\)");
          this.C = view;
          view = this.findViewById(R.id.widget_add_btn);
          a.o(view, "findViewById\(R.id.widget_add_btn\)");
          this.D = view;
          view = this.findViewById(R.id.widget_guide_tabs);
          a.o(view, "findViewById\(R.id.widget_guide_tabs\)");
          this.E = view;
          view = this.findViewById(R.id.widget_guide_pager);
          a.o(view, "findViewById\(R.id.widget_guide_pager\)");
          this.F = view;
          if (this.A3()) {
             tF1 = this.D;
             if (tF1 == null) {
                a.S(str);
             }
             tF1.setText(R.string.arg_RES_7f1051e8);
          }else {
             tF1 = this.D;
             if (tF1 == null) {
                a.S(str);
             }
             tF1.setText(R.string.arg_RES_7f1051ce);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "16")) {
          tF1 = this.y;
          String str1 = "actionBar";
          if (tF1 == null) {
             a.S(str1);
          }
          tF1.j(j.n(this, R.drawable.arg_RES_7f08068e, 0x7f060148));
          tF1 = this.y;
          if (tF1 == null) {
             a.S(str1);
          }
          tF1.q(R.string.arg_RES_7f100a00);
          tF1 = this.y;
          if (tF1 == null) {
             a.S(str1);
          }
          tF1.m(-1);
       }
       if (!PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "18")) {
          if (!PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "27")) {
             this.H = new d(this, Looper.getMainLooper());
          }
          tF1 = this.z;
          if (tF1 == null) {
             a.S("pagerTitle");
          }
          int i = 0;
          tF1.setText(this.v3().get(i).b());
          tF1 = this.A;
          if (tF1 == null) {
             a.S("pagerDesc");
          }
          tF1.setText(this.v3().get(i).a());
          o oo = new o(this.v3());
          BaseWidgetGuideActivity tB = this.B;
          if (tB == null) {
             a.S("widgetPager");
          }
          tB.setAdapter(oo);
          tF1 = this.C;
          if (tF1 == null) {
             a.S("widgetIndicator");
          }
          tF1.setItemCount(this.v3().size());
          tF1 = this.B;
          if (tF1 == null) {
             a.S("widgetPager");
          }
          tF1.setOffscreenPageLimit(this.v3().size());
          tF1 = this.B;
          if (tF1 == null) {
             a.S("widgetPager");
          }
          tF1.addOnPageChangeListener(new b(this));
          tF1 = this.D;
          if (tF1 == null) {
             a.S(str);
          }
          tF1.setOnClickListener(new c(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "32")) {
          BaseWidgetGuideActivity tF = this.F;
          if (tF == null) {
             a.S("guidePager");
          }
          tF.setAdapter(new l(this.N));
          tF = this.F;
          if (tF == null) {
             a.S("guidePager");
          }
          tF.addOnPageChangeListener(new a(this));
          tF = this.F;
          if (tF == null) {
             a.S("guidePager");
          }
          tF.setOffscreenPageLimit(this.N.size());
          tF = this.E;
          if (tF == null) {
             a.S("guideTabs");
          }
          tF1 = this.F;
          if (tF1 == null) {
             a.S("guidePager");
          }
          tF.setViewPager(tF1);
       }
       return;
    }
    public void onDestroy(){
       BaseWidgetGuideActivity uBaseWidgetG = BaseWidgetGuideActivity.class;
       if (PatchProxy.applyVoid(null, this, uBaseWidgetG, "33")) {
          return;
       }
       super.onDestroy();
       if (!PatchProxy.applyVoid(null, this, uBaseWidgetG, "28")) {
          uBaseWidgetG = this.H;
          if (uBaseWidgetG != null) {
             uBaseWidgetG.removeMessages(this.I);
          }
          this.H = null;
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BaseWidgetGuideActivity.class, "26")) {
          return;
       }
       super.onPause();
       this.z3();
       return;
    }
    public void onResume(){
       BaseWidgetGuideActivity uBaseWidgetG = BaseWidgetGuideActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "21")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "22")) {
          Intent intent = this.getIntent();
          a.o(intent, "intent");
          Uri data = intent.getData();
          String str1 = x0.a(data, "position_Android");
          String str2 = "";
          if (str1 == null) {
             str1 = str2;
          }
          this.K = str1;
          String str3 = x0.a(data, "only_Android");
          if (str3 != null) {
             str2 = str3;
          }
          this.L = str2;
          if (this.w3(str2) || this.w3(this.K)) {
             this.M = true;
          }
       }
       if (this.M != null) {
          if (!PatchProxy.applyVoid(objArray, this, uBaseWidgetG, "24")) {
             String str = "widgetPager";
             if (this.w3(this.L)) {
                uBaseWidgetG = this.B;
                if (uBaseWidgetG == null) {
                   a.S(str);
                }
                uBaseWidgetG.setCurrentItem(Integer.parseInt(this.L));
                uBaseWidgetG = this.C;
                if (uBaseWidgetG == null) {
                   a.S("widgetIndicator");
                }
                uBaseWidgetG.setVisibility(4);
                uBaseWidgetG = this.B;
                if (uBaseWidgetG == null) {
                   a.S(str);
                }
                uBaseWidgetG.setCanScroll(false);
             }else {
                uBaseWidgetG = this.B;
                if (uBaseWidgetG == null) {
                   a.S(str);
                }
                uBaseWidgetG.setCurrentItem(Integer.parseInt(this.K));
             }
          }
       }else {
          this.y3();
       }
       return;
    }
    public final void u3(BaseWidgetGuideActivity$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseWidgetGuideActivity.class, "20")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          AppWidgetManager.getInstance(a.b()).requestPinAppWidget(new ComponentName(a.b(), p0.c()), null, PendingIntent.getBroadcast(a.b(), 0, new Intent(), 0x8000000));
       }
       return;
    }
    public abstract List v3();
    public final boolean w3(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseWidgetGuideActivity uBaseWidgetG = BaseWidgetGuideActivity.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uBaseWidgetG, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       String str = (p0 == null || !p0.length())? 1: null;
       if (!str) {
          Object obj1 = PatchProxy.applyOneRefs(p0, this, uBaseWidgetG, "25");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): new Regex("-?[0-9]+").matches(p0);
          if (b1 && (Integer.parseInt(p0) >= 0 && Integer.parseInt(p0) < this.v3().size())) {
             b = true;
          }
       }
    label_0054 :
       return b;
    }
    public final boolean x3(){
       return this.G;
    }
    public final void y3(){
       if (PatchProxy.applyVoid(null, this, BaseWidgetGuideActivity.class, "30")) {
          return;
       }
       BaseWidgetGuideActivity tB = this.B;
       String str = "widgetPager";
       if (tB == null) {
          a.S(str);
       }
       boolean b = true;
       if (tB.getAdapter() != null) {
          tB = this.B;
          if (tB == null) {
             a.S(str);
          }
          a adapter = tB.getAdapter();
          a.m(adapter);
          a.o(adapter, "widgetPager.adapter!!");
          if (adapter.j() > b) {
          label_0037 :
             this.G = b;
             tB = this.H;
             if (tB != null) {
                tB.removeMessages(this.I);
             }
             if (this.G != null) {
                tB = this.H;
                if (tB != null) {
                   tB.sendEmptyMessageDelayed(this.I, this.J);
                }
             }
             return;
          }
       }
       b = false;
       goto label_0037 ;
    }
    public final void z3(){
       if (PatchProxy.applyVoid(null, this, BaseWidgetGuideActivity.class, "31")) {
          return;
       }
       this.G = false;
       BaseWidgetGuideActivity tH = this.H;
       if (tH != null) {
          tH.removeMessages(this.I);
       }
       return;
    }
}
