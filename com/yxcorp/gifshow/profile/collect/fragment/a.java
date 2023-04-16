package com.yxcorp.gifshow.profile.collect.fragment.a;
import msd.a;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import k2c.a;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.framework.model.user.UserOwnerCount;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.profile.collect.fragment.c;
import r2c.f;
import erd.g;
import crd.b;

public final class a implements a	// class@0012b2
{
    public final CollectionPostFragment b;

    public void a(CollectionPostFragment p0){
       this.b = p0;
    }
    public final Object invoke(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, CollectionPostFragment.class, "30")) {
       }else if(tb.S == null){
          tb.U = b.a(0x79c94a4a).a(2, tb.q().getCount(), tb.S.mCollection).map(new e()).subscribe(new c(tb, tb.Jh()), f.a);
       }
       return null;
    }
}
