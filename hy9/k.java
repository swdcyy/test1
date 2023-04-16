package hy9.k;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import hy9.l;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class k extends m	// class@00273c
{
    public final d c;

    public void k(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       l ol = this.c.l();
       Objects.requireNonNull(ol);
       if (!PatchProxy.applyVoid(null, ol, l.class, "1")) {
          ol.a.onNext(Boolean.TRUE);
       }
       return;
    }
}
