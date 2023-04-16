package com.kuaishou.merchant.basic.util.MerchantRatingHelper;
import java.lang.Object;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.BitmapDrawable;
import com.kuaishou.merchant.api.core.model.live.shop.ScoreStarPic;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import android.widget.RatingBar;
import java.lang.Number;
import brd.t;
import android.util.ArrayMap;
import z1.a;
import crd.b;
import com.kuaishou.merchant.basic.util.j;
import erd.o;
import t45.d;
import brd.z;
import ot3.f0;
import ot3.e0;
import erd.g;
import android.util.SparseArray;
import com.kuaishou.merchant.KernelsLogBiz;
import p74.a;
import o74.a;
import android.graphics.drawable.LayerDrawable;
import lnc.a1;
import java.util.Set;
import java.lang.Iterable;
import com.kuaishou.merchant.basic.util.i;
import brd.a0;
import crd.c;

public class MerchantRatingHelper	// class@0015d1
{

    public void MerchantRatingHelper(){
       super();
    }
    public static Drawable a(Resources p0,Bitmap p1,boolean p2){
       if (PatchProxy.isSupport(MerchantRatingHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, MerchantRatingHelper.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BitmapDrawable(p0, p1);
    }
    public static HashMap b(ScoreStarPic p0){
       Object obj = null;
       HashMap obj1 = PatchProxy.applyOneRefs(p0, obj, MerchantRatingHelper.class, "15");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0.mFullStarPic) && (TextUtils.isEmpty(p0.mHalfStarPic) || TextUtils.isEmpty(p0.mEmptyStarPic))) {
          return obj;
       }
       obj1 = new HashMap();
       obj1.put(Integer.valueOf(1), p0.mFullStarPic);
       obj1.put(Integer.valueOf(2), p0.mHalfStarPic);
       obj1.put(Integer.valueOf(3), p0.mEmptyStarPic);
       return obj1;
    }
    public static int c(RatingBar p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantRatingHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!p0.getNumStars()) {
          return 0;
       }
       return (((p0.getMeasuredWidth() - p0.getPaddingLeft()) - p0.getPaddingRight()) / p0.getNumStars());
    }
    public static b d(RatingBar p0,t p1,ArrayMap p2,a p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, MerchantRatingHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p1.flatMap(j.b).observeOn(d.a).subscribe(new f0(p0, p3), new e0(p2, p3, p0));
    }
    public static void e(RatingBar p0,SparseArray p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, MerchantRatingHelper.class, "10")) {
          return;
       }
       int i = 3;
       Drawable uDrawable = p1.get(i);
       String str = "MerchantRatingHelper";
       if (uDrawable == null) {
          if (p2 != null) {
             p2.accept(Boolean.FALSE);
          }
          a.s(KernelsLogBiz.RATING, str, "setRatingDrawable, but bgDrawable is null");
          return;
       }else {
          Drawable uDrawable1 = p1.get(2);
          if (uDrawable1 == null) {
             if (p2 != null) {
                p2.accept(Boolean.FALSE);
             }
             a.s(KernelsLogBiz.RATING, str, "setRatingDrawable, but secondaryDrawable is null");
             return;
          }else {
             Drawable uDrawable2 = p1.get(1);
             if (uDrawable2 == null) {
                if (p2 != null) {
                   p2.accept(Boolean.FALSE);
                }
                a.s(KernelsLogBiz.RATING, str, "setRatingDrawable, but progressDrawable is null");
                return;
             }else if(p2 != null){
                p2.accept(Boolean.TRUE);
             }
             Drawable[] uDrawableArr = new Drawable[i];
             uDrawableArr[0] = uDrawable;
             uDrawableArr[1] = uDrawable1;
             uDrawableArr[2] = uDrawable2;
             LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
             layerDrawabl.setId(0, 0x1020000);
             layerDrawabl.setId(1, 0x102000f);
             layerDrawabl.setId(2, 0x102000d);
             p0.setProgressDrawableTiled(layerDrawabl);
             return;
          }
       }
    }
    public static b f(RatingBar p0,HashMap p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyTwoRefs(p0, p1, null, MerchantRatingHelper.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyThreeRefs(p0, p1, null, null, MerchantRatingHelper.class, "3");
       if (obj != patchProxyRe) {
       }else {
          obj = PatchProxy.applyFourRefs(p0, p1, null, null, null, MerchantRatingHelper.class, "4");
          if (obj != patchProxyRe) {
          }else {
             obj = MerchantRatingHelper.g(p0, p1, null, null, a1.d(0x7f070267));
          }
       }
       return obj;
    }
    public static b g(RatingBar p0,HashMap p1,ArrayMap p2,a p3,int p4){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantRatingHelper merchantRati = MerchantRatingHelper.class;
       int i = 3;
       if (PatchProxy.isSupport(merchantRati)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, merchantRati, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (p1 == null || p1.size() != i) {
          return c.b();
       }else if(PatchProxy.isSupport(merchantRati)){
          ot = PatchProxy.applyThreeRefs(p1, p0, Integer.valueOf(p4), null, MerchantRatingHelper.class, "7");
          if (ot != patchProxyRe) {
          label_0068 :
             return MerchantRatingHelper.d(p0, ot, p2, p3);
          }
       }
       ot = t.fromIterable(p1.entrySet()).concatMap(new i(p0, p4)).toList().d0();
       goto label_0068 ;
    }
}
