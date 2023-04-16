package brd.j;
import brd.g;
import erd.f;
import crd.b;
import java.lang.Throwable;

public interface abstract j implements g	// class@0002c7
{

    boolean isCancelled();
    long requested();
    j serialize();
    void setCancellable(f p0);
    void setDisposable(b p0);
    boolean tryOnError(Throwable p0);
}
