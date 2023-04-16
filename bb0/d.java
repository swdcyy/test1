package bb0.d;
import java.lang.Runnable;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.c;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public final class d implements Runnable	// class@000259
{
    public final c b;

    public void d(c p0){
       this.b = p0;
    }
    public final void run(){
       this.b.w.onNext("");
    }
}
