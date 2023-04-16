package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$f;
import jzc.a$b;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import java.lang.Object;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.tbruyelle.rxpermissions2.g;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$f$a;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$f$b;
import erd.g;
import crd.b;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class PhotoSharePresenter$f implements a$b	// class@0017a2
{
    public final PhotoSharePresenter a;

    public void PhotoSharePresenter$f(PhotoSharePresenter p0){
       this.a = p0;
       super();
    }
    public final void a(KwaiOp p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoSharePresenter$f.class, "1")) {
          return;
       }
       a.p(p0, "kwaiOp");
       if (p0 == KwaiOp.SAVE_ALBUM) {
          Activity activity = this.a.getActivity();
          if (activity != null) {
             a.j(new g(activity), this.a.getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE", false).observeOn(d.a).subscribe(new PhotoSharePresenter$f$a(this), PhotoSharePresenter$f$b.b);
          }
       }else if(p0 == KwaiOp.FANS_PROMOTE){
          this.a.z.onNext(Boolean.TRUE);
       }
       this.a.h9();
       return;
    }
}
