package com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter$c;
import zq6.u;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.FollowFilterBindInfoPresenter;
import java.lang.Object;
import gsa.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import xvb.c;
import mrd.a;

public final class FollowFilterBindInfoPresenter$c implements u	// class@00122d
{
    public final FollowFilterBindInfoPresenter a;

    public void FollowFilterBindInfoPresenter$c(FollowFilterBindInfoPresenter p0){
       this.a = p0;
       super();
    }
    public void onChange(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FollowFilterBindInfoPresenter$c.class, "1")) {
       }else if(p0 != null){
          this.a.P8().setBackgroundColor(p0.k);
          this.a.v.onNext(new c(p0.b, p0.a));
       }
       PatchProxy.onMethodExit(FollowFilterBindInfoPresenter$c.class, "1");
       return;
    }
}
