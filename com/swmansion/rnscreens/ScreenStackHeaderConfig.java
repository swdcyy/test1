package com.swmansion.rnscreens.ScreenStackHeaderConfig;
import android.view.ViewGroup;
import android.content.Context;
import java.util.ArrayList;
import com.swmansion.rnscreens.ScreenStackHeaderConfig$a;
import androidx.appcompat.widget.Toolbar;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.view.ViewParent;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.ScreenStackFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.app.ActionBar;
import android.view.View$OnClickListener;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import yf.j;
import android.content.res.AssetManager;
import java.lang.String;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import java.lang.Object;
import com.swmansion.rnscreens.ScreenStackHeaderSubview$Type;
import android.widget.ImageView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import com.swmansion.rnscreens.ScreenStackHeaderConfig$b;
import java.lang.Enum;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.appcompat.app.ActionBar$LayoutParams;
import com.swmansion.rnscreens.ScreenFragment;
import com.swmansion.rnscreens.ScreenContainer;

public class ScreenStackHeaderConfig extends ViewGroup	// class@000cb4
{
    public final ArrayList b;
    public String c;
    public int d;
    public String e;
    public float f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public final Toolbar n;
    public boolean o;
    public int p;
    public int q;
    public View$OnClickListener r;

    public void ScreenStackHeaderConfig(Context p0){
       super(p0);
       this.b = new ArrayList(3);
       this.o = false;
       this.r = new ScreenStackHeaderConfig$a(this);
       this.setVisibility(8);
       Toolbar toolbar = new Toolbar(p0);
       this.n = toolbar;
       this.p = toolbar.getContentInsetStart();
       this.q = toolbar.getContentInsetStartWithNavigation();
       TypedValue typedValue = new TypedValue();
       if (p0.getTheme().resolveAttribute(0x1010433, typedValue, true)) {
          toolbar.setBackgroundColor(typedValue.data);
       }
       return;
    }
    public final void a(){
       if (this.getParent() != null && this.k == null) {
          this.b();
       }
       return;
    }
    public void b(){
       ScreenStackFragment d;
       ScreenStackHeaderConfig tn;
       ScreenStackFragment c;
       Screen parent = this.getParent();
       ScreenStack screenStack = this.getScreenStack();
       ScreenStackFragment screenStackF = 1;
       ScreenStackHeaderConfig screenStackH = (screenStack == null || screenStack.getTopScreen() == parent)? 1: null;
       if (this.o == null || (screenStackH && this.k == null)) {
          FragmentActivity activity = this.getScreenFragment().getActivity();
          if (!activity instanceof AppCompatActivity) {
             return;
          }else if(activity == null){
             return;
          }else if(this.h != null){
             if (this.n.getParent() != null) {
                ScreenStackFragment screenFragme = this.getScreenFragment();
                if (screenFragme.c != null) {
                   d = screenFragme.d;
                   if (d != null) {
                      screenStackF = screenFragme.c;
                      if (d.getParent() == screenStackF) {
                         screenStackF.removeView(screenFragme.d);
                      }
                   }
                }
                screenFragme.d = null;
             }
             return;
          }else if(this.n.getParent() == null){
             d = this.getScreenFragment();
             tn = this.n;
             c = d.c;
             if (c != null) {
                c.addView(tn);
             }
             d.d = tn;
             AppBarLayout$LayoutParams layoutParams = new AppBarLayout$LayoutParams(-1, -2);
             layoutParams.d(0);
             d.d.setLayoutParams(layoutParams);
          }
          activity.setSupportActionBar(this.n);
          ActionBar supportActio = activity.getSupportActionBar();
          this.n.setContentInsetStartWithNavigation(this.q);
          this.n.J(this.p, this.p);
          int b = (this.getScreenFragment().Xg() && this.i == null)? true: false;
          supportActio.S(b);
          this.n.setNavigationOnClickListener(this.r);
          d = this.getScreenFragment();
          tn = this.j;
          ScreenStackHeaderSubview$Type type = null;
          if (d.e != tn) {
             c = d.c;
             float f = (tn != null)? 0: ScreenStackFragment.f;
             c.setTargetElevation(f);
             d.e = tn;
          }
          supportActio.m0(this.c);
          if (TextUtils.isEmpty(this.c)) {
             this.n.setContentInsetStartWithNavigation(0);
          }
          TextView titleTextVie = this.getTitleTextView();
          tn = this.d;
          if (tn != null) {
             this.n.setTitleTextColor(tn);
          }
          if (titleTextVie != null) {
             if (this.e != null) {
                titleTextVie.setTypeface(j.c().e(this.e, 0, this.getContext().getAssets()));
             }
             tn = this.f;
             if (tn - type > 0) {
                titleTextVie.setTextSize(tn);
             }
          }
          ScreenStackHeaderConfig tg = this.g;
          if (tg != null) {
             this.n.setBackgroundColor(tg);
          }
          if (this.m != null) {
             Drawable navigationIc = this.n.getNavigationIcon();
             if (navigationIc != null) {
                navigationIc.setColorFilter(this.m, PorterDuff$Mode.SRC_ATOP);
             }
          }
          b = this.n.getChildCount() - screenStackF;
          while (b >= 0) {
             if (this.n.getChildAt(b) instanceof ScreenStackHeaderSubview) {
                this.n.removeViewAt(b);
             }
             b = b - 1;
          }
          b = this.b.size();
          int i = 0;
          while (i < b) {
             ScreenStackHeaderSubview screenStackH1 = this.b.get(i);
             type = screenStackH1.getType();
             if (type == ScreenStackHeaderSubview$Type.BACK) {
                View childAt = screenStackH1.getChildAt(0);
                if (childAt instanceof ImageView) {
                   supportActio.a0(childAt.getDrawable());
                }else {
                   throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                }
             }else {
                Toolbar$LayoutParams layoutParams1 = new Toolbar$LayoutParams(-2, -1);
                int i1 = ScreenStackHeaderConfig$b.a[type.ordinal()];
                if (i1 != screenStackF) {
                   if (i1 != 2) {
                      if (i1 == 3) {
                         layoutParams1.width = -1;
                         layoutParams1.a = screenStackF;
                         this.n.setTitle(null);
                      }
                   }else {
                      layoutParams1.a = 5;
                   }
                }else if(this.l == null){
                   this.n.setNavigationIcon(null);
                }
                this.n.setTitle(null);
                layoutParams1.a = 3;
                screenStackH1.setLayoutParams(layoutParams1);
                this.n.addView(screenStackH1);
             }
             i = i + 1;
          }
       }
       return;
    }
    public int getConfigSubviewsCount(){
       return this.b.size();
    }
    public final Screen getScreen(){
       ViewParent parent = this.getParent();
       if (parent instanceof Screen) {
          return parent;
       }
       return null;
    }
    public ScreenStackFragment getScreenFragment(){
       ViewParent parent = this.getParent();
       if (parent instanceof Screen) {
          ScreenFragment fragment = parent.getFragment();
          if (fragment instanceof ScreenStackFragment) {
             return fragment;
          }
       }
       return null;
    }
    public ScreenStack getScreenStack(){
       Screen screen = this.getScreen();
       if (screen != null) {
          ScreenContainer container = screen.getContainer();
          if (container instanceof ScreenStack) {
             return container;
          }
       }
       return null;
    }
    public final TextView getTitleTextView(){
       View childAt;
       int childCount = this.n.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = this.n.getChildAt(i);
          if (childAt instanceof TextView && childAt.getText().equals(this.n.getTitle())) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.o = true;
       this.b();
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.o = false;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
    public void setBackButtonInCustomView(boolean p0){
       this.l = p0;
    }
    public void setBackgroundColor(int p0){
       this.g = p0;
    }
    public void setHidden(boolean p0){
       this.h = p0;
    }
    public void setHideBackButton(boolean p0){
       this.i = p0;
    }
    public void setHideShadow(boolean p0){
       this.j = p0;
    }
    public void setTintColor(int p0){
       this.m = p0;
    }
    public void setTitle(String p0){
       this.c = p0;
    }
    public void setTitleColor(int p0){
       this.d = p0;
    }
    public void setTitleFontFamily(String p0){
       this.e = p0;
    }
    public void setTitleFontSize(float p0){
       this.f = p0;
    }
}
