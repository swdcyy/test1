package io.netty.util.concurrent.f;
import java.util.concurrent.Future;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import io.netty.util.concurrent.g;
import java.lang.Throwable;

public interface abstract f implements Future	// class@001106
{

    Object A();
    boolean await(long p0,TimeUnit p1);
    f c();
    boolean cancel(boolean p0);
    f e();
    f f(g p0);
    f g(g[] p0);
    f h(g[] p0);
    f i(g p0);
    boolean isSuccess();
    f j();
    boolean j0(long p0);
    f k();
    boolean l0(long p0,TimeUnit p1);
    boolean n0(long p0);
    boolean s();
    Throwable z();
}
