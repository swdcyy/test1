package okhttp3.OkHttpBridge;
import java.lang.Object;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.RealCall;
import okhttp3.Request$Builder;

public class OkHttpBridge	// class@001f55
{

    public void OkHttpBridge(){
       super();
    }
    public static Call newRealCall(OkHttpClient p0,Request p1){
       return RealCall.newRealCall(p0, p1, false);
    }
    public static Request$Builder requestBuilder(Request p0){
       return new Request$Builder(p0);
    }
}
