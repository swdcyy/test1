package bn.c$a;
import android.view.View$OnClickListener;
import io.reactivex.android.a;
import android.view.View;
import brd.y;
import com.jakewharton.rxbinding2.internal.Notification;
import java.lang.Object;

public final class c$a extends a implements View$OnClickListener	// class@000299
{
    public final View c;
    public final y d;

    public void c$a(View p0,y p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public void a(){
       this.c.setOnClickListener(null);
    }
    public void onClick(View p0){
       if (!this.isDisposed()) {
          this.d.onNext(Notification.INSTANCE);
       }
       return;
    }
}
