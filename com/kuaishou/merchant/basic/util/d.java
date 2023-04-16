package com.kuaishou.merchant.basic.util.d;
import android.util.SparseIntArray;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.view.View;
import java.lang.CharSequence;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.Bitmap;
import ot3.a;
import lnc.b3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.widget.TextView;
import java.lang.Boolean;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel$Style;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import bld.b;
import bld.c;
import com.yxcorp.widget.KwaiRadiusStyles;
import nt3.a;
import java.util.List;
import brd.t;
import java.lang.Float;
import crd.a;
import com.kuaishou.merchant.basic.util.c;
import io.reactivex.g;
import ot3.r;
import erd.o;
import ot3.p;
import erd.a;
import ekd.j;
import java.util.ArrayList;
import ekd.p1;
import android.widget.LinearLayout;
import ekd.m1;
import com.yxcorp.utility.n;
import java.lang.IllegalArgumentException;
import java.util.Collection;
import ekd.q;
import android.text.SpannableStringBuilder;
import android.app.Application;
import o56.a;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.basic.util.d$b;
import android.net.Uri;
import ekd.x0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.kuaishou.merchant.basic.util.d$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import ot3.w0;
import android.text.Html$ImageGetter;
import android.text.Html$TagHandler;
import android.text.Spanned;
import android.text.Html;
import android.text.Spannable;
import android.graphics.Typeface;

