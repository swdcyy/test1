package com.google.android.material.transformation.ExpandableBehavior$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.google.android.material.transformation.ExpandableBehavior;
import android.view.View;
import ak.b;
import java.lang.Object;
import android.view.ViewTreeObserver;

public class ExpandableBehavior$a implements ViewTreeObserver$OnPreDrawListener	// class@0016e7
{
    public final View b;
    public final int c;
    public final b d;
    public final ExpandableBehavior e;

    public void ExpandableBehavior$a(ExpandableBehavior p0,View p1,int p2,b p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public boolean onPreDraw(){
       this.b.getViewTreeObserver().removeOnPreDrawListener(this);
       ExpandableBehavior$a te = this.e;
       if (te.a == this.c) {
          ExpandableBehavior$a td = this.d;
          ExpandableBehavior$a uoa = td;
          te.e(uoa, this.b, td.b(), false);
       }
       return false;
    }
}
