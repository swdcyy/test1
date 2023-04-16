package nfd.o3;
import com.yxcorp.plugin.search.utils.j0;
import android.widget.TextView;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import com.yxcorp.plugin.search.result.widget.RounderCornerRelativeLayout;
import android.content.Context;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Boolean;
import ekd.j;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.plugin.search.response.SearchGoodsInfo$ActivityTagIcon;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.lang.Number;
import y17.a;
import nfd.t0;
import java.util.List;
import zf6.j;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.CouponTextEntity;
import nfd.r3;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;
import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView$n;
import nfd.o3$a;
import com.google.android.material.appbar.AppBarLayout;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import nfd.a1;
import com.yxcorp.plugin.search.entity.SearchFilter;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import o56.a;
import com.yxcorp.utility.n;
import java.lang.Float;
import android.text.TextPaint;
import com.yxcorp.plugin.search.entity.TemplateText;
import zf6.k;
import nfd.o3$b;
import ub.b;
import android.widget.ImageView;
import nfd.m0$a;
import nfd.m0;
import nfd.n0;

public class o3 extends j0	// class@001ded
{
    public static final int f;

    public void o3(){
       super();
    }
    public static void G(TextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, o3.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.x(p1)) {
          p0.setVisibility(8);
       }else {
          p0.setText(p1);
          p0.setVisibility(0);
       }
       return;
    }
    public static void H(View p0,int p1){
       o3 oo3 = o3.class;
       if (PatchProxy.isSupport(oo3) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oo3, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setVisibility(p1);
       return;
    }
    public static void M(View p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(o3.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, o3.class, "28")) {
          return;
       }
       if (p2 > 0 && p1 > 0) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          if (p3 > 0) {
             layoutParams.height = p3;
          }
          layoutParams.width = (int)((float)(layoutParams.height * p1) / (float)p2);
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public static View N(View p0){
       RounderCornerRelativeLayout obj = PatchProxy.applyOneRefs(p0, null, o3.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getParent() != null && p0 instanceof RounderCornerRelativeLayout) {
          return p0;
       }
       obj = new RounderCornerRelativeLayout(p0.getContext());
       obj.setBackgroundResource(R.drawable.arg_RES_7f081e78);
       obj.addView(p0);
       return obj;
    }
    public static boolean O(KwaiImageView p0,String p1,CDNUrl[] p2){
       a$a obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, o3.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (TextUtils.x(p1) && j.h(p2)) {
          return b;
       }
       obj = a.d();
       obj.b(":ks-features:ft-search:search-result");
       obj.d(ImageSource.ICON);
       a uoa = obj.a();
       if (!j.h(p2)) {
          p0.X(p2, uoa);
       }else {
          p0.M(p1, uoa);
       }
       return true;
    }
    public static int P(SearchGoodsInfo$ActivityTagIcon p0,Drawable p1,SpannableStringBuilder p2,int p3){
       a obj;
       if (PatchProxy.isSupport(o3.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, o3.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p1 == null) {
          return 0;
       }else {
          obj = new a(p1, " ");
          int o = t0.o;
          obj.c((int)((p0.mWidth / p0.mHeight) * (float)o), o);
          p2.append(" ");
          o = p3 + 1;
          p2.setSpan(obj, p3, o, 17);
          p2.append(" ");
          o++;
          return o;
       }
    }
    public static SpannableStringBuilder Q(Context p0,boolean p1,List p2){
       if (PatchProxy.isSupport(o3.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, null, o3.class, "34");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return o3.R(p0, p1, p2, j.b(p0, 0x7f060751));
    }
    public static SpannableStringBuilder R(Context p0,boolean p1,List p2,int p3){
       StringBuilder obj;
       if (PatchProxy.isSupport(o3.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), null, o3.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(p2)) {
          return null;
       }else {
          obj = "";
          Iterator iterator = p2.iterator();
          String str = "";
          while (iterator.hasNext()) {
             CouponTextEntity uCouponTextE = iterator.next();
             obj = obj+uCouponTextE.mCouponText;
             if (uCouponTextE.mHightlighType == 1) {
                str = uCouponTextE.mCouponText;
             }
          }
          int i = j.b(p0, R.color.arg_RES_7f060751);
          if (p3 <= 0) {
             p3 = i;
          }
          return r3.t(p3, p1, obj, str);
       }
    }
    public static View S(int p0,RecyclerFragment p1){
       o3 oo3 = o3.class;
       if (PatchProxy.isSupport(oo3)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, oo3, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null || p1.h0() == null) {
          return null;
       }else {
          return p1.h0().getLayoutManager().findViewByPosition(p0);
       }
    }
    public static int T(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o3.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = a1.a(R.color.arg_RES_7f06202f);
       try{
          i = Color.parseColor(p0);
          return e0;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public static RecyclerView$n U(int p0,int p1,int p2){
       if (PatchProxy.isSupport(o3.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, o3.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new o3$a(p0, p1, p2);
    }
    public static void V(AppBarLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, o3.class, "22")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       View childAt = p0.getChildAt(0);
       childAt.getLayoutParams().d(21);
       childAt.requestLayout();
       return;
    }
    public static boolean W(a1 p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, o3.class, "25");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          a1 uoa1 = a1.class;
          Object obj2 = PatchProxy.apply(obj, p0, uoa1, "22");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             obj = PatchProxy.apply(obj, p0, uoa1, "21");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else if(!p0.m()){
                b1 = false;
             }else {
                Iterator iterator = p0.a.iterator();
                String str = null;
                while (iterator.hasNext()) {
                   obj = iterator.next().iterator();
                   while (true) {
                      if (obj.hasNext()) {
                         SearchFilter searchFilter = obj.next();
                         if (searchFilter.mIsSelect != null && ((searchFilter.mFilterType).equals("101") || (searchFilter.mFilterType).equals("903"))) {
                            str = 1;
                         }
                      }
                      if (str) {
                      }else {
                         continue ;
                      }
                   }
                   return b;
                }
                b1 = str;
             }
             if (b1 && !PermissionUtils.a(a1.c(), "android.permission.ACCESS_FINE_LOCATION")) {
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (b1) {
             goto label_0094 ;
          }
       }
       b = false;
       goto label_0094 ;
    }
    public static void X(Activity p0,int p1){
       o3 oo3 = o3.class;
       if (PatchProxy.isSupport(oo3) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oo3, "2")) {
          return;
       }
       String str = j0.f(p0.getIntent(), "searchKeyword");
       KwaiActionBar kwaiActionBa = p0.findViewById(R.id.title_root);
       TextView titleTextVie = kwaiActionBa.getTitleTextView();
       float f = (float)(j0.p(a.B) - n.c(a.B, 130.00f));
       if (PatchProxy.isSupport(oo3)) {
          Context obj = PatchProxy.applyFourRefs(Integer.valueOf(p1), str, titleTextVie, Float.valueOf(f), null, o3.class, "9");
          if (obj != PatchProxyResult.class) {
             str = obj;
          }else {
          label_005e :
             obj = titleTextVie.getContext();
             if (obj != null) {
                Object[] objArray = new Object[]{str};
                float f1 = titleTextVie.getPaint().measureText(obj.getString(p1, objArray));
                if (f1 - f >= 0) {
                   int i = str.length();
                   String str1 = str;
                   while (f1 - f > 0 && i > 0) {
                      str1 = str.substring(0, i)+"...";
                      objArray = new Object[]{str1};
                      f1 = titleTextVie.getPaint().measureText(obj.getString(p1, objArray));
                      i = i - 1;
                   }
                   str = str1;
                }
             }
          }
       }else {
          goto label_005e ;
       }
       kwaiActionBa.e(R.drawable.arg_RES_7f0819d9, -1, a1.r(p1, str));
       return;
    }
    public static void Y(TextView p0,TemplateText p1){
       boolean b;
       o3 oo3 = o3.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, oo3, "17")) {
          return;
       }
       Object obj1 = PatchProxy.applyOneRefs(p1, obj, oo3, "21");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else if(p1 == null || TextUtils.x(p1.mText)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p0.setVisibility(8);
       }else {
          o3.G(p0, p1.mText);
       }
       return;
    }
    public static void Z(TextView p0,TemplateText p1,int p2){
       if (PatchProxy.isSupport(o3.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, o3.class, "18")) {
          return;
       }
       if (p1 != null) {
          p1 = p1.mColorInt;
          if (p1 != null) {
             p0.setTextColor(p1);
          label_002b :
             return;
          }
       }
       p0.setTextColor(j.d(p0, p2));
       goto label_002b ;
    }
    public static void a0(TextView p0,TemplateText p1,int p2,int p3){
       if (PatchProxy.isSupport(o3.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, o3.class, "19")) {
          return;
       }
       if (k.d()) {
          p0.setTextColor(j.d(p0, p3));
          return;
       }else if(p1 != null){
          p1 = p1.mColorInt;
          if (p1 != null) {
             p0.setTextColor(p1);
          label_003d :
             return;
          }
       }
       p0.setTextColor(j.d(p0, p2));
       goto label_003d ;
    }
    public static void b0(CDNUrl[] p0,int p1,KwaiImageView p2){
       if (PatchProxy.isSupport(o3.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, o3.class, "26")) {
          return;
       }
       p2.a0(p0, new o3$b(p2, p1));
       return;
    }
    public static void c0(int p0,KwaiImageView p1,View p2,TextView p3,boolean p4){
       o3 oo3 = o3.class;
       if (PatchProxy.isSupport(oo3)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oo3, "20")) {
             return;
          }
       }
       if (p0 == 1 || p0 == 2) {
          p2.setSelected(1);
          p3.setText(a1.p(R.string.arg_RES_7f1014be));
       }else {
          p2.setSelected(0);
          p3.setText(a1.p(R.string.arg_RES_7f100729));
       }
       p1.setVisibility(8);
       m0$a uoa = new m0$a();
       uoa.c(p0);
       uoa.f(R.drawable.arg_RES_7f081e90);
       uoa.b(1);
       uoa.e(p4);
       n0.a(p2, p1, p3, uoa.a());
       return;
    }
}
