package com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import qvb.q;
import qvb.a;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.MyProfilePhotoEmptyUpdatePresenter$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.profile.http.l;
import y8c.t;

public final class MyProfilePhotoEmptyUpdatePresenter extends PresenterV2	// class@001427
{
    public l p;
    public t q;
    public c r;
    public final p s;
    public boolean t;

    public void MyProfilePhotoEmptyUpdatePresenter(){
       super();
       this.s = s.c(new MyProfilePhotoEmptyUpdatePresenter$mPageListObserver$2(this));
    }
    public void E8(){
       MyProfilePhotoEmptyUpdatePresenter myProfilePho = MyProfilePhotoEmptyUpdatePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, myProfilePho, "3")) {
          return;
       }
       MyProfilePhotoEmptyUpdatePresenter tp = this.p;
       if (tp == null) {
          a.S("mPageList");
       }
       q oq = PatchProxy.apply(objArray, this, myProfilePho, "1");
       if (oq == PatchProxyResult.class) {
          oq = this.s.getValue();
       }
       tp.h(oq);
       myProfilePho = this.r;
       if (myProfilePho == null) {
          a.S("mLoadState");
       }
       this.X7(myProfilePho.e().subscribe(new MyProfilePhotoEmptyUpdatePresenter$a(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoEmptyUpdatePresenter.class, "4")) {
          return;
       }
       this.t = false;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfilePhotoEmptyUpdatePresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("PAGE_LIST");
       a.o(obj, "inject\(AccessIds.PAGE_LIST\)");
       this.p = obj;
       obj = this.q8(t.class);
       a.o(obj, "inject\(TipsHelper::class.java\)");
       this.q = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.r = obj;
       return;
    }
}
