package f5b.h;
import erd.g;
import f5b.c;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;

public final class h implements g	// class@0028ab
{
    public final c b;

    public void h(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (p0 == ActivityEvent.DESTROY) {
          p0.x = null;
       }
       return;
    }
}
