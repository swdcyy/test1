package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterGuidePresenter$e$a;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jn5.b;
import jn5.a$a;
import lnc.a1;
import jn5.a;

public final class FollowFilterGuidePresenter$e$a implements View$OnClickListener	// class@001236
{
    public static final FollowFilterGuidePresenter$e$a b;

    static {
       FollowFilterGuidePresenter$e$a.b = new FollowFilterGuidePresenter$e$a();
    }
    public void FollowFilterGuidePresenter$e$a(){
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowFilterGuidePresenter$e$a.class, "1")) {
          return;
       }
       a$a uoa = new a$a();
       uoa.c(0x27dc);
       uoa.g(2);
       uoa.h(a1.p(R.string.arg_RES_7f101022));
       uoa.d("TopFollow");
       b.a.b(uoa.a());
       return;
    }
}
