package ekd.p1$a;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewParent;
import java.lang.Class;

public final class p1$a implements Runnable	// class@000d6a
{
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public void p1$a(View p0,int p1,int p2,int p3,int p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void run(){
       Rect rect = new Rect();
       this.b.getHitRect(rect);
       rect.top = rect.top - this.c;
       rect.bottom = rect.bottom + this.d;
       rect.left = rect.left - this.e;
       rect.right = rect.right + this.f;
       TouchDelegate touchDelegat = new TouchDelegate(rect, this.b);
       if (View.class.isInstance(this.b.getParent())) {
          this.b.getParent().setTouchDelegate(touchDelegat);
       }
       return;
    }
}
