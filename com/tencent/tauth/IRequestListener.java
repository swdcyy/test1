package com.tencent.tauth.IRequestListener;
import org.json.JSONObject;
import com.tencent.open.utils.HttpUtils$HttpStatusException;
import java.io.IOException;
import org.json.JSONException;
import java.net.MalformedURLException;
import com.tencent.open.utils.HttpUtils$NetworkUnavailableException;
import java.net.SocketTimeoutException;
import java.lang.Exception;

public interface abstract IRequestListener	// class@000f8e
{

    void onComplete(JSONObject p0);
    void onHttpStatusException(HttpUtils$HttpStatusException p0);
    void onIOException(IOException p0);
    void onJSONException(JSONException p0);
    void onMalformedURLException(MalformedURLException p0);
    void onNetworkUnavailableException(HttpUtils$NetworkUnavailableException p0);
    void onSocketTimeoutException(SocketTimeoutException p0);
    void onUnknowException(Exception p0);
}
