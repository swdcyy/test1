package ced.m0;
import android.view.View$OnTouchListener;
import com.yxcorp.plugin.search.result.hashtag.presenters.r;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.kwai.library.widget.popup.common.c;

public final class m0 implements View$OnTouchListener	// class@000568
{
    public final r b;

    public void m0(r p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       m0 tb = this.b;
       if (tb.x != null && !p1.getAction()) {
          tb.x.o();
          tb.x = null;
       }
       return true;
    }
}
