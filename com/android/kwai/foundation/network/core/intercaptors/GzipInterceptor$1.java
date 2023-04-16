package com.android.kwai.foundation.network.core.intercaptors.GzipInterceptor$1;
import okhttp3.RequestBody;
import com.android.kwai.foundation.network.core.intercaptors.GzipInterceptor;
import okio.b;
import okhttp3.MediaType;
import okio.c;
import okio.ByteString;

public class GzipInterceptor$1 extends RequestBody	// class@000eed
{
    public final GzipInterceptor this$0;
    public final b val$buffer;
    public final RequestBody val$requestBody;

    public void GzipInterceptor$1(GzipInterceptor p0,RequestBody p1,b p2){
       this.this$0 = p0;
       this.val$requestBody = p1;
       this.val$buffer = p2;
       super();
    }
    public long contentLength(){
       return this.val$buffer.p();
    }
    public MediaType contentType(){
       return this.val$requestBody.contentType();
    }
    public void writeTo(c p0){
       p0.Y0(this.val$buffer.r());
    }
}
