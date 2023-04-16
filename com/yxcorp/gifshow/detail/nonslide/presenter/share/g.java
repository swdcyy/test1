package com.yxcorp.gifshow.detail.nonslide.presenter.share.g;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import thc.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public abstract class g extends k	// class@0015e1
{
    public PhotoDetailParam H;
    public static final int I;

    public void g(){
       super();
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.z = b.a(-1778235808).a(this.W8(), this.H.mPhoto.getPhotoId(), QCurrentUser.me().getToken()).map(new e()).delay(500, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new f(this), Functions.d());
       return;
    }
    public String W8(){
       return null;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.H = this.q8(PhotoDetailParam.class);
       return;
    }
}
