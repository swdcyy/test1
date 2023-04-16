package com.yxcorp.experiment.d$a;
import yb7.c;
import com.yxcorp.experiment.d;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import java.lang.Object;
import java.lang.Throwable;
import wu8.n;
import java.lang.Runnable;
import yb7.p;
import java.lang.String;
import wu8.m;
import f97.a;

public class d$a implements c	// class@0011e2
{
    public final ApiRequestTiming a;
    public final d b;

    public void d$a(d p0,ApiRequestTiming p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailure(Throwable p0){
       p.d(new n(p0));
    }
    public void onSuccess(Object p0){
       a.a(new m(this, p0, this.a));
    }
}
