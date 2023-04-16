package com.yxcorp.gifshow.detail.common.information.username.UserNameElement$k;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.username.UserNameElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import by9.h;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import by9.h$a;
import k2b.e0;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class UserNameElement$k implements g	// class@00146a
{
    public final UserNameElement b;

    public void UserNameElement$k(UserNameElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserNameElement$k.class, "1")) {
       }else {
          h$a x = h.x;
          QPhoto qPhoto = UserNameElement.n0(this.b);
          UserNameElement w = this.b.w;
          if (w == null) {
             a.S("mFragment");
          }
          h$a.c(x, qPhoto, "CO_CREATION", w, 0, 8, null);
          this.b.H().Q1.onNext(Boolean.TRUE);
       }
       return;
    }
}
