package com.yxcorp.gifshow.relation.feed.presenter.a$d$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.feed.presenter.a$d;
import com.kwai.framework.model.user.RecoUser;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.feed.presenter.a;
import com.kwai.library.widget.popup.common.c;
import gac.b;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import e17.i;
import e17.s;
import fac.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import a7c.h;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import hcc.i;

public class a$d$a implements View$OnClickListener	// class@0018a2
{
    public final RecoUser b;
    public final a$d c;

    public void a$d$a(a$d p0,RecoUser p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d$a.class, "1")) {
          return;
       }
       this.c.d.A.q(3);
       a$d$a tb = this.b;
       if (tb.mUser != null) {
          this.c.d.p.v2(tb);
          this.c.d.w.onNext(Integer.valueOf(1));
          s.f(R.string.arg_RES_7f1039c8);
       }
       a$d d = this.c.d;
       i.d(this.b, d.s, d.r, d.t, d.D.f());
       return;
    }
}
