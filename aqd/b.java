package aqd.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import aqd.a;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.view.View;

public class b implements ViewTreeObserver$OnGlobalLayoutListener	// class@00021c
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       this.b.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.j(this.b.h.getMeasuredWidth(), this.b.h.getMeasuredHeight());
    }
}
