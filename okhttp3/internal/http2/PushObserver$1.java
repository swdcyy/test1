package okhttp3.internal.http2.PushObserver$1;
import okhttp3.internal.http2.PushObserver;
import java.lang.Object;
import okio.d;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

public class PushObserver$1 implements PushObserver	// class@001fba
{

    public void PushObserver$1(){
       super();
    }
    public boolean onData(int p0,d p1,int p2,boolean p3){
       p1.skip((long)p2);
       return true;
    }
    public boolean onHeaders(int p0,List p1,boolean p2){
       return true;
    }
    public boolean onRequest(int p0,List p1){
       return true;
    }
    public void onReset(int p0,ErrorCode p1){
    }
}
