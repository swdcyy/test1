package com.yxcorp.gifshow.follow.stagger.presenter.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.stagger.presenter.w;
import erd.r;
import brd.t;
import eja.v0;
import kga.c;
import erd.g;
import crd.b;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import eja.x0;
import eja.w0;
import dha.a;
import w99.h;
import io.reactivex.subjects.PublishSubject;

public class x extends PresenterV2	// class@001224
{
    public a p;
    public h q;
    public PublishSubject r;

    public void x(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       g a = c.a;
       this.X7(this.r.filter(w.b).subscribe(new v0(this), a));
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       this.X7(activity.m().distinctUntilChanged().filter(new x0(this)).subscribe(new w0(this), a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.p = this.r8("HOME_FOLLOW_FROM_DETAIL_BACK_STATE");
       this.q = this.r8("HOME_FOLLOW_DETAIL_FLAG");
       this.r = this.r8("HOME_FOLLOW_PHOTO_CLICK_EVENT");
       return;
    }
}
