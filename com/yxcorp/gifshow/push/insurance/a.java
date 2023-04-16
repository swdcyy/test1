package com.yxcorp.gifshow.push.insurance.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.push.insurance.MutualInsuranceInitModule;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.util.Objects;
import i6c.c;
import i6c.k;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import java.lang.String;
import com.yxcorp.utility.SystemUtil;
import h30.a;
import com.yxcorp.utility.RomUtils;
import brd.t;
import cjd.e;
import erd.o;
import u6c.c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class a implements Runnable	// class@001674
{
    public final MutualInsuranceInitModule b;
    public final RequestTiming c;

    public void a(MutualInsuranceInitModule p0,RequestTiming p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = new c(tb);
       k.a().b(SystemUtil.m(a.a().a()), a.d(), RomUtils.e(), RomUtils.i(), this.c).map(new e()).subscribe(uoc, Functions.d());
    }
}
