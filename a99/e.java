package a99.e;
import erd.g;
import a99.g;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class e implements g	// class@00005e
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, g.class, "10")) {
       }else if(!tb.I.getScrollState()){
          tb.r.setVisibility(4);
          tb.D.onNext(Boolean.TRUE);
       }
       return;
    }
}
