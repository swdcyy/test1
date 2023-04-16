package com.yxcorp.gifshow.profile.collect.fragment.b;
import ok.h;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import java.lang.Object;
import java.lang.Void;
import s1c.r0;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import i2c.m;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class b implements h	// class@0012b3
{
    public final CollectionPostFragment b;

    public void b(CollectionPostFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       m om = new m(tb);
       return tb.J.b.observable().compose(c.c(tb.m(), FragmentEvent.DESTROY)).subscribe(om, Functions.e);
    }
}
