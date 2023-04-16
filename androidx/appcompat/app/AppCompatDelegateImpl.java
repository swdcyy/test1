package androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.e$a;
import android.view.LayoutInflater$Factory2;
import q0.d;
import androidx.collection.SimpleArrayMap;
import android.os.Build;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import q0.c;
import android.content.Context;
import android.view.Window;
import android.app.Dialog;
import androidx.appcompat.app.AppCompatDelegateImpl$a;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.Class;
import java.lang.Integer;
import w0.d;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import androidx.appcompat.app.AppCompatDelegateImpl$m;
import z1.d;
import androidx.appcompat.app.AppCompatDelegateImpl$n;
import androidx.appcompat.app.AppCompatDelegateImpl$l;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState;
import w0.j;
import android.view.ViewConfiguration;
import android.media.AudioManager;
import androidx.appcompat.app.ActionBar;
import android.content.res.Resources;
import android.view.Window$Callback;
import android.view.Menu;
import android.view.WindowManager;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager$LayoutParams;
import android.view.LayoutInflater;
import u0.i;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.app.d;
import androidx.appcompat.app.AppCompatDelegateImpl$g;
import androidx.appcompat.view.menu.j$a;
import android.view.KeyCharacterMap;
import java.lang.Runnable;
import a2.i0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.e;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import u0.b$a;
import u0.b;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import u0.d;
import androidx.appcompat.widget.ActionBarContextView;
import android.widget.PopupWindow;
import android.util.AttributeSet;
import e2.f;
import android.util.DisplayMetrics;
import cw9.c;
import androidx.appcompat.app.AppCompatDelegateImpl$d;
import androidx.appcompat.widget.ViewStubCompat;
import u0.e;
import androidx.appcompat.app.AppCompatDelegateImpl$h;
import a2.m0;
import androidx.appcompat.app.AppCompatDelegateImpl$e;
import a2.n0;
import android.util.AndroidRuntimeException;
import android.widget.TextView;
import android.content.ContextWrapper;
import java.lang.IllegalArgumentException;
import androidx.core.app.a;
import androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager;
import q0.h;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import androidx.appcompat.widget.ContentFrameLayout;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import a2.u0;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;
import w0.b0;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.app.AppCompatDelegateImpl$i;
import w0.x;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatDelegateImpl$b;
import a2.z;
import androidx.appcompat.app.AppCompatDelegateImpl$c;
import androidx.appcompat.widget.ContentFrameLayout$a;
import java.lang.StringBuilder;
import android.view.MenuItem;
import a2.h$a;
import q0.e;
import a2.h;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AppCompatDelegateImpl$o;
import pd6.a;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import o1.f$b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import androidx.appcompat.app.b;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import androidx.appcompat.widget.j;
import androidx.appcompat.app.AppCompatDelegateImpl$j;
import androidx.appcompat.app.AppCompatDelegateImpl$k;
import q0.j;
import q0.a;
import androidx.appcompat.app.AppCompatDelegateImpl$f;
import java.lang.System;
import android.view.MenuInflater;
import u0.g;
import androidx.appcompat.app.AppCompatDelegateImpl$p;
import androidx.appcompat.view.menu.k;
import android.view.LayoutInflater$Factory;
import a2.m;
import androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.app.UiModeManager;
import androidx.core.app.b;

public class AppCompatDelegateImpl extends d implements e$a, LayoutInflater$Factory2	// class@000582
{
    public View A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public AppCompatDelegateImpl$PanelFeatureState[] J;
    public AppCompatDelegateImpl$PanelFeatureState K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public AppCompatDelegateImpl$AutoNightModeManager U;
    public Rect U0;
    public AppCompatDelegateImpl$AutoNightModeManager V;
    public Rect V0;
    public boolean W;
    public b W0;
    public int X;
    public final Runnable Y;
    public boolean Z;
    public final Object g;
    public final Context h;
    public Window i;
    public AppCompatDelegateImpl$i j;
    public final c k;
    public ActionBar l;
    public MenuInflater m;
    public CharSequence n;
    public j o;
    public AppCompatDelegateImpl$g p;
    public AppCompatDelegateImpl$p q;
    public b r;
    public ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public m0 v;
    public boolean w;
    public boolean x;
    public ViewGroup y;
    public TextView z;
    public static final SimpleArrayMap X0;
    public static final boolean Y0;
    public static final int[] Z0;
    public static final boolean a1;
    public static final boolean b1;
    public static boolean c1;

