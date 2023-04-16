package nz0.e;
import java.lang.Runnable;
import nz0.f;
import java.lang.Object;
import java.util.Objects;
import android.graphics.Rect;
import android.widget.RelativeLayout;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.TouchDelegate;
import android.view.View;

public final class e implements Runnable	// class@003436
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       Objects.requireNonNull(tb);
       Rect rect = new Rect();
       tb.r.getHitRect(rect);
       rect.right = rect.right + n.c(a.a().a(), 20.00f);
       rect.left = rect.left + n.c(a.a().a(), 20.00f);
       rect.top = rect.top + n.c(a.a().a(), 20.00f);
       rect.bottom = rect.bottom + n.c(a.a().a(), 20.00f);
       tb.r.setTouchDelegate(new TouchDelegate(rect, tb.p));
    }
}
