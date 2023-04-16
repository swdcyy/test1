package com.yxcorp.gifshow.profile.collect.fragment.g;
import ok.h;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment;
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
import i2c.s;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;

public final class g implements h	// class@0012b8
{
    public final CollectionSerialFragment b;

    public void g(CollectionSerialFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       s os = new s(tb);
       return tb.I.b.observable().compose(c.c(tb.m(), FragmentEvent.DESTROY)).subscribe(os, Functions.e);
    }
}
