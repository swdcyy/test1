package retrofit2.a;
import java.lang.Cloneable;
import retrofit2.p;
import byd.a;
import okhttp3.Request;

public interface abstract a implements Cloneable	// class@002436
{

    void cancel();
    a clone();
    p execute();
    void h4(a p0);
    boolean isCanceled();
    boolean isExecuted();
    Request request();
}
