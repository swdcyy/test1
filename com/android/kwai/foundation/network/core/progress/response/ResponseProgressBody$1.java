package com.android.kwai.foundation.network.core.progress.response.ResponseProgressBody$1;
import okio.g;
import com.android.kwai.foundation.network.core.progress.response.ResponseProgressBody;
import okio.n;
import java.util.concurrent.atomic.AtomicLong;
import com.android.kwai.foundation.network.IRpcService$ResponseProgressListener;
import okio.b;
import okhttp3.ResponseBody;
import com.android.kwai.foundation.network.ThreadType;
import q7.a;
import java.lang.Runnable;
import android.os.Handler;

public class ResponseProgressBody$1 extends g	// class@000ef5
{
    public final ResponseProgressBody this$0;
    public AtomicLong totalBytesRead;

    public void ResponseProgressBody$1(ResponseProgressBody p0,n p1){
       this.this$0 = p0;
       super(p1);
       this.totalBytesRead = new AtomicLong(0);
    }
    public static void a(ResponseProgressBody$1 p0,long p1){
       p0.lambda$read$0(p1);
    }
    private void lambda$read$0(long p0){
       this.this$0.mProgressListener.onResponseProgressChanged(this.totalBytesRead.get(), p0);
    }
    public long read(b p0,long p1){
       long l = super.read(p0, p1);
       long l1 = this.this$0.mResponseBody.contentLength();
       if (!l - -1) {
          this.totalBytesRead.set(l1);
       }else {
          this.totalBytesRead.addAndGet(l);
       }
       ResponseProgressBody$1 tthis$0 = this.this$0;
       if (tthis$0.mThreadType == ThreadType.Main) {
          tthis$0.mHandler.post(new a(this, l1));
       }else {
          tthis$0.mProgressListener.onResponseProgressChanged(this.totalBytesRead.get(), l1);
       }
       return l;
    }
}
