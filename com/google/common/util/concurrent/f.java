package com.google.common.util.concurrent.f;
import java.util.concurrent.ExecutorService;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.Future;
import java.lang.Object;
import java.util.concurrent.Callable;
import xk.d;

public interface abstract f implements ExecutorService	// class@00193a
{

    List invokeAll(Collection p0);
    List invokeAll(Collection p0,long p1,TimeUnit p2);
    Future submit(Runnable p0);
    Future submit(Runnable p0,Object p1);
    Future submit(Callable p0);
    d submit(Runnable p0);
    d submit(Runnable p0,Object p1);
    d submit(Callable p0);
}
