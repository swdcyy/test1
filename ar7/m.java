package ar7.m;
import android.view.View$OnClickListener;
import ar7.n;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import ar7.q;
import java.util.Objects;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public final class m implements View$OnClickListener	// class@000355
{
    public final n b;
    public final int c;

    public void m(n p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, str)) {
          return;
       }
       q oq = this.b.l();
       m tc = this.c;
       Objects.requireNonNull(oq);
       if (!PatchProxy.isSupport(q.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tc), oq, q.class, str)) {
          oq.a.onNext(Integer.valueOf(tc));
       }
       return;
    }
}
