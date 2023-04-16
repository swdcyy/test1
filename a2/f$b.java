package a2.f$b;
import a2.f$a;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import android.os.Handler;
import java.lang.Object;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector$OnDoubleTapListener;

public class f$b implements f$a	// class@000058
{
    public final GestureDetector a;

    public void f$b(Context p0,GestureDetector$OnGestureListener p1,Handler p2){
       super();
       this.a = new GestureDetector(p0, p1, p2);
    }
    public boolean a(){
       return this.a.isLongpressEnabled();
    }
    public void b(boolean p0){
       this.a.setIsLongpressEnabled(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       return this.a.onTouchEvent(p0);
    }
    public void setOnDoubleTapListener(GestureDetector$OnDoubleTapListener p0){
       this.a.setOnDoubleTapListener(p0);
    }
}
