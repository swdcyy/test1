package com.yxcorp.gifshow.growth.util.GrowthCommonExtKt;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt$layoutMarginTop$2;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import msd.l;
import msd.p;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt$layoutHeight$1;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt$layoutMarginBottom$1;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt$layoutMarginTop$1;

public final class GrowthCommonExtKt	// class@001599
{

    public static final int a(RecyclerView p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthCommonExtKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "$this$findFirstCompletelyVisibleItemPosition");
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       int i = -1;
       if (layoutManage instanceof StaggeredGridLayoutManager) {
          int[] ointArray = layoutManage.findFirstCompletelyVisibleItemPositions(null);
          a.o(ointArray, "lm.findFirstCompletelyVisibleItemPositions\(null\)");
          Integer integer = ArraysKt___ArraysKt.Rm(ointArray);
          if (integer != null) {
             i = integer.intValue();
          }
       }else if(layoutManage instanceof GridLayoutManager){
          i = layoutManage.h();
       }else if(layoutManage instanceof LinearLayoutManager){
          i = layoutManage.h();
       }
       return i;
    }
    public static final int b(View p0){
       int i;
       GrowthCommonExtKt growthCommon = GrowthCommonExtKt.class;
       ViewGroup$LayoutParams layoutParams = null;
       GrowthCommonExtKt$layoutMarginTop$2 obj = PatchProxy.applyOneRefs(p0, layoutParams, growthCommon, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = GrowthCommonExtKt$layoutMarginTop$2.INSTANCE;
       Object obj1 = PatchProxy.applyTwoRefs(p0, obj, layoutParams, growthCommon, "7");
       if (obj1 != PatchProxyResult.class) {
          i = obj1.intValue();
       }else if(p0 != null){
          layoutParams = p0.getLayoutParams();
       }
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          i = obj.invoke(layoutParams).intValue();
       }else {
          i = 0;
       }
       return i;
    }
    public static final void c(View p0,int p1,p p2){
       if (PatchProxy.isSupport(GrowthCommonExtKt.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, GrowthCommonExtKt.class, "5")) {
          return;
       }
       if (p0 != null) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          if (layoutParams != null && layoutParams instanceof ViewGroup$MarginLayoutParams) {
             p2.invoke(layoutParams, Integer.valueOf(p1));
             p0.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public static final void d(View p0,int p1,p p2){
       if (PatchProxy.isSupport(GrowthCommonExtKt.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, GrowthCommonExtKt.class, "4")) {
          return;
       }
       if (p0 != null) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          if (layoutParams != null) {
             p2.invoke(layoutParams, Integer.valueOf(p1));
             p0.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public static final void e(View p0,int p1){
       GrowthCommonExtKt growthCommon = GrowthCommonExtKt.class;
       if (PatchProxy.isSupport(growthCommon) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, growthCommon, "11")) {
          return;
       }
       GrowthCommonExtKt.d(p0, p1, new GrowthCommonExtKt$layoutHeight$1(p1));
       return;
    }
    public static final void f(View p0,int p1){
       GrowthCommonExtKt growthCommon = GrowthCommonExtKt.class;
       if (PatchProxy.isSupport(growthCommon) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, growthCommon, "15")) {
          return;
       }
       GrowthCommonExtKt.c(p0, p1, new GrowthCommonExtKt$layoutMarginBottom$1(p1));
       return;
    }
    public static final void g(View p0,int p1){
       GrowthCommonExtKt growthCommon = GrowthCommonExtKt.class;
       if (PatchProxy.isSupport(growthCommon) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, growthCommon, "13")) {
          return;
       }
       GrowthCommonExtKt.c(p0, p1, new GrowthCommonExtKt$layoutMarginTop$1(p1));
       return;
    }
}
