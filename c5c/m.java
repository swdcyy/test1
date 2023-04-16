package c5c.m;
import u07.u;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.h;
import java.lang.Object;
import u07.t;
import android.view.View;
import s1c.j1;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import z5c.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import z5c.b0;

public final class m implements u	// class@00052c
{
    public final h b;

    public void m(h p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       m tb = this.b;
       tb.p.h.onNext(new Object());
       h t = tb.t;
       Objects.requireNonNull(t);
       if (PatchProxy.applyVoid(null, t, g.class, "3")) {
       }else {
          h oh = h.k("CLICK_H5_CANCEL");
          oh.e("PROFILE");
          oh.c(b0.f(t.a));
          oh.h();
       }
       return;
    }
}
