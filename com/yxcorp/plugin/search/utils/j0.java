package com.yxcorp.plugin.search.utils.j0;
import nfd.t0;
import java.lang.String;
import lnc.a1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.plugin.search.utils.j0$d;
import android.view.ViewOutlineProvider;
import com.yxcorp.plugin.search.utils.j0$c;
import android.widget.TextView;
import java.lang.Boolean;
import android.content.Context;
import androidx.core.content.ContextCompat;
import java.lang.Float;
import ufd.p;
import com.kwai.robust.PatchProxyResult;
import android.os.Vibrator;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.ImageView;
import zf6.j;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.Number;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import s0d.f;
import com.yxcorp.gifshow.model.CDNUrl;
import uc.d;
import s0d.a;
import s0d.e;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import android.view.ViewGroup;
import tkd.b;
import tkd.d;
import os5.l;
import android.os.Build$VERSION;
import xtd.a;
import com.yxcorp.plugin.search.utils.j0$b;
import ytd.b;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import nfd.p3;
import java.lang.Runnable;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.graphics.Typeface;
import o56.a;
import ekd.d0;
import com.yxcorp.utility.n;
import rkd.b;
import com.kuaishou.webkit.URLUtil;
import zf6.k;
import zf6.l;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.plugin.search.utils.j0$a;
import android.graphics.drawable.GradientDrawable;
import lnc.d2;
import k06.a;
import android.text.TextPaint;
import nfd.s1;
import com.kwai.sdk.switchconfig.a;
import android.text.TextUtils;
import android.graphics.Paint;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;
import com.kwai.framework.model.user.User$FollowStatus;
import android.graphics.Color;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.StringBuilder;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.utility.SystemUtil;
import vb5.b;
import vb5.a;
import jd.c;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.DraweeView;

public class j0	// class@0007a8
{
    public static final int a;
    public static int b;
    public static final String c;
    public static final String d;
    public static final int e;

