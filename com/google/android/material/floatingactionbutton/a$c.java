package com.google.android.material.floatingactionbutton.a$c;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.google.android.material.floatingactionbutton.a;
import java.lang.Object;

public class a$c implements ViewTreeObserver$OnPreDrawListener	// class@001690
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       this.b.D();
       return true;
    }
}
