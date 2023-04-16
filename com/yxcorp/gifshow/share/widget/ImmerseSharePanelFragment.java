package com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import mp7.b;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment$a;
import nsd.u;
import java.util.ArrayList;
import djc.g1;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mp7.e;
import com.kwai.robust.PatchProxyResult;
import djc.d1;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelData;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import djc.c1;
import e17.i;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment$b;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.JsonElement;
import java.util.List;
import java.util.Collection;
import uo7.j0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.view.View;
import android.widget.TextView;
import kotlin.Result;
import java.lang.CharSequence;
import zsd.u;
import qrd.l1;
import qrd.j0;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import androidx.viewpager2.widget.ViewPager2;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Number;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import cw9.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import rkd.b;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment$c;
import androidx.viewpager2.widget.ViewPager2$h;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.os.Bundle;
import i2b.a;
import djc.b1;
import android.view.View$OnClickListener;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import djc.n1;
import djc.f1;
import java.lang.NullPointerException;
import djc.e1;
import djc.e1$a;
import com.kwai.sharelib.model.PainterModel;
import ap7.a;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.ViewParent;

public final class ImmerseSharePanelFragment extends ForwardGridSectionFragment implements b	// class@001d0a
{
    public JsonObject X0;
    public ShareInitResponse$SharePanelData Y0;
    public g1 Z0;
    public l a1;
    public List b1;
    public ViewPager2 c1;
    public View d1;
    public TextView e1;
    public TextView f1;
    public TextView g1;
    public boolean h1;
    public String i1;
    public static final ImmerseSharePanelFragment$a j1;

