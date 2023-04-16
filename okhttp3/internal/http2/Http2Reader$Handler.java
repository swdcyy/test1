package okhttp3.internal.http2.Http2Reader$Handler;
import java.lang.String;
import okio.ByteString;
import okio.d;
import okhttp3.internal.http2.ErrorCode;
import java.util.List;
import okhttp3.internal.http2.Settings;

public interface abstract Http2Reader$Handler	// class@001fb1
{

    void ackSettings();
    void alternateService(int p0,String p1,ByteString p2,String p3,int p4,long p5);
    void data(boolean p0,int p1,d p2,int p3);
    void goAway(int p0,ErrorCode p1,ByteString p2);
    void headers(boolean p0,int p1,int p2,List p3);
    void ping(boolean p0,int p1,int p2);
    void priority(int p0,int p1,int p2,boolean p3);
    void pushPromise(int p0,int p1,List p2);
    void rstStream(int p0,ErrorCode p1);
    void settings(boolean p0,Settings p1);
    void windowUpdate(int p0,long p1);
}
