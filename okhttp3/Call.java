package okhttp3.Call;
import java.lang.Cloneable;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.Request;
import okio.o;

public interface abstract Call implements Cloneable	// class@002060
{

    void cancel();
    Call clone();
    void enqueue(Callback p0);
    Response execute();
    boolean isCanceled();
    boolean isExecuted();
    Request request();
    o timeout();
}
