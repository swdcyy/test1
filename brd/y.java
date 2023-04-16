package brd.y;
import java.lang.Throwable;
import java.lang.Object;
import crd.b;

public interface abstract y	// class@000348
{

    void onComplete();
    void onError(Throwable p0);
    void onNext(Object p0);
    void onSubscribe(b p0);
}
