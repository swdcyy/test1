package okhttp3.internal.http.HttpCodec;
import okhttp3.Request;
import okio.m;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Response$Builder;

public interface abstract HttpCodec	// class@0020b5
{

    void cancel();
    m createRequestBody(Request p0,long p1);
    void finishRequest();
    void flushRequest();
    ResponseBody openResponseBody(Response p0);
    Response$Builder readResponseHeaders(boolean p0);
    void writeRequestHeaders(Request p0);
}
