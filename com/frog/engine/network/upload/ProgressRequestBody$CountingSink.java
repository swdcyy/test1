package com.frog.engine.network.upload.ProgressRequestBody$CountingSink;
import okio.f;
import com.frog.engine.network.upload.ProgressRequestBody;
import okio.m;
import okio.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.frog.engine.network.upload.ProgressRequestBody$Listener;

public final class ProgressRequestBody$CountingSink extends f	// class@001557
{
    public long bytesWritten;
    public final ProgressRequestBody this$0;

    public void ProgressRequestBody$CountingSink(ProgressRequestBody p0,m p1){
       this.this$0 = p0;
       super(p1);
       this.bytesWritten = 0;
    }
    public void write(b p0,long p1){
       if (PatchProxy.isSupport(ProgressRequestBody$CountingSink.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, ProgressRequestBody$CountingSink.class, "1")) {
          return;
       }
       super.write(p0, p1);
       long l = this.bytesWritten + p1;
       this.bytesWritten = l;
       ProgressRequestBody$CountingSink tthis$0 = this.this$0;
       tthis$0.mListener.onProgress((int)(((float)l * 100.00f) / (float)tthis$0.contentLength()), this.bytesWritten, this.this$0.contentLength());
       return;
    }
}
