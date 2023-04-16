package bn.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import io.reactivex.android.a;
import android.view.View;
import brd.y;
import android.view.ViewTreeObserver;
import com.jakewharton.rxbinding2.internal.Notification;
import java.lang.Object;

public final class d$a extends a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00029b
{
    public final View c;
    public final y d;

    public void d$a(View p0,y p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public void a(){
       this.c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
    public void onGlobalLayout(){
       if (!this.isDisposed()) {
          this.d.onNext(Notification.INSTANCE);
       }
       return;
    }
}
