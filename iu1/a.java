package iu1.a;
import android.view.View$OnTouchListener;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.view.GestureDetector;

public final class a implements View$OnTouchListener	// class@002999
{
    public final LiveMultiPkScoreProgressBar b;

    public void a(LiveMultiPkScoreProgressBar p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       return this.b.p.onTouchEvent(p1);
    }
}
