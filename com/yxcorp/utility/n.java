package com.yxcorp.utility.n;
import ekd.e0;
import android.content.res.Resources;
import android.content.Context;
import java.lang.String;
import cw9.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Field;
import java.lang.Integer;
import android.view.View;
import android.graphics.Rect;
import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import java.lang.Exception;
import android.view.Window;
import ekd.o1;
import java.lang.Runnable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.graphics.Point;
import android.view.MotionEvent;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.ViewParent;
import java.util.LinkedList;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.yxcorp.utility.n$a;
import android.view.Display;
import android.content.ContextWrapper;
import android.view.WindowManager;
import com.yxcorp.utility.SystemUtil;
import ekd.k1;
import java.lang.UnsupportedOperationException;
import lnc.d2;
import android.util.Pair;
import com.yxcorp.utility.RomUtils;
import ukd.a;

public class n	// class@001415
{
    public static int a = 400;
    public static int b;
    public static Pair c;

    static {
       n.a = e0.b.getResources().getInteger(0x10e0001);
    }
    public static int A(Context p0){
       int b = n.b;
       if (b > 0) {
          return b;
       }
       String str = "status_bar_height";
       b = p0.getResources().getIdentifier(str, "dimen", "android");
       if (b > 0) {
          n.b = c.b(p0.getResources(), b);
       }else {
          Class uClass = Class.forName("com.android.internal.R$dimen");
          Object obj = uClass.newInstance();
          Field field = uClass.getField(str);
          field.setAccessible(true);
          n.b = c.b(p0.getResources(), Integer.parseInt(field.get(obj).toString()));
       }
       if (n.b <= 0) {
          n.b = n.c(p0, 25.00f);
       }
       return n.b;
    }
    public static Rect B(View p0,boolean p1){
       int[] ointArray = new int[2];
       if (p1) {
          p0.getLocationOnScreen(ointArray);
       }else {
          p0.getLocationInWindow(ointArray);
       }
       return new Rect(ointArray[0], ointArray[1], (ointArray[0] + p0.getWidth()), (ointArray[1] + p0.getHeight()));
    }
    public static void C(Activity p0){
       try{
          View currentFocus = p0.getCurrentFocus();
          if (currentFocus != null) {
             p0.getSystemService("input_method").hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static void D(Activity p0,int p1){
       if (p1 > 0) {
          p0.getWindow().getDecorView().postDelayed(new o1(p0), (long)p1);
       }else {
          n.C(p0);
       }
       return;
    }
    public static void E(Context p0,IBinder p1){
       if (p1 != null) {
          try{
             p0.getSystemService("input_method").hideSoftInputFromWindow(p1, 0);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
       }
    }
    public static void F(Window p0){
       try{
          View currentFocus = p0.getCurrentFocus();
          if (currentFocus != null) {
             p0.getContext().getSystemService("input_method").hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
          }
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static View G(Context p0,int p1){
       return LayoutInflater.from(p0).inflate(p1, null);
    }
    public static View H(ViewGroup p0,int p1){
       return a.c(LayoutInflater.from(p0.getContext()), p1, p0, false);
    }
    public static boolean I(Activity p0){
       boolean b = false;
       if (p0 != null) {
          int requestedOri = p0.getRequestedOrientation();
          if (requestedOri && (requestedOri == 8 || requestedOri == 6)) {
             b = true;
          }
       }
       return b;
    }
    public static boolean J(RecyclerView p0,boolean p1){
       int i;
       boolean b = true;
       if (!p0.getChildCount()) {
          return b;
       }
       View childAt = p0.getChildAt((p0.getChildCount() - b));
       if (p1) {
          if (childAt.getBottom() <= (p0.getHeight() - p0.getPaddingBottom())) {
          label_0033 :
             i = 1;
          label_0036 :
             if (!i || p0.getChildAdapterPosition(childAt) != (p0.getAdapter().getItemCount() - b)) {
                b = false;
             }
             return b;
          }
       }else if(childAt.getRight() <= (p0.getWidth() - p0.getPaddingRight())){
          goto label_0033 ;
       }
       i = 0;
       goto label_0036 ;
    }
    public static boolean K(Point p0,Point p1){
       boolean b = (p0.y < p1.y)? true: false;
       return b;
    }
    public static boolean L(Context p0){
       return n.M(n.e(p0), n.s(p0));
    }
    public static boolean M(Point p0,Point p1){
       boolean b = (p0.x < p1.x)? true: false;
       return b;
    }
    public static boolean N(View p0,MotionEvent p1){
       Rect rect = new Rect();
       int[] ointArray = n.p(p0);
       rect.set(ointArray[0], ointArray[1], (ointArray[0] + p0.getWidth()), (ointArray[1] + p0.getHeight()));
       return (rect.contains((int)p1.getRawX(), (int)p1.getRawY()) ^ 1);
    }
    public static float O(String p0,float p1){
       Paint paint = new Paint();
       paint.setTextSize(p1);
       return paint.measureText(p0);
    }
    public static int P(Context p0,float p1){
       return (int)((p1 / c.c(p0.getResources()).density) + 0x3f000000);
    }
    public static void Q(View p0){
       if (p0 != null && p0.getParent() instanceof ViewGroup) {
          p0.getParent().removeView(p0);
       }
       return;
    }
    public static void R(View p0,boolean p1){
       if (p0 != null && p0.isEnabled() != p1) {
          if (p0 instanceof ViewGroup) {
             LinkedList linkedList = new LinkedList();
             linkedList.add(p0);
             while (!linkedList.isEmpty()) {
                ViewGroup viewGroup = linkedList.removeFirst();
                viewGroup.setEnabled(p1);
                int i = 0;
                while (i < viewGroup.getChildCount()) {
                   if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                      linkedList.addLast(viewGroup.getChildAt(i));
                   }else {
                      viewGroup.getChildAt(i).setEnabled(p1);
                   }
                   i = i + 1;
                }
             }
          }else {
             p0.setEnabled(p1);
          }
       }
       return;
    }
    public static void S(View p0,int p1){
       p0.setPadding(p0.getPaddingLeft(), p0.getPaddingTop(), p0.getPaddingRight(), n.c(p0.getContext(), (float)p1));
    }
    public static void T(View p0,int p1){
       p0.setPadding(n.c(p0.getContext(), (float)p1), p0.getPaddingTop(), p0.getPaddingRight(), p0.getPaddingBottom());
    }
    public static void U(View p0,int p1){
       p0.setPadding(p0.getPaddingLeft(), p0.getPaddingTop(), n.c(p0.getContext(), (float)p1), p0.getPaddingBottom());
    }
    public static void V(View p0){
       if (p0 != null && p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          p0.getLayoutParams().topMargin = n.A(p0.getContext());
       }
       return;
    }
    public static void W(View p0,int p1,long p2){
       n.X(p0, p1, p2, null);
    }
    public static void X(View p0,int p1,long p2,Animation$AnimationListener p3){
       if (p0 != null && p0.getVisibility() != p1) {
          p0.clearAnimation();
          if (p2 - null > 0) {
             Context applicationC = p0.getContext().getApplicationContext();
             int i = (!p1)? 0x7f01004a: 0x7f01004c;
             Animation uAnimation = AnimationUtils.loadAnimation(applicationC, i);
             uAnimation.setAnimationListener(p3);
             uAnimation.setDuration(p2);
             p0.startAnimation(uAnimation);
          }
          if (p3 == null) {
             try{
                p0.setVisibility(p1);
             }catch(java.lang.Exception e3){
                e3.printStackTrace();
             }
          }
       }
    }
    public static void Y(View p0,int p1,boolean p2){
       long l = (p2)? (long)n.a: 0;
       n.W(p0, p1, l);
       return;
    }
    public static void Z(int p0,View[] p1){
       if (p1 != null && p1.length) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             object oobject = p1[i];
             if (oobject != null) {
                oobject.setVisibility(p0);
             }
             i = i + 1;
          }
       }
       return;
    }
    public static void a(View p0){
       if (p0 != null && p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.topMargin = layoutParams.topMargin + n.A(p0.getContext());
       }
       return;
    }
    public static void a0(Context p0,View p1,int p2){
       if (p2 > 0) {
          p1.postDelayed(new n$a(p0, p1), (long)p2);
       }else {
          try{
             p0.getSystemService("input_method").showSoftInput(p1, 1);
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public static boolean b(Context p0){
       boolean b = false;
       Display uDisplay = n.h(p0);
       Point point = new Point();
       Point point1 = new Point();
       uDisplay.getSize(point);
       uDisplay.getRealSize(point1);
       if (point1.y != point.y) {
          b = true;
       }
       return b;
    }
    public static void b0(Context p0,View p1,boolean p2){
       int i = (p2)? 500: 0;
       n.a0(p0, p1, i);
       return;
    }
    public static int c(Context p0,float p1){
       return (int)((p1 * c.c(p0.getResources()).density) + 0x3f000000);
    }
    public static int c0(Context p0,float p1){
       return (int)((p1 * c.c(p0.getResources()).scaledDensity) + 0x3f000000);
    }
    public static Activity d(View p0){
       Context context = p0.getContext();
       while (true) {
          if (!context instanceof ContextWrapper) {
             return null;
          }
          if (context instanceof Activity) {
             break ;
          }else {
             context = context.getBaseContext();
          }
       }
       return context;
    }
    public static Point e(Context p0){
       Point point = new Point();
       p0.getSystemService("window").getDefaultDisplay().getSize(point);
       return point;
    }
    public static View f(Activity p0){
       return n.g(p0.getWindow());
    }
    public static View g(Window p0){
       if (!SystemUtil.I() || k1.g()) {
          return p0.getDecorView().findViewById(0x1020002);
       }
       throw new UnsupportedOperationException("getContentView on non-ui thread is not supported.");
    }
    public static Display h(Context p0){
       Pair c;
       String str = "window";
       if (d2.g()) {
          return p0.getSystemService(str).getDefaultDisplay();
       }
       DisplayMetrics densityDpi = c.c(p0.getResources()).densityDpi;
       c = n.c;
       if (c == null || c.first.intValue() != densityDpi) {
          n.c = new Pair(Integer.valueOf(densityDpi), p0.getSystemService(str).getDefaultDisplay());
       }
       return n.c.second;
    }
    public static float i(Context p0){
       return c.c(p0.getResources()).density;
    }
    public static int j(Activity p0){
       View view = n.f(p0);
       int i = (view == null)? 0: view.getHeight();
       return i;
    }
    public static int k(Activity p0){
       View view = n.f(p0);
       int i = (view == null)? 0: view.getWidth();
       return i;
    }
    public static int l(Activity p0){
       boolean b = n.I(p0);
       int i = n.k(p0);
       int i1 = (RomUtils.n())? n.w(p0): n.j(p0);
       if (!i) {
          i = n.z(p0);
       }
       if (!i1) {
          i1 = n.v(p0);
       }
       if (b && (i >= i1 && (b || i <= i1))) {
          i = i1;
       }
       return i;
    }
    public static int m(Activity p0){
       boolean b = n.I(p0);
       int i = n.k(p0);
       int i1 = n.j(p0);
       if (!i) {
          i = n.z(p0);
       }
       if (!i1) {
          i1 = n.v(p0);
       }
       if (!b || (i < i1 || (!b && i > i1))) {
          i = i1;
       }
       return i;
    }
    public static int n(Context p0){
       int i = -1;
       try{
          Object[] objArray = new Object[0];
          Integer integer = a.a(p0.getSystemService("input_method"), "getInputMethodWindowVisibleHeight", objArray);
          if (integer != null) {
             i = integer.intValue();
          }
          return i;
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return i;
       }
    }
    public static int[] o(View p0){
       int[] ointArray = new int[2];
       p0.getLocationInWindow(ointArray);
       return ointArray;
    }
    public static int[] p(View p0){
       int[] ointArray = new int[2];
       p0.getLocationOnScreen(ointArray);
       return ointArray;
    }
    public static int q(Context p0){
       if (p0 == null || !n.b(p0)) {
          return 0;
       }
       return c.b(p0.getResources(), p0.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }
    public static Point r(Context p0){
       Point point = n.e(p0);
       Point point1 = n.s(p0);
       if (n.M(point, point1)) {
          return new Point((point1.x - point.x), point.y);
       }
       if (n.K(point, point1)) {
          return new Point(point.x, (point1.y - point.y));
       }
       return new Point();
    }
    public static Point s(Context p0){
       Point point = new Point();
       p0.getSystemService("window").getDefaultDisplay().getRealSize(point);
       return point;
    }
    public static int t(Activity p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getWindowManager().getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.heightPixels;
    }
    public static int u(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.heightPixels;
    }
    public static int v(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.heightPixels;
    }
    public static int w(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       c.d(p0.getSystemService("window").getDefaultDisplay(), uDisplayMetr);
       return uDisplayMetr.heightPixels;
    }
    public static int x(Activity p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getWindowManager().getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels;
    }
    public static int y(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels;
    }
    public static int z(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels;
    }
}
