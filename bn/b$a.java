package bn.b$a;
import android.view.View$OnAttachStateChangeListener;
import io.reactivex.android.a;
import android.view.View;
import brd.y;
import com.jakewharton.rxbinding2.internal.Notification;
import java.lang.Object;

public final class b$a extends a implements View$OnAttachStateChangeListener	// class@000297
{
    public final View c;
    public final boolean d;
    public final y e;

    public void b$a(View p0,boolean p1,y p2){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public void a(){
       this.c.removeOnAttachStateChangeListener(this);
    }
    public void onViewAttachedToWindow(View p0){
       if (this.d != null && !this.isDisposed()) {
          this.e.onNext(Notification.INSTANCE);
       }
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (this.d == null && !this.isDisposed()) {
          this.e.onNext(Notification.INSTANCE);
       }
       return;
    }
}
