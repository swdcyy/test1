package okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.PushObserver$1;
import okio.d;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

public interface abstract PushObserver	// class@001fbb
{
    public static final PushObserver CANCEL;

    static {
       PushObserver.CANCEL = new PushObserver$1();
    }
    boolean onData(int p0,d p1,int p2,boolean p3);
    boolean onHeaders(int p0,List p1,boolean p2);
    boolean onRequest(int p0,List p1);
    void onReset(int p0,ErrorCode p1);
}
