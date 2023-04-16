package brd.c;
import java.lang.Throwable;
import erd.f;
import crd.b;

public interface abstract c	// class@0002bc
{

    boolean isDisposed();
    void onComplete();
    void onError(Throwable p0);
    void setCancellable(f p0);
    void setDisposable(b p0);
    boolean tryOnError(Throwable p0);
}