    static {
       AppCompatDelegateImpl.X0 = new SimpleArrayMap();
       AppCompatDelegateImpl.Y0 = false;
       int[] ointArray = new int[]{0x1010054};
       AppCompatDelegateImpl.Z0 = ointArray;
       AppCompatDelegateImpl.a1 = ("robolectric").equals(Build.FINGERPRINT) ^ 1;
       AppCompatDelegateImpl.b1 = true;
    }
    public void AppCompatDelegateImpl(Activity p0,c p1){
       super(p0, null, p1, p0);
    }
    public void AppCompatDelegateImpl(Dialog p0,c p1){
       super(p0.getContext(), p0.getWindow(), p1, p0);
    }
    public void AppCompatDelegateImpl(Context p0,Window p1,c p2,Object p3){
       super();
       this.v = null;
       this.w = true;
       this.Q = -100;
       this.Y = new AppCompatDelegateImpl$a(this);
       this.h = p0;
       this.k = p2;
       this.g = p3;
       if (this.Q == -100 && p3 instanceof Dialog) {
          AppCompatActivity uAppCompatAc = this.O0();
          if (uAppCompatAc != null) {
             this.Q = uAppCompatAc.getDelegate().n();
          }
       }
       if (this.Q == -100) {
          SimpleArrayMap x0 = AppCompatDelegateImpl.X0;
          Integer integer = x0.get(p3.getClass().getName());
          if (integer != null) {
             this.Q = integer.intValue();
             x0.remove(p3.getClass().getName());
          }
       }
       if (p1 != null) {
          this.S(p1);
       }
       d.g();
       return;
    }
    public static Configuration i0(Configuration p0,Configuration p1){
       Configuration uConfigurati = new Configuration();
       uConfigurati.fontScale = 0;
       if (p1 != null && p0.diff(p1)) {
          Configuration fontScale = p1.fontScale;
          if (p0.fontScale - fontScale) {
             uConfigurati.fontScale = fontScale;
          }
          fontScale = p1.mcc;
          if (p0.mcc != fontScale) {
             uConfigurati.mcc = fontScale;
          }
          fontScale = p1.mnc;
          if (p0.mnc != fontScale) {
             uConfigurati.mnc = fontScale;
          }
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= 24) {
             AppCompatDelegateImpl$m.a(p0, p1, uConfigurati);
          }else if(!d.a(p0.locale, p1.locale)){
             uConfigurati.locale = p1.locale;
          }
          Configuration touchscreen = p1.touchscreen;
          if (p0.touchscreen != touchscreen) {
             uConfigurati.touchscreen = touchscreen;
          }
          touchscreen = p1.keyboard;
          if (p0.keyboard != touchscreen) {
             uConfigurati.keyboard = touchscreen;
          }
          touchscreen = p1.keyboardHidden;
          if (p0.keyboardHidden != touchscreen) {
             uConfigurati.keyboardHidden = touchscreen;
          }
          touchscreen = p1.navigation;
          if (p0.navigation != touchscreen) {
             uConfigurati.navigation = touchscreen;
          }
          touchscreen = p1.navigationHidden;
          if (p0.navigationHidden != touchscreen) {
             uConfigurati.navigationHidden = touchscreen;
          }
          touchscreen = p1.orientation;
          if (p0.orientation != touchscreen) {
             uConfigurati.orientation = touchscreen;
          }
          int i = p1.screenLayout & 0x0f;
          if ((p0.screenLayout & 0x0f) != i) {
             uConfigurati.screenLayout = uConfigurati.screenLayout | i;
          }
          i = p1.screenLayout & 0x00c0;
          if ((p0.screenLayout & 0x00c0) != i) {
             uConfigurati.screenLayout = uConfigurati.screenLayout | i;
          }
          i = p1.screenLayout & 0x30;
          if ((p0.screenLayout & 0x30) != i) {
             uConfigurati.screenLayout = uConfigurati.screenLayout | i;
          }
          i = p1.screenLayout & 0x0300;
          if ((p0.screenLayout & 0x0300) != i) {
             uConfigurati.screenLayout = uConfigurati.screenLayout | i;
          }
          if (sDK_INT >= 26) {
             AppCompatDelegateImpl$n.a(p0, p1, uConfigurati);
          }
          int i1 = p1.uiMode & 0x0f;
          if ((p0.uiMode & 0x0f) != i1) {
             uConfigurati.uiMode = uConfigurati.uiMode | i1;
          }
          i1 = p1.uiMode & 0x30;
          if ((p0.uiMode & 0x30) != i1) {
             uConfigurati.uiMode = uConfigurati.uiMode | i1;
          }
          fontScale = p1.screenWidthDp;
          if (p0.screenWidthDp != fontScale) {
             uConfigurati.screenWidthDp = fontScale;
          }
          fontScale = p1.screenHeightDp;
          if (p0.screenHeightDp != fontScale) {
             uConfigurati.screenHeightDp = fontScale;
          }
          fontScale = p1.smallestScreenWidthDp;
          if (p0.smallestScreenWidthDp != fontScale) {
             uConfigurati.smallestScreenWidthDp = fontScale;
          }
          AppCompatDelegateImpl$l.a(p0, p1, uConfigurati);
       }
       return uConfigurati;
    }
    public void A(Bundle p0){
    }
    public boolean A0(int p0,KeyEvent p1){
       if (p0 != 4) {
          if (p0 == 82) {
             this.B0(false, p1);
             return true;
          }
       }else {
          AppCompatDelegateImpl tL = this.L;
          this.L = false;
          AppCompatDelegateImpl$PanelFeatureState panelFeature = this.m0(false, false);
          if (panelFeature.o != null) {
             if (tL == null) {
                this.Y(panelFeature, true);
             }
             return true;
          }else if(this.w0()){
             return true;
          }
       }
       return false;
    }
    public void B(){
       this.O = true;
       this.e();
    }
    public final boolean B0(int p0,KeyEvent p1){
       boolean b1;
       if (this.r != null) {
          return false;
       }
       boolean b = true;
       AppCompatDelegateImpl$PanelFeatureState panelFeature = this.m0(p0, b);
       if (!p0) {
          AppCompatDelegateImpl to = this.o;
          if (to != null && (to.d() && !ViewConfiguration.get(this.h).hasPermanentMenuKey())) {
             if (!this.o.g()) {
                if (this.P == null && this.H0(panelFeature, p1)) {
                   b = this.o.f();
                }else {
                label_0062 :
                   b = false;
                }
             }else {
                b = this.o.a();
             }
          }else {
          label_0043 :
             AppCompatDelegateImpl$PanelFeatureState o = panelFeature.o;
             if (o != null || panelFeature.n != null) {
                this.Y(panelFeature, b);
                b = o;
             }else if(panelFeature.m != null){
                if (panelFeature.r != null) {
                   panelFeature.m = false;
                   b1 = this.H0(panelFeature, p1);
                }else {
                   b1 = true;
                }
                if (b1) {
                   this.E0(panelFeature, p1);
                }else {
                   goto label_0062 ;
                }
             }else {
                goto label_0062 ;
             }
          }
       }else {
          goto label_0043 ;
       }
       if (b != null) {
          AudioManager systemServic = this.h.getApplicationContext().getSystemService("audio");
          if (systemServic != null) {
             systemServic.playSoundEffect(false);
          }
       }
       return b;
    }
    public void C(){
       this.O = false;
       ActionBar uActionBar = this.p();
       if (uActionBar != null) {
          uActionBar.i0(false);
       }
       return;
    }
    public void C0(int p0){
       if (p0 == 108) {
          ActionBar uActionBar = this.p();
          if (uActionBar != null) {
             uActionBar.m(true);
          }
       }
       return;
    }
    public void D0(int p0){
       if (p0 == 108) {
          ActionBar uActionBar = this.p();
          if (uActionBar != null) {
             uActionBar.m(false);
          }
       }else if(!p0){
          AppCompatDelegateImpl$PanelFeatureState panelFeature = this.m0(p0, true);
          if (panelFeature.o != null) {
             this.Y(panelFeature, false);
          }
       }
       return;
    }
    public final void E0(AppCompatDelegateImpl$PanelFeatureState p0,KeyEvent p1){
       Window$Callback uCallback;
       ViewGroup$LayoutParams layoutParams;
       int i;
       if (p0.o == null && this.P == null) {
          boolean b = false;
          if (p0.a == null) {
             uCallback = ((this.h.getResources().getConfiguration().screenLayout & 0x0f) == 4)? 1: null;
             if (uCallback) {
                return;
             }
          }
          uCallback = this.o0();
          if (uCallback != null && !uCallback.onMenuOpened(p0.a, p0.j)) {
             this.Y(p0, true);
             return;
          }else {
             WindowManager systemServic = this.h.getSystemService("window");
             if (systemServic == null) {
                return;
             }else if(!this.H0(p0, p1)){
                return;
             }else {
                AppCompatDelegateImpl$PanelFeatureState g = p0.g;
                AppCompatDelegateImpl$PanelFeatureState panelFeature = -1;
                if (g == null || p0.q != null) {
                   if (g == null) {
                      this.r0(p0);
                      if (p0.g == null) {
                         return;
                      }
                   }else if(p0.q != null && g.getChildCount() > 0){
                      p0.g.removeAllViews();
                   }
                   if (!this.q0(p0) || !p0.b()) {
                      p0.q = true;
                   }else {
                      layoutParams = p0.h.getLayoutParams();
                      if (layoutParams == null) {
                         layoutParams = new ViewGroup$LayoutParams(-2, -2);
                      }
                      p0.g.setBackgroundResource(p0.b);
                      ViewParent parent = p0.h.getParent();
                      if (parent instanceof ViewGroup) {
                         parent.removeView(p0.h);
                      }
                      p0.g.addView(p0.h, layoutParams);
                      if (!p0.h.hasFocus()) {
                         p0.h.requestFocus();
                      }
                   }
                }else {
                   g = p0.i;
                   if (g != null) {
                      layoutParams = g.getLayoutParams();
                      if (layoutParams != null && layoutParams.width == panelFeature) {
                         i = -1;
                      label_00ca :
                         p0.n = b;
                         WindowManager$LayoutParams layoutParams1 = new WindowManager$LayoutParams(i, -2, p0.d, p0.e, 1002, 0x820000, -3);
                         layoutParams.gravity = p0.c;
                         layoutParams.windowAnimations = p0.f;
                         systemServic.addView(p0.g, p0.h);
                         p0.o = true;
                         return;
                      }
                   }
                }
                i = -2;
                goto label_00ca ;
             }
          }
       }
       return;
    }
    public boolean F(int p0){
       p0 = this.J0(p0);
       if (this.H != null && p0 == 108) {
          return false;
       }
       if (this.D != null && p0 == 1) {
          this.D = false;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 5) {
                if (p0 != 10) {
                   if (p0 != 108) {
                      if (p0 != 109) {
                         return this.i.requestFeature(p0);
                      }else {
                         this.N0();
                         this.E = true;
                         return true;
                      }
                   }else {
                      this.N0();
                      this.D = true;
                      return true;
                   }
                }else {
                   this.N0();
                   this.F = true;
                   return true;
                }
             }else {
                this.N0();
                this.C = true;
                return true;
             }
          }else {
             this.N0();
             this.B = true;
             return true;
          }
       }else {
          this.N0();
          this.H = true;
          return true;
       }
    }
    public final ActionBar F0(){
       return this.l;
    }
    public void G(int p0){
       this.f0();
       ViewGroup viewGroup = this.y.findViewById(0x1020002);
       viewGroup.removeAllViews();
       LayoutInflater.from(this.h).inflate(p0, viewGroup);
       this.j.a().onContentChanged();
    }
    public final boolean G0(AppCompatDelegateImpl$PanelFeatureState p0,int p1,KeyEvent p2,int p3){
       boolean b = false;
       if (p2.isSystem()) {
          return b;
       }
       if (p0.m != null || this.H0(p0, p2)) {
          AppCompatDelegateImpl$PanelFeatureState j = p0.j;
          if (j != null) {
             b = j.performShortcut(p1, p2, p3);
          }
       }
       if (b && (!(p3 & 0x01) && this.o == null)) {
          this.Y(p0, true);
       }
    label_0028 :
       return b;
    }
    public void H(View p0){
       this.f0();
       ViewGroup viewGroup = this.y.findViewById(0x1020002);
       viewGroup.removeAllViews();
       viewGroup.addView(p0);
       this.j.a().onContentChanged();
    }
    public final boolean H0(AppCompatDelegateImpl$PanelFeatureState p0,KeyEvent p1){
       boolean deviceId;
       if (this.P != null) {
          return false;
       }
       if (p0.m != null) {
          return true;
       }
       AppCompatDelegateImpl tK = this.K;
       if (tK != null && tK != p0) {
          this.Y(tK, false);
       }
       Window$Callback uCallback = this.o0();
       if (uCallback != null) {
          p0.i = uCallback.onCreatePanelView(p0.a);
       }
       AppCompatDelegateImpl$PanelFeatureState a = p0.a;
       a = (a == null || a == 108)? 1: 0;
       if (a) {
          AppCompatDelegateImpl to = this.o;
          if (to != null) {
             to.i();
          }
       }
       if (p0.i == null && (!a || !this.F0() instanceof d)) {
          AppCompatDelegateImpl$PanelFeatureState j = p0.j;
          if (j == null || p0.r != null) {
             if (j == null) {
                this.s0(p0);
                if (p0.j == null) {
                   return false;
                }
             }
             if (a && this.o != null) {
                if (this.p == null) {
                   this.p = new AppCompatDelegateImpl$g(this);
                }
                this.o.b(p0.j, this.p);
             }
             p0.j.h0();
             if (!uCallback.onCreatePanelMenu(p0.a, p0.j)) {
                p0.c(null);
                if (a) {
                   AppCompatDelegateImpl to1 = this.o;
                   if (to1 != null) {
                      to1.b(null, this.p);
                   }
                }
                return false;
             }else {
                p0.r = false;
             }
          }
          p0.j.h0();
          j = p0.u;
          if (j != null) {
             p0.j.R(j);
             p0.u = null;
          }
          if (!uCallback.onPreparePanel(false, p0.i, p0.j)) {
             if (a) {
                AppCompatDelegateImpl to2 = this.o;
                if (to2 != null) {
                   to2.b(null, this.p);
                }
             }
             p0.j.g0();
             return false;
          }else if(p1 != null){
             deviceId = p1.getDeviceId();
          }else {
             deviceId = -1;
          }
          deviceId = (KeyCharacterMap.load(deviceId).getKeyboardType() != 1)? true: false;
          p0.p = deviceId;
          p0.j.setQwertyMode(deviceId);
          p0.j.g0();
       }
       p0.m = true;
       p0.n = false;
       this.K = p0;
       return true;
    }
    public void I(View p0,ViewGroup$LayoutParams p1){
       this.f0();
       ViewGroup viewGroup = this.y.findViewById(0x1020002);
       viewGroup.removeAllViews();
       viewGroup.addView(p0, p1);
       this.j.a().onContentChanged();
    }
    public final void I0(boolean p0){
       AppCompatDelegateImpl$PanelFeatureState panelFeature;
       AppCompatDelegateImpl to = this.o;
       int i = 1;
       if (to != null && (to.d() && (!ViewConfiguration.get(this.h).hasPermanentMenuKey() || this.o.c()))) {
          Window$Callback uCallback = this.o0();
          if (!this.o.g() || !p0) {
             if (uCallback != null && this.P == null) {
                if (this.W != null && (this.X & i)) {
                   this.i.getDecorView().removeCallbacks(this.Y);
                   this.Y.run();
                }
                panelFeature = this.m0(0, i);
                AppCompatDelegateImpl$PanelFeatureState j = panelFeature.j;
                if (j != null && (panelFeature.r == null && uCallback.onPreparePanel(0, panelFeature.i, j))) {
                   uCallback.onMenuOpened(108, panelFeature.j);
                   this.o.f();
                }
             }
          }else {
             this.o.a();
             if (this.P == null) {
                uCallback.onPanelClosed(108, this.m0(0, i).j);
             }
          }
          return;
       }else {
          panelFeature = this.m0(0, i);
          panelFeature.q = i;
          this.Y(panelFeature, 0);
          this.E0(panelFeature, null);
          return;
       }
    }
    public final int J0(int p0){
       if (p0 == 8) {
          return 108;
       }
       if (p0 == 9) {
          p0 = 109;
       }
       return p0;
    }
    public void K(boolean p0){
       this.w = p0;
    }
    public final boolean K0(){
       boolean b;
       if (this.x != null) {
          AppCompatDelegateImpl ty = this.y;
          if (ty != null && i0.Y(ty)) {
             b = true;
          label_0011 :
             return b;
          }
       }
       b = false;
       goto label_0011 ;
    }
    public void L(int p0){
       if (this.Q != p0) {
          this.Q = p0;
          if (this.M != null) {
             this.e();
          }
       }
       return;
    }
    public final boolean L0(ViewParent p0){
       if (p0 == null) {
          return false;
       }
       View decorView = this.i.getDecorView();
       while (true) {
          if (p0 == null) {
             return true;
          }
          if (p0 != decorView && (!p0 instanceof View || i0.X(p0))) {
             break ;
          }else {
             p0 = p0.getParent();
          }
       }
       return false;
    }
    public void M(Toolbar p0){
       if (!this.g instanceof Activity) {
          return;
       }
       ActionBar uActionBar = this.p();
       if (uActionBar instanceof e) {
          throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
       }
       MenuInflater menuInflater = null;
       this.m = menuInflater;
       if (uActionBar != null) {
          uActionBar.E();
       }
       if (p0 != null) {
          d uod = new d(p0, this.n0(), this.j);
          this.l = uod;
          this.i.setCallback(uod.r0());
       }else {
          this.l = menuInflater;
          this.i.setCallback(this.j);
       }
       this.s();
       return;
    }
    public b M0(b$a p0){
       AppCompatDelegateImpl tr1;
       boolean b;
       TypedValue typedValue;
       Resources$Theme theme;
       Resources$Theme theme1;
       d uod;
       PopupWindow popupWindow;
       Context context;
       AppCompatDelegateImpl ts;
       e uoe;
       float f;
       m0 om0;
       ViewStubCompat viewStubComp;
       this.e0();
       AppCompatDelegateImpl tr = this.r;
       if (tr != null) {
          tr.c();
       }
       tr = this.k;
       AttributeSet uAttributeSe = null;
       b uob = (tr != null && this.P == null)? tr.onWindowStartingSupportActionMode(p0): uAttributeSe;
    }
    public void N(int p0){
       this.R = p0;
    }
    public final void N0(){
       if (this.x == null) {
          return;
       }
       throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
    public final void O(CharSequence p0){
       this.n = p0;
       AppCompatDelegateImpl to = this.o;
       if (to != null) {
          to.setWindowTitle(p0);
       }else if(this.F0() != null){
          this.F0().n0(p0);
       }else {
          to = this.z;
          if (to != null) {
             to.setText(p0);
          }
       }
       return;
    }
    public final AppCompatActivity O0(){
       for (AppCompatDelegateImpl th = this.h; th != null; th = th.getBaseContext()) {
          if (th instanceof AppCompatActivity) {
             return th;
          }
          if (th instanceof ContextWrapper) {
          }else {
             break ;
          }
       }
       return null;
    }
    public b P(b$a p0){
       if (p0 == null) {
          throw new IllegalArgumentException("ActionMode callback can not be null.");
       }
       AppCompatDelegateImpl tr = this.r;
       if (tr != null) {
          tr.c();
       }
       AppCompatDelegateImpl$h oh = new AppCompatDelegateImpl$h(this, p0);
       ActionBar uActionBar = this.p();
       if (uActionBar != null) {
          b uob = uActionBar.p0(oh);
          this.r = uob;
          if (uob != null) {
             AppCompatDelegateImpl tk = this.k;
             if (tk != null) {
                tk.onSupportActionModeStarted(uob);
             }
          }
       }
       if (this.r == null) {
          this.r = this.M0(oh);
       }
       return this.r;
    }
    public final boolean P0(int p0,boolean p1){
       AppCompatDelegateImpl tg;
       boolean b = this.u0();
       int i = this.h.getResources().getConfiguration().uiMode & 0x30;
       int i1 = this.Z(this.h, p0, null).uiMode & 0x30;
       boolean b1 = true;
       if (i != i1 && (p1 && (!b && (this.M != null && (AppCompatDelegateImpl.a1 || this.N != null))))) {
          tg = this.g;
          if (tg instanceof Activity && !tg.isChild()) {
             a.e(this.g);
             tg = 1;
          label_0048 :
             if (!tg && i != i1) {
                this.Q0(i1, b, null);
             }else {
                b1 = tg;
             }
             if (b1 != null) {
                tg = this.g;
                if (tg instanceof AppCompatActivity) {
                   tg.onNightModeChanged(p0);
                }
             }
             return b1;
          }
       }
    label_0047 :
       tg = null;
       goto label_0048 ;
    }
    public final boolean Q(boolean p0){
       if (this.P != null) {
          return false;
       }
       int i = this.T();
       p0 = this.P0(this.v0(this.h, i), p0);
       if (!i) {
          this.l0(this.h).e();
       }else {
          AppCompatDelegateImpl tU = this.U;
          if (tU != null) {
             tU.a();
          }
       }
       if (i == 3) {
          this.k0(this.h).e();
       }else {
          AppCompatDelegateImpl tV = this.V;
          if (tV != null) {
             tV.a();
          }
       }
       return p0;
    }
    public final void Q0(int p0,boolean p1,Configuration p2){
       Resources resources = this.h.getResources();
       Configuration uConfigurati = new Configuration(resources.getConfiguration());
       uConfigurati.uiMode = p0 | (resources.getConfiguration().uiMode & 0xcf);
       resources.updateConfiguration(uConfigurati, null);
       p0 = Build$VERSION.SDK_INT;
       if (p0 < 26) {
          h.a(resources);
       }
       AppCompatDelegateImpl tR = this.R;
       if (tR != null) {
          this.h.setTheme(tR);
          if (p0 >= 23) {
             this.h.getTheme().applyStyle(this.R, true);
          }
       }
       if (p1) {
          AppCompatDelegateImpl tg = this.g;
          if (tg instanceof Activity) {
             if (tg instanceof LifecycleOwner) {
                if (tg.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.STARTED)) {
                   tg.onConfigurationChanged(uConfigurati);
                }
             }else if(this.O != null){
                tg.onConfigurationChanged(uConfigurati);
             }
          }
       }
       return;
    }
    public final void R(){
       ContentFrameLayout uContentFram = this.y.findViewById(0x1020002);
       View decorView = this.i.getDecorView();
       int paddingLeft = decorView.getPaddingLeft();
       int paddingTop = decorView.getPaddingTop();
       int paddingRight = decorView.getPaddingRight();
       uContentFram.a(paddingLeft, paddingTop, paddingRight, decorView.getPaddingBottom());
       TypedArray typedArray = this.h.obtainStyledAttributes(c$b.t);
       typedArray.getValue(122, uContentFram.getMinWidthMajor());
       typedArray.getValue(123, uContentFram.getMinWidthMinor());
       paddingLeft = 120;
       if (typedArray.hasValue(paddingLeft)) {
          typedArray.getValue(paddingLeft, uContentFram.getFixedWidthMajor());
       }
       paddingLeft = 121;
       if (typedArray.hasValue(paddingLeft)) {
          typedArray.getValue(paddingLeft, uContentFram.getFixedWidthMinor());
       }
       paddingLeft = 118;
       if (typedArray.hasValue(paddingLeft)) {
          typedArray.getValue(paddingLeft, uContentFram.getFixedHeightMajor());
       }
       if (typedArray.hasValue(119)) {
          typedArray.getValue(119, uContentFram.getFixedHeightMinor());
       }
       typedArray.recycle();
       uContentFram.requestLayout();
       return;
    }
    public final int R0(u0 p0,Rect p1){
       int i1;
       AppCompatDelegateImpl uAppCompatDe;
       AppCompatDelegateImpl tA;
       int i5;
       ViewGroup$MarginLayoutParams layoutParams2;
       int i = 0;
       if (p0 != null) {
          i1 = p0.k();
       }else if(p1 != null){
          i1 = p1.top;
       }else {
          i1 = 0;
       }
       AppCompatDelegateImpl ts = this.s;
       if (ts != null && ts.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
          int i2 = 1;
          if (this.s.isShown()) {
             if (this.U0 == null) {
                this.U0 = new Rect();
                this.V0 = new Rect();
             }
             AppCompatDelegateImpl tU0 = this.U0;
             AppCompatDelegateImpl tV0 = this.V0;
             if (p0 == null) {
                tU0.set(p1);
             }else {
                tU0.set(p0.i(), p0.k(), p0.j(), p0.h());
             }
             b0.a(this.y, tU0, tV0);
             Rect top = tU0.top;
             p1 = tU0.left;
             Rect right = tU0.right;
             u0 ou0 = i0.J(this.y);
             int i3 = (ou0 == null)? 0: ou0.i();
             int i4 = (ou0 == null)? 0: ou0.j();
             if (layoutParams.topMargin == top && (layoutParams.leftMargin != p1 || layoutParams.rightMargin != right)) {
                layoutParams.topMargin = top;
                layoutParams.leftMargin = p1;
                layoutParams.rightMargin = right;
                uAppCompatDe = 1;
             }else {
                uAppCompatDe = null;
             }
             if (top > null && this.A == null) {
                View view = new View(this.h);
                this.A = view;
                view.setVisibility(8);
                FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                layoutParams1.leftMargin = i3;
                layoutParams1.rightMargin = i4;
                this.y.addView(this.A, -1, layoutParams1);
             }else {
                tA = this.A;
                if (tA != null) {
                   layoutParams2 = tA.getLayoutParams();
                   ViewGroup$MarginLayoutParams topMargin = layoutParams.topMargin;
                   if (layoutParams2.height == topMargin && (layoutParams2.leftMargin != i3 || layoutParams2.rightMargin != i4)) {
                      layoutParams2.height = topMargin;
                      layoutParams2.leftMargin = i3;
                      layoutParams2.rightMargin = i4;
                      this.A.setLayoutParams(layoutParams2);
                   }
                }
             }
             tA = this.A;
             if (tA == null) {
                i2 = 0;
             }
             if (i2 && tA.getVisibility()) {
                this.S0(this.A);
             }
             if (this.F == null && i2) {
                i1 = 0;
             }
             i5 = i2;
             i2 = uAppCompatDe;
          }else if(layoutParams.topMargin != null){
             layoutParams.topMargin = i;
             layoutParams2 = 0;
          }else {
             layoutParams2 = 0;
             i2 = 0;
          }
          if (i2) {
             this.s.setLayoutParams(layoutParams);
          }
       }else {
          layoutParams2 = 0;
       }
       uAppCompatDe = this.A;
       if (uAppCompatDe != null) {
          if (!i5) {
             i = 8;
          }
          uAppCompatDe.setVisibility(i);
       }
       return i1;
    }
    public final void S(Window p0){
       String str = "AppCompat has already installed itself into the Window";
       if (this.i != null) {
          throw new IllegalStateException(str);
       }
       Window$Callback callback = p0.getCallback();
       if (callback instanceof AppCompatDelegateImpl$i) {
          throw new IllegalStateException(str);
       }
       AppCompatDelegateImpl$i oi = new AppCompatDelegateImpl$i(this, callback);
       this.j = oi;
       p0.setCallback(oi);
       x ox = x.u(this.h, null, AppCompatDelegateImpl.Z0);
       Drawable uDrawable = ox.h(0);
       if (uDrawable != null) {
          p0.setBackgroundDrawable(uDrawable);
       }
       ox.w();
       this.i = p0;
       return;
    }
    public final void S0(View p0){
       AppCompatDelegateImpl uAppCompatDe = (i0.Q(p0) & 0x2000)? 1: null;
       int color = (uAppCompatDe)? ContextCompat.getColor(this.h, R.color.arg_RES_7f060012): ContextCompat.getColor(this.h, R.color.arg_RES_7f060011);
       p0.setBackgroundColor(color);
       return;
    }
    public final int T(){
       AppCompatDelegateImpl tQ = this.Q;
       if (tQ != -100) {
       }else {
          tQ = d.l();
       }
       return tQ;
    }
    public void U(int p0,AppCompatDelegateImpl$PanelFeatureState p1,Menu p2){
       AppCompatDelegateImpl$PanelFeatureState j;
       if (p2 == null) {
          j = p1.j;
       }
       if (p1.o == null) {
          return;
       }else if(this.P == null){
          this.j.a().onPanelClosed(p0, j);
       }
       return;
    }
    public void V(e p0){
       if (this.I != null) {
          return;
       }
       this.I = true;
       this.o.n();
       Window$Callback uCallback = this.o0();
       if (uCallback != null && this.P == null) {
          uCallback.onPanelClosed(108, p0);
       }
       this.I = false;
       return;
    }
    public final void W(){
       AppCompatDelegateImpl tU = this.U;
       if (tU != null) {
          tU.a();
       }
       tU = this.V;
       if (tU != null) {
          tU.a();
       }
       return;
    }
    public void X(int p0){
       this.Y(this.m0(p0, true), true);
    }
    public void Y(AppCompatDelegateImpl$PanelFeatureState p0,boolean p1){
       if (p1 && p0.a == null) {
          AppCompatDelegateImpl to = this.o;
          if (to != null && to.g()) {
             this.V(p0.j);
             return;
          }
       }
       WindowManager systemServic = this.h.getSystemService("window");
       if (systemServic != null && p0.o != null) {
          AppCompatDelegateImpl$PanelFeatureState g = p0.g;
          if (g != null) {
             systemServic.removeView(g);
             if (p1) {
                this.U(p0.a, p0, null);
             }
          }
       }
       p0.m = false;
       p0.n = false;
       p0.o = false;
       p0.h = null;
       p0.q = true;
       if (this.K == p0) {
          this.K = null;
       }
       return;
    }
    public final Configuration Z(Context p0,int p1,Configuration p2){
       int i;
       if (p1 != 1) {
          i = (p1 != 2)? p0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30: 32;
       }else {
          i = 16;
       }
       Configuration uConfigurati = new Configuration();
       uConfigurati.fontScale = 0;
       if (p2 != null) {
          uConfigurati.setTo(p2);
       }
       uConfigurati.uiMode = i | (uConfigurati.uiMode & 0xcf);
       return uConfigurati;
    }
    public void a(e p0){
       this.I0(true);
    }
    public final ViewGroup a0(){
       ViewGroup viewGroup;
       TypedArray typedArray = this.h.obtainStyledAttributes(c$b.t);
       int i = 115;
       if (typedArray.hasValue(i)) {
          boolean b = false;
          int i1 = 1;
          if (typedArray.getBoolean(124, b)) {
             this.F(i1);
          }else if(typedArray.getBoolean(i, b)){
             this.F(108);
          }
          int i2 = 109;
          if (typedArray.getBoolean(116, b)) {
             this.F(i2);
          }
          if (typedArray.getBoolean(117, b)) {
             this.F(10);
          }
          this.G = typedArray.getBoolean(b, b);
          typedArray.recycle();
          this.g0();
          this.i.getDecorView();
          LayoutInflater layoutInflat = LayoutInflater.from(this.h);
          if (this.H == null) {
             if (this.G != null) {
                viewGroup = layoutInflat.inflate(R.layout.arg_RES_7f0d000c, null);
                this.E = b;
                this.D = b;
             }else if(this.D != null){
                TypedValue typedValue = new TypedValue();
                this.h.getTheme().resolveAttribute(R.attr.arg_RES_7f0400dc, typedValue, i1);
                d uod = (typedValue.resourceId != null)? new d(this.h, typedValue.resourceId): this.h;
                viewGroup = LayoutInflater.from(uod).inflate(R.layout.arg, null);
                j oj = viewGroup.findViewById(R.id.decor_content_parent);
                this.o = oj;
                oj.setWindowCallback(this.o0());
                if (this.E != null) {
                   this.o.m(i2);
                }
                if (this.B != null) {
                   this.o.m(2);
                }
                if (this.C != null) {
                   this.o.m(5);
                }
             }else {
                viewGroup = null;
             }
          }else if(this.F != null){
             viewGroup = layoutInflat.inflate(R.layout.arg_RES_7f0d0016, null);
          }else {
             viewGroup = layoutInflat.inflate(R.layout.arg_RES_7f0d0015, null);
          }
          if (viewGroup != null) {
             i0.I0(viewGroup, new AppCompatDelegateImpl$b(this));
             if (this.o == null) {
                this.z = viewGroup.findViewById(0x7f0a3f2c);
             }
             b0.c(viewGroup);
             ContentFrameLayout uContentFram = viewGroup.findViewById(R.id.action_bar_activity_content);
             ViewGroup viewGroup1 = this.i.findViewById(0x1020002);
             if (viewGroup1 != null) {
                while (viewGroup1.getChildCount() > 0) {
                   viewGroup1.removeViewAt(b);
                   uContentFram.addView(viewGroup1.getChildAt(b));
                }
                viewGroup1.setId(-1);
                uContentFram.setId(0x1020002);
                if (viewGroup1 instanceof FrameLayout) {
                   viewGroup1.setForeground(null);
                }
             }
             this.i.setContentView(viewGroup);
             uContentFram.setAttachListener(new AppCompatDelegateImpl$c(this));
             return viewGroup;
          }else {
             throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: "+this.D+", windowActionBarOverlay: "+this.E+", android:windowIsFloating: "+this.G+", windowActionModeOverlay: "+this.F+", windowNoTitle: "+this.H+" }");
          }
       }else {
          typedArray.recycle();
          throw new IllegalStateException("You need to use a Theme.AppCompat theme \(or descendant\) with this activity.");
       }
    }
    public boolean b(e p0,MenuItem p1){
       Window$Callback uCallback = this.o0();
       if (uCallback != null && this.P == null) {
          AppCompatDelegateImpl$PanelFeatureState panelFeature = this.h0(p0.F());
          if (panelFeature != null) {
             return uCallback.onMenuItemSelected(panelFeature.a, p1);
          }
       }
       return false;
    }
    public void b0(){
       AppCompatDelegateImpl$PanelFeatureState j;
       AppCompatDelegateImpl to = this.o;
       if (to != null) {
          to.n();
       }
       if (this.t != null) {
          try{
             this.i.getDecorView().removeCallbacks(this.u);
             if (this.t.isShowing()) {
                this.t.dismiss();
             }
             this.t = null;
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
    }
    public boolean c0(KeyEvent p0){
       AppCompatDelegateImpl tg = this.g;
       boolean b = true;
       if (tg instanceof h$a || tg instanceof e) {
          View decorView = this.i.getDecorView();
          if (decorView != null && h.d(decorView, p0)) {
             return b;
          }
       }
       if (p0.getKeyCode() == 82 && this.j.a().dispatchKeyEvent(p0)) {
          return b;
       }else {
          int keyCode = p0.getKeyCode();
          if (p0.getAction()) {
             b = false;
          }
          boolean b1 = (b)? this.x0(keyCode, p0): this.A0(keyCode, p0);
          return b1;
       }
    }
    public void d(View p0,ViewGroup$LayoutParams p1){
       this.f0();
       this.y.findViewById(0x1020002).addView(p0, p1);
       this.j.a().onContentChanged();
    }
    public void d0(int p0){
       boolean b = true;
       AppCompatDelegateImpl$PanelFeatureState panelFeature = this.m0(p0, b);
       if (panelFeature.j != null) {
          Bundle uBundle = new Bundle();
          panelFeature.j.T(uBundle);
          if (uBundle.size() > 0) {
             panelFeature.u = uBundle;
          }
          panelFeature.j.h0();
          panelFeature.j.clear();
       }
       panelFeature.r = b;
       panelFeature.q = b;
       if (p0 == 108 || (!p0 && this.o != null)) {
          AppCompatDelegateImpl$PanelFeatureState panelFeature1 = this.m0(0, 0);
          panelFeature1.m = false;
          this.H0(panelFeature1, null);
       }
       return;
    }
    public boolean e(){
       return this.Q(true);
    }
    public void e0(){
       AppCompatDelegateImpl tv = this.v;
       if (tv != null) {
          tv.b();
       }
       return;
    }
    public final void f0(){
       if (this.x == null) {
          this.y = this.a0();
          CharSequence uCharSequenc = this.n0();
          if (!TextUtils.isEmpty(uCharSequenc)) {
             AppCompatDelegateImpl to = this.o;
             if (to != null) {
                to.setWindowTitle(uCharSequenc);
             }else if(this.F0() != null){
                this.F0().n0(uCharSequenc);
             }else {
                to = this.z;
                if (to != null) {
                   to.setText(uCharSequenc);
                }
             }
          }
          this.R();
          this.x = true;
          AppCompatDelegateImpl$PanelFeatureState panelFeature = this.m0(0, 0);
          if (this.P == null && panelFeature.j == null) {
             this.t0(108);
          }
       }
    label_0049 :
       return;
    }
    public Context g(Context p0){
       boolean b = true;
       this.M = b;
       boolean i = this.v0(p0, this.T());
       Configuration uConfigurati = null;
       if (AppCompatDelegateImpl.b1 && p0 instanceof ContextThemeWrapper) {
          Configuration uConfigurati1 = this.Z(p0, i, uConfigurati);
          try{
             AppCompatDelegateImpl$o.a(p0, uConfigurati1);
             return p0;
          }catch(java.lang.IllegalStateException e0){
          }
       label_0020 :
          if (p0 instanceof d) {
             uConfigurati1 = this.Z(p0, i, uConfigurati);
             try{
                a.a(p0, uConfigurati1);
                return p0;
             }catch(java.lang.IllegalStateException e0){
             }
             if (!AppCompatDelegateImpl.a1) {
                return p0;
             }
             try{
                uConfigurati1 = p0.getPackageManager().getResourcesForApplication(p0.getApplicationInfo()).getConfiguration();
                Configuration configuratio = p0.getResources().getConfiguration();
                if (!uConfigurati1.equals(configuratio)) {
                   uConfigurati = AppCompatDelegateImpl.i0(uConfigurati1, configuratio);
                }
                d uod = new d(p0, 0x7f110341);
                a.a(uod, this.Z(p0, i, uConfigurati));
                try{
                   i = 0;
                   if (p0.getTheme() == null) {
                      b = 0;
                   }
                   i = e0;
                }catch(java.lang.NullPointerException e0){
                }
                if (i) {
                   f$b.a(uod.getTheme());
                }
                return uod;
             }catch(android.content.pm.PackageManager$NameNotFoundException e7){
                throw new RuntimeException("Application failed to obtain resources from itself", e7);
             }
          }else {
             goto label_0030 ;
          }
       }else {
          goto label_0020 ;
       }
    }
    public final void g0(){
       if (this.i == null) {
          AppCompatDelegateImpl tg = this.g;
          if (tg instanceof Activity) {
             this.S(tg.getWindow());
          }
       }
       if (this.i != null) {
          return;
       }else {
          throw new IllegalStateException("We have not been given a Window");
       }
    }
    public AppCompatDelegateImpl$PanelFeatureState h0(Menu p0){
       object oobject;
       AppCompatDelegateImpl tJ = this.J;
       int i = 0;
       int len = (tJ != null)? tJ.length: 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = tJ[i];
          if (oobject != null && oobject.j == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public View j(View p0,String p1,Context p2,AttributeSet p3){
       boolean b;
       int i = 0;
       if (this.W0 == null) {
          String str = this.h.obtainStyledAttributes(c$b.t).getString(114);
          if (str == null) {
             this.W0 = new b();
          }else {
             Class[] uClassArray = new Class[i];
             Object[] objArray = new Object[i];
             this.W0 = Class.forName(str).getDeclaredConstructor(uClassArray).newInstance(objArray);
          }
       }
       boolean y0 = AppCompatDelegateImpl.Y0;
       if (y0) {
          AppCompatDelegateImpl uAppCompatDe = 1;
          if (p3 instanceof XmlPullParser) {
             if (p3.getDepth() > uAppCompatDe) {
                i = 1;
             }
          }else {
             i = this.L0(p0);
          }
          b = i;
       }else {
          b = false;
       }
       return this.W0.createView(p0, p1, p2, p3, b, y0, true, false);
    }
    public final Context j0(){
       ActionBar uActionBar = this.p();
       Context uContext = (uActionBar != null)? uActionBar.x(): null;
       if (uContext == null) {
          uContext = this.h;
       }
       return uContext;
    }
    public View k(int p0){
       this.f0();
       return this.i.findViewById(p0);
    }
    public final AppCompatDelegateImpl$AutoNightModeManager k0(Context p0){
       if (this.V == null) {
          this.V = new AppCompatDelegateImpl$j(this, p0);
       }
       return this.V;
    }
    public final AppCompatDelegateImpl$AutoNightModeManager l0(Context p0){
       if (this.U == null) {
          this.U = new AppCompatDelegateImpl$k(this, j.a(p0));
       }
       return this.U;
    }
    public final a m(){
       return new AppCompatDelegateImpl$f(this);
    }
    public AppCompatDelegateImpl$PanelFeatureState m0(int p0,boolean p1){
       AppCompatDelegateImpl tJ = this.J;
       if (tJ == null || tJ.length <= p0) {
          AppCompatDelegateImpl$PanelFeatureState[] panelFeature = new AppCompatDelegateImpl$PanelFeatureState[(p0 + 1)];
          if (tJ != null) {
             System.arraycopy(tJ, 0, panelFeature, 0, tJ.length);
          }
          this.J = panelFeature;
          tJ = panelFeature;
       }
       object oobject = tJ[p0];
       if (oobject == null) {
          oobject = new AppCompatDelegateImpl$PanelFeatureState(p0);
          tJ[p0] = oobject;
       }
       return oobject;
    }
    public int n(){
       return this.Q;
    }
    public final CharSequence n0(){
       AppCompatDelegateImpl tg = this.g;
       if (tg instanceof Activity) {
          return tg.getTitle();
       }
       return this.n;
    }
    public MenuInflater o(){
       if (this.m == null) {
          this.p0();
          AppCompatDelegateImpl tl = this.l;
          Context uContext = (tl != null)? tl.x(): this.h;
          this.m = new g(uContext);
       }
       return this.m;
    }
    public final Window$Callback o0(){
       return this.i.getCallback();
    }
    public final View onCreateView(View p0,String p1,Context p2,AttributeSet p3){
       return this.j(p0, p1, p2, p3);
    }
    public View onCreateView(String p0,Context p1,AttributeSet p2){
       return this.onCreateView(null, p0, p1, p2);
    }
    public ActionBar p(){
       this.p0();
       return this.l;
    }
    public final void p0(){
       this.f0();
       if (this.D != null && this.l == null) {
          AppCompatDelegateImpl tg = this.g;
          if (tg instanceof Activity) {
             this.l = new e(this.g, this.E);
          }else if(tg instanceof Dialog){
             this.l = new e(this.g);
          }
          tg = this.l;
          if (tg != null) {
             tg.R(this.Z);
          }
       }
    label_0038 :
       return;
    }
    public boolean q(int p0){
       AppCompatDelegateImpl uAppCompatDe;
       int i = this.J0(p0);
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i != 5) {
                if (i != 10) {
                   if (i != 108) {
                      uAppCompatDe = (i != 109)? null: this.E;
                   }else {
                      uAppCompatDe = this.D;
                   }
                }else {
                   uAppCompatDe = this.F;
                }
             }else {
                uAppCompatDe = this.C;
             }
          }else {
             uAppCompatDe = this.B;
          }
       }else {
          uAppCompatDe = this.H;
       }
       if (uAppCompatDe == null && !this.i.hasFeature(p0)) {
          b = false;
       }
       return b;
    }
    public final boolean q0(AppCompatDelegateImpl$PanelFeatureState p0){
       AppCompatDelegateImpl$PanelFeatureState i = p0.i;
       boolean b = true;
       if (i != null) {
          p0.h = i;
          return b;
       }else if(p0.j == null){
          return false;
       }else if(this.q == null){
          this.q = new AppCompatDelegateImpl$p(this);
       }
       View view = p0.a(this.q);
       p0.h = view;
       if (view == null) {
          b = false;
       }
       return b;
    }
    public void r(){
       LayoutInflater layoutInflat = LayoutInflater.from(this.h);
       if (layoutInflat.getFactory() == null) {
          m.b(layoutInflat, this);
       }else {
          v0 = layoutInflat.getFactory2() instanceof AppCompatDelegateImpl;
       }
       return;
    }
    public final boolean r0(AppCompatDelegateImpl$PanelFeatureState p0){
       p0.d(this.j0());
       p0.g = new AppCompatDelegateImpl$ListMenuDecorView(this, p0.l);
       p0.c = 81;
       return true;
    }
    public void s(){
       ActionBar uActionBar = this.p();
       if (uActionBar != null && uActionBar.A()) {
          return;
       }
       this.t0(0);
       return;
    }
    public final boolean s0(AppCompatDelegateImpl$PanelFeatureState p0){
       AppCompatDelegateImpl th = this.h;
       AppCompatDelegateImpl$PanelFeatureState a = p0.a;
       if (a == null || (a == 108 && this.o != null)) {
          TypedValue typedValue = new TypedValue();
          Resources$Theme theme = th.getTheme();
          theme.resolveAttribute(R.attr.arg_RES_7f0400dc, typedValue, true);
          Resources resources = null;
          if (typedValue.resourceId != null) {
             resources = th.getResources().newTheme();
             resources.setTo(theme);
             resources.applyStyle(typedValue.resourceId, true);
             resources.resolveAttribute(R.attr.arg_RES_7f0400dd, typedValue, true);
          }else {
             theme.resolveAttribute(R.attr.arg_RES_7f0400dd, typedValue, true);
          }
          if (typedValue.resourceId != null) {
             if (resources == null) {
                resources = th.getResources().newTheme();
                resources.setTo(theme);
             }
             resources.applyStyle(typedValue.resourceId, true);
          }
          if (resources != null) {
             d uod = new d(th, 0);
             uod.getTheme().setTo(resources);
             th = uod;
          }
       }
    label_0063 :
       e uoe = new e(th);
       uoe.V(this);
       p0.c(uoe);
       return true;
    }
    public final void t0(int p0){
       this.X = (1 << p0) | this.X;
       if (this.W == null) {
          i0.k0(this.i.getDecorView(), this.Y);
          this.W = true;
       }
       return;
    }
    public boolean u(){
       return this.w;
    }
    public final boolean u0(){
       if (this.T == null && this.g instanceof Activity) {
          PackageManager packageManag = this.h.getPackageManager();
          if (packageManag == null) {
             return false;
          }else {
             try{
                int sDK_INT = Build$VERSION.SDK_INT;
                if (sDK_INT >= 29) {
                   sDK_INT = 0x100c0000;
                }else if(sDK_INT >= 24){
                   sDK_INT = 0xc0000;
                }else {
                   sDK_INT = 0;
                }
                ActivityInfo activityInfo = packageManag.getActivityInfo(new ComponentName(this.h, this.g.getClass()), sDK_INT);
                boolean b = (activityInfo != null && (activityInfo.configChanges & 0x0200))? true: false;
                this.S = b;
             }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                this.S = false;
             }
          }
       }
    }
    public void v(Configuration p0){
       if (this.D != null && this.x != null) {
          ActionBar uActionBar = this.p();
          if (uActionBar != null) {
             uActionBar.D(p0);
          }
       }
       d.a().f(this.h);
       this.Q(false);
       return;
    }
    public int v0(Context p0,int p1){
       if (p1 == -100) {
          return -1;
       }
       if (p1 != -1) {
          if (p1) {
             if (p1 != 1 && p1 != 2) {
                if (p1 == 3) {
                   return this.k0(p0).c();
                }else {
                   throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
             }
          }else if(Build$VERSION.SDK_INT >= 23 && !p0.getApplicationContext().getSystemService(UiModeManager.class).getNightMode()){
             return -1;
          }else {
             return this.l0(p0).c();
          }
       }
       return p1;
    }
    public void w(Bundle p0){
       this.M = true;
       this.Q(false);
       this.g0();
       AppCompatDelegateImpl tg = this.g;
       if (tg instanceof Activity) {
          String str = null;
          try{
             str = b.c(tg);
          }catch(java.lang.IllegalArgumentException e0){
          }
          if (str != null) {
             ActionBar uActionBar = this.F0();
             if (uActionBar == null) {
                this.Z = true;
             }else {
                uActionBar.R(true);
             }
          }
          d.c(this);
       }
       this.N = true;
       return;
    }
    public boolean w0(){
       AppCompatDelegateImpl tr = this.r;
       if (tr != null) {
          tr.c();
          return true;
       }else {
          ActionBar uActionBar = this.p();
          if (uActionBar != null && uActionBar.l()) {
             return true;
          }
          return false;
       }
    }
    public void x(){
       if (this.g instanceof Activity) {
          d.D(this);
       }
       if (this.W != null) {
          this.i.getDecorView().removeCallbacks(this.Y);
       }
       this.O = false;
       this.P = true;
       if (this.Q != -100) {
          AppCompatDelegateImpl tg = this.g;
          if (tg instanceof Activity && tg.isChangingConfigurations()) {
             AppCompatDelegateImpl.X0.put(this.g.getClass().getName(), Integer.valueOf(this.Q));
          label_0057 :
             tg = this.l;
             if (tg != null) {
                tg.E();
             }
             this.W();
             return;
          }
       }
       AppCompatDelegateImpl.X0.remove(this.g.getClass().getName());
       goto label_0057 ;
    }
    public boolean x0(int p0,KeyEvent p1){
       boolean b = true;
       if (p0 != 4) {
          if (p0 == 82) {
             this.y0(false, p1);
             return b;
          }
       }else if(p1.getFlags() & 0x0080){
          b = false;
       }
       this.L = b;
       return false;
    }
    public void y(Bundle p0){
       this.f0();
    }
    public final boolean y0(int p0,KeyEvent p1){
       if (!p1.getRepeatCount()) {
          AppCompatDelegateImpl$PanelFeatureState panelFeature = this.m0(p0, true);
          if (panelFeature.o == null) {
             return this.H0(panelFeature, p1);
          }
       }
       return false;
    }
    public void z(){
       ActionBar uActionBar = this.p();
       if (uActionBar != null) {
          uActionBar.i0(true);
       }
       return;
    }
    public boolean z0(int p0,KeyEvent p1){
       ActionBar uActionBar = this.p();
       if (uActionBar != null && uActionBar.F(p0, p1)) {
          return true;
       }
       AppCompatDelegateImpl tK = this.K;
       if (tK != null && this.G0(tK, p1.getKeyCode(), p1, true)) {
          tK = this.K;
          if (tK != null) {
             tK.n = true;
          }
          return true;
       }else if(this.K == null){
          AppCompatDelegateImpl$PanelFeatureState panelFeature = this.m0(0, true);
          this.H0(panelFeature, p1);
          boolean b = this.G0(panelFeature, p1.getKeyCode(), p1, true);
          panelFeature.m = false;
          if (b) {
             return true;
          }
       }
       return 0;
    }
}
