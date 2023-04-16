package com.yxcorp.gifshow.detail.common.information.subscribeauthor.g$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.c;
import qp7.d;
import xy9.i;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class g$a extends m	// class@00145d
{
    public final g c;

    public void g$a(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.c.v();
       i oi = this.c.l();
       Objects.requireNonNull(oi);
       if (!PatchProxy.applyVoid(null, oi, i.class, "3")) {
          oi.b.onNext(Boolean.TRUE);
       }
       return;
    }
}
