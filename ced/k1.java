package ced.k1;
import android.view.View$OnTouchListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.e0;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import android.widget.TextView;

public final class k1 implements View$OnTouchListener	// class@000563
{
    public final e0 b;

    public void k1(e0 p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       k1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!p1.getAction()) {
          tb.I.setAlpha(0x3f000000);
       }else {
          tb.I.setAlpha(0x3f800000);
       }
       return false;
    }
}
