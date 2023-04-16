package com.yxcorp.gifshow.profile.collect.fragment.m;
import ok.h;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionTabFragment;
import java.lang.Object;
import java.lang.Void;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import i2c.n0;
import erd.r;
import com.yxcorp.gifshow.profile.collect.fragment.p;
import erd.o;
import com.yxcorp.gifshow.profile.collect.fragment.l;
import i2c.t0;
import i2c.r0;
import erd.g;
import crd.b;

public final class m implements h	// class@0012be
{
    public final ProfileCollectionTabFragment b;

    public void m(ProfileCollectionTabFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       m tb = this.b;
       return t.just(tb.H).delay(300, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).filter(new n0(tb)).flatMap(new p(tb)).filter(l.b).map(new t0(tb)).subscribe(new r0(tb));
    }
}
