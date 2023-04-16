package com.yxcorp.gifshow.relation.explore.presenter.gallery.e$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import gbc.b;
import java.util.Objects;
import iac.z;
import y8c.d;
import com.kwai.framework.model.user.RecoUser;
import io.reactivex.subjects.PublishSubject;

public class e$c extends m	// class@00183c
{
    public final e c;

    public void e$c(e p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
          return;
       }
       e0 uoe0 = null;
       b.f("close", this.c.A, uoe0);
       e$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(uoe0, tc, e.class, "6")) {
          tc.r.onNext(new z(tc.p, tc.q.get()));
       }
       return;
    }
}
