package bjc.i;
import android.view.View$OnClickListener;
import bjc.h$c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cic.c;
import uo7.k;
import com.yxcorp.gifshow.entity.QPhoto;
import cic.c$a;
import mhc.e2;
import io.reactivex.subjects.PublishSubject;

public final class i implements View$OnClickListener	// class@00048b
{
    public final h$c b;

    public void i(h$c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h$c.class, "8")) {
       }else {
          c.d.a(tb.p, tb.q);
          tb.r.onNext(new e2(p0.getId()));
       }
       return;
    }
}
