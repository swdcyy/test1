package b8a.e1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.r;
import java.lang.Object;
import java.util.Objects;
import rd5.g;
import com.kuaishou.android.model.mix.QComment;
import io.reactivex.subjects.PublishSubject;

public final class e1 implements Runnable	// class@00039e
{
    public final r b;

    public void e1(r p0){
       this.b = p0;
    }
    public final void run(){
       e1 tb = this.b;
       Objects.requireNonNull(tb);
       g og = new g(0, null);
       og.c = 9;
       og.d = false;
       tb.t.onNext(og);
    }
}
