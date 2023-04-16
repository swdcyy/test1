package com.android.kwai.foundation.network.core.progress.response.ResponseProgressBody;
import okhttp3.ResponseBody;
import com.android.kwai.foundation.network.core.wrapper.CallbackWrapper;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import com.android.kwai.foundation.network.IRpcService$ResponseProgressListener;
import com.android.kwai.foundation.network.ThreadType;
import okhttp3.MediaType;
import okio.d;
import okio.n;
import okio.l;
import com.android.kwai.foundation.network.core.progress.response.ResponseProgressBody$1;

public class ResponseProgressBody extends ResponseBody	// class@000ef6
{
    public d bufferedSource;
    public Handler mHandler;
    public IRpcService$ResponseProgressListener mProgressListener;
    public ResponseBody mResponseBody;
    public ThreadType mThreadType;

    public void ResponseProgressBody(ResponseBody p0,CallbackWrapper p1){
       super();
       this.mHandler = new Handler(Looper.getMainLooper());
       this.mResponseBody = p0;
       this.mProgressListener = p1.getCallback();
       this.mThreadType = p1.getThreadType();
    }
    public long contentLength(){
       return this.mResponseBody.contentLength();
    }
    public MediaType contentType(){
       return this.mResponseBody.contentType();
    }
    public d source(){
       if (this.bufferedSource == null) {
          this.bufferedSource = l.d(this.source(this.mResponseBody.source()));
       }
       return this.bufferedSource;
    }
    public final n source(n p0){
       return new ResponseProgressBody$1(this, p0);
    }
}
