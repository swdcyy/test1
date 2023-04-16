package brd.g;
import java.lang.Throwable;
import java.lang.Object;

public interface abstract g	// class@00033c
{

    void onComplete();
    void onError(Throwable p0);
    void onNext(Object p0);
}