public final class d	// class@0015d9
{
    public static SparseIntArray a;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       d.a = sparseIntArr;
       sparseIntArr.put(1, R.drawable.arg_RES_7f08171b);
       d.a.put(3, R.drawable.arg_RES_7f080e63);
       d.a.put(4, R.drawable.arg_RES_7f080e64);
       d.a.put(5, R.drawable.arg_RES_7f080e65);
       d.a.put(6, R.drawable.arg_RES_7f080e66);
       d.a.put(7, R.drawable.arg_RES_7f080ea9);
       d.a.put(8, R.drawable.arg_RES_7f080ed7);
       d.a.put(9, R.drawable.arg_RES_7f080371);
       d.a.put(10, R.drawable.arg_RES_7f080e67);
       d.a.put(11, R.drawable.arg_RES_7f080e68);
       d.a.put(12, R.drawable.arg_RES_7f080e6c);
       d.a.put(13, R.drawable.arg_RES_7f080ea7);
       d.a.put(14, R.drawable.arg_RES_7f0803bf);
       d.a.put(15, R.drawable.arg_RES_7f080ed6);
       d.a.put(16, R.drawable.arg_RES_7f080ee7);
       d.a.put(17, R.drawable.arg_RES_7f0803b8);
       d.a.put(18, R.drawable.arg_RES_7f080383);
       d.a.put(20, R.drawable.arg_RES_7f080e98);
       d.a.put(26, R.drawable.arg_RES_7f0816ff);
       d.a.put(35, R.drawable.arg_RES_7f0803b7);
    }
    public void d(){
       super();
    }
    public static void a(StringBuilder p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "20")) {
          return;
       }
       p0+"<"+"img"+" src="+"\'"+p1+"\'"+">";
       return;
    }
    public static String b(Commodity$IconLabel p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.toString(p0.hashCode());
    }
    public static CharSequence c(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BitmapDrawable obj = PatchProxy.applyOneRefs(p0, null, d.class, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new BitmapDrawable(a1.m(), a.a(p0));
       SpannableString spannableStr = PatchProxy.applyOneRefs(obj, null, d.class, "36");
       if (spannableStr != patchProxyRe) {
       }else {
          b3 uob3 = new b3(a1.c(), obj);
          uob3.b(false);
          uob3.g(a1.d(R.dimen.arg_RES_7f07031b));
          spannableStr = uob3.a();
       }
       return spannableStr;
    }
    public static void d(TextView p0,Commodity$IconLabel p1,boolean p2){
       int i;
       KwaiRadiusStyles kwaiRadiusSt;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, d.class, "10")) {
          return;
       }
       if (p1.mStyle != null) {
          Object obj = null;
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, uod, "14")) {
             i = a1.e((float)p1.mStyle.mPaddingHorizontal);
             Commodity$IconLabel mStyle1 = p1.mStyle;
             if (mStyle1 != null && mStyle1.mPaddingHorizontal != -1) {
                p0.setPadding(i, p0.getPaddingTop(), i, p0.getPaddingBottom());
             }
          }
          d.r(p0, p1.mStyle);
          if (!p2) {
             Commodity$IconLabel mStyle = p1.mStyle;
             if (!PatchProxy.applyVoidTwoRefs(p0, mStyle, obj, uod, "11")) {
                i = TextUtils.J(mStyle.mBackgroundColor, 0);
                int i1 = TextUtils.J(mStyle.mDividerColor, 0);
                Commodity$IconLabel$Style mDividerColo = mStyle.mDividerColorAlpha;
                if (mDividerColo > 0) {
                   i1 = Color.argb((int)(mDividerColo * 0x437f0000), Color.red(i1), Color.green(i1), Color.blue(i1));
                }
                if (i || i1) {
                   b uob = new b();
                   if (i) {
                      uob.v(i);
                   }
                   if (i1) {
                      uob.w(i1);
                      Commodity$IconLabel$Style mBorderWidth = mStyle.mBorderWidth;
                      if (mBorderWidth <= 0) {
                         mBorderWidth = 0x3f000000;
                      }
                      uob.x(mBorderWidth);
                   }
                   Commodity$IconLabel$Style mCornerRadiu = mStyle.mCornerRadius;
                   if (PatchProxy.isSupport(uod)) {
                      kwaiRadiusSt = PatchProxy.applyOneRefs(Integer.valueOf(mCornerRadiu), obj, uod, "12");
                      if (kwaiRadiusSt != PatchProxyResult.class) {
                      }else {
                      label_00b9 :
                         kwaiRadiusSt = KwaiRadiusStyles.R2;
                         if (mCornerRadiu >= null) {
                            kwaiRadiusSt = new a((float)mCornerRadiu);
                         }
                      }
                   }else {
                      goto label_00b9 ;
                   }
                   uob.g(kwaiRadiusSt);
                   p0.setBackground(uob.a());
                }
             }
          }
          Commodity$IconLabel$Style mTagHeight = p1.mStyle.mTagHeight;
          if (mTagHeight > null) {
             p0.setHeight(a1.e((float)mTagHeight));
          }else {
             p0.setHeight(a1.e(14.00f));
          }
       }
       return;
    }
    public static t e(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.f(p0, 0, false);
    }
    public static t f(List p0,float p1,boolean p2){
       a obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Boolean.valueOf(p2), null, d.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       return t.create(new c(p0, obj, p1, p2)).map(new r(p0)).doOnDispose(new p(obj));
    }
    public static t g(Commodity$IconLabel[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.h(p0)) {
          return t.empty();
       }
       return d.e(j.a(p0));
    }
    public static t h(Commodity$IconLabel[] p0,float p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, uod, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return d.i(p0, p1, false);
    }
    public static t i(Commodity$IconLabel[] p0,float p1,boolean p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Boolean.valueOf(p2), null, d.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (j.h(p0)) {
          return t.empty();
       }else {
          return d.f(j.a(p0), p1, p2);
       }
    }
    public static Drawable j(int p0,String p1,String p2,String p3){
       LinearLayout obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, null, d.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = p1.g(a1.c(), R.layout.arg_RES_7f0d068e);
       TextView textView = m1.f(obj, R.id.tv_coupon_prefix);
       TextView textView1 = m1.f(obj, R.id.fans_group_coupon_suffix);
       textView.setText(p2);
       m1.f(obj, R.id.tv_coupon_content).setText(p1);
       int i = 0;
       if (!TextUtils.x(p3)) {
          textView1.setText(p3);
          textView1.setVisibility(i);
          obj.setBackgroundResource(p0);
       }else {
          textView1.setVisibility(8);
          textView.setPadding(a1.d(R.dimen.arg_RES_7f07030a), a1.d(R.dimen.arg_RES_7f0702ac), i, i);
          obj.setBackgroundResource(R.drawable.arg_RES_7f081700);
       }
       return new BitmapDrawable(a1.m(), a.a(obj));
    }
    public static Drawable k(int p0,Commodity$IconLabel p1){
       TextView obj1;
       d uod = d.class;
       Commodity$IconLabel obj = null;
       if (PatchProxy.isSupport(uod)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, uod, "9");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = n.G(a1.c(), R.layout.arg_RES_7f0d068d);
       obj1.setText(p1.mContent);
       obj1.setBackgroundResource(p0);
       Bitmap uBitmap = 1;
       if (!PatchProxy.applyVoidTwoRefs(obj1, p1, obj, uod, "15")) {
          if (p1.mType == 26) {
             p1.mContentTextColor = "#FFFFFF";
             p1.mContentTextSize = 10;
          }
          Commodity$IconLabel mContentText = p1.mContentTextColor;
          obj = p1.mContentTextSize;
          if (mContentText != null && !mContentText.isEmpty()) {
             try{
                obj1.setTextColor(Color.parseColor(mContentText));
             }catch(java.lang.IllegalArgumentException e4){
                e4.toString();
             }
          }
       }
    label_0065 :
       if (p1.mStyle != null) {
          d.d(obj1, p1, false);
       }else {
          obj1.setHeight(a1.e(14.00f));
          obj1.setTextSize(uBitmap, 9.00f);
       }
       return new BitmapDrawable(a1.m(), a.a(obj1));
    }
    public static CharSequence l(List p0){
       Commodity$IconLabel[] obj = PatchProxy.applyOneRefs(p0, null, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          return new SpannableStringBuilder();
       }
       obj = new Commodity$IconLabel[p0.size()];
       return d.m(p0.toArray(obj));
    }
    public static CharSequence m(Commodity$IconLabel[] p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = null;
       SparseIntArray obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = d.a;
       SpannableStringBuilder spannableStr = PatchProxy.applyTwoRefs(obj1, p0, obj, uod, "6");
       if (spannableStr != patchProxyRe) {
       }else if(obj1 == null || j.h(p0)){
          spannableStr = new SpannableStringBuilder();
       }else {
          spannableStr = new SpannableStringBuilder();
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject != null) {
                spannableStr.append(d.n(obj1, oobject));
             }
             i = i + 1;
          }
       }
       return spannableStr;
    }
    public static CharSequence n(SparseIntArray p0,Commodity$IconLabel p1){
       Drawable uDrawable = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, uDrawable, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = p0.get(p1.mType);
       if (i <= 0) {
          return "";
       }
       if (!TextUtils.x(p1.mPrefix)) {
          uDrawable = d.j(i, p1.mContent, p1.mPrefix, p1.mSuffix);
       }else if(!TextUtils.x(p1.mContent)){
          uDrawable = d.k(i, p1);
       }
       b3 uob3 = (uDrawable != null)? new b3(a.b(), uDrawable): new b3(a.b(), i);
       uob3.b(false);
       uob3.g(a1.d(R.dimen.arg_RES_7f07031b));
       return uob3.a();
    }
    public static boolean o(Commodity p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!j.h(p0.getShowIconList())) {
          Commodity$IconLabel[] showIconList = p0.getShowIconList();
          int len = showIconList.length;
          int i = 0;
          while (i < len) {
             object oobject = showIconList[i];
             if (oobject != null && oobject.mType == p1) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static void p(String p0,d$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "35")) {
          return;
       }
       Uri uri = x0.f(p0);
       if (uri == null) {
          return;
       }
       a.d(ImageRequestBuilder.k(uri).a(), new d$a(p1));
       return;
    }
    public static void q(TextView p0,String p1,Commodity p2,Commodity$IconLabel[] p3){
       int i = a1.d(R.dimen.arg_RES_7f07031b);
       d uod = d.class;
       int i1 = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(i),p3};
          if (PatchProxy.applyVoid(objArray, null, uod, "17")) {
          label_0090 :
             return;
          }
       }
       StringBuilder str = PatchProxy.applyTwoRefs(p1, p3, null, uod, "18");
       if (str != PatchProxyResult.class) {
       }else {
          str = "";
          if (j.h(p3)) {
             str = str+p1;
          }else {
             int len = p3.length;
             while (i1 < len) {
                object oobject = p3[i1];
                if (!TextUtils.x(oobject.mIconUrl)) {
                   if (oobject.getWidth() >= 1 && oobject.getHeight() >= 1) {
                      d.a(str, oobject.mIconUrl);
                   }
                }else {
                   d.a(str, d.b(oobject));
                }
                i1 = i1 + 1;
             }
             str = str+p1;
          }
       }
       w0 ow0 = new w0(p0, p2, p3);
       ow0.d = i;
       p0.setText(Html.fromHtml(str, ow0, null));
       goto label_0090 ;
    }
    public static void r(TextView p0,Commodity$IconLabel$Style p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "13")) {
          return;
       }
       if (p1.mContentBold != null) {
          p0.setTypeface(Typeface.DEFAULT_BOLD);
       }
       if (!TextUtils.x(p1.mTextColor)) {
          p0.setTextColor(TextUtils.J(p1.mTextColor, a1.a(R.color.arg_RES_7f061dfb)));
       }
       p1 = p1.mTextSize;
       if (p1 > null) {
          p0.setTextSize(1, (float)p1);
       }else {
          p0.setTextSize(1, 9.00f);
       }
       return;
    }
}
