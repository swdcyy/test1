package brd.p;
import java.lang.Throwable;
import crd.b;
import java.lang.Object;

public interface abstract p	// class@0002cd
{

    void onComplete();
    void onError(Throwable p0);
    void onSubscribe(b p0);
    void onSuccess(Object p0);
}
