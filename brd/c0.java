package brd.c0;
import java.lang.Throwable;
import java.lang.Object;
import erd.f;
import crd.b;

public interface abstract c0	// class@0002bb
{

    boolean isDisposed();
    void onError(Throwable p0);
    void onSuccess(Object p0);
    void setCancellable(f p0);
    void setDisposable(b p0);
    boolean tryOnError(Throwable p0);
}
