package com.android.kwai.foundation.network.core.progress.request.RequestProgressBody$ByteSink;
import okio.f;
import com.android.kwai.foundation.network.core.progress.request.RequestProgressBody;
import okio.m;
import java.util.concurrent.atomic.AtomicLong;
import com.android.kwai.foundation.network.IRpcService$RequestProgressListener;
import okio.b;
import com.android.kwai.foundation.network.ThreadType;
import p7.a;
import java.lang.Runnable;
import android.os.Handler;

public final class RequestProgressBody$ByteSink extends f	// class@000ef3
{
    public AtomicLong mByteLength;
    public boolean mIsCallServer;
    public final RequestProgressBody this$0;

    public void RequestProgressBody$ByteSink(RequestProgressBody p0,m p1,boolean p2){
       this.this$0 = p0;
       super(p1);
       this.mByteLength = new AtomicLong(0);
       this.mIsCallServer = p2;
    }
    public static void a(RequestProgressBody$ByteSink p0,long p1){
       p0.lambda$write$0(p1);
    }
    private void lambda$write$0(long p0){
       this.this$0.mRequestProgressListener.onRequestProgressChanged(this.mByteLength.get(), p0);
    }
    public void write(b p0,long p1){
       super.write(p0, p1);
       if (this.mIsCallServer != null) {
          this.mByteLength.get();
          this.mByteLength.addAndGet(p1);
          long l = this.this$0.contentLength();
          RequestProgressBody$ByteSink tthis$0 = this.this$0;
          if (tthis$0.mThreadType == ThreadType.Main) {
             tthis$0.mHandler.post(new a(this, l));
          }else {
             tthis$0.mRequestProgressListener.onRequestProgressChanged(this.mByteLength.get(), l);
          }
       }
       return;
    }
}
