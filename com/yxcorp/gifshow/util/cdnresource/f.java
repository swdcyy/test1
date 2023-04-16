package com.yxcorp.gifshow.util.cdnresource.f;
import java.lang.String;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.cdnresource.e;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Runnable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.graphics.drawable.StateListDrawable;
import com.yxcorp.gifshow.util.cdnresource.f$a;
import java.lang.reflect.Type;
import el.a;
import m0b.a;
import android.content.SharedPreferences;
import java.lang.Object;
import km8.b;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.like.resource.LikeActivityResourceConfig;
import pnc.n;
import wkd.b;
import pnc.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.graphics.drawable.Drawable$ConstantState;
import e17.i;

public class f	// class@001f6e
{

    public static Drawable a(String p0,CdnResource$ResourceKey p1,Drawable p2){
       if (TextUtils.x(p0)) {
          return p2;
       }
       Bitmap uBitmap = e.f(p0, p1);
       if (uBitmap == null) {
          return p2;
       }
       return new BitmapDrawable(a1.m(), uBitmap);
    }
    public static void b(LottieAnimationView p0,CdnResource$ResourceKey p1,int p2,Runnable p3){
       e.c("ACTIVITY_RESOURCE", p0, p1, p2, p3, null, true);
    }
    public static void c(LottieAnimationView p0,CdnResource$ResourceKey p1,int p2,Runnable p3,ClientContent$ContentPackage p4,boolean p5){
       e.c("ACTIVITY_RESOURCE", p0, p1, p2, p3, p4, p5);
    }
    public static void d(String p0,LottieAnimationView p1,CdnResource$ResourceKey p2,int p3,Runnable p4){
       if (TextUtils.x(p0)) {
          f.b(p1, p2, p3, p4);
       }else {
          e.c(p0, p1, p2, p3, p4, null, true);
       }
       return;
    }
    public static void e(String p0,LottieAnimationView p1,CdnResource$ResourceKey p2,int p3,Runnable p4,ClientContent$ContentPackage p5,boolean p6){
       f.f(p0, p1, p2, p3, p4, p5, p6, false);
    }
    public static void f(String p0,LottieAnimationView p1,CdnResource$ResourceKey p2,int p3,Runnable p4,ClientContent$ContentPackage p5,boolean p6,boolean p7){
       if (TextUtils.x(p0)) {
          e.d("ACTIVITY_RESOURCE", p1, p2, p3, p4, p5, p6, p7);
       }else {
          e.d(p0, p1, p2, p3, p4, p5, p6, p7);
       }
       return;
    }
    public static void g(String p0,LottieAnimationView p1,CdnResource$ResourceKey p2,int p3,Runnable p4,boolean p5){
       if (TextUtils.x(p0)) {
          e.d("ACTIVITY_RESOURCE", p1, p2, p3, p4, null, true, p5);
       }else {
          e.d(p0, p1, p2, p3, p4, null, true, p5);
       }
       return;
    }
    public static Drawable h(String p0,CdnResource$ResourceKey p1,CdnResource$ResourceKey p2,Drawable p3){
       return f.i(p0, p1, p2, p3, false);
    }
    public static Drawable i(String p0,CdnResource$ResourceKey p1,CdnResource$ResourceKey p2,Drawable p3,boolean p4){
       if (!TextUtils.x(p0)) {
          Bitmap uBitmap = e.g(p0, p1, p4);
          Bitmap uBitmap1 = e.g(p0, p2, p4);
          if (uBitmap != null && uBitmap1 != null) {
             StateListDrawable stateListDra = new StateListDrawable();
             int[] ointArray = new int[]{0x10100a1};
             stateListDra.addState(ointArray, new BitmapDrawable(a1.m(), uBitmap));
             int[] ointArray1 = new int[0];
             stateListDra.addState(ointArray1, new BitmapDrawable(a1.m(), uBitmap1));
             return stateListDra;
          }
       }
       return p3;
    }
    public static Drawable j(String p0,CdnResource$ResourceKey p1,CdnResource$ResourceKey p2,Drawable p3){
       if (!TextUtils.x(p0)) {
          Bitmap uBitmap = e.f(p0, p1);
          Bitmap uBitmap1 = e.f(p0, p2);
          if (uBitmap != null && uBitmap1 != null) {
             return f.l(new BitmapDrawable(a1.m(), uBitmap), new BitmapDrawable(a1.m(), uBitmap1));
          }
       }
       return p3;
    }
    public static void k(){
       Type type = new f$a().getType();
       String str = "";
       String str1 = a.a.getString("feedLikeActivityResourceMap", str);
       Map map = (str1 == null || str1 == str)? null: b.a(str1, type);
       if (map == null) {
          return;
       }else {
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (n.a(uEntry.getValue().mStartTimestamp, uEntry.getValue().mEndTimestamp)) {
                b.a(0x44c00a7).a(uEntry.getKey(), uEntry.getValue().mResourceUrl, uEntry.getValue().mKsOrderId, uEntry.getValue().mDisplayStyle);
             }else {
                Log.d("LikeResourceUtils", "未下发CDN资源 , CDN资源不在当前时间段使用 config = "+uEntry.getValue());
             }
          }
          return;
       }
    }
    public static StateListDrawable l(Drawable p0,Drawable p1){
       Drawable uDrawable;
       int i = 112;
       Drawable$ConstantState uConstantSta = null;
       if (p0 != null && p0.getConstantState() != null) {
          uDrawable = p0.getConstantState().newDrawable().mutate();
          if (uDrawable != null) {
             uDrawable.setAlpha(i);
          }
       }else {
          uDrawable = uConstantSta;
       }
       if (p1 != null && p1.getConstantState() != null) {
          uConstantSta = p1.getConstantState().newDrawable().mutate();
          if (uConstantSta != null) {
             uConstantSta.setAlpha(i);
          }
       }
       StateListDrawable stateListDra = new StateListDrawable();
       if (uDrawable != null) {
          stateListDra.addState(new int[2]{0x10100a1,0x10100a7}, uDrawable);
       }
       if (p0 != null) {
          stateListDra.addState(new int[2]{0x10100a1,0xfefeff59}, p0);
       }
       if (uConstantSta != null) {
          stateListDra.addState(new int[2]{0xfefeff5f,0x10100a7}, uConstantSta);
       }
       if (p1 != null) {
          stateListDra.addState(new int[2]{0xfefeff5f,0xfefeff59}, p1);
       }
       return stateListDra;
    }
    public static void m(String p0){
       i.d(R.style.arg_RES_7f11066a, "开始下载资源");
       b.a(0x44c00a7).b("ACTIVITY_RESOURCE", p0);
    }
}
