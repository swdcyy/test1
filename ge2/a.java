package ge2.a;
import android.view.View$OnTouchListener;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;

public final class a implements View$OnTouchListener	// class@002b05
{
    public final LivePkAvatarsBanner b;

    public void a(LivePkAvatarsBanner p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       return this.b.c.dispatchTouchEvent(p1);
    }
}
