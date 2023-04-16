package com.yxcorp.gifshow.profile.fragment.v;
import ok.h;
import com.yxcorp.gifshow.profile.fragment.UserProfilePhotoFragment;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import e6a.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.yxcorp.gifshow.profile.fragment.w;
import erd.g;
import k3c.q2;
import erd.r;
import k3c.o2;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class v implements h	// class@001333
{
    public final UserProfilePhotoFragment b;

    public void v(UserProfilePhotoFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       o2 oo2 = new o2(tb);
       return RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).compose(c.c(tb.m(), FragmentEvent.DESTROY)).doOnNext(w.b).filter(new q2(tb)).subscribe(oo2, Functions.e);
    }
}
