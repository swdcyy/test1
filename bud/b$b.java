package bud.b$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import bud.c;
import java.lang.Object;
import android.graphics.Rect;

public final class b$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0002f8
{
    public final Rect b;
    public boolean c;
    public final View d;
    public final c e;

    public void b$b(View p0,c p1){
       this.d = p0;
       this.e = p1;
       super();
       this.b = new Rect();
       this.c = false;
    }
    public void onGlobalLayout(){
       this.d.getWindowVisibleDisplayFrame(this.b);
       boolean height = this.d.getRootView().getHeight();
       height = ((double)(height - this.b.height()) - ((double)height * 0x3fc3333333333333) > 0)? true: false;
       if (height == this.c) {
          return;
       }else {
          this.c = height;
          this.e.a(height);
          return;
       }
    }
}
