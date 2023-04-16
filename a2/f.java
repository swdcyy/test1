package a2.f;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import android.os.Handler;
import java.lang.Object;
import a2.f$b;
import android.view.MotionEvent;
import a2.f$a;
import android.view.GestureDetector$OnDoubleTapListener;

public final class f	// class@00005a
{
    public final f$a a;

    public void f(Context p0,GestureDetector$OnGestureListener p1){
       super(p0, p1, null);
    }
    public void f(Context p0,GestureDetector$OnGestureListener p1,Handler p2){
       super();
       this.a = new f$b(p0, p1, null);
    }
    public boolean a(MotionEvent p0){
       return this.a.onTouchEvent(p0);
    }
    public void b(GestureDetector$OnDoubleTapListener p0){
       this.a.setOnDoubleTapListener(p0);
    }
}
