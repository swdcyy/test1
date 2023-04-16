package cxd.c;
import java.lang.Throwable;
import java.lang.Object;
import cxd.d;

public interface abstract c	// class@000c9c
{

    void onComplete();
    void onError(Throwable p0);
    void onNext(Object p0);
    void onSubscribe(d p0);
}
