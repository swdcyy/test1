package com.hhh.smartwidget.bubble.a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.hhh.smartwidget.bubble.a;
import com.hhh.smartwidget.bubble.a$d;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.view.View;

public class a$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000578
{
    public final a$d b;
    public final a c;

    public void a$a(a p0,a$d p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       this.b.z.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.t();
    }
}
