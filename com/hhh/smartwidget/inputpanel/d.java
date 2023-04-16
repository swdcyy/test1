package com.hhh.smartwidget.inputpanel.d;
import java.util.WeakHashMap;
import android.view.View;
import com.hhh.smartwidget.inputpanel.d$b;
import java.lang.Object;
import com.hhh.smartwidget.inputpanel.d$a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class d	// class@000588
{
    public static final WeakHashMap a;

    static {
       d.a = new WeakHashMap();
    }
    public static void a(View p0,d$b p1){
       WeakHashMap a = d.a;
       if (a.get(p1) != null) {
          return;
       }
       d$a uoa = new d$a(p0, p1);
       p0.getViewTreeObserver().addOnGlobalLayoutListener(uoa);
       a.put(p1, uoa);
       return;
    }
    public static void b(View p0,d$b p1){
       p0.getViewTreeObserver().removeOnGlobalLayoutListener(d.a.remove(p1));
    }
}
