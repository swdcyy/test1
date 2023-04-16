package com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import wy6.a;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import java.lang.String;
import com.kwai.sdk.switchconfig.a;
import android.content.Context;
import ix6.c;
import ix6.a;
import uy6.h;
import uy6.b;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import k2b.u1;
import java.lang.CharSequence;
import e17.i;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import android.view.ViewGroup;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import android.view.View;
import java.lang.Integer;
import ix6.e;
import lw6.a;
import ix6.g;
import android.graphics.Canvas;
import java.lang.Long;
import java.util.Objects;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import java.lang.Number;
import h3.a;
import cw6.b;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.SystemUtil;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.util.Log;
import android.view.View$MeasureSpec;
import lnc.a1;
import java.lang.Math;
import com.kwai.library.groot.framework.viewpager.constant.GrootTargetBoundUpdatedType;
import ix6.i;
import ix6.j;

public class KwaiGrootViewPager extends GrootViewPager implements a	// class@000842
{
    public String R1;
    public String S1;
    public boolean T1;
    public boolean U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;
    public int Y1;
    public e Z1;
    public g a2;
    public final c b2;
    public final a c2;
    public static final String[] d2;
    public static final boolean e2;
    public static final boolean f2;

    static {
       String[] stringArray = new String[]{"measureChildWithMargins","onMeasure","layoutChildren"};
       KwaiGrootViewPager.d2 = stringArray;
       KwaiGrootViewPager.e2 = a.t().d("grootViewpagerInIgnoreAreaFix", false);
       KwaiGrootViewPager.f2 = a.t().d("enableScrollDurationLog", false);
    }
    public void KwaiGrootViewPager(Context p0){
       super(p0);
       this.X1 = true;
       this.Y1 = -1;
       this.b2 = new c(this);
       this.c2 = new a();
       this.N1 = KwaiGrootViewPager.f2;
       this.setEnableCorrectOffset(h.a.w);
    }
    public void KwaiGrootViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.X1 = true;
       this.Y1 = -1;
       this.b2 = new c(this);
       this.c2 = new a();
       this.N1 = KwaiGrootViewPager.f2;
       this.setEnableCorrectOffset(h.a.w);
    }
    public static void q0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KwaiGrootViewPager.class, "22")) {
          return;
       }
       u1.R("XfCommonLowFreqCustomEvent", "[`"+p0+"`]"+p1, 14);
       return;
    }
    public void V(){
       if (PatchProxy.applyVoid(null, this, KwaiGrootViewPager.class, "3")) {
          return;
       }
       if (this.T1 != null) {
          return;
       }
       if (this.V1 != null) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, this.getNoMoreText());
       return;
    }
    public boolean Y(MotionEvent p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, KwaiGrootViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!KwaiGrootViewPager.e2) {
          return super.Y(p0);
       }
       obj = new int[2];
       this.getLocationInWindow(obj);
       int i = (int)p0.getX() + obj[0];
       int i1 = (int)p0.getY() + obj[1];
       Rect rect = new Rect();
       Iterator iterator = this.A1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return 0;
          }
          View view = iterator.next();
          view.getLocationInWindow(obj);
          int width = view.getWidth();
          rect.set(0, 0, width, view.getHeight());
          rect.offset(obj[0], obj[1]);
          if (rect.contains(i, i1)) {
             break ;
          }
       }
       return 1;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiGrootViewPager.class, "29")) {
          return;
       }
       if (this.b2.b(p0, false)) {
          return;
       }
       super.addView(p0);
       return;
    }
    public void addView(View p0,int p1){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KwaiGrootViewPager.class, "30")) {
          return;
       }
       if (this.b2.b(p0, true)) {
          return;
       }
       super.addView(p0, p1);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiGrootViewPager obj = PatchProxy.applyOneRefs(p0, this, KwaiGrootViewPager.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Z1;
       if (obj != null) {
          obj.e(p0);
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, this, KwaiGrootViewPager.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = p0.getActionIndex();
          if (b) {
             float x = p0.getX(b);
             float y = p0.getY(b);
             int i = 0;
             if (x - i < 0 || (y - i < 0 || (x - (float)(this.getRight() - this.getLeft()) >= 0 || y - (float)(this.getBottom() - this.getTop()) >= 0))) {
                b = false;
             }
          }
          b = true;
       }
       if (!b) {
          a.b("GrootViewPager", "point not in self, "+p0);
          return false;
       }else {
          b = super.dispatchTouchEvent(p0);
          obj = this.a2;
          if (obj != null) {
             obj.onTouch(p0);
          }
          return b;
       }
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       KwaiGrootViewPager obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KwaiGrootViewPager.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, KwaiGrootViewPager.class, "36");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = this.b2;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p1, obj, c.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(h.g && !obj.c.contains(p1)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return false;
       }else {
          return super.drawChild(p0, p1, p2);
       }
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, KwaiGrootViewPager.class, "2")) {
          return;
       }
       if (this.U1 != null) {
          return;
       }
       if (this.W1 != null) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, this.getNoMoreText());
       return;
    }
    public String getAlreadyBottomText(){
       KwaiGrootViewPager tS1;
       String obj = PatchProxy.apply(null, this, KwaiGrootViewPager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.S1) && this.getResources() != null) {
          this.S1 = this.getResources().getString(0x7f1001cd);
       }
       obj = (TextUtils.x(this.S1))? "已加载到底部": this.S1;
       return obj;
    }
    public int getLastShowType(){
       Object obj = PatchProxy.apply(null, this, KwaiGrootViewPager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getAdapter() instanceof b) {
          return this.getAdapter().f0();
       }
       return 0;
    }
    public ViewGroup$LayoutParams getLayoutParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StackTraceElement[] obj = PatchProxy.apply(null, this, KwaiGrootViewPager.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (SystemUtil.I()) {
          obj = Thread.currentThread().getStackTrace();
          boolean b = false;
          int i = 0;
          while (i < obj.length) {
             if (("getLayoutParams").equals(obj[i].getMethodName())) {
                i = i + 1;
                if (i < obj.length) {
                   String methodName = obj[i].getMethodName();
                   Object obj1 = PatchProxy.applyOneRefs(methodName, this, KwaiGrootViewPager.class, "19");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else {
                      String[] d2 = KwaiGrootViewPager.d2;
                      int len = d2.length;
                      int i1 = 0;
                      while (i1 < len) {
                         if ((d2[i1]).equals(methodName)) {
                            b = true;
                         }
                         i1 = i1 + 1;
                      }
                   }
                   if (!b) {
                      a.b("GrootViewPager", "getLayoutParams "+obj[i].toString());
                      KwaiGrootViewPager.q0("GrootViewPager", "getLayoutParams, "+Log.getStackTraceString(new RuntimeException()));
                      break ;
                   }
                }
             }
             i = i + 1;
          }
       }
       return super.getLayoutParams();
    }
    public ViewGroup$LayoutParams getLayoutParamsWithoutLog(){
       Object obj = PatchProxy.apply(null, this, KwaiGrootViewPager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getLayoutParams();
    }
    public int getMeasureChildCount(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KwaiGrootViewPager obj = PatchProxy.apply(objArray, this, KwaiGrootViewPager.class, "31");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (!this.b2.c()) {
          return super.getMeasureChildCount();
       }
       obj = this.b2;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, c.class, "6");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): obj.c.size();
       return i;
    }
    public String getNoMoreText(){
       KwaiGrootViewPager tR1;
       String obj = PatchProxy.apply(null, this, KwaiGrootViewPager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.R1) && this.getResources() != null) {
          this.R1 = this.getResources().getString(0x7f1013a7);
       }
       obj = (TextUtils.x(this.R1))? "无更多作品": this.R1;
       return obj;
    }
    public void h0(int p0){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiGrootViewPager.class, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, KwaiGrootViewPager.class, "11")) {
          i oi = i.l();
          if (oi != null && oi.s()) {
             CharSequence uCharSequenc = oi.n();
             if (!TextUtils.x(uCharSequenc) && (TextUtils.n(this.getNoMoreText(), uCharSequenc.toString()) || TextUtils.n(this.getAlreadyBottomText(), uCharSequenc.toString()))) {
                oi.h();
             }
          }
       }
       KwaiGrootViewPager tZ1 = this.Z1;
       if (tZ1 != null) {
          tZ1.a(p0);
       }
       return;
    }
    public View k(int p0){
       KwaiGrootViewPager obj;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(KwaiGrootViewPager.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KwaiGrootViewPager.class, "32");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (this.b2.c()) {
          obj = this.b2;
          Objects.requireNonNull(obj);
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoc, "7");
             if (obj1 != patchProxyRe) {
             label_0048 :
                return obj1;
             }
          }
          obj1 = obj.c.get(p0);
          goto label_0048 ;
       }else {
          return super.k(p0);
       }
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KwaiGrootViewPager.class, "35")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.c2.f()) {
          this.c2.cancelAll();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KwaiGrootViewPager.class, "9")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       KwaiGrootViewPager tZ1 = this.Z1;
       if (tZ1 != null) {
          tZ1.c(p0, p1, p2, p3, p4);
       }
       p0.b = false;
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiGrootViewPager.class, "24")) {
          return;
       }
       if (this.Y1 > null) {
          int mode = View$MeasureSpec.getMode(p1);
          p1 = View$MeasureSpec.getSize(p1);
          if ((double)p1 - ((double)a1.g() * 0x3ff199999999999a) > 0) {
             a.b("GrootViewPager", "onMeasure: mode "+mode+", size "+p1+", ScreenLongAxis "+a1.g()+", maxHeight "+this.Y1);
          }
          p1 = View$MeasureSpec.makeMeasureSpec(Math.min(this.Y1, p1), mode);
       }
       KwaiGrootViewPager tc2 = this.c2;
       Objects.requireNonNull(tc2);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tc2, uoa, "2") && tc2.f())) {
          boolean b = (tc2.b == null && (tc2.d != p0 || tc2.c != p1))? true: false;
          tc2.b = b;
          tc2.d = p0;
          tc2.c = p1;
          a.h(tc2, "setNewestMeasureSpec{ msc:"+tc2.b+" , w:"+View$MeasureSpec.getSize(p0)+",h:"+View$MeasureSpec.getSize(p1)+'}', null, null, 6, null);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, KwaiGrootViewPager.class, "26")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p1 != p3) {
          this.f0(GrootTargetBoundUpdatedType.ON_SCROLL_END);
       }
       return;
    }
    public boolean p0(){
       return this.X1;
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiGrootViewPager.class, "27")) {
          return;
       }
       boolean b = false;
       if (this.c2.f()) {
          this.c2.b(p0);
          this.c2.c(p0, b);
       }
       KwaiGrootViewPager tb2 = this.b2;
       Objects.requireNonNull(tb2);
       Object obj = PatchProxy.applyOneRefs(p0, tb2, c.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!tb2.a()){
          tb2.c.remove(p0);
          if (!tb2.d(p0)) {
             if (!tb2.b.contains(p0)) {
                tb2.b.add(p0);
             }
             if (h.g) {
                p0.forceLayout();
                p0.setLeft(b);
                p0.setRight(b);
             }else {
                p0.setVisibility(8);
             }
             b = true;
          }
       }
       if (b) {
          return;
       }else {
          super.removeView(p0);
          return;
       }
    }
    public void removeViewAt(int p0){
       boolean b;
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiGrootViewPager.class, "28")) {
          return;
       }
       KwaiGrootViewPager tb2 = this.b2;
       Objects.requireNonNull(tb2);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          View obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), tb2, uoc, "4");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!tb2.a()){
             obj = tb2.a.getChildAt(p0);
             tb2.c.remove(obj);
             if (!tb2.d(obj)) {
                if (!tb2.b.contains(obj)) {
                   tb2.b.add(obj);
                }
                if (h.g) {
                   obj.forceLayout();
                }else {
                   obj.setVisibility(8);
                }
                b = true;
             }
          }
          b = false;
       }else {
          goto label_0039 ;
       }
       if (b) {
          return;
       }else {
          super.removeViewAt(p0);
          return;
       }
    }
    public void scrollTo(int p0,int p1){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KwaiGrootViewPager.class, "1")) {
          return;
       }
       int scrollX = this.getScrollX();
       int scrollY = this.getScrollY();
       int i = Math.abs((scrollY - p1));
       int i1 = Math.abs((scrollX - p0));
       int height = this.getHeight();
       int width = this.getWidth();
       KwaiGrootViewPager tY1 = this.Y1;
       int i2 = (tY1 > null)? Math.min(height, tY1): height;
       if (i >= i2 || i1 >= width) {
          a.b("GrootViewPager", "scrollTo: curX = "+scrollX+" curY = "+scrollY+" scrollToX = "+p0+" scrollToY = "+p1+" diffY = "+i+" diffX = "+i1+" viewPagerHeight = "+height+" mMaxHeight = "+this.Y1+" viewPagerWidth = "+width);
       }
       super.scrollTo(p0, p1);
       return;
    }
    public void setContentTranslationY(int p0){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiGrootViewPager.class, "17")) {
          return;
       }
       super.setViewPagerTranslationY(p0);
       return;
    }
    public void setDisableShowBottomTips(boolean p0){
       this.U1 = p0;
    }
    public void setDisableShowNoMoreTipsAtBottom(boolean p0){
       this.W1 = p0;
    }
    public void setDisableShowNoMoreTipsAtTop(boolean p0){
       this.V1 = p0;
    }
    public void setDisableShowTopTips(boolean p0){
       this.T1 = p0;
    }
    public void setGrootViewPagerInterceptor(e p0){
       this.Z1 = p0;
    }
    public void setLayoutParams(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiGrootViewPager.class, "21")) {
          return;
       }
       super.setLayoutParams(p0);
       if (SystemUtil.I()) {
          a.b("GrootViewPager", "setLayoutParams height "+p0.height+", width "+p0.width);
          KwaiGrootViewPager.q0("GrootViewPager", "setLayoutParams height "+p0.height+", width "+p0.width+", "+Log.getStackTraceString(new RuntimeException()));
       }
       return;
    }
    public void setMaxHeight(int p0){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiGrootViewPager.class, "23")) {
          return;
       }
       a.b("GrootViewPager", "setMaxHeight: "+p0);
       this.Y1 = p0;
       return;
    }
    public void setNoMoreText(String p0){
       this.R1 = p0;
    }
    public void t(View p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiGrootViewPager.class, "34")) {
          return;
       }
       if (!this.c2.e()) {
          if (this.c2.f()) {
             this.c2.c(p0, true);
          }
          super.t(p0, p1, p2);
          return;
       }else {
          this.c2.c(p0, false);
          if (this.l(p0) == this.getCurrentItem()) {
             super.t(p0, p1, p2);
          }else {
             this.c2.d(p0, new i(p0, p1, p2));
          }
          return;
       }
    }
    public void u(View p0,int p1,int p2){
       if (PatchProxy.isSupport(KwaiGrootViewPager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, KwaiGrootViewPager.class, "33")) {
          return;
       }
       if (!this.c2.e()) {
          if (this.c2.f()) {
             this.c2.b(p0);
          }
          super.u(p0, p1, p2);
          return;
       }else {
          this.c2.b(p0);
          if (this.l(p0) == this.getCurrentItem()) {
             super.u(p0, p1, p2);
          }else {
             this.c2.a(p0, new j(p0, p1, p2));
          }
          return;
       }
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, KwaiGrootViewPager.class, "25")) {
          return;
       }
       super.w();
       return;
    }
}
