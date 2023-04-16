package androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.app.AppCompatDelegateImpl;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import r0.a;

public class AppCompatDelegateImpl$ListMenuDecorView extends ContentFrameLayout	// class@00056c
{
    public final AppCompatDelegateImpl j;

    public void AppCompatDelegateImpl$ListMenuDecorView(AppCompatDelegateImpl p0,Context p1){
       this.j = p0;
       super(p1);
    }
    public final boolean b(int p0,int p1){
       int i = -5;
       boolean b = (p0 >= i && (p1 >= i && (p0 > (this.getWidth() + 5) || p1 > (this.getHeight() + 5))))? true: false;
       return b;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       boolean b = (this.j.c0(p0) || super.dispatchKeyEvent(p0))? true: false;
       return b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       if (p0.getAction() || !this.b((int)p0.getX(), (int)p0.getY())) {
          return super.onInterceptTouchEvent(p0);
       }
       this.j.X(0);
       return true;
    }
    public void setBackgroundResource(int p0){
       this.setBackgroundDrawable(a.d(this.getContext(), p0));
    }
}
