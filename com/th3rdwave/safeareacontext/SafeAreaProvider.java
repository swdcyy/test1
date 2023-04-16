package com.th3rdwave.safeareacontext.SafeAreaProvider;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.Context;
import android.view.View;
import ar8.a;
import ar8.e;
import android.view.ViewGroup;
import ar8.c;
import java.lang.Object;
import java.util.Objects;
import od.a;
import com.th3rdwave.safeareacontext.SafeAreaProvider$a;
import android.view.ViewTreeObserver;

public class SafeAreaProvider extends ReactViewGroup implements ViewTreeObserver$OnPreDrawListener	// class@000f93
{
    public SafeAreaProvider$a b;
    public a c;
    public c d;

    public void SafeAreaProvider(Context p0){
       super(p0);
    }
    public final void h(){
       a uoa = e.c(this);
       c uoc = e.a(this.getRootView(), this);
       if (uoa != null && uoc != null) {
          SafeAreaProvider tc = this.c;
          if (tc != null && (this.d != null && tc.a(uoa))) {
             tc = this.d;
             Objects.requireNonNull(tc);
             int i = 1;
             if (tc != uoc && (tc.a - uoc.a || (tc.b - uoc.b || (tc.c - uoc.c || tc.d - uoc.d)))) {
                i = 0;
             }
             if (i) {
             label_005b :
                return;
             }
          }
       label_004d :
          tc = this.b;
          a.c(tc);
          tc.a(this, uoa, uoc);
          this.c = uoa;
          this.d = uoc;
          goto label_005b ;
       }else {
          goto label_005b ;
       }
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.getViewTreeObserver().addOnPreDrawListener(this);
       this.h();
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.getViewTreeObserver().removeOnPreDrawListener(this);
    }
    public boolean onPreDraw(){
       this.h();
       return true;
    }
    public void setOnInsetsChangeListener(SafeAreaProvider$a p0){
       this.b = p0;
    }
}