    static {
       ImmerseSharePanelFragment.j1 = new ImmerseSharePanelFragment$a(null);
    }
    public void ImmerseSharePanelFragment(){
       super();
       this.b1 = new ArrayList();
       this.i1 = "";
    }
    public static final g1 hi(ImmerseSharePanelFragment p0){
       p0 = p0.Z0;
       if (p0 == null) {
          a.S("pagerAdapter");
       }
       return p0;
    }
    public void J8(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "16")) {
          return;
       }
       a.p(p0, "currentPainterModelSetter");
       this.a1 = p0;
       return;
    }
    public e Nh(){
       Object obj = PatchProxy.apply(null, this, ImmerseSharePanelFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d1(this);
    }
    public void S6(ShareInitResponse$SharePanelData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "14")) {
          return;
       }
       a.p(p0, "sharePanel");
       ShareInitResponse$SharePanelData mCustomPanel = p0.mCustomPanelParams;
       if (mCustomPanel == null) {
          c1.b(this.i1, "沉浸式面板setSharePanel没有customPanel数据异常", null, null, 12, null);
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e7);
          this.X0 = new JsonObject();
       }else {
          a.o(mCustomPanel, "sharePanel.mCustomPanelParams");
          this.X0 = mCustomPanel;
       }
       this.Y0 = p0;
       ImmerseSharePanelFragment tX0 = this.X0;
       String str = "customPanelParam";
       if (tX0 == null) {
          a.S(str);
       }
       String str1 = "painterModelArray";
       if (tX0.s0(str1)) {
          Gson gson = new Gson();
          ImmerseSharePanelFragment tX01 = this.X0;
          if (tX01 == null) {
             a.S(str);
          }
          gson = gson.d(tX01.g0(str1), new ImmerseSharePanelFragment$b().getType());
          a.o(gson, "Gson\(\).fromJson\(customPa…PainterModel>>\(\) {}.type\)");
          this.b1 = gson;
       }
       return;
    }
    public int Vh(){
       return 0x7f0d0623;
    }
    public void dd(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "15")) {
          return;
       }
       a.p(p0, "operationList");
       int i = 1;
       if (p0.isEmpty() ^ i) {
          j0[] oj0Array = new j0[i];
          oj0Array[0] = p0.get(0);
          super.dd(CollectionsKt__CollectionsKt.P(oj0Array));
          return;
       }else {
          super.dd(p0);
          return;
       }
    }
    public final String ii(){
       return this.i1;
    }
    public String j2(){
       return "immersive";
    }
    public final JsonObject ji(){
       ImmerseSharePanelFragment obj = PatchProxy.apply(null, this, ImmerseSharePanelFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.X0;
       if (obj == null) {
          return new JsonObject();
       }
       if (obj == null) {
          a.S("customPanelParam");
       }
       return obj;
    }
    public final void ki(View p0){
       ImmerseSharePanelFragment e1;
       ImmerseSharePanelFragment x0;
       JsonElement jsonElement;
       String str6;
       CharSequence text;
       JsonElement jsonElement2;
       float[] uofloatArray;
       TextPaint paint;
       TextPaint paint1;
       JsonElement jsonElement3;
       TextView textView = this;
       View obj = p0;
       String str = "subTitle.paint";
       String str1 = "title.paint";
       String str2 = "subTitleGradual";
       String str3 = "titleGradual";
       String str4 = "customPanelParam";
       if (PatchProxy.applyVoidOneRefs(obj, textView, ImmerseSharePanelFragment.class, "8")) {
          return;
       }
       View view = obj.findViewById(R.id.share_big_title);
       a.o(view, "view.findViewById\(R.id.share_big_title\)");
       textView.e1 = view;
       obj = obj.findViewById(R.id.share_sub_title);
       a.o(obj, "view.findViewById\(R.id.share_sub_title\)");
       textView.f1 = obj;
       int i = 8;
       String str5 = "";
       if (this.ji().s0("title")) {
          e1 = textView.e1;
          if (e1 == null) {
             a.S("title");
          }
          x0 = textView.X0;
          if (x0 == null) {
             a.S(str4);
          }
          jsonElement = x0.e0("title");
          if (jsonElement != null) {
             str6 = jsonElement.w();
             if (str6 != null) {
             label_006b :
                e1.setText(str6);
                e1 = textView.e1;
                if (e1 == null) {
                   a.S("title");
                }
                text = e1.getText();
                e1 = (text == null || u.S1(text))? 1: null;
                if (e1) {
                   e1 = textView.e1;
                   if (e1 == null) {
                      a.S("title");
                   }
                   e1.setVisibility(i);
                }else {
                   e1 = textView.e1;
                   if (e1 == null) {
                      a.S("title");
                   }
                   e1.setVisibility(0);
                }
             }
          }
          str6 = str5;
          goto label_006b ;
       }
       if (this.ji().s0("subTitle")) {
          e1 = textView.f1;
          if (e1 == null) {
             a.S("subTitle");
          }
          x0 = textView.X0;
          if (x0 == null) {
             a.S(str4);
          }
          jsonElement = x0.e0("subTitle");
          if (jsonElement != null) {
             str6 = jsonElement.w();
             if (str6 != null) {
                str5 = str6;
             }
          }
          e1.setText(str5);
          e1 = textView.f1;
          if (e1 == null) {
             a.S("subTitle");
          }
          text = e1.getText();
          e1 = (text == null || u.S1(text))? 1: null;
          if (e1) {
             e1 = textView.f1;
             if (e1 == null) {
                a.S("subTitle");
             }
             e1.setVisibility(i);
          }else {
             e1 = textView.f1;
             if (e1 == null) {
                a.S("subTitle");
             }
             e1.setVisibility(0);
          }
       }
       JsonArray obj1 = Result.constructor-impl(l1.a);
       if (Result.exceptionOrNull-impl(obj1) != null) {
          e1 = textView.e1;
          if (e1 == null) {
             a.S("title");
          }
          e1.setVisibility(i);
          e1 = textView.f1;
          if (e1 == null) {
             a.S("subTitle");
          }
          e1.setVisibility(i);
       }
       int i1 = 0;
       int i2 = 2;
       if (this.ji().s0(str3)) {
          e1 = textView.X0;
          if (e1 == null) {
             a.S(str4);
          }
          obj1 = e1.g0(str3);
          if (obj1.size() > 1) {
             int[] ointArray = new int[i2];
             JsonElement jsonElement1 = obj1.e0(0);
             a.o(jsonElement1, "jsonArray[0]");
             ointArray[0] = Color.parseColor(jsonElement1.w());
             jsonElement2 = obj1.e0(1);
             a.o(jsonElement2, "jsonArray[1]");
             ointArray[1] = Color.parseColor(jsonElement2.w());
             uofloatArray = new float[i2];
             uofloatArray[0] = i1;
             uofloatArray[1] = 0x3f800000;
             float f = 0;
             float f1 = 0;
             ImmerseSharePanelFragment e11 = textView.e1;
             if (e11 == null) {
                a.S("title");
             }
             paint = e11.getPaint();
             a.o(paint, str1);
             float textSize = paint.getTextSize();
             ImmerseSharePanelFragment e12 = textView.e1;
             if (e12 == null) {
                a.S("title");
             }
             LinearGradient linearGradie = new LinearGradient(f, f1, (textSize * (float)e12.getText().length()), 0, ointArray, uofloatArray, Shader$TileMode.CLAMP);
             e1 = textView.e1;
             if (e1 == null) {
                a.S("title");
             }
             paint1 = e1.getPaint();
             a.o(paint1, str1);
             paint1.setShader(jsonElement1);
             e1 = textView.e1;
             if (e1 == null) {
                a.S("title");
             }
             e1.invalidate();
          }else if(obj1.size() > 0){
             ImmerseSharePanelFragment e13 = textView.e1;
             if (e13 == null) {
                a.S("title");
             }
             jsonElement2 = obj1.e0(0);
             a.o(jsonElement2, "jsonArray[0]");
             e13.setTextColor(Color.parseColor(jsonElement2.w()));
          }
       }
       if (this.ji().s0(str2)) {
          e1 = textView.X0;
          if (e1 == null) {
             a.S(str4);
          }
          obj1 = e1.g0(str2);
          if (obj1.size() > 1) {
             int[] ointArray1 = new int[]{Color.parseColor(jsonElement3.w()),Color.parseColor(jsonElement2.w())};
             jsonElement3 = obj1.e0(0);
             a.o(jsonElement3, "jsonArray[0]");
             jsonElement2 = obj1.e0(1);
             a.o(jsonElement2, "jsonArray[1]");
             uofloatArray = new float[]{0,0x3f800000};
             ImmerseSharePanelFragment immerseShare = textView.f1;
             if (immerseShare == null) {
                a.S("subTitle");
             }
             TextPaint paint2 = immerseShare.getPaint();
             a.o(paint2, str);
             float textSize1 = paint2.getTextSize();
             ImmerseSharePanelFragment immerseShare1 = textView.f1;
             if (immerseShare1 == null) {
                a.S("subTitle");
             }
             LinearGradient linearGradie1 = new LinearGradient(0, 0, (textSize1 * (float)immerseShare1.getText().length()), 0, ointArray1, uofloatArray, Shader$TileMode.CLAMP);
             e1 = textView.f1;
             if (e1 == null) {
                a.S("subTitle");
             }
             paint1 = e1.getPaint();
             a.o(paint1, str);
             paint1.setShader(jsonElement3);
             e1 = textView.f1;
             if (e1 == null) {
                a.S("subTitle");
             }
             e1.invalidate();
          }else if(obj1.size() > 0){
             ImmerseSharePanelFragment immerseShare2 = textView.f1;
             if (immerseShare2 == null) {
                a.S("subTitle");
             }
             jsonElement2 = obj1.e0(0);
             a.o(jsonElement2, "jsonArray[0]");
             immerseShare2.setTextColor(Color.parseColor(jsonElement2.w()));
          }
       }
       Result.constructor-impl(l1.a);
       return;
    }
    public final void li(View p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "5")) {
          return;
       }
       View view = p0.findViewById(R.id.share_poster_vp);
       a.o(view, "view.findViewById\(R.id.share_poster_vp\)");
       this.c1 = view;
       this.Z0 = new g1(this);
       ImmerseSharePanelFragment tc1 = this.c1;
       if (tc1 == null) {
          a.S("posterViewPager");
       }
       ImmerseSharePanelFragment tZ0 = this.Z0;
       String str = "pagerAdapter";
       if (tZ0 == null) {
          a.S(str);
       }
       tc1.setAdapter(tZ0);
       tc1 = this.Z0;
       if (tc1 == null) {
          a.S(str);
       }
       tZ0 = this.b1;
       Objects.requireNonNull(tc1);
       if (!PatchProxy.applyVoidOneRefs(tZ0, tc1, g1.class, "1")) {
          a.p(tZ0, "<set-?>");
          tc1.e = tZ0;
       }
       tc1 = this.Z0;
       if (tc1 == null) {
          a.S(str);
       }
       tc1.k0();
       tc1 = this.c1;
       if (tc1 == null) {
          a.S("posterViewPager");
       }
       int i = 1;
       tc1.setOffscreenPageLimit(i);
       tc1 = this.c1;
       if (tc1 == null) {
          a.S("posterViewPager");
       }
       tc1.setClipChildren(i);
       tc1 = this.c1;
       if (tc1 == null) {
          a.S("posterViewPager");
       }
       i = 0;
       view = tc1.getChildAt(i);
       Objects.requireNonNull(view, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
       Object obj = PatchProxy.apply(null, this, ImmerseSharePanelFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          f = obj.floatValue();
       }else {
          f = (float)c.b(this.getResources(), 0x7f070463) / (float)n.j(this.Lh());
          if (f - 0x3f07ae14 > 0) {
             f = (b.e())? 0x3f000000: 0x3f07ae14;
          }
       label_00c4 :
          f = f * (float)n.j(this.Lh());
       }
       view.setPadding((int)((((float)n.k(this.Lh()) - (((float)9 * f) / 16.00f)) / (float)2) - (float)n.c(this.getContext(), 18.00f)), i, (int)((((float)n.k(this.Lh()) - (((float)9 * f) / 16.00f)) / (float)2) - (float)n.c(this.getContext(), 18.00f)), i);
       view.setClipToPadding(i);
       ViewGroup viewGroup = p0.findViewById(R.id.share_vp_root);
       a.o(viewGroup, "vpRoot");
       ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
       layoutParams.height = (int)f;
       viewGroup.setLayoutParams(layoutParams);
       ImmerseSharePanelFragment tc11 = this.c1;
       if (tc11 == null) {
          a.S("posterViewPager");
       }
       tc11.j(new ImmerseSharePanelFragment$c(this));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "2")) {
          return;
       }
       a.p(p0, "newConfig");
       try{
          super.onConfigurationChanged(p0);
          if (this.h1 != b.e()) {
             this.dismissAllowingStateLoss();
          }
          this.h1 = b.e();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImmerseSharePanelFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0621, p1, false);
       a.o(view, "this");
       this.li(view);
       if (!PatchProxy.applyVoidOneRefs(view, this, ImmerseSharePanelFragment.class, "7")) {
          View view1 = view.findViewById(R.id.share_close_btn);
          a.o(view1, "view.findViewById\(R.id.share_close_btn\)");
          this.d1 = view1;
          if (view1 == null) {
             a.S("closeBtn");
          }
          view1.setOnClickListener(new b1(this));
       }
       this.ki(view);
       p1 = Result.constructor-impl(l1.a);
       if (Result.exceptionOrNull-impl(p1) != null) {
          this.dismissAllowingStateLoss();
       }
       return view;
    }
    public void onDestroy(){
       Map$Entry obj;
       if (PatchProxy.applyVoid(null, this, ImmerseSharePanelFragment.class, "20")) {
          return;
       }
       super.onDestroy();
       ImmerseSharePanelFragment tZ0 = this.Z0;
       if (tZ0 == null) {
          a.S("pagerAdapter");
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = tZ0.K0().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof f1) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       iterator = linkedHashMa.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             n1 value = iterator.next().getValue();
             if (value != null) {
                value.release();
                obj = Result.constructor-impl(l1.a);
                Throwable throwable = Result.exceptionOrNull-impl(obj);
                if (throwable != null) {
                   c1.b(this.i1, "沉浸式面板视频海报销毁时异常", throwable, null, 8, null);
                }
             }else {
                break ;
             }
          }else {
             iterator = e1.d.a().entrySet().iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                obj.getKey();
                obj.getValue().destroy();
             }
             e1.d.a().clear();
             return;
          }
       }
       throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.share.widget.ImmerseSharePosterVideoViewHolder");
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "19")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       ImmerseSharePanelFragment tZ0 = this.Z0;
       if (tZ0 == null) {
          a.S("pagerAdapter");
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = tZ0.K0().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof f1) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       iterator = linkedHashMa.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          n1 value = iterator.next().getValue();
          if (value != null) {
             value.release();
             Object obj = Result.constructor-impl(l1.a);
             Throwable throwable = Result.exceptionOrNull-impl(obj);
             if (throwable != null) {
                c1.b(this.i1, "沉浸式面板视频海报销毁时异常", throwable, null, 8, null);
             }
          }else {
             break ;
          }
       }
       throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.share.widget.ImmerseSharePosterVideoViewHolder");
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ImmerseSharePanelFragment.class, "18")) {
          return;
       }
       super.onPause();
       ImmerseSharePanelFragment tZ0 = this.Z0;
       if (tZ0 == null) {
          a.S("pagerAdapter");
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = tZ0.K0().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getValue() instanceof f1) {
             linkedHashMa.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       iterator = linkedHashMa.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          n1 value = iterator.next().getValue();
          if (value != null) {
             value.f();
             Result.constructor-impl(l1.a);
          }else {
             break ;
          }
       }
       throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.share.widget.ImmerseSharePosterVideoViewHolder");
    }
    public void onResume(){
       ViewGroup$LayoutParams layoutParams;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ImmerseSharePanelFragment.class, "11")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, ImmerseSharePanelFragment.class, "12")) {
          int i = n.k(this.Lh());
          int i1 = n.j(this.Lh());
          View view = this.getView();
          if (view != null) {
             layoutParams = view.getLayoutParams();
             if (layoutParams != null) {
             label_003c :
                layoutParams.width = i;
                layoutParams.height = i1;
                View view1 = this.getView();
                if (view1 != null) {
                   view1.setLayoutParams(layoutParams);
                }
             }
          }
          layoutParams = new ViewGroup$LayoutParams(i, i1);
          goto label_003c ;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ImmerseSharePanelFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.h1 = b.e();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setDimAmount(0x3f59999a);
          }
       }
       p0.setOnClickListener(null);
       return;
    }
    public void u7(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "17")) {
          return;
       }
       a.p(p0, "view");
       if (!PatchProxy.applyVoidOneRefs(p0, this, ImmerseSharePanelFragment.class, "9")) {
          p0 = p0.findViewById(R.id.share_panel_title);
          a.o(p0, "view.findViewById\(R.id.share_panel_title\)");
          this.g1 = p0;
          ImmerseSharePanelFragment tY0 = this.Y0;
          String str = "sharePanelData";
          if (tY0 == null) {
             a.S(str);
          }
          ShareInitResponse$SharePanelData mTitle = tY0.mTitle;
          a.o(mTitle, "sharePanelData.mTitle");
          String str1 = "panelTitle";
          if (u.S1(mTitle) ^ 0x01) {
             tY0 = this.g1;
             if (tY0 == null) {
                a.S(str1);
             }
             ImmerseSharePanelFragment tY01 = this.Y0;
             if (tY01 == null) {
                a.S(str);
             }
             tY0.setText(tY01.mTitle);
          }else {
             tY0 = this.g1;
             if (tY0 == null) {
                a.S(str1);
             }
             ViewParent parent = tY0.getParent();
             Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
             parent.setVisibility(8);
          }
       }
       return;
    }
}
