package com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.MyProfilePostRecoTipsPresenter;
import com.yxcorp.gifshow.profile.model.ProfilePostRecoTip;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s1c.q;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import z5c.y1;

public final class MyProfilePostRecoTipsPresenter$d extends m	// class@00142d
{
    public final MyProfilePostRecoTipsPresenter c;
    public final ProfilePostRecoTip d;

    public void MyProfilePostRecoTipsPresenter$d(MyProfilePostRecoTipsPresenter p0,ProfilePostRecoTip p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfilePostRecoTipsPresenter$d.class, "1")) {
          return;
       }
       if (this.d.getScheme() == null) {
          q.C().e("MyProfilePostRecoTipsPresenter", "Click actionBtn no scheme", new IllegalArgumentException());
          return;
       }else {
          this.c.d9(false);
          y1.R(MyProfilePostRecoTipsPresenter.P8(this.c), this.d.getMaterialId(), this.d.getMaterialName(), "template");
          this.c.b9(this.d.getScheme());
          return;
       }
    }
}
