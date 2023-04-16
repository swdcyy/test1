package com.yxcorp.gifshow.profile.presenter.profile.i;
import msd.a;
import com.yxcorp.gifshow.profile.presenter.profile.l;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import o3c.l;
import qvb.i;
import com.kwai.framework.model.user.UserOwnerCount;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.profile.presenter.profile.g;
import z5c.l0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i implements a	// class@00155d
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final Object invoke(){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, l.class, "9")) {
       }else if(tb.u == null || !tb.R8()){
          tb.X7(b.a(0x37313f08).a(1, tb.q.getCount(), tb.u.mLike).map(new e()).subscribe(new g(tb, tb.R8()), l0.a));
       }
       return null;
    }
}