    static {
       j0.a = t0.t;
       j0.c = a1.p(0x7f1044cf);
       j0.d = a1.p(0x7f1044cd);
       j0.e = t0.Y;
    }
    public void j0(){
       super();
    }
    public static void A(View p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj0, "44")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setClipToOutline(true);
       p0.setOutlineProvider(new j0$d(p1));
       return;
    }
    public static void B(View p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj0, "43")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setClipToOutline(true);
       p0.setOutlineProvider(new j0$c(p1));
       return;
    }
    public static void C(boolean p0,TextView p1,int p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), null, j0.class, "12")) {
          return;
       }
       if (p0) {
          p1.setTextColor(a1.a(R.color.arg_RES_7f061e52));
          return;
       }else {
          p1.setTextColor(ContextCompat.getColor(p1.getContext(), p2));
          return;
       }
    }
    public static void D(View p0,float p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, oj0, "42")) {
          return;
       }
       if (p0 != null) {
          p0.setOutlineProvider(new p(p1));
          p0.setClipToOutline(true);
       }
       return;
    }
    public static boolean E(int p0,TextView p1,boolean p2,String p3){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, null, j0.class, "36");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (p0 >= 0 || p1.getVisibility()) {
          p1.setTranslationX(0);
          return b;
       }else {
          int i = - p0;
          boolean a = j0.a;
          if (i <= a) {
             p1.setTranslationX((float)p0);
          }else {
             p1.setTranslationX(((float)(- a) + ((float)(p0 + a) / 2.00f)));
          }
          a = true;
          Context uContext = (i > j0.e)? 1: null;
          String d = (uContext)? j0.d: j0.c;
          if (!uContext) {
             p2 = false;
          }
          if (uContext && !p2) {
             uContext = p1.getContext();
             if (!PatchProxy.applyVoidOneRefs(uContext, null, oj0, "35")) {
                Vibrator systemServic = uContext.getSystemService("vibrator");
                if (systemServic != null && (systemServic.hasVibrator() && PermissionUtils.a(uContext, "android.permission.VIBRATE"))) {
                   systemServic.vibrate(20);
                }
             }
          }else {
             a = p2;
          }
          p1.setText(d);
          if (!TextUtils.x(null)) {
             p1.setText(null);
          }
          return a;
       }
    }
    public static void F(boolean p0,TextView p1,int p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Integer.valueOf(p2), null, j0.class, "13")) {
          return;
       }
       if (p0) {
          p1.setTextColor(a1.a(R.color.arg_RES_7f06204a));
          return;
       }else {
          p1.setTextColor(ContextCompat.getColor(p1.getContext(), p2));
          return;
       }
    }
    public static void G(TextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j0.class, "17")) {
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
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj0, "15")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setVisibility(p1);
       return;
    }
    public static void I(View p0,int p1,int p2,int p3,int p4){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oj0, "37")) {
             return;
          }
       }
       if (p0 == null) {
          return;
       }else {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.setMargins(p1, p2, p3, p4);
          p0.setLayoutParams(layoutParams);
          return;
       }
    }
    public static void J(TextView p0,ImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j0.class, "34")) {
          return;
       }
       p0.setTextSize(2, 13.00f);
       p0.setTextColor(j.d(p0, R.color.arg_RES_7f0607d6));
       ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
       int m = t0.m;
       layoutParams.height = m;
       layoutParams.width = m;
       p1.setLayoutParams(layoutParams);
       return;
    }
    public static void K(User p0,ImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j0.class, "2")) {
          return;
       }
       j0.L(p0, p1, false);
       return;
    }
    public static void L(User p0,ImageView p1,boolean p2){
       int i1;
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, j0.class, "3")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       int i = 8;
       if (p0 == null) {
          p1.setVisibility(i);
          return;
       }else {
          User mVerifiedDet = p0.mVerifiedDetail;
          if (mVerifiedDet != null) {
             i1 = j0.m(mVerifiedDet.mIconType, p2);
             if (i1) {
                p1.setVisibility(0);
                p1.setImageResource(i1);
             }else {
                p1.setVisibility(i);
             }
          }else if(p0.isVerified()){
             p1.setVisibility(0);
             Object obj = PatchProxy.applyOneRefs(p0, null, oj0, "4");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else if(p0.isBlueVerifiedType()){
                i1 = 0x7f080581;
             }else {
                i1 = 0x7f08059f;
             }
             p1.setImageResource(i1);
          }else {
             p1.setVisibility(i);
          }
          return;
       }
    }
    public static void a(KwaiBindableImageView p0,User p1,HeadImageSize p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, j0.class, "11")) {
          return;
       }
       b uob = null;
       d uod = p0.g0(uob, uob, f.x().r(p1.mAvatars).t(p1.mAvatar).p(new d(p2.getSize(), p2.getSize())).w());
       if (uod != null) {
          uob = uod.e();
       }
       p0.setController(uob);
       return;
    }
    public static void b(LiveCoverIconView p0,LiveStreamFeed p1,int p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, j0.class, "1")) {
          return;
       }
       if (p1 != null) {
          LiveStreamFeed mLiveStreamM = p1.mLiveStreamModel;
          if (mLiveStreamM != null && !q.f(mLiveStreamM.mCoverWidgets)) {
             LiveCoverWidgetModel liveCoverWid = p1.mLiveStreamModel.mCoverWidgets.get(0);
             if (liveCoverWid == null) {
                p0.setVisibility(8);
                return;
             }else {
                p0.setVisibility(0);
                p0.N(liveCoverWid);
                d.a(-1492894991).Zj(p1, p2);
                return;
             }
          }
       }
       p0.setVisibility(8);
       return;
    }
    public static void c(View p0,int p1,int p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, j0.class, "29")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.height = a1.e((float)p2);
       layoutParams.width = a1.e((float)p1);
       p0.setLayoutParams(layoutParams);
       return;
    }
    public static void d(View[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j0.class, "23")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             p0[i].setDefaultFocusHighlightEnabled(false);
          }
       }
       return;
    }
    public static a e(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j0.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(new j0$b(p0), 0x3fc00000, 2.00f, 0xbf800000);
    }
    public static Bitmap f(Drawable p0,int p1,int p2,Bitmap$Config p3){
       if (PatchProxy.isSupport(j0.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, j0.class, "52");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          Bitmap uBitmap = Bitmap.createBitmap(p1, p2, p3);
          p0.setBounds(0, 0, p1, p2);
          p0.draw(new Canvas(uBitmap));
          return uBitmap;
       }
    }
    public static void g(TextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j0.class, "32")) {
          return;
       }
       if (TextUtils.x(p1)) {
          p0.setText(p1);
          return;
       }else {
          p0.setText("");
          p0.post(new p3(p0, p1));
          return;
       }
    }
    public static void h(View p0,View p1,int p2){
       if (PatchProxy.isSupport(j0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, j0.class, "7")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Rect rect = new Rect();
          p1.getHitRect(rect);
          rect.top = rect.top - p2;
          rect.bottom = rect.bottom + p2;
          rect.left = rect.left - p2;
          rect.right = rect.right + p2;
          p0.setTouchDelegate(new TouchDelegate(rect, p1));
       }
       return;
    }
    public static Typeface i(){
       Object obj = PatchProxy.apply(null, null, j0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d0.a("alte-din.ttf", a.B);
    }
    public static int j(Context p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oj0, "48");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = n.z(p0);
       if (!b.g()) {
          int a0 = t0.A0;
          if (i > a0) {
             i = a0;
          }
       }
       return (((i - (t0.t * 2)) - (t0.i * (p1 - 1))) / p1);
    }
    public static String k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j0.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       if (URLUtil.isNetworkUrl(p0) && k.d()) {
          p0 = l.j(p0);
       }
       return p0;
    }
    public static Drawable l(Context p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oj0, "50");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return ContextCompat.getDrawable(p0, p1);
    }
    public static int m(int p0,boolean p1){
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                p0 = 0;
             }else if(p1){
                p0 = 0x7f081ed1;
             }else {
                p0 = 0x7f080594;
             }
          }else if(p1){
             p0 = 0x7f081ebe;
          }else {
             p0 = 0x7f080581;
          }
       }else if(p1){
          p0 = 0x7f081eda;
       }else {
          p0 = 0x7f08059f;
       }
       return p0;
    }
    public static RecyclerView$n n(int p0,int p1,int p2,int p3,int p4,int p5){
       Object obj;
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, null, oj0, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       j0$a uoa = new j0$a(p0, p4, p2, p5, p1, p3);
       return obj;
    }
    public static Drawable o(int p0,float p1,float p2,float p3,float p4){
       float[] obj;
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, oj0, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{p1,p1,p2,p2,p3,p3,p4,p4};
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setShape(0);
       gradientDraw.setGradientType(0);
       gradientDraw.setCornerRadii(obj);
       gradientDraw.setColor(p0);
       return gradientDraw;
    }
    public static int p(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j0.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!j0.b || d2.g()) {
          j0.b = n.z(p0);
       }
       return j0.b;
    }
    public static Drawable q(Context p0){
       a obj = PatchProxy.applyOneRefs(p0, null, j0.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.f((float)t0.x0);
       obj.i(j.b(p0, R.color.arg_RES_7f0608c5));
       return obj.a();
    }
    public static float r(TextView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j0.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (p0 != null && !TextUtils.x(p1)) {
          return p0.getPaint().measureText(p1);
       }
       return 0;
    }
    public static void s(View p0){
       boolean b;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, j0.class, "53")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String obj1 = PatchProxy.apply(obj, obj, s1.class, "25");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          obj1 = a.t().c("validGrayWhiteMaskPages", "");
          b = (!TextUtils.isEmpty(obj1) && obj1.contains("SEARCH_ALL"))? true: false;
       }
       if (b) {
          j0.t(p0);
       }
       return;
    }
    public static void t(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j0.class, "55")) {
          return;
       }
       Paint paint = new Paint();
       ColorMatrix uColorMatrix = new ColorMatrix();
       uColorMatrix.setSaturation(0);
       paint.setColorFilter(new ColorMatrixColorFilter(uColorMatrix));
       p0.setLayerType(2, paint);
       return;
    }
    public static boolean u(User p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.isPrivate() && p0.getFollowStatus() != User$FollowStatus.FOLLOWING) {
          b = true;
       }
       return b;
    }
    public static int v(String p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oj0, "47");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (TextUtils.x(p0)) {
          return p1;
       }else {
          try{
             return Color.parseColor(p0);
          }catch(java.lang.Exception e4){
             ExceptionHandler.handleCaughtException(e4);
             return p1;
          }
       }
    }
    public static int w(String p0,int p1){
       int i;
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oj0, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (TextUtils.x(p0)) {
          return p1;
       }else if(p0.startsWith("#")){
          i = TextUtils.J(p0, p1);
       }else {
          i = TextUtils.J("#"+p0, p1);
       }
       return i;
    }
    public static void x(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j0.class, "20")) {
          return;
       }
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(p0);
       }
       return;
    }
    public static void y(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j0.class, "31")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0 instanceof RecyclerView) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          if (!layoutManage instanceof LinearLayoutManager) {
             return;
          }else if(layoutManage.h()){
             p0.scrollToPosition(0);
          }
          return;
       }else if(p0.getScrollY()){
          p0.scrollTo(p0.getScrollX(), 0);
       }
       return;
    }
    public static void z(CDNUrl[] p0,String p1,KwaiImageView p2,View p3,boolean p4){
       int width;
       int height;
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, oj0, "46")) {
             return;
          }
       }
       if (!SystemUtil.a(21)) {
          return;
       }else if(p3 != null){
          width = p3.getWidth();
          height = p3.getHeight();
       }else {
          height = 0;
          width = 0;
       }
       f uof = f.x();
       if (TextUtils.x(p1)) {
          uof.r(p0);
       }else {
          uof.t(p1);
       }
       f uof1 = uof.o(width, height);
       int i = 170;
       b uob = (p4)? new b(i): new a(i);
       p2.setVisibility(0);
       d uod = Fresco.newDraweeControllerBuilder();
       uod.y(p2.getController());
       uod.u(uof1.l(uob).w());
       p2.setController(uod.e());
       return;
    }
}
