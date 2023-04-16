package com.yxcorp.gifshow.profile.fragment.o;
import ok.h;
import com.yxcorp.gifshow.profile.fragment.UserProfilePhotoFragment;
import java.lang.Object;
import java.lang.Void;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment;
import s1c.r0;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import k3c.p2;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class o implements h	// class@00132c
{
    public final UserProfilePhotoFragment b;

    public void o(UserProfilePhotoFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o tb = this.b;
       p2 op2 = new p2(tb);
       return tb.G.b.observable().compose(c.c(tb.m(), FragmentEvent.DESTROY)).subscribe(op2, Functions.e);
    }
}
