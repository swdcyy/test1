package com.yxcorp.gifshow.tti.module.i;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.tti.module.RefreshLiveAuthStatus;
import wkd.b;
import rfc.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.tti.module.j;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class i implements Runnable	// class@001ddb
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final void run(){
       b.a(0x4a533fa).f(RequestTiming.ON_HOME_PAGE_CREATED).map(new e()).subscribe(new j(), Functions.d());
    }
}
