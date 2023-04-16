package com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2$a;
import qvb.q;
import com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter;
import kotlin.jvm.internal.a;
import qvb.a;

public final class MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2$a implements q	// class@001425
{
    public final MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2 b;

    public void MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2$a(MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2 p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2$a omPageListOb = MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2$a.class;
       if (PatchProxy.isSupport(omPageListOb) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omPageListOb, "1")) {
          return;
       }
       MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2 this$0 = this.b.this$0;
       MyProfilePhotoEmptyUpdatePresenter p = this$0.p;
       if (p == null) {
          a.S("mPageList");
       }
       this$0.t = p.isEmpty();
       return;
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
}
