package brd.v;
import brd.g;
import erd.f;
import crd.b;
import java.lang.Throwable;

public interface abstract v implements g	// class@0002d4
{

    boolean isDisposed();
    v serialize();
    void setCancellable(f p0);
    void setDisposable(b p0);
    boolean tryOnError(Throwable p0);
}
