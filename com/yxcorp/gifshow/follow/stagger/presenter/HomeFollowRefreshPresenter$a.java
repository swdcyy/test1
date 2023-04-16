package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class HomeFollowRefreshPresenter$a implements Runnable	// class@0011f8
{
    public final HomeFollowRefreshPresenter b;

    public void HomeFollowRefreshPresenter$a(HomeFollowRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, HomeFollowRefreshPresenter$a.class, "1")) {
          return;
       }
       HomeFollowRefreshPresenter$a tb = this.b;
       tb.x = true;
       tb.V8();
       return;
    }
}
